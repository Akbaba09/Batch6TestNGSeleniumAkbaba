package eurotech.tests.day3_webelement_intro;

import eurotech.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VerifyConfirmationMessage {
    public static void main(String[] args) throws InterruptedException {
        //open firefox browser
        //go to "http://www.eurotech.study/login"
        //enter valid credentials "eurotech@gmail.com", "Test12345!"
        //verify that confirmation message is "Welcome Teacher"

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://www.eurotech.study/login");
        Thread.sleep(1000);

        driver.findElement(By.id("rcc-confirm-button")).click();
        //enter username
        driver.findElement(By.name("email")).sendKeys("eurotech@gmail.com");
        Thread.sleep(1000);
        //enter password
        driver.findElement(By.id("loginpage-form-pw-input")).sendKeys("Test12345!");
        Thread.sleep(1000);
        //click login button
        driver.findElement(By.id("loginpage-form-btn")).click();
        Thread.sleep(2000);

        WebElement welcomeMessage = driver.findElement(By.id("dashboard-p1"));
        //we have to ways to get text from web pages
        //1. getText() --> it will work 99% and it will return string
        //2. getAttribute() -->

        System.out.println(welcomeMessage.getText());

        String expectedText = "Welcome Teacher";
        String actualText = welcomeMessage.getText();

        if(expectedText.equals(actualText)){
            System.out.println("passed");
        }else{
            System.out.println("failed");
        }




    }
}
