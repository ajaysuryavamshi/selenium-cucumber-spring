package com.automation.spring.selenium.bdd.page;

import com.automation.spring.selenium.bdd.annotation.Page;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Page
public class LoginPage extends BasePage {

    @FindBy(id = "Email")
    private WebElement emailInput;

    @FindBy(id = "Password")
    private WebElement passwordInput;

    @FindBy(css = "button.button-1.login-button")
    private WebElement loginButton;

    public void enterEmail(String email) {
        this.emailInput.clear();
        this.emailInput.sendKeys(email);
    }

    public void enterPassword(String password) {
        this.passwordInput.clear();
        this.passwordInput.sendKeys(password);
    }

    public void clickOnLogInButton() {
        this.loginButton.click();
    }

}
