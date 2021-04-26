Feature: Adding product to Cart
  As a: Customer
  I want: to add product to Cart
  So that: I can add product to Cart

  Scenario: Adding product to Cart
    Given Customer is on page with url 'item.page.url'
    When Customer adds product to cart
    Then Products should be present on basket page

