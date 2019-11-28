Feature: Change color of thing and add at the basket

  Scenario: add Iphone to the basket
    Given the user is on the Rozetka home page
    When  the user search for a thing by name 'iphone xs'
    And  the user choose by name iphone xs
    And the user click on the gold circle in any iphone
    And  the user return space gray color
    And the user click on basket button
    Then the user check button 'Оформить заказ' is visible



