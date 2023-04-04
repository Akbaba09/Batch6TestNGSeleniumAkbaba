package eurotech.tests.day4_basicLocators;

import eurotech.utilities.ConfigurationReader;
import eurotech.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ClassNameTest {
    public static void main(String[] args) throws InterruptedException {


       // WebDriver driver = WebDriverFactory.getDriver("chrome");
        WebDriver driver = WebDriverFactory.getDriver(ConfigurationReader.get("browser"));
       // driver.get("http://eurotech.study/login");
        driver.get(ConfigurationReader.get("url"));
        driver.findElement(By.id("rcc-confirm-button")).click();
        Thread.sleep(1000);
        driver.findElement(By.name("email")).sendKeys("eurotech@gmail.com");
        driver.findElement(By.name("password")).sendKeys("Test12345!");
        driver.findElement(By.id("loginpage-form-btn")).click();
        Thread.sleep(1000);

        String text = driver.findElement(By.className("my-2")).getText();
        System.out.println("text = " + text);

        //driver.close();


    }
}
