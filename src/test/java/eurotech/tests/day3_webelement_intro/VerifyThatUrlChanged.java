package eurotech.tests.day3_webelement_intro;

import eurotech.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VerifyThatUrlChanged {
    public static void main(String[] args) throws InterruptedException {
        //open the browser
        //enter email address as "eurotech@gmail.com"
        //enter password as "Test12345!"
        //click login button
        //verify that URL has changed

        WebDriver driver = WebDriverFactory.getDriver("firefox");
        driver.get("http://eurotech.study/login");
        Thread.sleep(2000);

        WebElement understandBtn = driver.findElement(By.id("rcc-confirm-button"));

        understandBtn.click();
        String email = "eurotech@gmail.com";
        String password = "Test12345!";

        WebElement emailInput = driver.findElement(By.id("loginpage-input-email"));
        emailInput.sendKeys(email);

        WebElement passwordInput = driver.findElement(By.name("password"));
        passwordInput.sendKeys(password);


        WebElement loginBtn = driver.findElement(By.id("loginpage-form-btn"));
        loginBtn.click();
        String expectedUrl ="http://eurotech.study/dashboard";
        String actualUrl = driver.getCurrentUrl();

        if(expectedUrl.equals((actualUrl))){
            System.out.println("passed");
        }else{
            System.out.println("failed");
        }


//        Thread.sleep(2000);
//        driver.close();










    }
}
