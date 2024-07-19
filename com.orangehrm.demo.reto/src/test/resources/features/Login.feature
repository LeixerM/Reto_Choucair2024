#Autor: Leixer Molina


Feature: The user wants to enter the serenity demo and log in
  As a user I want to enter my password and demo serenity username

  @test
  Scenario: Validate that the user logged in successfully
    Given that the user enters the page
     When  enter the credentials
      |strUser|strPassword|
      |Admin  |admin123   |
     Then  It is located on the main page






