package eurotech.tests.day15_POM;

import eurotech.Pages.LoginPage;
import eurotech.tests.TestBase;
import eurotech.utilities.ConfigurationReader;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PositiveLoginTest extends TestBase {
    LoginPage loginPage = new LoginPage();
    @Test
    public void login() throws InterruptedException {
        driver.get(ConfigurationReader.get("url"));


        loginPage.iUnderstandButton.click();
        loginPage.userNameInput.sendKeys(ConfigurationReader.get("userTeacher"));
        loginPage.passwordInput.sendKeys(ConfigurationReader.get("userPassword"));
        loginPage.loginButton.click();
        Thread.sleep(2000);

        Assert.assertEquals(driver.getCurrentUrl(), "http://eurotech.study/dashboard", "verifying that user successfully logged in" );


    }

    @Test
    public void loginWithMethod() {
        driver.get(ConfigurationReader.get("url"));
        String username = ConfigurationReader.get("userTeacher");
        String password = ConfigurationReader.get("userPassword");
        loginPage.login(username,password);
        Assert.assertEquals(driver.getCurrentUrl(), "http://eurotech.study/dashboard", "verifying that user successfully logged in" );

    }

    @Test
    public void loginWithLoginAsTeacher() throws InterruptedException {
        driver.get(ConfigurationReader.get("url"));
        loginPage.loginAsTeacher();
        Thread.sleep(2000);
        Assert.assertEquals(driver.getCurrentUrl(), "http://eurotech.study/dashboard", "verifying that user successfully logged in" );


    }
}
