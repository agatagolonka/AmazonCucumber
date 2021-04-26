package com.agatagolonka.pages.amazon;

import com.agatagolonka.pages.BasePage;
import com.agatagolonka.pages.PageManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends BasePage {

    @FindBy(id = "twotabsearchtextbox")
    public static WebElement SEARCH_FIELD ;
    @FindBy(id = "nav-search-submit-button")
    public static WebElement SEARCH_BUTTON ;
    @FindBy(id = "search")
    public static WebElement RESULT_ITEM ;

    public SearchPage(WebDriver driver, PageManager pageManage) {
        super(driver, pageManage);
    }

    public void searchSomething(String product) throws Exception {
        waitForElementToBeVisible(SEARCH_FIELD);
        enterText(SEARCH_FIELD, product);
        click(SEARCH_BUTTON);
    }

    public String getProductName() {
        return RESULT_ITEM.getText();
    }

}
