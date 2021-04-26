package com.agatagolonka.pages.amazon;

import com.agatagolonka.pages.BasePage;
import com.agatagolonka.pages.PageManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends BasePage {
    @FindBy(xpath = "//input[@id='add-to-cart-button']")
    public static WebElement ADD_TO_CART;
    @FindBy(xpath = "//span[@cel_widget_id='MAIN-SEARCH_RESULTS-1']//span[@class='a-size-base-plus a-color-base a-text-normal']")
    public static WebElement SEARCHED_ITEM ;

    public ProductPage(WebDriver driver, PageManager pageManage) {
        super(driver, pageManage);
    }

    public void openProductPage() {
        waitForElementToBeVisible(SEARCHED_ITEM);
        click(SEARCHED_ITEM);
        implicitWait(5);
    }

    public void addItemToCart() throws Exception {
        waitForElementToBeVisible(ADD_TO_CART);
        click(ADD_TO_CART);
        implicitWait(5);
    }
}
