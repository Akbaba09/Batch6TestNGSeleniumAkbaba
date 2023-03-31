package eurotech.tests.day14_PropertiesSingleton;

import eurotech.utilities.ConfigurationReader;
import eurotech.utilities.Driver;
import eurotech.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class DriverTest {

//    @Test
//    public void test1() throws InterruptedException {
//
//       // WebDriver driver = WebDriverFactory.getDriver("chrome");
//       // WebDriver driver = WebDriverFactory.getDriver(ConfigurationReader.get("browser"));
//        WebDriver driver = Driver.get();
//        driver.get(ConfigurationReader.get("url"));
//        Thread.sleep(1000);
//        Driver.closeDriver();
//    }

    @Test
    public void test2() throws InterruptedException {

       // WebDriver driver = WebDriverFactory.getDriver(ConfigurationReader.get("browser"));
        WebDriver driver= Driver.get();
        driver.get("http://www.amazon.com/");
        Driver.closeDriver();

    }

    @Test
    public void test3() {
       // WebDriver driver = WebDriverFactory.getDriver(ConfigurationReader.get("browser"));
        WebDriver driver = Driver.get();
        driver.get("http://www.google.com/");
        Driver.closeDriver();

    }
    }

