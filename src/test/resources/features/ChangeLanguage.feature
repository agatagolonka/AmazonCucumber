Feature: Change language
  As a: Customer
  I want: change language
  So that: I can change language

  Scenario Outline: Change language
  Given Customer is on page with url 'home.page.url'
  When Customer change language '<language>'
    Then Language should be changed
    Examples:
  |language   |option
  | Deutsch   | DE-msg
