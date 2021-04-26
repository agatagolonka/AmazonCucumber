package com.agatagolonka.pages.amazon;

import com.agatagolonka.pages.BasePage;
import com.agatagolonka.pages.PageManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ChangeLanguage extends BasePage {
    @FindBy(xpath = "//span[@class=\"icp-nav-flag icp-nav-flag-us\"]")
    public static WebElement COUNTRY;

    @FindBy(xpath = "//input[@value='de_DE']")
    public static WebElement DEUTSCH;


    @FindBy(xpath ="//input[@aria-labelledby]" )
    public static WebElement CONFIRM;

    @FindBy(id="nav-search-label-id" )
    public static WebElement ALL;

    public ChangeLanguage(WebDriver driver, PageManager pageManage) {
        super(driver, pageManage);
    }

    public void goToChangeCountry() throws Exception {
        waitForElementToBeVisible(COUNTRY);
        click(COUNTRY);
    }

    public void changeCountry(String string) throws Exception {
        waitForElementToBeVisible(DEUTSCH);
        click(DEUTSCH);
        click(CONFIRM);
    }

    public String getTextAfterChange(){
        waitForElementToBeVisible(ALL);
        return ALL.getText();
    }

}
