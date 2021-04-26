package com.agatagolonka.stepdefinitions;

import com.agatagolonka.drivers.CucumberStepContext;
import com.agatagolonka.pages.PageManager;
import com.agatagolonka.properties.PropertyManager;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class ChangeLanguageSteps {
    WebDriver driver = CucumberStepContext.getInstance().getDriver();
    PageManager pageManager = CucumberStepContext.getInstance().getPageManager();
    PropertyManager propertyManager = CucumberStepContext.getInstance().getPropertyManager();

    @When("Customer change language {string}")
    public void customerChangeLanguageLanguage(String language) throws Exception {
        pageManager.changeLanguage().goToChangeCountry();
        pageManager.changeLanguage().changeCountry(language);

    }

    @Then("Language should be changed")
    public void languageShouldBeChanged() {
        Assert.assertFalse(pageManager.changeLanguage().getTextAfterChange()=="All");
    }
}
