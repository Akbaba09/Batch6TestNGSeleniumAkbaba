package eurotech.tests.day9_typesOfElements;

import eurotech.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class SelectDropDownTest {
    WebDriver driver;
    @BeforeMethod
    public void setUp() {
        driver= WebDriverFactory.getDriver("chrome");

    }


    @Test
    public void test1() throws InterruptedException {

        driver.get("https://demoqa.com/select-menu");
        WebElement colorDropDown = driver.findElement(By.cssSelector("#oldSelectMenu"));

        Select select = new Select(colorDropDown);
        List<WebElement> colorOptions = select.getOptions();
        int expectedSize = 11;
        int actualSize = colorOptions.size();

        Assert.assertEquals(actualSize,expectedSize, "verifying there are "+expectedSize+ " colors");

        for (WebElement colorOption:colorOptions) {
            System.out.println("colorOption = " + colorOption.getText());

        }

        // verify the default color is red

        String defaultColor = "Red";
        String actualDefaultColor = select.getFirstSelectedOption().getText();
        Assert.assertEquals(actualDefaultColor, defaultColor, "verifying color is red");
        System.out.println("actualDefaultColor = " + actualDefaultColor);

        select.selectByVisibleText("Yellow");
        Thread.sleep(1000);
        Assert.assertTrue("Yellow".equals( select.getFirstSelectedOption().getText()), "verifying Yellow is selected");




        select.selectByIndex(2);
        Thread.sleep(1000);
        Assert.assertTrue("Green".equals( select.getFirstSelectedOption().getText()), "verifying Green is selected");

        select.selectByValue("8");
        Assert.assertTrue("Indigo".equals( select.getFirstSelectedOption().getText()), "verifying Indigo is selected");




    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.close();

    }
}
