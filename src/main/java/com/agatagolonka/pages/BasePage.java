package com.agatagolonka.pages;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class BasePage {
    private static int timeout = 10;
    public WebDriverWait wait;
    protected static WebDriver driver;

    public BasePage(WebDriver driver, PageManager pageManage) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }

    protected void openWebPage(String url) {
        driver.navigate().to(url);
    }

    public void click(WebElement element) {
        Actions actions = new Actions(driver);
        actions.click(element).perform();
    }

    protected void enterText(WebElement element, String text) {
        Actions actions = new Actions(driver);
        actions.sendKeys(element, text).perform();
    }

    public void waitForElementToBeVisible(WebElement element) throws NoSuchElementException {
        try {
            wait = new WebDriverWait(driver, timeout);
            wait.until(ExpectedConditions.visibilityOf(element));
        } catch (Exception e) {
            throw new NoSuchElementException(String.format("The element was not visible"));
        }
    }
    public void implicitWait(int secs) {

        driver.manage().timeouts().implicitlyWait(secs, TimeUnit.SECONDS);
    }
    protected void selectFromDropdownByText(WebElement element, String value) {
        Select dropdown = new Select(element);
        dropdown.selectByVisibleText(value);
    }


}
