import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFileUploads {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/home/mea/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://html.com/input-type-file/");

        driver.findElement(By.xpath("//input[@id='fileupload']")).sendKeys("/home/mea/Documents/OrderManagement/Details.txt");
    }
}
