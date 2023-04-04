package eurotech.tests.day1_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class OpenBrowser {
    public static void main(String[] args) {

//        WebDriverManager.chromedriver().setup();
//
//        WebDriver driver = new ChromeDriver();
//
//        driver.get("https://www.amazon.de/");
//        driver.close();
//
//        WebDriverManager.firefoxdriver().setup();
//        WebDriver driver1 = new FirefoxDriver();
//        driver1.get("https://www.amazon.de/");
//        driver1.close();



        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.de/");
        driver.close();
//
//        WebDriverManager.edgedriver().setup();
//        WebDriver driver2 = new EdgeDriver();
//        driver2.get("https://www.amazon.de/");
//        driver2.close();


//
//        WebDriverManager.safaridriver().setup();
//        WebDriver driver3 = new SafariDriver();
//        driver3.get("https://www.amazon.de/");
//        driver3.close();



    }
}
