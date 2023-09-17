package testng;

import org.testng.annotations.*;

public class TestAnnotations {


    @BeforeSuite
    public void beforeSuite() {
        System.out.println("BEFORE SUITE: The annotated method will be run before all tests in this suite have run.");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("BEFORE TEST: The annotated method will be run before any test method belonging to the classes inside the <test> tag is run.");
    }

    @BeforeGroups
    public void beforeGroups() {
        System.out.println("BEFORE GROUPS: The list of groups that this configuration method will run before. This method is guaranteed to run shortly before the first test method that belongs to any of these groups is invoked.");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("BEFORE CLASS: The annotated method will be run before the first test method in the current class is invoked.");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("BEFORE METHOD: The annotated method will be run before each test method.");
    }


    @Test
    public void annotationsNewGeneration() {
        System.out.println("");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("AFTER SUITE: The annotated method will be run after all tests in this suite have run.");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("AFTER TEST: The annotated method will be run after all the test methods belonging to the classes inside the <test> tag have run.");
    }

    @AfterGroups
    public void afterGroups() {
        System.out.println("AFTER GROUPS: The list of groups that this configuration method will run before. This method is guaranteed to run shortly before the first test method that belongs to any of these groups is invoked.");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("AFTER CLASS: The annotated method will be run after all the test methods in the current class have been run.");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("AFTER METHOD:  The annotated method will be run after each test method.");
    }
}
