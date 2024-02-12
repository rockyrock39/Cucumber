Feature: Shopping Cart

  @smoke @regression
  Scenario: Add item to cart
    Given I am on the product page
    When I add the item to the cart
    Then the item should be added successfully

  @regression
  Scenario: Remove item from cart
    Given I have items in the cart
    When I remove the item from the cart
    Then the item should be removed successfully

  @smoke
  Scenario: View cart
    Given I have items in the cart
    When I view the cart
    Then I should see the items in the cart
    
   @setup
  Scenario: Example Scenario with Setup
    Given I have a precondition
    When I perform some action
    Then I should see the expected result

  @cleanup
  Scenario: Example Scenario with Cleanup
    Given I have a precondition
    When I perform some action
    Then I should see the expected result
  
