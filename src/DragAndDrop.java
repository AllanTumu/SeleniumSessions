import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/home/mea/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        //Site with a drag and drop
        driver.get("https://jqueryui.com/droppable/");

        //Switch to frame
        driver.switchTo().frame(0); //We only switch to frames when they are present

        //Create an Actions Class Object
        Actions action = new Actions(driver);

        //Drag and drop element
        action.clickAndHold(driver.findElement(By.xpath("//div[@id='draggable']")))
                .moveToElement(driver.findElement(By.xpath("//div[@id='droppable']")))
                .release()
                .build()
                .perform();

        driver.quit();
    }
}
