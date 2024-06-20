package pages;

import library.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass {
    @FindBy(className = "login_logo")
    private WebElement logo;

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public String verifyURL() {
        return driver.getCurrentUrl();
    }

    public boolean verifyLogo() {
        return logo.isDisplayed();
    }
}
