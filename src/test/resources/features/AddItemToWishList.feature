Feature: Adding product to Wishlist
  As a: Customer
  I want: to add product to Wishlist
  So that: I can add product to Wishlist

  Scenario: Adding product to Wishlist
    Given Customer is on page with url 'home.page.url'
    When Customer add product to wishlist from '<direct search>'

      |direct search    |
      |default.product.short.name|
    Then Product should be present on wishlist '<product name>'

      |product name        |
      |default.product.name|