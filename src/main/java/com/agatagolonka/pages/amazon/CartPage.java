package com.agatagolonka.pages.amazon;

import com.agatagolonka.pages.BasePage;
import com.agatagolonka.pages.PageManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class CartPage extends BasePage {


    @FindBy(id = "nav-cart")
    public static WebElement GO_TO_CART;


    @FindBy(xpath = "//input[@aria-labelledby=\"attach-sidesheet-view-cart-button-announce\"]")
    public static WebElement CONTINUE_GO_TO_CART;
    @FindBy(id = "sc-subtotal-label-activecart")
    public static WebElement SUBTOTAL;

    @FindBy(css = "input[value='Delete']")
    public static WebElement DELETE_BUTTONS;
    @FindBy(xpath = ("//h2[text()=\"\n" +
            "Your Amazon Cart is empty\n" +
            "\"]"))
    public static WebElement SHOPPING_CART_HEADER;
    @FindBy(xpath = "//select[@id='quantity']")
    public static WebElement QUANTITY;
    @FindBy(xpath = "//a[@id=\"dropdown1_4\"]")
    public static WebElement QUANTITY4;
    private final String SHOPPING_CART_EMPTY_MSG = "Your Amazon Cart is empty";
    private final String SHOPPING_CART_PAGE = "https://www.amazon.com/gp/cart/view.html?ref_=nav_cart";

    public CartPage(WebDriver driver, PageManager pageManage) {
        super(driver, pageManage);
    }

    public void goToCart() throws Exception {
        waitForElementToBeVisible(GO_TO_CART);
        GO_TO_CART.click();
    }

    public String getProductsSubtotal() {

        waitForElementToBeVisible(SUBTOTAL);
        return SUBTOTAL.getText();
    }

    public void deleteProduct() {
        waitForElementToBeVisible(DELETE_BUTTONS);
        DELETE_BUTTONS.click();

    }

    public boolean checkCartIsEmpty() {
        String actualMessage = SHOPPING_CART_HEADER.getText();
        System.out.println(actualMessage);
        return (actualMessage.equals(SHOPPING_CART_EMPTY_MSG));

    }

    public void incrementQuantity(String quantity){
            selectFromDropdownByText(QUANTITY, "4");
    }

    public void continueGoToCart() {
        implicitWait(5);
        waitForElementToBeVisible(CONTINUE_GO_TO_CART);
        CONTINUE_GO_TO_CART.click();

    }
}
