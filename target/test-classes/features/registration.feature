Feature: Registration

  Scenario: Valid Registration
    Given I navigate to BlueSky Citadel site
    And I click on register link
    And I enter the single line Text
    And I pick one select
    And I enter my email
    And I enter my password
    And I pick multi select
    And I select radio and checkbox lists
    And I select country and date
    Then I fill the register details
    Then I am register
