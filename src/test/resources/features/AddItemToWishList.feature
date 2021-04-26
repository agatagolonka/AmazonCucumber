Feature: Adding product to Wishlist
  As a: Customer
  I want: to add product to Wishlist
  So that: I can add product to Wishlist

  Scenario Outline: Adding product to Wishlist
    Given Customer is on page with url 'home.page.url'
    When  Enter the <email> and <password>
    And Customer add product to wishlist 'item.page.url'
    Then Product should be present on wishlist

    Examples:
      | email                       | password           |
      | annanowaktestuser@gmail.com | annanowaktestuser  |
