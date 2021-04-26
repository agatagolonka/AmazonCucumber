package com.agatagolonka.stepdefinitions;

import com.agatagolonka.drivers.CucumberStepContext;
import com.agatagolonka.pages.PageManager;
import com.agatagolonka.properties.PropertyManager;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;;

public class SearchSteps {
    WebDriver driver = CucumberStepContext.getInstance().getDriver();
    PageManager pageManager = CucumberStepContext.getInstance().getPageManager();
    PropertyManager propertyManager = CucumberStepContext.getInstance().getPropertyManager();

    @When("Customer performs search for {string}")
    public void customerPerformsSearchForSearchingProduct(String product) throws Exception {
        pageManager.searchPage().implicitWait(5);
        pageManager.searchPage().searchSomething(product);



    }

    @Then("Page title contains {string}")
    public void pageTitleContainsSearchResult(String product) {
        pageManager.searchPage().implicitWait(5);
        String str = pageManager.searchPage().getProductName();
        Assert.assertTrue(str.contains(product));
    }

}
