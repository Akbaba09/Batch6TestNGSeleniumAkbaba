package eurotech.tests;

import eurotech.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class TestBase {

    protected WebDriver driver;
    protected WebDriverWait wait;

    @BeforeClass
    public void beforeClass() {
        driver = Driver.get();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, 15);
    }


    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        Driver.closeDriver();

    }








}
