package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.LoginPage;

public class LoginStep {
    @Steps
    LoginPage lp;
    @Given("I am on the login page")
    public void iAmOnTheLoginPage() {
        lp.openLogin();
    }

    @When("I input email {string}")
    public void iInputEmail(String email) {
        lp.InputEmail(email);
    }

    @And("I input password {string}")
    public void iInputPassword(String password) {
        lp.InputPassword(password);
    }

    @And("I click login button")
    public void iClickLoginButton() {
        lp.ClickBtnSubmit();
    }

    @Then("I will validate status {string}")
    public void iWillValidateStatus(String status) {
        if (status.equals("true")) {
            lp.ValidDashboard();
        }else if (status.equals("false")){
            lp.MessageFailed();
        }else if (status.equals("req-email")){
            lp.ValidReqEmail();
        }else if (status.equals("req-password")){
            lp.ValidReqPass();
        }else if (status.equals("req-6char")){
            lp.ValidReqPass6Char();
        }
    }
}
