package eurotech.tests.day14_PropertiesSingleton;

import eurotech.tests.TestBase;
import eurotech.utilities.ConfigurationReader;
import eurotech.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LoginTest extends TestBase {


    @Test
    public void testName() {
        driver.get(ConfigurationReader.get("url"));


        WebElement iUnderstandButton = driver.findElement(By.id("rcc-confirm-button"));
        WebElement userNameInput = driver.findElement(By.name("email"));
        WebElement passwordInput = driver.findElement(By.name("password"));
        WebElement loginButton =         driver.findElement(By.id("loginpage-form-btn"));

        iUnderstandButton.click();

        userNameInput.sendKeys(ConfigurationReader.get("userTeacher"));
        passwordInput.sendKeys(ConfigurationReader.get("userPassword"));
        loginButton.click();

    }


}
