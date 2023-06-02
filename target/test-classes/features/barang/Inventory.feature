Feature: Inventory
  As a user
  I want to arrange item
  So I can manage my item inventory
@arrange
  Scenario: User arrange item
    Given I am login
    And I go to dashboard
    And I click side bar item
    And I click side bar persediaan
    When I click box item
    And I click button penyesuaian persediaan
    And I input new qty
    And I click button simpan
    Then I validate status arrange

