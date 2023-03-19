@Beymen
Feature: BeymenApp Test Automation Project
  Scenario: BeymenApp Test Automation
    Given Navigate to Beymen App
    And   Click on search
    And   Click on the women section
    And   Click on the shoes section
    And   Click on the Sneakers section
    And   Click on sort by section
    And   Click on the button that increases by price from here
    And   Click on the filter button
    And   Search and select Nike in the Brand section
    And   Search and select Red from the Color section
    And   Search and select thirty-eight from the size section
    And   Click the list products button
    And   Click the Add to Cart button that comes with the product.
    And   Please select the body type displayed here
    And   Verify that the product has been added to your cart
    And   Click the Go To Cart button
    And   Verify your product
    When  Verify the Total of Items, Total Discount, Shipping fee and Amount Payable section in the Shopping summary below
    Then  Delete the product from the cart and verify that the product has been deleted
