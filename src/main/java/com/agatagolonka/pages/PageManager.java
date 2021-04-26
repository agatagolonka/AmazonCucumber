package com.agatagolonka.pages;

import com.agatagolonka.pages.amazon.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PageManager {

    private static final Logger logger = LogManager.getLogger(PageManager.class.getSimpleName());

    public WebDriver driver;
    private HomePage homePage;
    private CartPage cartPage;
    private SignInPage signInPage;
    private SearchPage searchPage;
    private ProductPage productPage;
    private ChangeLanguage changeLanguage;
    private WishListPage wishListPage;


    public PageManager(WebDriver driver){
        this.driver = driver;
    }

    public HomePage homePage(){
        if(homePage == null)
            homePage = new HomePage(driver, this);
        return homePage;
    }

    public CartPage cartPage(){
        if(cartPage == null)
            cartPage = new CartPage(driver, this);
        return cartPage;
    }
    public ChangeLanguage changeLanguage(){
        if(changeLanguage == null)
            changeLanguage = new ChangeLanguage(driver, this);
        return changeLanguage;
    }

    public SignInPage signInPage(){

        if(signInPage == null)
            signInPage = new SignInPage(driver, this);
        return signInPage;
    }
    public WishListPage wishListPage(){

        if(wishListPage == null)
            wishListPage = new WishListPage(driver, this);
        return wishListPage;
    }
    public SearchPage searchPage(){

        if(searchPage== null)
            searchPage = new SearchPage(driver, this);
        return searchPage;
    }
    public ProductPage productPage(){

        if(productPage== null)
            productPage = new ProductPage(driver, this);
        return productPage;
    }


    public PageManager open(String url){
        logger.info("Opening page with url: " + url);
        driver.navigate().to(url);
        return this;
    }

    public PageManager waitForPageToLoad(){
        logger.info("Waiting till next page is loaded");
        new WebDriverWait(driver, Duration.ofSeconds(3)).until(
            webDriver -> ((JavascriptExecutor) webDriver).executeScript("return document.readyState").equals("complete"));
        return this;
    }
}
