package com.agatagolonka.stepdefinitions;

import com.agatagolonka.drivers.CucumberStepContext;
import com.agatagolonka.pages.PageManager;
import com.agatagolonka.properties.PropertyManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class ProductSteps {
    WebDriver driver = CucumberStepContext.getInstance().getDriver();
    PageManager pageManager = CucumberStepContext.getInstance().getPageManager();
    PropertyManager propertyManager = CucumberStepContext.getInstance().getPropertyManager();
    @When("Customer add product to Cart from search {string}")
    public void customerAddProductToCartFromSearchDirectSearch(String product) throws Exception {
        pageManager.searchPage().implicitWait(5);
        pageManager.searchPage().searchSomething(product);
    }

    @And("Open product card")
    public void openProductCard() {
        pageManager.productPage().openProductPage();
    }


}
