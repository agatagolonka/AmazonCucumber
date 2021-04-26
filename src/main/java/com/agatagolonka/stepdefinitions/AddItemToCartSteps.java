package com.agatagolonka.stepdefinitions;

import com.agatagolonka.drivers.CucumberStepContext;
import com.agatagolonka.pages.PageManager;
import com.agatagolonka.properties.PropertyManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class AddItemToCartSteps {

    WebDriver driver = CucumberStepContext.getInstance().getDriver();
    PageManager pageManager = CucumberStepContext.getInstance().getPageManager();
    PropertyManager propertyManager = CucumberStepContext.getInstance().getPropertyManager();

    @When("Customer adds product from {string}")
    public void customerAddsProductFromDirectSearch(String product) throws Exception {
        pageManager.searchPage().implicitWait(5);
        pageManager.searchPage().searchSomething(product);
        pageManager.productPage().openProductPage();
        pageManager.productPage().addItemToCart();
    }

    @Then("Products should be present on basket page {string}")
    public void productsShouldBePresentOnBasketPageProductName(String product) throws Exception {
        pageManager.cartPage().goToCart();
        String sub= pageManager.cartPage().getProductsSubtotal();
        Assert.assertEquals(sub,1);
    }


    @Then("Customer delete product from Cart {string}")
    public void customerDeleteProductFromCartDirectSearch(String product) {
    }

    @And("Cart is empty")
    public void cartIsEmpty() {
    }

    @Then("Customer increment quantity  in basket {string}")
    public void customerIncrementQuantityInBasketProductName(String quantity) {
    }


}
