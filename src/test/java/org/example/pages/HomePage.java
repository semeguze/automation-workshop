package org.example.pages;

import com.google.j2objc.annotations.Weak;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("http://automationpractice.com/")
public class HomePage extends PageObject {

    @FindBy(id = "search_query_top")
    private WebElement searchTextField;

    @FindBy(name = "submit_search")
    private WebElement searchButton;

    public void searchProduct(String clothe) {
        waitFor(searchTextField);
        searchTextField.sendKeys(clothe);

        Assert.assertNotNull("The search box should contain text", searchTextField.getText());

        //searchTextField.sendKeys(Keys.ENTER);
        searchButton.click();

    }
}
