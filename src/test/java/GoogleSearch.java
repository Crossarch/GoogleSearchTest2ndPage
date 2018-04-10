import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

import static junit.framework.TestCase.assertTrue;

public class GoogleSearch {

        private WebDriver driver;
        private String baseUrl;

        @Before
        public void beforeMethod() {
            driver = new ChromeDriver();
            baseUrl = "https://google.com.ua";
        }

        @Test
        public void testMethod() throws Exception {
            System.setProperty("webdriver.chrome.driver", "c:/Program Files (x86)/ChromeDriver/chromedriver.exe");
            driver.get(baseUrl);
            driver.findElement(By.cssSelector("input#lst-ib")).sendKeys("cats");
            driver.findElement(By.cssSelector("input#lst-ib")).sendKeys(Keys.ENTER);
            driver.findElement(By.cssSelector("a#pnnext.pn")).click();
            driver.findElements(By.cssSelector("div.rc"));
            System.out.println(driver.findElements(By.cssSelector("div.rc")).size());
            for (int i = 0; i < driver.findElements(By.cssSelector("div.rc")).size(); i++) {
                System.out.println(driver.findElements(By.cssSelector("div.rc")).get(i).getText());
            }
        }

        @After
        public void afterMethod() {
            //driver.quit();
        }
    }
