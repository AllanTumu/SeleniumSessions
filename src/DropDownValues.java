import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownValues {

    public static void main(String[] args) {
        //Initialize browser
        System.setProperty("webdriver.chrome.driver", "/home/mea/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //Launch google.com
        driver.get("https://www.seleniumeasy.com/test/");

        //Click to go to the drop down section
        driver.findElement(By.linkText("Input Forms")).click();

        //Click to search for Drop down lists
        driver.findElement(By.linkText("Select Dropdown List")).click();

        //To handle drop lists, we create an object of Select class
        Select select = new Select(driver.findElement(By.id("select-demo")));
        select.selectByVisibleText("Monday");

        assert driver.findElement(By.xpath("//select[@id='select-demo']")).equals("Monday");


    }
}
