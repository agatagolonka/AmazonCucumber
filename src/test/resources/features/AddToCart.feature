Feature: Adding product to Cart
  As a: Customer
  I want: to add product to Cart
  So that: I can add product to Cart

  Scenario Outline: Adding product to Cart
    Given Customer is on page with url 'home.page.url'
    When Customer adds product from '<direct search>'
    Then Products should be present on basket page '<direct search>'
    Examples:
      |direct search    |
      |Witcher 3        |
