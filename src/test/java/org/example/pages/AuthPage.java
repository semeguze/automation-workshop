package org.example.pages;

import lombok.Getter;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.NamedUrl;
import net.thucydides.core.annotations.NamedUrls;
import net.thucydides.core.pages.PageObject;
import org.apache.commons.lang3.StringUtils;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
//@NamedUrls({@NamedUrl(name = "authenticationPage", url = "/index.php?controller=authentication&back=my-account")})
@DefaultUrl("http://automationpractice.com/index.php?controller=authentication&back=my-account")
public class AuthPage extends PageObject {

    @FindBy(css = "[id='login_form'] [id='email']")
    private WebElement usernameTextField;

    @FindBy(css = "[id='login_form'] [id='passwd']")
    private WebElement passwordTextField;

    @FindBy(id = "SubmitLogin")
    private WebElement loginButton;

    public void enterUsernameCredential(String username) {
        waitFor(usernameTextField);
        usernameTextField.clear();
        usernameTextField.sendKeys(username);
    }

    public void enterPasswordCredential(String password) {
        waitFor(passwordTextField);
        passwordTextField.clear();
        passwordTextField.sendKeys(password);
    }

    public void performTheSignInAction(){
        waitFor(loginButton);
        loginButton.click();
    }

    public void checkAuthPage() {
        Assert.assertTrue("Username text field should be visible", getUsernameTextField().isDisplayed());
        Assert.assertTrue("Password text field should be visible", getPasswordTextField().isDisplayed());
    }

    public void checkLoginData() {
        Assert.assertNotNull("Username text field should contain a value", getUsernameTextField().getText());
        Assert.assertNotNull("Password text field should contain a value", getPasswordTextField().getText());
    }
}
