package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.InventoryPage;
import starter.pages.LoginPage;

public class InventoryStep {
    @Steps
    LoginStep ls;
    LoginPage lp;
    InventoryPage Ip;

    @Given("I am login")
    public void iAmLogin() {
        ls.IamLogin();
    }

    @And("I go to dashboard")
    public void iGoToDashboard() {
       lp.ValidDashboard();
    }

    @And("I click side bar item")
    public void iClickSideBarItem() {
        Ip.ClickSideBarITem();
    }

    @And("I click side bar persediaan")
    public void iClickSideBarPersediaan() {
        Ip.ClickSideBarPersediaan();
    }

    @When("I click box item")
    public void iClickBoxItem() {
        Ip.ClickBoxItem();
    }

    @And("I click button penyesuaian persediaan")
    public void iClickButtonPenyesuaianPersediaan() {
        Ip.ClickBtnPenyesuaianPersediaan();
    }

    @And("I input new qty")
    public void iInputNewQty() {

        Ip.InputNewQty();
    }

    @And("I click button simpan")
    public void iClickButtonSimpan() {
        Ip.ClickBtnSimpan();
    }

    @Then("I validate status arrange")
    public void iValidateStatusArrange() {
        Ip.ValidateStatus();
    }
}
