Feature: Login functionality of amazon website with invaliddata

  Scenario Outline: Verification of login button with multiple users
    Given Customer is on page with url 'home.page.url'

    When  Enter the <email> and <password>

    Then Login is immpossible

    Examples:
      | email              | password               |
      | login.mail.invalid | login.passwd1.invalid  |