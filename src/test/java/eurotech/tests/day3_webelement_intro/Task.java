package eurotech.tests.day3_webelement_intro;

import eurotech.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Task {
    public static void main(String[] args) throws InterruptedException {
        // open firefox browser
        // navigate to "http://www.eurotech.study/login"
        // enter username and password "eurotech@gmail.com", "Test12345!"
        //verify login successfully
        //verify that dashboard text is exist

        WebDriver driver = WebDriverFactory.getDriver("firefox");
        driver.get("http://www.eurotech.study/login");
        Thread.sleep(2000);

        driver.findElement(By.id("rcc-confirm-button")).click();
        //enter username
        driver.findElement(By.name("email")).sendKeys("eurotech@gmail.com");
        //enter password
        driver.findElement(By.id("loginpage-form-pw-input")).sendKeys("Test12345!");
        //click login button
        driver.findElement(By.id("loginpage-form-btn")).click();
        Thread.sleep(2000);


//        driver.findElement(By.id("rcc-confirm-button")).click();
//
//        WebElement emailInput = driver.findElement(By.id("loginpage-input-email"));
//        emailInput.sendKeys("eurotech@gmail.com");
//
//         WebElement passwordInput = driver.findElement(By.id("password"));
//         passwordInput.sendKeys("Test12345!");
//
//        driver.findElement(By.id("loginpage-form-btn")).click();
//        Thread.sleep(2000);


        WebElement dashboard = driver.findElement(By.id("dashboard-h1"));

        String expectedText = "Dashboard";
        String actualText = dashboard.getText();

        if(expectedText.equals(actualText)){
            System.out.println("passed");
        }else{
            System.out.println("failed");
        }








    }
}
