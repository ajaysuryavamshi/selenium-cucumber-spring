package com.automation.spring.selenium.bdd.steps;

import com.automation.spring.selenium.bdd.annotation.LazyAutowired;
import com.automation.spring.selenium.bdd.util.ScreenshotUtil;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

import java.io.IOException;

public class BaseSteps {

    @Autowired
    private ApplicationContext applicationContext;

    @LazyAutowired
    private ScreenshotUtil screenshotUtil;

    @After
    public void tearDown(Scenario scenario) throws IOException {
        screenshotUtil.takeScreenshot();
        applicationContext.getBean(WebDriver.class).quit();
    }

}
