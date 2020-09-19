package org.example.pages.base;

import com.google.common.base.Predicate;
import lombok.Getter;
import lombok.Setter;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
@Setter
@DefaultUrl("http://automationpractice.com/")
public class BasePage extends PageObject {

    @FindBy(className = "login")
    private WebElement loginButton;

    @FindBy(className = "logout")
    private WebElement logoutButton;

    @FindBy(css = "#contact-link > a")
    private WebElement contactUsButton;

    public void clickOnTheSignInButton() {
        loginButton.click();
    }

    public void validateSignOutButton() {
        waitFor(logoutButton);

        Assert.assertEquals("Sign out", logoutButton.getText());
    }

}
