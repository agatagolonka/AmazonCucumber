Feature: product search
  As a: customer
  I want: to have product search
  So that: I can find required product by name

  Scenario Outline:
  Given Customer is on page with url 'home.page.url'
  When Customer performs search for '<searching product>'
  Then Page title contains '<search result>'
    Examples:
      |     searching product |search result    |
      |Witcher 3              |Witcher 3        |
