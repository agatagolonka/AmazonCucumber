package com.agatagolonka.drivers;

import com.agatagolonka.pages.PageManager;
import com.agatagolonka.properties.PropertyManager;
import org.openqa.selenium.WebDriver;

public class CucumberStepContext {

    private static CucumberStepContext instance;
    WebDriver driver;
    PageManager pageManager;
    PropertyManager propertyManager;

    private CucumberStepContext() {
    }

    public static CucumberStepContext getInstance() {
        if (instance == null)
            instance = new CucumberStepContext();
        return instance;
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    public PageManager getPageManager() {
        return pageManager;
    }

    public void setPageManager(PageManager pageManager) {
        this.pageManager = pageManager;
    }

    public PropertyManager getPropertyManager() {
        return propertyManager;
    }

    public void setPropertyManager(PropertyManager propertyManager) {
        this.propertyManager = propertyManager;
    }

}
