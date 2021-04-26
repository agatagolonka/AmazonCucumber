package com.agatagolonka.stepdefinitions;

import com.agatagolonka.drivers.CucumberStepContext;
import com.agatagolonka.pages.PageManager;
import com.agatagolonka.properties.PropertyManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class WishListSteps {
    WebDriver driver = CucumberStepContext.getInstance().getDriver();
    PageManager pageManager = CucumberStepContext.getInstance().getPageManager();
    PropertyManager propertyManager = CucumberStepContext.getInstance().getPropertyManager();
    @When("Customer add product to wishlist from {string}")
    public void customerAddProductToWishlistFromDirectSearch() {
    }

    @Then("Product should be present on wishlist {string}")
    public void productShouldBePresentOnWishlistProductName() {
    }
}
