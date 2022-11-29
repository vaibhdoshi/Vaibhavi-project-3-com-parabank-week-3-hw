package utilities;

import browserfactory.BaseTest;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Utility extends BaseTest {



    /**
     * This method will click on element
     */

    public void clickOnElement(By by) {
        WebElement loginLink = driver.findElement(by);
        loginLink.click();
    }

    //This method will send text on element
    public void sendTextToElement(By by, String text) {
        driver.findElement(by).sendKeys(text);
    }

    // This method will get text from element
    public String getTextFromElement(By by) {
        return driver.findElement(by).getText();

    }

    public void verifyMessage(By by, String expectedText, String actualText) {
        String expectedMessage;
        WebElement actualTextMessage = driver.findElement(by);
        String actualMessage = actualTextMessage.getText();
        Assert.assertEquals(expectedText, actualText);


    }


}






