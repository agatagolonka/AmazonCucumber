Feature: Open product card
  As a: customer
  I want: To have open product card
  So that: I can open required product by name

  Scenario Outline:
    Given Customer is on page with url 'home.page.url'
    When Customer performs search for '<searching product>'
    Then Page title contains '<search result>'
    And Open product card
    Examples:
      |    searching product  |search result    |
      |Witcher 3              |Witcher 3        |
