package eurotech.tests.day6_cssSelector;

import eurotech.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import javax.swing.plaf.TableHeaderUI;

public class cssSelectorTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("http://eurotech.study/login");
        driver.findElement(By.cssSelector("#rcc-confirm-button")).click();
        System.out.println("accepted cookies...");

        Thread.sleep(2000);

        driver.findElement(By.cssSelector("#loginpage-input-email")).sendKeys("eurotech@gmail.com");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("#loginpage-form-pw-input")).sendKeys("Test12345!");
        driver.findElement(By.id("loginpage-form-btn")).click();
        Thread.sleep(2000);
        driver.close();

    }
}
