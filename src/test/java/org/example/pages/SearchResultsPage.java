package org.example.pages;

import net.serenitybdd.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchResultsPage extends PageObject {

    @FindBy(css = ".product_list  .product-container")
    private List<WebElement> searchResultList;

    public void validateSearchPerformed() {
        Assert.assertTrue(searchResultList.size() > 0);
    }

    /**
     * @param productName Name of the product
     */
    public void validateProductExists(String productName) {

        boolean elementFound = false;

        // I'm using this to get the name of the product for each product container
        for (WebElement element :searchResultList) {
            if (element.findElement(By.className("product-name")).getText().contains(productName)){
                elementFound = true;
            }
        }

        Assert.assertTrue("The product name should be displayed", elementFound);
    }
}
