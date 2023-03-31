package eurotech.tests.day4_basicLocators;

import eurotech.utilities.WebDriverFactory;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IdLocatorTest {
    public static void main(String[] args) throws InterruptedException {
       WebDriver driver = WebDriverFactory.getDriver("chrome");
//        driver.get("https://demoqa.com/text-box");
//        //driver.manage().window().maximize();
//        WebElement userNameInput = driver.findElement(By.id("userName"));
//
//        Faker faker = new Faker();
//        userNameInput.sendKeys(faker.name().fullName());
//        WebElement userEmail = driver.findElement(By.id("userEmail"));
//        userEmail.sendKeys(faker.internet().emailAddress());
//        String element = faker.artist().name();
//        System.out.println("element = " + element);
//
//        Thread.sleep(2000);


        driver.get("https://www.amazon.de/");
        driver.findElement(By.xpath("https://www.amazon.de/"));






    }
}
