package eurotech.tests.day7_testNG;

import org.testng.annotations.*;

public class testNGAnnotations {

    @Test
    public void test1(){
        System.out.println("This is test1");

    }

    @Test
    public void test2(){
        System.out.println("This is test2");

    }

    @BeforeMethod

    public void setUp(){
        System.out.println("setting up browser");

    }

    @AfterMethod
    public void tearDown(){
        System.out.println("closing the browser");

    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("this is before class");
    }

    @AfterClass

    public void afterClass(){
        System.out.println("This is after class");
    }








}
