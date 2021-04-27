package com.agatagolonka.pages.amazon;

import com.agatagolonka.pages.BasePage;
import com.agatagolonka.pages.PageManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class SignInPage extends BasePage {

    @FindBy(css = "#ap_email")
    public static WebElement USERNAME;
    @FindBy(css = "#ap_password")
    public static WebElement PASSWORD;
    @FindBy(css = "#signInSubmit")
    public static WebElement SIGNIN_BUTTON;
    @FindBy(id = "nav-link-accountList")
    public static WebElement START_LOGIN;
    @FindBy(id = "continue")
    public static WebElement CONTINUE_LOGIN;
    @FindBy(id = "nav-link-accountList-nav-line-1")
    public static WebElement ACCOUNT_NAME;

    public SignInPage(WebDriver driver, PageManager pageManage) {
        super(driver, pageManage);
    }

    public void enterUsername(String userName) {
        waitForElementToBeVisible(USERNAME);
        enterText(USERNAME, userName);
    }

    public void enterPassword(String password) {
        waitForElementToBeVisible(PASSWORD);
        enterText(PASSWORD, password);
    }

    public String getUserName() {
        waitForElementToBeVisible(ACCOUNT_NAME);
        return ACCOUNT_NAME.getText();
    }

    public void clickStartLogin() throws Exception {
        click(START_LOGIN);
    }

    public void clickContinue() throws Exception {
        click(CONTINUE_LOGIN);
    }

    public void clickSignInButton() throws Exception {
        click(SIGNIN_BUTTON);
    }
}
