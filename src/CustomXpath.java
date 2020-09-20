import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class CustomXpath {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/home/mea/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

        driver.get("https://www.facebook.com/");

        //Click Create New Account
        driver.findElement(By.xpath("//a[contains(text(),'Create New Account')]"))
                .click();

        String sign_up = driver.findElement(By.xpath("//div[contains(text(),'Sign Up')]"))
                .getText();

        //Validation
        if (sign_up.equals("Sign Up")) {
            System.out.println("PASSED");
        }
        else {
            System.out.println("FAILED");

        }

        //Input the the required data
//        driver.findElement(By.xpath("//input[@name='firstname']"))
//                .sendKeys("mbonyebyombii");
        driver.findElement(By.xpath("//input[contains(@name, 'firstname')]")).sendKeys("mbonyebyombii");
        driver.findElement(By.xpath("//input[@name='lastname']"))
                .sendKeys("Mea");
        driver.findElement(By.xpath("//input[@name='reg_email__']"))
                .sendKeys("mbonyebyombiimea@gmail.com");
        driver.findElement(By.xpath("//input[@name='reg_passwd__']"))
                .sendKeys("12345678");
        driver.findElement(By.xpath("//select[@name='birthday_month']"))
                .click();

        Select select = new Select(driver.findElement(By.xpath("//select[@name='birthday_month']")));
        select.selectByVisibleText("Aug");

        Select select1 = new Select(driver.findElement(By.xpath("//select[@name='birthday_day']")));
        select1.selectByVisibleText("13");

        Select select2 = new Select(driver.findElement(By.xpath("//select[@name='birthday_year']")));
        select2.selectByVisibleText("1997");

        driver.findElement(By.xpath("//label[contains(text(),'Male')]"))
                .click();

        //Click Sign Up
        driver.findElement(By.xpath("//button[@name='websubmit']"))
                .click();
    }
}
