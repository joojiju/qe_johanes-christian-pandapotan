@CartsFakeStoreAPI
Feature: Cart of Fake Store API

  @FakeStoreAPI @CartsFakeStoreAPI
  Scenario: User can get all carts
    Given User call an api "/carts" with method "GET"
    Then User verify status code is 200
    Then User verify response is match with json schema "carts.json"

  @FakeStoreAPI @CartsFakeStoreAPI
  Scenario: User can get cart by ID
    Given User call an api "/carts/1" with method "GET"
    Then User verify status code is 200
    Then User verify response is match with json schema "byIdCarts.json"

  @FakeStoreAPI @CartsFakeStoreAPI
  Scenario: User can get all products with limit
    Given User call an api "/carts?limit=6" with method "GET"
    Then User verify status code is 200
    Then User verify response is match with json schema "carts.json"

  @FakeStoreAPI @CartsFakeStoreAPI
  Scenario: User can get all products with descending sort
    Given User call an api "/carts?sort=desc" with method "GET"
    Then User verify status code is 200
    Then User verify response is match with json schema "carts.json"

  @FakeStoreAPI @CartsFakeStoreAPI
  Scenario: User can get carts with date range
    Given User call an api "/carts?startdate=2019-12-10&enddate=2020-10-10" with method "GET"
    Then User verify status code is 200
    Then User verify response is match with json schema "carts.json"

  @FakeStoreAPI @CartsFakeStoreAPI
  Scenario: User can add new cart
    Given User call an api "/carts" with method "POST" with payload below
      | userId | date       | products                                            |
      | 5      | 2020-02-03 | [{productId:5,quantity:1},{productId:1,quantity:5}] |
    Then User verify status code is 200
    Then User verify response is match with json schema "newCarts.json"

  @FakeStoreAPI @CartsFakeStoreAPI
  Scenario: User can edit cart data by ID
    Given User call an api "/carts/7" with method "PUT" with payload below
      | userId | date       | products                   |
      | 3      | 2019-12-10 | [{productId:1,quantity:3}] |
    Then User verify status code is 200
    Then User verify response is match with json schema "newCarts.json"

  @FakeStoreAPI @CartsFakeStoreAPI
  Scenario: User can delete cart by ID
    Given User call an api "/carts/4" with method "DELETE"
    Then User verify status code is 200
    Then User verify response is match with json schema "byIdCarts.json"