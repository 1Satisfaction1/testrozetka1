Feature: Change color of thing and add in basket

  Scenario: add Iphone in the basket
    Given the user is on the Rozetka home page
    When  the user looks for a thing by name 'iphone xs'
    And  the user choose by name iphone xs
    And the user click on the silver circle in any iphone
    And  the user return space gray color
    And the user click on basket button
    Then the user check button 'Оформить заказ' is visible

