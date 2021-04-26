Feature: Adding product to Cart
  As a: Customer
  I want: increment a quantity in a cart
  So that: Subtotal of product is increment

  Scenario: Adding product to Cart
    Given Customer is on page with url 'home.page.url'
    When Customer adds product from '<direct search>'

      |direct search    |
      |default.product.short.name|
    Then Customer increment quantity  in basket '<product name>'
    And Search result count is more than '<quantity>'

      |product name        | quantity|
      |default.product.name|2        |
