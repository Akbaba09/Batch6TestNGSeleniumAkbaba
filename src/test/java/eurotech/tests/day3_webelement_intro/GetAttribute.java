package eurotech.tests.day3_webelement_intro;

import eurotech.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GetAttribute {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("firefox");
        driver.get("http://www.eurotech.study/login");

        WebElement emailInput = driver.findElement(By.id("loginpage-input-email"));
        emailInput.sendKeys("Hello World!");
        Thread.sleep(1000);
        System.out.println(emailInput.getAttribute("value"));

        System.out.println(emailInput.getAttribute("placeHolder"));
        System.out.println(emailInput.getAttribute("id"));
        WebElement passwordInput = driver.findElement(By.id("loginpage-form-pw-input"));
        System.out.println(passwordInput.getAttribute("minlength"));

        driver.close();
    }
}
