import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LocatorConcept {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        //Launch Chrome Browser
        System.setProperty("webdriver.chrome.driver","/home/mea/chromedriver" );
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //Initailize facebook
        driver.get("https://www.seleniumeasy.com/test/");

        driver.findElement(By.xpath("//a[@id='btn_basic_example']")).click();

        driver.findElement(By.xpath("//a[@class='list-group-item'][contains(text(),'Simple Form Demo')]")).click();

        // ID
        driver.findElement(By.id("user-message")).sendKeys("My message");

        //driver.findElement(By.xpath("//input[@id='user-message']")).sendKeys("My message");

        driver.findElement(By.xpath("//button[contains(text(),'Show Message')]")).click();

        String message = driver.findElement(By.xpath("//span[@id='display']")).getText();
        System.out.println(message);
        //Validation
        if (message.equals("My message")) {
            System.out.println("PASSED");

        }
        else {
            System.out.println("FAILED");
        }
        String yourMessage =  driver.findElement(By.xpath("//label[contains(text(),'Your Message:')]")).getText();
        assert yourMessage.equals("Your Message");
        driver.quit();

        //Link text
        //driver.findElement(By.linkText("")).click();
    }
}
