Feature: Validation on Ordering Customize Single Topping Pizza online for pickup is working fine
  
  Inorder to order a pizza from Casey's online
  I want to test all function step by step
  We will do functional testing

  Scenario: Customer should able to Order Single Topping Pizza For Pickup
    Given I want to navigate to Caseys website "https://www.caseys.com/"
    When I go to Menu
    Then I select Pizza from the menu
    And Validate that default selection type of pizza Is Single Topping Pizza
    And I click on Create Your Own Pizza
    Then I validate the title of Page is "Create Your Own Pizza - Order Online for Delivery or Pickup | Casey's"
    And I choose the quantity of Pizza as "2"
    And I select pizza as "Original"
    And I select pizza size as "Medium"
    And I select Sauce as Marinara Light
    And I select Cheese as RegularCheese Regular
    And I select Meats on Pizza
    Then I select Veggies on Pizza
    And I add Special Instruction as Square Cut
    And I print Allergen Info
    Then I click on Start Order
    And I validate on alert for Pickup or Delivery
    And I enter the address for Pickup as "1403 N Main St, Findlay, OH 45840, USA"
    Then verify the store details
    And Click on curbside pickup
    And I select Pickup status
    And I select Time for Pickup
    Then I Submit Order
    And I close the browser
