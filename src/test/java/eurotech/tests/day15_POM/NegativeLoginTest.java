package eurotech.tests.day15_POM;

import eurotech.Pages.LoginPage;
import eurotech.tests.TestBase;
import eurotech.utilities.ConfigurationReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NegativeLoginTest extends TestBase {
    LoginPage loginPage = new LoginPage();


    @Test
    public void wrongPassword() {
        driver.get(ConfigurationReader.get("url"));


        WebElement iUnderstandButton = driver.findElement(By.id("rcc-confirm-button"));
        WebElement userNameInput = driver.findElement(By.name("email"));
        WebElement passwordInput = driver.findElement(By.name("password"));
        WebElement loginButton =  driver.findElement(By.id("loginpage-form-btn"));

        iUnderstandButton.click();

        userNameInput.sendKeys(ConfigurationReader.get("userTeacher"));
        passwordInput.sendKeys(ConfigurationReader.get("userPassword"));
        loginButton.click();

        WebElement warningMessage = driver.findElement(By.xpath("//div[text()='Invalid Credentials!']"));



        Assert.assertTrue(warningMessage.isDisplayed(),"verifying warning message is displayed upon invalid login");
        Assert.assertEquals(warningMessage.getText(), "Invalid Credentials!", "verifying the warning message equal to Invalid Credentials!");

    }
    @Test
    public void wrongPassword2() {

       // LoginPage loginPage = new LoginPage();
        driver.get(ConfigurationReader.get("url"));



        loginPage.iUnderstandButton.click();
        loginPage.userNameInput.sendKeys(ConfigurationReader.get("userTeacher"));
        loginPage.passwordInput.sendKeys(ConfigurationReader.get("userPassword"));
        loginPage.loginButton.click();


        Assert.assertTrue(loginPage.warningMessage.isDisplayed(),"verifying warning message is displayed upon invalid login");
        Assert.assertEquals(loginPage.warningMessage.getText(), "Invalid Credentials!", "verifying the warning message equal to Invalid Credentials!");

    }
    @Test
    public void wrongUsername() {

        //LoginPage loginPage = new LoginPage();
        driver.get(ConfigurationReader.get("url"));



        loginPage.iUnderstandButton.click();
        loginPage.userNameInput.sendKeys(ConfigurationReader.get("invalidUsername@gmail.com"));
        loginPage.passwordInput.sendKeys(ConfigurationReader.get("userPassword"));
        loginPage.loginButton.click();


        Assert.assertTrue(loginPage.warningMessage.isDisplayed(),"verifying warning message is displayed upon invalid login");
        Assert.assertEquals(loginPage.warningMessage.getText(), "Invalid Credentials!", "verifying the warning message equal to Invalid Credentials!");



    }






}








