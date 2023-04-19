@UsersFakeStoreAPI
Feature: User of Fake Store API

  @FakeStoreAPI @UsersFakeStoreAPI
  Scenario: User can get all users
    Given User call an api "/users" with method "GET"
    Then User verify status code is 200
    Then User verify response is match with json schema "users.json"

  @FakeStoreAPI @UsersFakeStoreAPI
  Scenario: User can get user data by ID
    Given User call an api "/users/1" with method "GET"
    Then User verify status code is 200
    Then User verify response is match with json schema "byIdUsers.json"

  @FakeStoreAPI @UsersFakeStoreAPI
  Scenario: User cannot get user by ID because the parameter is wrong
    Given User call an api "/users/johnd" with method "GET"
    Then User verify status code is 400
    Then User verify response is match with json schema "wrongParameterUser.json"

  @FakeStoreAPI @UsersFakeStoreAPI
  Scenario: User can get all users with limit
    Given User call an api "/users?limit=7" with method "GET"
    Then User verify status code is 200
    Then User verify response is match with json schema "users.json"

  @FakeStoreAPI @UsersFakeStoreAPI
  Scenario: User can get all users with descending sort
    Given User call an api "/users?sort=desc" with method "GET"
    Then User verify status code is 200
    Then User verify response is match with json schema "users.json"

  @FakeStoreAPI @UsersFakeStoreAPI
  Scenario: User can delete user data
    Given User call an api "/users/6" with method "DELETE"
    Then User verify status code is 200
    Then User verify response is match with json schema "byIdUsers.json"

  @FakeStoreAPI @UsersFakeStoreAPI
  Scenario: User cannot delete user by ID because the parameter is wrong
    Given User call an api "/users/johnd" with method "DELETE"
    Then User verify status code is 400
    Then User verify response is match with json schema "wrongParameterUser.json"
