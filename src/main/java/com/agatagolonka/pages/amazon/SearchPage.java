package com.agatagolonka.pages.amazon;

import com.agatagolonka.pages.BasePage;
import com.agatagolonka.pages.PageManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

import java.util.List;

public class SearchPage extends BasePage {

    @FindBy(id = "twotabsearchtextbox")
    public static WebElement SEARCH_FIELD;
    @FindBy(id = "nav-search-submit-button")
    public static WebElement SEARCH_BUTTON;
    @FindBy(id = "search")
    public static WebElement RESULT_ITEM;

    @FindBys({
            @FindBy(xpath = "//a[@class='a-link-normal a-text-normal']")})
    public static List<WebElement> LIST_OF_ITEMS;

    public SearchPage(WebDriver driver, PageManager pageManage) {
        super(driver, pageManage);
    }

    public void searchSomething(String product) throws Exception {
        waitForElementToBeVisible(SEARCH_FIELD);
        enterText(SEARCH_FIELD, product);
        click(SEARCH_BUTTON);
    }

    public String getProductName() {
        return LIST_OF_ITEMS.get(0).getText();
    }

    public SearchPage firstItem() {
        click(LIST_OF_ITEMS.get(0));
        return this;
    }

}
