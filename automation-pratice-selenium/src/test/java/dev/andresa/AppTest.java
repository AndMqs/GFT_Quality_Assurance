package dev.andresa;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AppTest {
    private WebDriver driver;

    @Test
    public void helloSelenium() {
        //https://www.selenium.dev/documentation/webdriver/getting_started/install_drivers
        System.getProperty("webdriver.chrome.driver", "drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");

        String currentUrl = driver.getCurrentUrl();
        String expected = "https://www.saucedemo.com/";

       assertEquals(expected, currentUrl);
        driver.quit();
    }


    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }

}
