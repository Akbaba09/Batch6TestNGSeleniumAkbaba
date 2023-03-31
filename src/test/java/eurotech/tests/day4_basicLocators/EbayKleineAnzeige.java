package eurotech.tests.day4_basicLocators;

import eurotech.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EbayKleineAnzeige {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("firefox");
        driver.get("https://www.ebay-kleinanzeigen.de/");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"site-signin\"]/nav/ul/li[3]/a/span")).click();
        driver.findElement(By.id("login-email")).sendKeys("coskunakbaba0955@gmail.com");
        driver.findElement(By.name("password")).sendKeys("Akb*2949");
        driver.findElement(By.xpath("//*[@id=\"recaptcha-anchor\"]/div[4]")).click();
        driver.findElement(By.xpath("//button[@id='login-submit']")).click();
        Thread.sleep(5000);
        driver.close();
    }
}
