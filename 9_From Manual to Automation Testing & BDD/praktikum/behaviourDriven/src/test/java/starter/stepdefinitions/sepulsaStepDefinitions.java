package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_old.Ac;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;
import starter.helpers.doSomething;
import starter.helpers.navigateTo;
import starter.helpers.sepulsaPage;

public class sepulsaStepDefinitions {
    @Given("{actor} is on sepulsa landing page")
    public void userIsOnSepulsaLandingPage(Actor actor) {
        actor.wasAbleTo(navigateTo.theSepulsaHomePage());
    }

    @When("{actor} click on masuk button")
    public void userClickOnMasukButton(Actor actor) {
        actor.attemptsTo(doSomething.clickMasukButton());
    }

    @And("{actor} input VALID sepulsa username {string}")
    public void userInputVALIDSepulsaUsername(Actor actor, String username) {
        actor.attemptsTo(doSomething.fillValidSepulsaUsername(username));
    }

    @And("{actor} input VALID sepulsa password {string}")
    public void userInputVALIDSepulsaPassword(Actor actor, String password) {
        actor.attemptsTo(doSomething.fillValidSepulsaPassword(password));
    }

    @And("{actor} click on masuk button to login")
    public void userClickOnMasukButtonToLogin(Actor actor) {
        actor.attemptsTo(doSomething.clickSubmitLoginButton());
    }

    @And("{actor} click on beranda button")
    public void userClickOnBerandaButton(Actor actor) {
        actor.attemptsTo(doSomething.clickHomeButton());
    }

    @Then("{actor} succesfully logged in to sepulsa and see {string} text")
    public void userSuccesfullyLoggedInToSepulsaAndSeeText(Actor actor, String text) {
        actor.attemptsTo(Ensure.that(sepulsaPage.HOME_PAGE).hasText(text));
    }

    @And("{actor} input INVALID sepulsa username {string}")
    public void userInputINVALIDSepulsaUsername(Actor actor, String invUsername) {
        actor.attemptsTo(doSomething.fillInvalidSepulsaUsername(invUsername));
    }

    @And("{actor} input INVALID sepulsa password {string}")
    public void userInputINVALIDSepulsaPassword(Actor actor, String invPassword) {
        actor.attemptsTo(doSomething.fillInvalidSepulsaPassword(invPassword));
    }

    @Then("{actor} cannot logged in to sepulsa and see error message {string}")
    public void userCannotLoggedInToSepulsaAndSeeErrorMessage(Actor actor, String error) {
        actor.attemptsTo(Ensure.that(sepulsaPage.ALERT_MESSAGE).hasText(error));
    }

    @When("{actor} click on pulsa button")
    public void userClickOnPulsaButton(Actor actor) {
        actor.attemptsTo(doSomething.clickPulsaButton());
    }

    @And("{actor} input nomor handphone {string}")
    public void userInputNomorHandphone(Actor actor, String nomorHP) {
        actor.attemptsTo(doSomething.fillNomorHPWithValue(nomorHP));
    }

    @And("{actor} click on harga Rp5.000 card")
    public void userClickOnHargaRpCard(Actor actor) {
        actor.attemptsTo(doSomething.choosePulsa5rb());
    }

    @Then("{actor} redirected to payment confirmation page and see {string} text")
    public void userRedirectedToPaymentConfirmationPageAndSeeText(Actor actor, String text) {
        actor.attemptsTo(Ensure.that(sepulsaPage.TOTAL_PEMBAYARAN).hasText(text));
    }
}
