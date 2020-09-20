import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ImplicitWaitConcept {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/home/mea/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        driver.get("https://www.jumia.ug/"); //Enter URL

        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);//pageLoadTimeout
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS); //ImplicitlyWait

        driver.quit();



        //Implicitly Wait is a dynamic wait
    }
}
