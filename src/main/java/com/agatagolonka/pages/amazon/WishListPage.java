package com.agatagolonka.pages.amazon;

import com.agatagolonka.pages.BasePage;
import com.agatagolonka.pages.PageManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WishListPage extends BasePage {

    @FindBy(xpath = "//input[@id=\"add-to-wishlist-button-submit\"] ")
    public static WebElement ADD_TO_WISHLIST;

    @FindBy(xpath = "//span[text()=\"View Your List\"]")
    public static WebElement VIEW_WISHLIST;

    @FindBy(xpath = "//span[@class=\"a-size-medium\" ]")
    public static WebElement EMPTY_LIST;


    public WishListPage(WebDriver driver, PageManager pageManage) {
        super(driver, pageManage);
    }

        public void addToWishlist() throws Exception {
            waitForElementToBeVisible(ADD_TO_WISHLIST);
            ADD_TO_WISHLIST.click();
        }

        public void goToWishlist(){
            waitForElementToBeVisible(VIEW_WISHLIST);
            VIEW_WISHLIST.click();
        }

    public boolean emptyList(){
        waitForElementToBeVisible(EMPTY_LIST);
        String str ="There are no items in this List. ";
        return !str.equals(EMPTY_LIST.getText());
    }

}
