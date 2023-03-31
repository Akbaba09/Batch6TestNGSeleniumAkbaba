package eurotech.tests.day2_webDriver_basic;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class closeAndQuit {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.facebook.com");
        // close current tab
        driver.close();
        // close all browser
        driver.quit();
    }
}
