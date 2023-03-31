package eurotech.tests.day9_typesOfElements;


import eurotech.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AttributeTest {

    @Test
    public void test1() throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://demoqa.com/text-box");

        WebElement fullName = driver.findElement(By.cssSelector("#userName"));

        System.out.println(fullName.getAttribute("id"));
        System.out.println(fullName.getAttribute("autocomplete"));
        System.out.println(fullName.getAttribute("placeholder"));
        System.out.println(fullName.getAttribute("type"));
        System.out.println(fullName.getAttribute("class"));

        System.out.println("outerHTML: "+ fullName.getAttribute("outerHTML"));
        System.out.println("innerHTML: "+ fullName.getAttribute("innerHTML"));


        WebElement fullNameBroad = driver.findElement(By.xpath("//div[@id='userName-wrapper']"));
        System.out.println("outerHTML: "+ fullNameBroad.getAttribute("outerHTML"));
        System.out.println("innerHTML: "+ fullNameBroad.getAttribute("innerHTML"));

        System.out.println("driver.getPageSource() = " + driver.getPageSource());


        Thread.sleep(1000);
        driver.close();


    }






}
