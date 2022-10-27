package com.alpian.stepDefinitions;

import com.alpian.pages.ComputerDatabasePage;
import com.alpian.utilities.ConfigurationReader;
import com.alpian.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.Select;
import static org.junit.Assert.*;

public class ComputerDatabaseStepDef {

    ComputerDatabasePage computerDatabasePage = new ComputerDatabasePage();

    @Given("User is on the computer database login page")
    public void user_is_on_the_computer_database_login_page() {
       Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @Given("User click the add a new computer button")
    public void user_click_the_add_a_new_computer_button() {
        computerDatabasePage.addNewComputerButton.click();
    }

    @When("User see new page included {string} text")
    public void user_see_new_page_included_page(String textAddComputer) {
        assertEquals(computerDatabasePage.addAComputerText.getText(),textAddComputer);
    }

    @When("User fill out the Computer name box with {string}")
    public void user_fill_out_the_computer_name_box_with(String computerName) {
        computerDatabasePage.computerNameBox.sendKeys(computerName);
    }

    @When("User fill out the Introduced box with {string}")
    public void user_fill_out_the_introduced_box_with(String introducedDate) {
        computerDatabasePage.introducedBox.sendKeys(introducedDate);
    }

    @When("User fill out the Discontinued box with {string}")
    public void user_fill_out_the_discontinued_box_with(String discontinuedDate) {
        computerDatabasePage.discontinuedBox.sendKeys(discontinuedDate);
    }

    @When("User select a company name {string}")
    public void user_select_a_company_name(String companyName) {
        Select select = new Select(computerDatabasePage.companyName);
        select.selectByVisibleText(companyName);
    }

    @When("User click Create this computer button")
    public void user_click_button() {
        computerDatabasePage.createThisComputerButton.click();
    }

    @Then("User should see {string} text")
    public void user_should_see_text(String message) {
        assertEquals(computerDatabasePage.alertMessage.getText(),message);
    }

    @Then("User should see the alert {string}")
    public void userShouldSeeTheAlert(String alert) {
        assertEquals(computerDatabasePage.getAlertMessage.getText(),alert);
    }

    @Then("User should see the alert is {string}")
    public void userShouldSeeTheAlertIs(String alert) {
        assertEquals(computerDatabasePage.failedToRefineType.getText(),alert);
    }

    @Given("User click the first computer name ACE")
    public void userClickTheFirstComputerNameACE() {
        computerDatabasePage.firstComputer.click();
    }

    @When("User see in new page included {string} text")
    public void userSeeInNewPageIncludedText(String validationTextForEdit) {
        assertEquals(computerDatabasePage.editComputerText.getText(),validationTextForEdit);
    }

    @And("User click Save this computer button")
    public void userClickSaveThisComputerButton() {
        computerDatabasePage.saveThisComputerButton.click();
    }

    @And("User click Delete this computer button")
    public void userClickDeleteThisComputerButton() {
        computerDatabasePage.deleteThisComputerButton.click();
    }




}
