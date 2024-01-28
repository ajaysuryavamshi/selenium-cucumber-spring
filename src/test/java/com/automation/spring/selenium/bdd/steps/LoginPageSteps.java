package com.automation.spring.selenium.bdd.steps;

import com.automation.spring.selenium.bdd.annotation.LazyAutowired;
import com.automation.spring.selenium.bdd.page.LoginPage;
import com.automation.spring.selenium.bdd.util.ScreenshotUtil;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Lazy;

import java.io.IOException;

@SpringBootTest
@CucumberContextConfiguration
public class LoginPageSteps {

    @Value("${application.url:https://admin-demo.nopcommerce.com}")
    private String url;

    @LazyAutowired
    private LoginPage loginPage;

    @Given("I navigate to the login page")
    public void iNavigateToTheLoginPage() {
        this.loginPage.launch(this.url);
    }

    @When("I enter valid credentials")
    public void iEnterValidCredentials() {
        this.loginPage.enterEmail("admin@yourstore.com");
        this.loginPage.enterPassword("admin");
    }

    @And("click on the login button")
    public void clickOnTheLoginButton() {
        this.loginPage.clickOnLogInButton();
    }

    @Then("I should be redirected to the dashboard")
    public void iShouldBeRedirectedToTheDashboard() {
    }

    @When("I enter invalid credentials")
    public void iEnterInvalidCredentials() {
    }

    @Then("I should see an error message")
    public void iShouldSeeAnErrorMessage() {
    }
}
