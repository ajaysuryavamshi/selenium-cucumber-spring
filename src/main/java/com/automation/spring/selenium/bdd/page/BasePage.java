package com.automation.spring.selenium.bdd.page;

import jakarta.annotation.PostConstruct;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;

public class BasePage {

    @Autowired
    private WebDriver driver;

    @Autowired
    private WebDriverWait wait;

    @PostConstruct
    public void init() {
        PageFactory.initElements(this.driver, this);
    }

    public void launch(String url) {
        this.driver.get(url);
    }

}
