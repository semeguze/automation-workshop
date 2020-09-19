package org.example.pages.base;

import lombok.Getter;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

@Getter
@DefaultUrl("http://automationpractice.com/")
public class BasePage extends PageObject {

    @FindBy(className = "login")
    private WebElement loginButton;

    @FindBy(className = "logout")
    private WebElement logoutButton;

    public void clickOnTheSignInButton() {
        loginButton.click();
    }

    public void validateSignOutButton() {
        waitFor(logoutButton);
        Assert.assertEquals("Sign out", logoutButton.getText());
    }

}
