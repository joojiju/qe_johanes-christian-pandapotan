package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;
import starter.action.*;
import starter.page.*;
import starter.navigation.*;
public class saucedemoStepDefinitions {
    @Given("{actor} is on saucedemo login page")
    public void userIsOnSaucedemoLoginPage(Actor actor) {
        actor.wasAbleTo(navigateTo.theSauceDemoLoginPage());
    }

    @And("{actor} input valid saucedemo username {string}")
    public void userInputValidSaucedemoUsername(Actor actor, String username) {
        actor.attemptsTo(doSomething.fillSauceDemoUsername(username));
    }

    @And("{actor} input valid saucedemo password {string}")
    public void userInputValidSaucedemoPassword(Actor actor, String password) {
        actor.attemptsTo(doSomething.fillSauceDemoPassword(password));
    }

    @And("{actor} click on the saucedemo submit login button")
    public void userClickOnTheSaucedemoSubmitLoginButton(Actor actor) {
        actor.attemptsTo(doSomething.clickSauceDemoSubmitLoginButton());
    }

    @Then("{actor} see {string} text on inventory page")
    public void userSeeTextOnInventoryPage(Actor actor, String text) {
        actor.attemptsTo(Ensure.that(saucedemoPage.INVENTORY_PAGE).hasText(text));
    }

    @Then("{actor} see {string} text on the login page")
    public void userSeeTextOnTheLoginPage(Actor actor, String text) {
        actor.attemptsTo(Ensure.that(saucedemoPage.LOGIN_ALERT).hasText(text));
    }

    @Given("{actor} is logged in on saucedemo with username {string} and password {string}")
    public void userIsLoggedInOnSaucedemoWithUsernameAndPassword(Actor actor, String username, String password) {
        userIsOnSaucedemoLoginPage(actor);
        userInputValidSaucedemoUsername(actor, username);
        userInputValidSaucedemoPassword(actor,password);
        userClickOnTheSaucedemoSubmitLoginButton(actor);
    }

    @And("{actor} add Sauce Labs Backpack items to cart")
    public void userAddSauceLabsBackpackItemsToCart(Actor actor) {
        actor.attemptsTo(doSomething.addSauceLabsBackpackItemsButton());
    }

    @And("{actor} add Sauce Labs Fleece Jacket to cart")
    public void userAddSauceLabsFleeceJacketToCart(Actor actor) {
        actor.attemptsTo(doSomething.addSauceLabsFleeceJacketItemsButton());
    }

    @And("{actor} click on the cart button")
    public void userClickOnTheCartButton(Actor actor) {
        actor.attemptsTo(doSomething.clickSauceDemoCartButton());
    }

    @And("{actor} click on the checkout button")
    public void userClickOnTheCheckoutButton(Actor actor) {
        actor.attemptsTo(doSomething.clickSauceDemoCheckoutButton());
    }

    @And("{actor} fill on the first name field with {string}")
    public void userFillOnTheFirstNameFieldWith(Actor actor, String firstname) {
        actor.attemptsTo(doSomething.fillSauceDemoCheckoutFirstname(firstname));
    }

    @And("{actor} fill on the last name field with {string}")
    public void userFillOnTheLastNameFieldWith(Actor actor, String lastname) {
        actor.attemptsTo(doSomething.fillSauceDemoCheckoutLastname(lastname));
    }

    @And("{actor} fill on the postal code field with {string}")
    public void userFillOnThePostalCodeFieldWith(Actor actor, String postalcode) {
        actor.attemptsTo(doSomething.fillSauceDemoCheckoutPostalCode(postalcode));
    }

    @And("{actor} click on the continue button")
    public void userClickOnTheContinueButton(Actor actor) {
        actor.attemptsTo(doSomething.clickSauceDemoContinueButton());
    }

    @And("{actor} see {string} text as the confirmation")
    public void userSeeTextAsTheConfirmation(Actor actor, String text) {
        actor.attemptsTo(Ensure.that(saucedemoPage.CHECKOUT_OVERVIEW).hasText(text));
    }

    @And("{actor} click on the finish button")
    public void userClickOnTheFinishButton(Actor actor) {
        actor.attemptsTo(doSomething.clickSauceDemoFinishButton());
    }

    @Then("{actor} see {string} text as the sign that the checkout has been successfull")
    public void userSeeTextAsTheSignThatTheCheckoutHasBeenSuccessfull(Actor actor, String text) {
        actor.attemptsTo(Ensure.that(saucedemoPage.CHECKOUT_COMPLETE).hasText(text));
    }

    @Then("{actor} see {string} text as the sign that the checkout is failed")
    public void userSeeTextAsTheSignThatTheCheckoutIsFailed(Actor actor, String text) {
        actor.attemptsTo(Ensure.that(saucedemoPage.CHECKOUT_FAILED).hasText(text));
    }

    @When("{actor} click the side navbar button")
    public void userClickTheSideNavbarButton(Actor actor) {
        actor.attemptsTo(doSomething.clickSauceDemoSideNavbarButton());
    }

    @And("{actor} click the about menu on side navbar")
    public void userClickTheAboutMenuOnSideNavbar(Actor actor) {
        actor.attemptsTo(doSomething.clickSauceDemoAboutMenuButton());
    }

    @Then("{actor} see {string} as success sign text on the about page")
    public void userSeeAsSuccessSignTextOnTheAboutPage(Actor actor, String text) {
        actor.attemptsTo(Ensure.that(saucelabsPage.ABOUT_SUCCESS_PAGE).hasText(text));
    }

    @Then("{actor} see {string} as failed sign text on the about page")
    public void userSeeAsFailedSignTextOnTheAboutPage(Actor actor, String text) {
        actor.attemptsTo(Ensure.that(saucelabsPage.ABOUT_404_PAGE).hasText(text));
    }
}
