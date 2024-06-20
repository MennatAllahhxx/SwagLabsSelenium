package tests;

import library.BaseClass;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginPageTest extends BaseClass {

    LoginPage login;

    @BeforeMethod
    public void setup() {
        login = new LoginPage(driver);
    }

    @Test
    public void verifyURL() {
        String actualURL = login.verifyURL();
        String expectedURL = "https://www.saucedemo.com/";
        Assert.assertEquals(actualURL, expectedURL);
    }

    @Test
    public void verifyLogo() {
        Assert.assertTrue(login.verifyLogo());
    }
}
