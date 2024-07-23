#Autor: Leixer Molina


Feature: The user is on the main page where they want to apply in the recruitment option to be hired

  @test
  Scenario: It is validated that the user is hired when applying
    Given Enter the credentials to enter the main page
      |strUser     |strPassword           |
      |Admin       |admin123              |
    When  the user makes his application
    Then  It validates that the user was hired







