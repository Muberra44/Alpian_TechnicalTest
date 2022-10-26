package com.alpian.stepDefinitions;

import com.alpian.pages.ComputerDatabase_Page;
import com.alpian.utilities.ConfigurationReader;
import com.alpian.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

public class ComputerDatabase_StepDef {

    ComputerDatabase_Page computerDatabase_page = new ComputerDatabase_Page();

    @Given("User is on the computer database login page")
    public void user_is_on_the_computer_database_login_page() {

       Driver.getDriver().get(ConfigurationReader.getProperty("url"));

    }

    @Given("User click the add a new computer button")
    public void user_click_the_add_a_new_computer_button() {

        computerDatabase_page.addNewComputerButton.click();

    }

    @When("User see new page included {string} text")
    public void user_see_new_page_included_page(String textAddComputer) {

        Assert.assertEquals(computerDatabase_page.addAComputerText.getText(),textAddComputer);

    }

    @When("User fill out the Computer name box with {string}")
    public void user_fill_out_the_computer_name_box_with(String string) {

        computerDatabase_page.computerNameBox.sendKeys(string);

    }

    @When("User fill out the Introduced box with {string}")
    public void user_fill_out_the_introduced_box_with(String string) {

        computerDatabase_page.introducedBox.sendKeys(string);


    }

    @When("User fill out the Discontinued box with {string}")
    public void user_fill_out_the_discontinued_box_with(String string) {

        computerDatabase_page.discountedBox.sendKeys(string);


    }

    @When("User select a company name {string}")
    public void user_select_a_company_name(String string) {

        Select select = new Select(computerDatabase_page.companyName);
        select.selectByVisibleText(string);

    }

    @When("User click Create this computer button")
    public void user_click_button() {

        computerDatabase_page.createThisComputerButton.click();

    }

    @Then("User should see {string} text")
    public void user_should_see_text(String message) {

        Assert.assertEquals(computerDatabase_page.alertMessage.getText(),message);

    }

    @Then("User should see the alert {string}")
    public void userShouldSeeTheAlert(String alert) {


        Assert.assertEquals(computerDatabase_page.getAlertMessage.getText(),alert);

    }


    @Then("User should see the alert is {string}")
    public void userShouldSeeTheAlertIs(String alert) {

        Assert.assertEquals(computerDatabase_page.failedToRefineType.getText(),alert);

    }

    @Given("User click the first computer name ACE")
    public void userClickTheFirstComputerNameACE() {

        computerDatabase_page.firstComputer.click();

    }

    @When("User see in new page included {string} text")
    public void userSeeInNewPageIncludedText(String editComputerText) {

        Assert.assertEquals(computerDatabase_page.editComputerText.getText(),editComputerText);

    }


    @And("User click Save this computer button")
    public void userClickSaveThisComputerButton() {

        computerDatabase_page.saveThisComputerButton.click();

    }


    @And("User click Delete this computer button")
    public void userClickDeleteThisComputerButton() {
        
        computerDatabase_page.deleteThisComputerButton.click();

    }



}
