package com.automation.spring.selenium.bdd.config;

import com.automation.spring.selenium.bdd.annotation.LazyConfiguration;
import com.automation.spring.selenium.bdd.annotation.ThreadScopeBean;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;

import java.time.Duration;

@LazyConfiguration
public class WebDriverConfig {

    @Value("${default.timeout:30}")
    private long timeout;

    @ThreadScopeBean
    @ConditionalOnProperty(name = "browser", havingValue = "safari")
    public WebDriver safariDriver() {
        return new SafariDriver();
    }

    @ThreadScopeBean
    @ConditionalOnMissingBean
    public WebDriver chromeDriver() {
        return new ChromeDriver();
    }

    @Bean
    public WebDriverWait webDriverWait(WebDriver driver) {
        return new WebDriverWait(driver, Duration.ofSeconds(this.timeout));
    }

}
