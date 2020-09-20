import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class FindElementsConcept {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/home/mea/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

        driver.get("https://www.selenium.dev/exceptions/#stale_element_reference.html");

        //get the count of links on the page
        List <WebElement> linkList = driver.findElements(By.tagName("a"));
        System.out.println(linkList.size());

        //get the text of each link on the page
        //To print the array list, we use for loop
        for (int i = 0; i<linkList.size(); i++) {
            String linkText = linkList.get(i).getText();
            System.out.println(linkText);
        }

        driver.quit();
    }
}
