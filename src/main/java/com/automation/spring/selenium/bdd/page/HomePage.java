package com.automation.spring.selenium.bdd.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.stereotype.Component;

@Component
public class HomePage extends BasePage {

    @FindBy(css = "a[href=\"/logout\"]")
    private WebElement logoutButton;

    public void clickOnLogoutButton() {
        this.logoutButton.click();
    }

}
