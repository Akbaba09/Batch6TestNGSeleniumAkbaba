package eurotech.tests.day7_testNG;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testNGAssertions {
    @Test
    public void test1(){
        System.out.println("verifying whether login is successful");
        String expectedTitel ="title";
        String actualTitel = "title";
        Assert.assertEquals(actualTitel,expectedTitel);




    }

    @Test
    public void test2(){
        String expectedText = "vEuro";
        String actualText = "Eurotech";
       // Assert.assertTrue(actualText.startsWith(expectedText));
        Assert.assertTrue((actualText.startsWith(expectedText)),"Verifying title to start with the expected text");
        System.out.println("test continues");
    }

    @Test
    public void test3() {
        Assert.assertFalse(0 > 1);


    }

    @Test
    public void test4() {
        Assert.assertNotEquals("Title","title");
    }

    @Test
    public void test5() {

    }

    @BeforeMethod

    public void setUp(){
        System.out.println("setting up browser");

    }
    @AfterMethod
    public void tearDown(){
        System.out.println("closing the browser");

    }


}
