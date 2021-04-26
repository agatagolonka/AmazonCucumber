Feature: Deleting product from Cart
  As a: Customer
  I want: to delete product from Cart
  So that: I can delete product from Cart

  Scenario: Deleting product from Cart
    Given Customer is on page with url 'item.page.url'
    When Customer adds product to cart
    Then Customer delete product from Cart
    And Cart is empty

