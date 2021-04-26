Feature: Login functionality of amazon website with multiple credentials

  Scenario Outline: Verification of login button with multiple users
    Given Customer is on page with url 'home.page.url'

    When  Enter the <email> and <password>

    And  Click On SignIn Button
    Then Username should be correct '<username>'

    Examples:
      | email                       | password           |username    |
      | annanowaktestuser@gmail.com | annanowaktestuser  |Hello, Anna |
      | annanowaktestuser@gmail.com | annanowaktestuser  |Hello, Anna |