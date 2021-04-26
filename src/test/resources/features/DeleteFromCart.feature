Feature: Deleting product from Cart
  As a: Customer
  I want: to delete product from Cart
  So that: I can delete product from Cart

  Scenario Outline: Deleting product from Cart
    Given Customer is on page with url 'home.page.url'
    When Customer add product to Cart from search '<direct search>'
    Then Customer delete product from Cart '<direct search>'
    And Cart is empty
    Examples:
      |direct search    |
      |default.product.short.name|
