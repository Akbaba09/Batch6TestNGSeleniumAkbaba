package eurotech.tests.day13_Webtables;

import eurotech.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.sql.SQLOutput;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class WebTables {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
        driver.findElement(By.id("ez-accept-all")).click();
        WebElement demeoTable = driver.findElement(By.xpath("//h3[text()='Demo Table 2']"));
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].scrollIntoView(true);",demeoTable);

    }

    @Test
    public void printTable() {

        //print table
        WebElement table1 = driver.findElement(By.xpath("//table[@border='1']"));
        System.out.println(table1.getText());
        //table[@id='customers']

        System.out.println("*******************************************************");

        WebElement table2 = driver.findElement(By.xpath("//table[@id='customers']"));
        System.out.println("table2.getText() = " + table2.getText());

    }


    @Test
    public void getAllHeaders() {


//        for (WebElement element : driver.findElements(By.xpath("//table[@border='1']/thead//th"))) {
//            System.out.println("element.getText() = " + element.getText());
//
//        }


        List<WebElement> allHeaders = driver.findElements(By.xpath("//table[@border='1']/thead//th"));
        System.out.println("allHeaders.size() = " + allHeaders.size());

        for (WebElement allHeader : allHeaders) {
            System.out.println("allHeader.getText() = " + allHeader.getText());
        }

        System.out.println("****************************");

//
//        for (WebElement element : driver.findElements(By.xpath("//table[@border='1']/tbody//tr"))) {
//            System.out.println("element.getText() = " + element.getText());
//
//        }


        List<WebElement> rows = driver.findElements(By.xpath("//table[@border='1']/tbody/tr"));
        System.out.println("rows.size() = " + rows.size());

        for (WebElement row : rows) {
            System.out.println("row.getText() = " + row.getText());
        }

    }











    @AfterMethod
    public void tearDown() throws InterruptedException {

        Thread.sleep(2000);
        driver.quit();
    }


}
