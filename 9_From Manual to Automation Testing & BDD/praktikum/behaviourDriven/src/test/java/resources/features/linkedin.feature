@LinkedIn
Feature: LinkedIn Home Page
  @Login @NormalPositive
  Scenario: User login with VALID username and password
    Given user is on linkedin landing page
    When user click on sign in button
    And user input VALID username "rinagi1725@djpich.com"
    And user input VALID password "ini Passw0rd_"
    And user click on the sign in button
    Then user successfully logged in and see "Connections" text

  @Login @NormalNegative
  Scenario: User login with INVALID username and password
    Given user is on linkedin landing page
    When user click on sign in button
    And user input INVALID username "adwiqd"
    And user input INVALID password "dqwdo20"
    And user click on the sign in button
    Then user cannot logged in and see error message "Please enter a valid username"

  @Login @NormalNegative
  Scenario: User login with INVALID username and VALID password
    Given user is on linkedin landing page
    When user click on sign in button
    And user input INVALID username "adwiqd"
    And user input VALID password "ini Passw0rd_"
    And user click on the sign in button
    Then user cannot logged in and see error message "Please enter a valid username"

  @Login @NormalNegative
  Scenario: User login with VALID username and INVALID password
    Given user is on linkedin landing page
    When user click on sign in button
    And user input VALID username "rinagi1725@djpich.com"
    And user input INVALID password "dqwdo20"
    And user click on the sign in button
    Then user cannot logged in and see error password message "That's not the right password. Try again or sign in with a one-time link"

  @SearchPeople @NormalPositive
  Scenario: User search for someone with their name
    Given user is on linkedin landing page
    When user click on people icon on the navbar
    And user type "Johanes" as the first name on the first name text box
    And user type "Christian" as the last name on the last name text box
    And user press search people button
    Then user see "10+" number of people from the search

  @SearchJobs @NormalPositive
  Scenario: User search for a job
    Given user is on linkedin landing page
    When user click on the suitcase icon
    And user type "Creative Director" in the search job text box
    When user press search jobs button
    Then user see some jobs recommendation related to "Creative Director Jobs in United States"

  @SearchJobs @NormalPositive
  Scenario: User search for a job with VALID location
    Given user is on linkedin landing page
    When user click on the suitcase icon
    And user type "Creative Director" in the search job text box
    And user type "Jakarta" in the location text box
    And user press search jobs button
    Then user see some jobs recommendation related to "Creative Director Jobs in Jakarta" as the location

  @SearchJobs @NormalNegative
  Scenario: User search for a job with INVALID location
    Given user is on linkedin landing page
    When user click on the suitcase icon
    And user type "Creative Director" in the search job text box
    And user type "sdqwrcas" in the location text box as invalid location
    And user press search jobs button
    Then user see some jobs recommendation related to "Creative Director Jobs in United States"
