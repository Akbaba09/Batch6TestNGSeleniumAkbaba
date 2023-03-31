package eurotech.tests.day9_typesOfElements;
import eurotech.utilities.WebDriverFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DisplayedDemo {

    @Test
    public void test1() throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://the-internet.herokuapp.com/dynamic_loading");

        driver.findElement(By.xpath("//a[text()='Example 1: Element on page that is hidden']")).click();

        WebElement element = driver.findElement(By.xpath("//button[text()='Start']"));

        Thread.sleep(2000);

        WebElement helloWorld = driver.findElement(By.xpath("//h4[text()='Hello World!']"));

        Assert.assertFalse(helloWorld.isDisplayed(), "verifying Hello World is not displayed");

        element.click();
        Thread.sleep(5000);

        Assert.assertTrue(helloWorld.isDisplayed(), "verifying Hello World is displayed");
        driver.close();
    }
}
