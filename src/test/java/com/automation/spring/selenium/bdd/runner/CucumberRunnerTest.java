package com.automation.spring.selenium.bdd.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(
        features = "classpath:features/",
        glue = "com.automation.spring.selenium.bdd.steps",
        plugin = {"pretty", "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"}
)
public class CucumberRunnerTest extends AbstractTestNGCucumberTests {

    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }

}
