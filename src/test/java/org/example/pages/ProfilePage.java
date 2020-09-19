package org.example.pages;

import lombok.Getter;
import net.thucydides.core.annotations.NamedUrl;
import net.thucydides.core.annotations.NamedUrls;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
@NamedUrls({@NamedUrl(name = "Authentication Page", url = "/index.php?controller=my-account")})
public class ProfilePage extends PageObject {

    @FindBy(className = "page-heading")
    private WebElement accountLabel;

    public void checkProfilePage() {
        Assert.assertEquals("MY ACCOUNT", accountLabel.getText());
    }
}
