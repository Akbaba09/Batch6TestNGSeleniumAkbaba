package eurotech.utilities;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverFactory {
    // Task
    // Write a static method with String parameter(browserType)
    // it will setup browser
    // this method return type chromedriver or
    // firefoxdriver (webdriver)
    // name is getDriver


    public static WebDriver getDriver(String browserType){
        WebDriver driver = null;
        switch (browserType.toLowerCase()){
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;

        }
        return driver;



    }



}
