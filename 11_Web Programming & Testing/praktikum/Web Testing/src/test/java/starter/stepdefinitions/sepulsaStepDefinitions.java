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

    @When("{actor} click on the pulsa button on menu")
    public void userClickOnThePulsaButtonOnMenu(Actor actor) {
        actor.attemptsTo(doSomething.clickPulsaButton());
    }

    @And("{actor} input nomor handphone {string}")
    public void userInputNomorHandphone(Actor actor, String nomorHp) {
        actor.attemptsTo(doSomething.fillNomorHPWithValue(nomorHp));
    }

    @And("{actor} choose nominal 20 ribu")
    public void userChooseNominal20Ribu(Actor actor) {
        actor.attemptsTo(doSomething.choosePulsa20rb());
    }

    @Then("{actor} can see {string} checkout page")
    public void userCanSeeCheckoutPage(Actor actor, String text) {
        actor.attemptsTo(Ensure.that(sepulsaPage.TOTAL_PEMBAYARAN).hasText(text));
    }

    @When("{actor} click on the uang elektronik button on menu")
    public void userClickOnTheUangElektronikButtonOnMenu(Actor actor) {
        actor.attemptsTo(doSomething.clickUangElektronikButton());
    }

    @And("{actor} click on the Go-Pay button")
    public void userClickOnTheGoPayButton(Actor actor) {
        actor.attemptsTo(doSomething.clickGoPayButton());
    }

    @And("{actor} choose nominal 25 ribu")
    public void userChooseNominal25Ribu(Actor actor) {
        actor.attemptsTo(doSomething.chooseGoPay25rb());
    }

    @When("{actor} click on the voucher game button on menu")
    public void userClickOnTheVoucherGameButtonOnMenu(Actor actor) {
        actor.attemptsTo(doSomething.clickVoucherGameButton());
    }

    @And("{actor} click on the Twitch button")
    public void userClickOnTheTwitchButton(Actor actor) {
        actor.attemptsTo(doSomething.clickTwitchButton());
    }

    @Then("{actor} can see {string} on nominal page")
    public void userCanSeeOnNominalPage(Actor actor, String text) {
        actor.attemptsTo(Ensure.that(sepulsaPage.NOMINAL_ALERT).hasText(text));
    }

    @Given("{actor} is on sepulsa home page")
    public void userIsOnSepulsaHomePage(Actor actor) {
        actor.wasAbleTo(navigateTo.theSepulsaHomePage());
    }

    @When("{actor} click on the masuk button")
    public void userClickOnTheMasukButton(Actor actor) {
        actor.attemptsTo(doSomething.clickMasukButton());
    }

    @And("{actor} input valid sepulsa username {string}")
    public void userInputValidSepulsaUsername(Actor actor, String username) {
        actor.attemptsTo(doSomething.fillValidSepulsaUsername(username));
    }

    @And("{actor} input valid sepulsa password {string}")
    public void userInputValidSepulsaPassword(Actor actor, String password) {
        actor.attemptsTo(doSomething.fillValidSepulsaPassword(password));
    }

    @And("{actor} click on the submit login button")
    public void userClickOnTheSubmitLoginButton(Actor actor) {
        actor.attemptsTo(doSomething.clickSubmitLoginButton());
    }

    @And("{actor} click on the akun button on navbar")
    public void userClickOnTheAkunButtonOnNavbar(Actor actor) {
        actor.attemptsTo(doSomething.clickProfileButton());
    }

    @Then("{actor} can see their profile page and this text {string}")
    public void userCanSeeTheirProfilePage(Actor actor, String text) {
        actor.attemptsTo(Ensure.that(sepulsaPage.PROFILE_PAGE).hasText(text));
    }


    @Given("{actor} is logged in on sepulsa with username {string} and password {string}")
    public void userIsLoggedInOnSepulsaWithUsernameAndPassword(Actor actor, String username, String password) {
        userIsOnSepulsaHomePage(actor);
        userClickOnTheMasukButton(actor);
        userInputValidSepulsaUsername(actor, username);
        userInputValidSepulsaPassword(actor, password);
        userClickOnTheSubmitLoginButton(actor);
    }

    @And("{actor} click on the ShopeePay button")
    public void userClickOnTheShopeePayButton(Actor actor) {
        actor.attemptsTo(doSomething.clickShopeePayButton());
    }

    @And("{actor} choose nominal 15 ribu")
    public void userChooseNominal15Ribu(Actor actor) {
        actor.attemptsTo(doSomething.chooseShopeePay15rb());
    }

    @And("{actor} click on the GoPay payment method")
    public void userClickOnTheGoPayPaymentMethod(Actor actor) {
        actor.attemptsTo(doSomething.clickGoPayPaymentMethod());
    }

    @Then("{actor} click on the Bayar Sekarang button")
    public void userClickOnTheBayarSekarangButton(Actor actor) {
        actor.attemptsTo(doSomething.clickBayarSekarangButton());
    }

    @Then("{actor} can see {string} on checkout page")
    public void userCanSeeOnCheckoutPage(Actor actor, String text) {
        actor.attemptsTo(Ensure.that(sepulsaPage.PAYMENT_ALERT).hasText(text));
    }

    @And("{actor} input invalid sepulsa username {string}")
    public void userInputInvalidSepulsaUsername(Actor actor, String invUsername) {
        actor.attemptsTo(doSomething.fillInvalidSepulsaUsername(invUsername));
    }

    @And("{actor} input invalid sepulsa password {string}")
    public void userInputInvalidSepulsaPassword(Actor actor, String invPassword) {
        actor.attemptsTo(doSomething.fillInvalidSepulsaPassword(invPassword));
    }

    @Then("{actor} see this {string} alert message invalid account")
    public void userGotAlertMessageInvalidAccount(Actor actor, String alert) {
        actor.attemptsTo(Ensure.that(sepulsaPage.ALERT_MESSAGE).hasText(alert));
    }
}
