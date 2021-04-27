package com.agatagolonka.stepdefinitions;

import com.agatagolonka.drivers.CucumberStepContext;
import com.agatagolonka.pages.PageManager;
import com.agatagolonka.properties.PropertyManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class WishListSteps {
    WebDriver driver = CucumberStepContext.getInstance().getDriver();
    PageManager pageManager = CucumberStepContext.getInstance().getPageManager();
    PropertyManager propertyManager = CucumberStepContext.getInstance().getPropertyManager();


    @Then("Product should be present on wishlist")
    public void productShouldBePresentOnWishlist() {
        Assert.assertFalse(pageManager.wishListPage().emptyList());
    }


    @And("Customer add product to wishlist {string}")
    public void customerAddProductToWishlistItemPageUrl(String pageName) throws Exception {
        pageManager.open(propertyManager.getProperty(pageName))
                .waitForPageToLoad();
        pageManager.wishListPage().goToWishlist();
        pageManager.wishListPage().addToWishlist();
    }

    @When("Add product to wishlist")
    public void addProductToWishlist() throws Exception {
        pageManager.wishListPage().addToWishlist();
    }

}
