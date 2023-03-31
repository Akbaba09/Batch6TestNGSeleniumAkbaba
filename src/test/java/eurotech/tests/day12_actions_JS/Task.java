package eurotech.tests.day12_actions_JS;

import eurotech.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Task {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.getDriver("firefox");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

    }

    @Test
    public void test1() {
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();

        Alert alert = driver.switchTo().alert();
        alert.accept();

    }

    @Test
    public void test2() {
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
        Alert alert = driver.switchTo().alert();
        alert.dismiss();

        String result = driver.findElement(By.cssSelector("#result")).getText();

        String expectedResult = "You clicked: Cancel";

        Assert.assertEquals(result,expectedResult, "verifying you clicked cancel");


    }

    @Test
    public void test3() {
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
        Alert alert = driver.switchTo().alert();
        alert.sendKeys("Group one was here");
        alert.accept();

        String actualResult =driver.findElement(By.cssSelector("#result")).getText();
        String expectedResult = "You entered: Group one was here";
        Assert.assertTrue(actualResult.equals(expectedResult));


    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);

    }
}
