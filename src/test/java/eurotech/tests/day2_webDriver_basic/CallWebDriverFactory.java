package eurotech.tests.day2_webDriver_basic;

import eurotech.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class CallWebDriverFactory {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("firefox");
        driver.get("http://eurotech.study/login");
        driver.close();
    }
}
