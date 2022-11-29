package testsuite;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

public class LoginTest extends Utility {

    String baseUrl = "https://parabank.parasoft.com/parabank/index.htm";

    @Before
    public void setUp() {

        openBrowser(baseUrl);
    }

    @Test

    public void userShouldLoginSuccessfullyWithValidCredentials() {
        //Enter valid username
        sendTextToElement(By.xpath("//input[@name='username']"), "Freya2");
        //Enter valid password
        sendTextToElement(By.xpath("//input[@name='password']"), "abcdef1");
        //Click on 'Login Button'
        clickOnElement(By.xpath("//input[@value='Log In']"));
        //Verify the 'Accounts Overview' text is display
        //can not verify above as I can not log in internal error has occured
        ///html/body/div[1]/div[3]/div[2]/div/div/h1


    }


    @Test

    public void verifyTheErrorMessage() {
        //Enter invalid username
        sendTextToElement(By.xpath("//input[@name='username']"), "Freya");
        //enter invalid password
        sendTextToElement(By.xpath("//input[@name='password']"), "abcdefg");
        //Click on LoginButton
        clickOnElement(By.xpath("//input[@value='Log In']"));
        //Verify the error message ‘The username and password could not be verified.’
        //can not verify above as I can not log in internal error has occured
        //html/body/div[1]/div[3]/div[2]/p

    }


    @Test

    public void userShouldLogOutSuccessfully() {
        //Enter valid username
        sendTextToElement(By.xpath("//input[@name='username']"), "Freya2");
        //Enter valid password
        sendTextToElement(By.xpath("//input[@name='password']"), "abcdefg");
        //click on 'Login'button
        clickOnElement(By.xpath("//input[@value='Log In']"));
        //click on 'Log out' link
        clickOnElement(By.xpath("']"));
        //Verify the text'Customer Login'
        //can not verify above as I can not log in internal error has occured
        ///html/body/div[1]/div[3]/div[1]/h2


    }


    @After
    public void tearDown() {
        closeBrowser();
    }

}
