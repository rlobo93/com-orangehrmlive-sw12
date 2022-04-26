package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Utility;

public class ForgotPasswordTest extends Utility {

    String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setup(){
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully(){

        //locate ‘Forgot your password’ link and click
        clickOnElement(By.xpath("//a[contains(text(),'Forgot your password?')]"));

        // Verify the text ‘Forgot Your Password?’
        verifyExpectedAndActual(By.xpath("//h1[contains(text(),'Forgot Your Password?')]"),"Forgot Your Password?");

    }


    @After
    public void teardown(){
        closeBrowser();
    }
}
