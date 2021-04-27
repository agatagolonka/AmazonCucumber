package com.agatagolonka.pages.amazon;

import com.agatagolonka.pages.BasePage;
import com.agatagolonka.pages.PageManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WishListPage extends BasePage {

    @FindBy(xpath = "//*[@id=\"add-to-wishlist-button-submit\"]")
    public static WebElement ADD_TO_WISHLIST;

    @FindBy(xpath = "//span[text()=\"View Your List\"]")
    public static WebElement VIEW_WISHLIST;

    @FindBy(xpath = "//span[@class=\"a-size-medium\" ]")
    public static WebElement EMPTY_LIST;

    @FindBy(xpath = "//span[@class=\"nav-line-2 nav-long-width\"]/span")
    public static WebElement NAVIGATION_ARROW;

    @FindBy(xpath = "//span[text()=\"Shopping List\"]")
    public static WebElement GO_TO_WISHLIST;

    public WishListPage(WebDriver driver, PageManager pageManage) {
        super(driver, pageManage);
    }

    public void addToWishlist() throws Exception {
        waitForElementToBeVisible(ADD_TO_WISHLIST);
        ADD_TO_WISHLIST.click();
    }

    public void goToWishlist() {
        waitForElementToBeVisible(NAVIGATION_ARROW);
        NAVIGATION_ARROW.click();
        waitForElementToBeVisible(GO_TO_WISHLIST);
        GO_TO_WISHLIST.click();
    }

    public boolean emptyList() {
        waitForElementToBeVisible(EMPTY_LIST);
        String str = "There are no items in this List. ";
        return !str.equals(EMPTY_LIST.getText());
    }

}
