package com.agatagolonka.stepdefinitions;

import com.agatagolonka.drivers.CucumberStepContext;
import com.agatagolonka.pages.PageManager;
import com.agatagolonka.properties.PropertyManager;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;

public class LocalizationSteps {


    WebDriver driver = CucumberStepContext.getInstance().getDriver();
    PageManager pageManager = CucumberStepContext.getInstance().getPageManager();
    PropertyManager propertyManager = CucumberStepContext.getInstance().getPropertyManager();


    @Given("Customer is on page with url {string}")
    public void customerIsOnPageWithUrlHomePageUrl(String pageName) {
        pageManager.open(propertyManager.getProperty(pageName))
                .waitForPageToLoad();
    }
}
