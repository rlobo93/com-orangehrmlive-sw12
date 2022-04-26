package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Utility;

public class LoginTest extends Utility {

    String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setup(){
        openBrowser(baseUrl);
    }

    @Test
    public void userSholdLoginSuccessfullyWithValidCredentials(){

        //locate username field and enter valid username
        sendTextToElement(By.id("txtUsername"),"Admin");

        //locate password field and enter valid password
        sendTextToElement(By.id("txtPassword"),"admin123");



        //locate login button and click it
        clickOnElement(By.id("btnLogin"));


        //Verify the ‘Welcome’ text is display
        verifyExpectedAndActual(By.id("welcome"),"Welcome");

    }




    @After
    public void teardown(){
        closeBrowser();
    }

}
