package eurotech.tests.day13_Webtables;

import eurotech.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;


public class DynamicWebTable {

    WebDriver driver;
    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);


    }

    @Test
    public void dynamicNegative() {

        driver.get("https://demoqa.com/webtables");
        WebElement kierra = driver.findElement(By.xpath("//div[@class='rt-tbody']/div[3]/div/div[1]"));
        System.out.println("Before Click "+ kierra.getText());


        driver.findElement(By.xpath("//*[text()='Last Name']")).click();

        System.out.println("After Click "+kierra.getText());


    }

    @Test
    public void dynamicPositive() {
        driver.get("https://demoqa.com/webtables");

        WebElement kierra = driver.findElement(By.xpath("//*[text()='Kierra']"));
        System.out.println("Before Click "+ kierra.getText());

        WebElement element = driver.findElement(By.xpath("//*[text()='Last Name']"));
        element.click();



        kierra = driver.findElement(By.xpath("//*[text()='Kierra']"));
        System.out.println("After Click "+kierra.getText());
        Assert.assertEquals(kierra.getText(),"Kierra");
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {

        Thread.sleep(2000);
        driver.quit();
    }
}
