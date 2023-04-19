@SauceDemo
Feature: SauceDemo
  @Login @NormalPositive
  Scenario: User can login with valid username and valid password
    Given user is on saucedemo login page
    When user input valid saucedemo username "standard_user"
    And user input valid saucedemo password "secret_sauce"
    And user click on the saucedemo submit login button
    Then user see "Products" text on inventory page

  @Login @NormalNegative
  Scenario: User cannot login because the account has been locked out
    Given user is on saucedemo login page
    When user input valid saucedemo username "locked_out_user"
    And user input valid saucedemo password "secret_sauce"
    And user click on the saucedemo submit login button
    Then user see "Epic sadface: Sorry, this user has been locked out." text on the login page

  @Checkout @NormalPositive
  Scenario: User can successfully checkout items on their cart
    Given user is logged in on saucedemo with username "standard_user" and password "secret_sauce"
    When user see "Products" text on inventory page
    And user add Sauce Labs Backpack items to cart
    And user add Sauce Labs Fleece Jacket to cart
    And user click on the cart button
    And user click on the checkout button
    And user fill on the first name field with "First Name"
    And user fill on the last name field with "Last Name"
    And user fill on the postal code field with "14045"
    And user click on the continue button
    And user see "Checkout: Overview" text as the confirmation
    And user click on the finish button
    Then user see "Checkout: Complete!" text as the sign that the checkout has been successfull


  @Checkout @NormalNegative
  Scenario: User cannot checkout because has not fill the required data yet
    Given user is logged in on saucedemo with username "standard_user" and password "secret_sauce"
    When user see "Products" text on inventory page
    And user add Sauce Labs Backpack items to cart
    And user add Sauce Labs Fleece Jacket to cart
    And user click on the cart button
    And user click on the checkout button
    And user click on the continue button
    Then user see "Error: First Name is required" text as the sign that the checkout is failed

  @About @NormalPositive
  Scenario: User successfully redirected to the about page
    Given user is logged in on saucedemo with username "standard_user" and password "secret_sauce"
    When user click the side navbar button
    And user click the about menu on side navbar
    Then user see "Pricing" as success sign text on the about page

  @About @NormalNegative
  Scenario: User redirected to the about page but the page was not found
    Given user is logged in on saucedemo with username "problem_user" and password "secret_sauce"
    When user click the side navbar button
    And user click the about menu on side navbar
    Then user see "This page could not be found." as failed sign text on the about page