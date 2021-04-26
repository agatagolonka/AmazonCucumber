Feature: Adding product to Cart
  As a: Customer
  I want: increment a quantity in a cart
  So that: Subtotal of product is increment

  Scenario Outline: Adding product to Cart
    Given Customer is on page with url 'item.page.url'
    When Customer adds product to cart
    And Customer increment quantity  in basket '<product name>'
    Then Search result count is more than '<quantity>'
Examples:
      |product name        | quantity|
      |default.product.name|2        |
