package testsuite;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Utility;

public class RegisterTest extends Utility {

    String baseUrl = "https://parabank.parasoft.com/parabank/index.htm";

    @Before
    public void setUp() {

        openBrowser(baseUrl);
    }

    @Test
    public void verifyThatSigingUpPageDisplay() {
        //click on the 'Register Link'
        clickOnElement(By.xpath("//a[normalize-space()='Register']"));
        //Verify the text 'Signing up is easy'
        String expectedMessage = "Signing up is easy!";
        WebElement actualTextMessage = driver.findElement(By.xpath("//h1[normalize-space()='Signing up is easy!']"));
        String actualMessage = actualTextMessage.getText();
        //validate actual and expected
        Assert.assertEquals(expectedMessage, actualMessage);

    }

    @Test
    public void userShouldRegisterAccountSuccessfully() {
        //Click on Register Link
        clickOnElement(By.xpath("//a[normalize-space()='Register']"));
        //Enter First Name
        driver.findElement(By.xpath("//input[@id='customer.firstName']")).sendKeys("Freya");
        //Enter Last name
        sendTextToElement(By.xpath("//input[@id='customer.lastName']"), "Joshi");
        //Enter Address
        sendTextToElement(By.xpath("//input[@id='customer.address.street']"), "134 Camerose Avenue");
        // Enter City
        sendTextToElement(By.xpath("//input[@id='customer.address.city']"), "London");
        // Enter State
        sendTextToElement(By.xpath("//input[@id='customer.address.state']"), "UK");
        //Enter Zip Code
        sendTextToElement(By.xpath("//input[@id='customer.address.zipCode']"), "123456");
        //Enter Phone
        sendTextToElement(By.xpath("//input[@id='customer.phoneNumber']"), "07758417734");
        // Enter SSN
        sendTextToElement(By.xpath("//input[@id='customer.ssn']"), "12345");
        //Enter Username
        sendTextToElement(By.xpath("//input[@id='customer.username']"), "Freya2");
        // Enter Password
        sendTextToElement(By.xpath("//input[@id='customer.password']"), "abcdef1");
        // Enter Confirm
        sendTextToElement(By.xpath("//input[@id='repeatedPassword']"), "abcdef1");
        // Click on REGISTER button
        clickOnElement(By.xpath("//input[@value='Register']"));
        //Verify the text 'Your account was created successfully. You are now logged in.’
        String expectedMessage = "Your account was created successfully. You are now logged in.";
        WebElement actualtextMessage = driver.findElement(By.xpath("//p[contains(text(),'Your account was created successfully. You are now logged in')]"));
        String actualMessage = actualtextMessage.getText();
        Assert.assertEquals(expectedMessage, actualMessage);

    }

    @After
    public void tearDown() {
        closeBrowser();
    }

}