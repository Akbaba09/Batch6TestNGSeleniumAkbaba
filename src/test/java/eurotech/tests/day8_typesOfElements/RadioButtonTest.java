package eurotech.tests.day8_typesOfElements;

import eurotech.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RadioButtonTest {

    @Test
    public void testName() throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://demo.aspnetawesome.com/");
        driver.findElement(By.xpath("//*[@id=\"btnCookie\"]")).click();
        Thread.sleep(2000);

        WebElement vegetablesRadio = driver.findElement(By.xpath("//div[text()='Vegetables']/../input"));
//        Assert.assertTrue(vegetablesRadio.isSelected(),"Verifying that 'vegetables' radio button is selected");
//       // System.out.println("Verifying that 'vegetables' radio button is selected = "+vegetablesRadio.isSelected());


        WebElement legumesRadio = driver.findElement(By.xpath("//div[text()='Legumes']/../input"));
        Assert.assertFalse(legumesRadio.isSelected(), "Verifying that 'legumes' button is not selected");

        WebElement legumesClick = driver.findElement(By.xpath("//div[text()='Legumes']/../div[1]"));
        legumesClick.click();




        Assert.assertTrue(legumesRadio.isSelected(), "Verifying that 'legumes' button is selected");
        Assert.assertFalse(vegetablesRadio.isSelected());





        driver.close();



    }
}
