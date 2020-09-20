import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class FrameHandling {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/home/mea/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://ui.freecrm.com/");

        //dynamic Wait
        driver.manage()
                .timeouts()
                .pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage()
                .timeouts()
                .implicitlyWait(30,TimeUnit.SECONDS);

        //Input email and Password
        driver.findElement(By.xpath("//input[@placeholder='E-mail address']"))
                .sendKeys("twopak30@gmail.com");
        driver.findElement(By.xpath("//input[@placeholder='Password']"))
                .sendKeys("KatungyE");
        driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']"))
                .click();

        //Validation of a successful Login
        String user = driver.findElement(By.xpath("//span[@class='user-display']"))
                .getText();
        if (user.equals("Allan Tumuhimbise")) {
            System.out.println("Successful Login");
        }
        else {
            System.out.println("Login not Successful");
        }

        driver.quit();

        //Site no longer has frames

    }
}
