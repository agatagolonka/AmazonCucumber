package com.agatagolonka.stepdefinitions;

import com.agatagolonka.drivers.CucumberStepContext;
import com.agatagolonka.drivers.DriverManager;
import com.agatagolonka.pages.PageManager;
import com.agatagolonka.properties.PropertyManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class BaseStep {


    @Before
    public void setup(){
        CucumberStepContext.getInstance().setPropertyManager(new PropertyManager("amazon/amazon.properties"));
        CucumberStepContext.getInstance().setDriver(DriverManager.getDriver("Chrome", "GRID"));
        CucumberStepContext.getInstance().setPageManager( new PageManager(CucumberStepContext.getInstance().getDriver()));
}

    @After
    public void cleanUp(){
        CucumberStepContext.getInstance().getDriver().quit();
    }
}
