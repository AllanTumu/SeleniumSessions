import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovementConcept {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/home/mea/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize(); //Maximizes the window
        driver.manage().deleteAllCookies(); //Deletes all the cookies

        driver.get("https://www.spicejet.com/"); //Enter URL

        Actions action = new Actions(driver);

        action.moveToElement(driver.findElement(By.xpath("//a[@id='highlight-addons']")))
                .build()
                .perform();

        driver.findElement(By.xpath("//a[contains(text(),'Visa Services')]")).click();

        driver.quit();

    }
}
