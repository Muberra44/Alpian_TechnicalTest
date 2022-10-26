@wip
Feature:Computer database feature

  User Story: Create a series of test cases that cover the CRUD operation plus the edge cases.
  Make sure you give detailed instructions for each test case (pre conditions, steps,
  expected results).


  Background:
    Given User is on the computer database login page

  Scenario: Verify that User should be able to create from computer database
    Given User click the add a new computer button
    When User see new page included "Add a computer" text
    And User fill out the Computer name box with "Dell 2"
    And User fill out the Introduced box with "2022-08-30"
    And User fill out the Discontinued box with "2022-10-20"
    And User select a company name "Canon"
    And User click Create this computer button
    Then User should see "Done ! Computer Dell 2 has been created" text


  Scenario: Negative test scenario with empty box in required box
    Given User click the add a new computer button
    When User click Create this computer button
    Then User should see the alert is "Failed to refine type : Predicate isEmpty() did not fail."


  Scenario: Negative test scenario with invalid credentials in Introduced and Discontinued box
    Given User click the add a new computer button
    When User see new page included "Add a computer" text
    And User fill out the Computer name box with "Dell 2"
    And User fill out the Introduced box with "!@#$%"
    And User fill out the Discontinued box with "!@#$%"
    And User click Create this computer button
    Then User should see the alert "Failed to decode date : java.time.format.DateTimeParseException: Text '!@#$%' could not be parsed at index 0"

  Scenario: Verify that User should be able to update from computer database
    Given User click the first computer name ACE
    When User see in new page included "Edit computer" text
    And User fill out the Introduced box with "2022-08-30"
    And User click Save this computer button
    Then User should see "Done ! Computer ACE has been updated" text


  Scenario: Verify that User should be able to delete from computer database
    Given User click the first computer name ACE
    When User see in new page included "Edit computer" text
    And User click Delete this computer button
    Then User should see "Done ! Computer ACE has been deleted" text



