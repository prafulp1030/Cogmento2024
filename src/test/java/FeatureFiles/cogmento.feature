Feature: Test Cogmento CRM

  Scenario: validate login functionality
    Given user open a url
    When user enter username and password
    Then user click on login button

  Scenario: validate home page functionality
    When user is on home page and validate logo
