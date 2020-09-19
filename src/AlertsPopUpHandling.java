import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsPopUpHandling {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/home/mea/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //Launch google.com
        driver.get("https://www.seleniumeasy.com/test/");

        driver.findElement(By.linkText("Alerts & Modals")).click();

        driver.findElement(By.linkText("Javascript Alerts")).click();

        driver.findElement(By.xpath("//button[@class='btn btn-default']")).click();

        Alert alert = driver.switchTo().alert();

        System.out.println(alert.getText()); //prints the alert message

        alert.accept(); //clicks ok button

        driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg'][contains(text(),'Click me!')]")).click();

        alert.dismiss(); //Used for canceling the alert

        driver.findElement(By.xpath("//button[contains(text(),'Click for Prompt Box')]")).click();

        alert.sendKeys("Allan");

        alert.accept();

        driver.quit();



    }
}
