Feature: Test Cogmento CRM

  Scenario: validate login functionality
    Given user open a url
    When user enter username and password
    Then user click on login button

  Scenario: validate home page functionality
    When user is on home page and validate logo

  Scenario: validate home page tite functionality
    And user validate home page title

  Scenario: validate home page url functionality
    And user validate home page url

  Scenario: validate contact page page url functionality
    And user click on contact link
    And user validate contact keyword
