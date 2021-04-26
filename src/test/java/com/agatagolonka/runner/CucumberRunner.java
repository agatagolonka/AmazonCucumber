package com.agatagolonka.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features = "src/test/resources/features/", glue ="com.agatagolonka.stepdefinitions")
public class CucumberRunner extends AbstractTestNGCucumberTests {


}
