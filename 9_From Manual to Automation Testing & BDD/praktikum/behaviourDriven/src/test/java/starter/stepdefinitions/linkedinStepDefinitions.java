package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;
import starter.helpers.linkedinPage;
import starter.helpers.doSomething;
import starter.helpers.navigateTo;

public class linkedinStepDefinitions {
    @Given("{actor} is on linkedin landing page")
    public void userIsOnLinkedinLandingPage(Actor actor) {
        actor.wasAbleTo(navigateTo.theLinkedInLandingPage());
    }

    @When("{actor} click on sign in button")
    public void userClickOnSignInButton(Actor actor) {
        actor.attemptsTo(doSomething.clickLinkedInSignIn());
    }

    @And("{actor} input VALID username {string}")
    public void userInputVALIDUsername(Actor actor, String username) {
        actor.attemptsTo(doSomething.fillValidLinkedInUsername(username));
    }

    @And("{actor} input VALID password {string}")
    public void userInputVALIDPassword(Actor actor, String password) {
        actor.attemptsTo(doSomething.fillValidLinkedInPassword(password));
    }

    @And("{actor} click on the sign in button")
    public void userClickOnTheSignInButton(Actor actor) {
        actor.attemptsTo(doSomething.clickLinkedInSignInButton());
    }

    @Then("{actor} successfully logged in and see {string} text")
    public void userSuccessfullyLoggedInAndSeeText(Actor actor, String text) {
        actor.attemptsTo(Ensure.that(linkedinPage.FEED_PAGE).hasText(text));
    }

    @And("{actor} input INVALID username {string}")
    public void userInputINVALIDUsername(Actor actor, String invUsername) {
        actor.attemptsTo(doSomething.fillInvalidLinkedInUsername(invUsername));
    }

    @And("{actor} input INVALID password {string}")
    public void userInputINVALIDPassword(Actor actor, String invPassword) {
        actor.attemptsTo(doSomething.fillInvalidLinkedInPassword(invPassword));
    }

    @Then("{actor} cannot logged in and see error message {string}")
    public void userCannotLoggedInAndSeeErrorMessage(Actor actor, String message) {
        actor.attemptsTo(Ensure.that(linkedinPage.INVALID_EMAIL_LABEL).hasText(message));
    }

    @Then("{actor} cannot logged in and see error password message {string}")
    public void userCannotLoggedInAndSeeErrorPasswordMessage(Actor actor, String message) {
        actor.attemptsTo(Ensure.that(linkedinPage.INVALID_PASSWORD_LABEL).hasText(message));
    }

    @When("{actor} click on people icon on the navbar")
    public void userClickOnPeopleIconOnTheNavbar(Actor actor) {
        actor.attemptsTo(doSomething.clickLinkedInPeopleButton());
    }

    @And("{actor} type {string} as the first name on the first name text box")
    public void userTypeAsTheFirstNameOnTheFirstNameTextBox(Actor actor,String first) {
        actor.attemptsTo(doSomething.fillSearchFirstNameField(first));
    }

    @And("{actor} type {string} as the last name on the last name text box")
    public void userTypeAsTheLastNameOnTheLastNameTextBox(Actor actor, String last) {
        actor.attemptsTo(doSomething.fillSearchLastNameField(last));
    }

    @And("{actor} press search people button")
    public void userPressSearchPeopleButton(Actor actor) {
        actor.attemptsTo(doSomething.clickLinkedInPeopleSearchButton());
    }

    @Then("{actor} see {string} number of people from the search")
    public void userSeeNumberOfPeopleFromTheSearch(Actor actor, String result) {
        actor.attemptsTo(Ensure.that(linkedinPage.TOTAL_SEARCH_RESULTS).hasText(result));
    }

    @When("{actor} click on the suitcase icon")
    public void userClickOnTheSuitcaseIcon(Actor actor) {
        actor.attemptsTo(doSomething.clickLinkedInJobsButton());
    }

    @And("{actor} type {string} in the search job text box")
    public void userTypeInTheSearchJobTextBox(Actor actor, String keyword) {
        actor.attemptsTo(doSomething.fillJobsSearchWithKeyword(keyword));
    }

    @When("{actor} press search jobs button")
    public void userPressSearchJobsButton(Actor actor) {
        actor.attemptsTo(doSomething.clickLinkedInJobsSearchButton());
    }

    @And("{actor} type {string} in the location text box")
    public void userTypeInTheLocationTextBox(Actor actor, String location) {
        actor.attemptsTo(doSomething.fillJobsLocationWithValidKeyword(location));
    }

    @And("{actor} type {string} in the location text box as invalid location")
    public void userTypeInTheLocationTextBoxAsInvalidLocation(Actor actor, String invLocation) {
        actor.attemptsTo(doSomething.fillJobsLocationWithInvalidKeyword(invLocation));
    }

    @Then("{actor} see some jobs recommendation related to {string}")
    public void userSeeSomeJobsRecommendationRelatedTo(Actor actor, String result) {
        actor.attemptsTo(Ensure.that(linkedinPage.JOBS_SEARCH_RESULTS).hasText(result));
    }

    @Then("{actor} see some jobs recommendation related to {string} as the location")
    public void userSeeSomeJobsRecommendationRelatedToAsTheLocation(Actor actor, String result) {
        actor.attemptsTo(Ensure.that(linkedinPage.JOBS_SEARCH_RESULTS2).hasText(result));
    }
}
