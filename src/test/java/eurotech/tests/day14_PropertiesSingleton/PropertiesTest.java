package eurotech.tests.day14_PropertiesSingleton;

import eurotech.utilities.ConfigurationReader;
import eurotech.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class PropertiesTest {
    @Test
    public void test1() throws InterruptedException {
        // WebDriver driver = WebDriverFactory.getDriver("chrome");
        WebDriver driver = WebDriverFactory.getDriver(ConfigurationReader.get("browser"));
        System.out.println("ConfigurationReader.get(\"browser\") = " + ConfigurationReader.get("browser"));


        // driver.get("http://eurotech.study/login");
        driver.get(ConfigurationReader.get("url"));
        System.out.println("ConfigurationReader.get(\"url\") = " + ConfigurationReader.get("url"));
        driver.findElement(By.id("rcc-confirm-button")).click();
        Thread.sleep(1000);
       // driver.findElement(By.name("email")).sendKeys("eurotech@gmail.com");
        driver.findElement(By.name("email")).sendKeys(ConfigurationReader.get("userTeacher"));
        System.out.println("ConfigurationReader.get(\"userTeacher\") = " + ConfigurationReader.get("userTeacher"));
        // driver.findElement(By.name("password")).sendKeys("Test12345!");
        driver.findElement(By.name("password")).sendKeys(ConfigurationReader.get("userPassword")+ Keys.ENTER);
        System.out.println("ConfigurationReader.get(\"userPassword\") = " + ConfigurationReader.get("userPassword"));
        // driver.findElement(By.id("loginpage-form-btn")).click();
        Thread.sleep(1000);

        String text = driver.findElement(By.className("my-2")).getText();
        System.out.println("text = " + text);

        driver.close();
    }

    @Test
    public void test2() {
      //   SingletonClassExample singleton = new SingletonClassExample(); // It is not possible to create this object, because it is private.
        SingletonClassExample singleton1 = SingletonClassExample.getInstanceOfSingletonClassExample();
        SingletonClassExample singleton2 = SingletonClassExample.getInstanceOfSingletonClassExample();


    }
}
