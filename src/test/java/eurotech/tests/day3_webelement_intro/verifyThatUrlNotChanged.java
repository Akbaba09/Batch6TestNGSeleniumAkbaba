package eurotech.tests.day3_webelement_intro;

import eurotech.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class verifyThatUrlNotChanged {
    public static void main(String[] args) throws InterruptedException {
        //open chrome browser
        // go to http://eurotech.study/login
        //click login button
        //verify that URL not changed

        WebDriver driver = WebDriverFactory.getDriver("firefox");
        driver.get("http://eurotech.study/login");
        Thread.sleep(2000);
        WebElement understandBtn = driver.findElement(By.id("rcc-confirm-button"));

        understandBtn.click();
        Thread.sleep(3000);

        WebElement loginBtn = driver.findElement(By.id("loginpage-form-btn"));
        loginBtn.click();

        String expectedUrl ="http://eurotech.study/login";
        String actualUrl = driver.getCurrentUrl();

        if(expectedUrl.equals((actualUrl))){
            System.out.println("passed");
        }else{
            System.out.println("failed");
        }

        Thread.sleep(2000);
        driver.close();




    }
}
