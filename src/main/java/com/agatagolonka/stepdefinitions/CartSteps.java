package com.agatagolonka.stepdefinitions;

import com.agatagolonka.drivers.CucumberStepContext;
import com.agatagolonka.pages.PageManager;
import com.agatagolonka.properties.PropertyManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class CartSteps {

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
        pageManager.cartPage().continueGoToCart();
        String sub= pageManager.cartPage().getProductsSubtotal();
        Assert.assertEquals(sub,1);
    }



    @And("Cart is empty")
    public void cartIsEmpty() {
        pageManager.cartPage().implicitWait(5);
        Assert.assertTrue(pageManager.cartPage().checkCartIsEmpty());
    }

    @Then("Customer increment quantity  in basket {string}")
    public void customerIncrementQuantityInBasketProductName(String quantity) throws Exception {
        pageManager.cartPage().goToCart();
        pageManager.cartPage().incrementQuantity(quantity);
    }


    @Then("Products should be present on basket page")
    public void productsShouldBePresentOnBasketPage() throws Exception {
        pageManager.cartPage().goToCart();
        String sub = pageManager.cartPage().getProductsSubtotal();
        Assert.assertEquals(sub, "Subtotal (1 item):");

    }

    @When("Customer adds product to cart")
    public void customerAddsProductToCart() throws Exception {
        pageManager.productPage().addItemToCart();
        pageManager.productPage().implicitWait(5);

    }

    @Then("Customer delete product from Cart")
    public void customerDeleteProductFromCart() throws Exception {

        pageManager.cartPage().goToCart();
        pageManager.cartPage().implicitWait(3);
        pageManager.cartPage().deleteProduct();
    }

    @Then("Search result count is more than {string}")
    public void searchResultCountIsMoreThanQuantity() {
        pageManager.productPage().implicitWait(5);
        String sub = pageManager.cartPage().getProductsSubtotal();
        Assert.assertEquals(sub, "Subtotal (4 items):");
    }
}
