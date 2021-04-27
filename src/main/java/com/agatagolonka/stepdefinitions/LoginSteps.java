package com.agatagolonka.stepdefinitions;

import com.agatagolonka.drivers.CucumberStepContext;
import com.agatagolonka.pages.PageManager;
import com.agatagolonka.properties.PropertyManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginSteps {

    WebDriver driver = CucumberStepContext.getInstance().getDriver();
    PageManager pageManager = CucumberStepContext.getInstance().getPageManager();
    PropertyManager propertyManager = CucumberStepContext.getInstance().getPropertyManager();

    @When("^Enter the (.*) and (.*)$")
    public void enterTheEmailAndPassword(String email, String password) throws Exception {
        pageManager.signInPage().clickStartLogin();
        pageManager.signInPage().enterUsername(email);
        pageManager.signInPage().clickContinue();
        pageManager.signInPage().enterPassword(password);


    }

    @And("Click On SignIn Button")
    public void clickOnSignInButton() throws Exception {
        pageManager.signInPage().clickSignInButton();
    }


    @Then("Username should be correct {string}")
    public void usernameShouldBeCorrectUsername(String username) {

        pageManager.signInPage().getUserName();
        String str = pageManager.signInPage().getUserName();
        Assert.assertTrue(str.contains(username));

    }

    @Then("Login is immpossible")
    public void loginIsImmpossible() {


    }
}
