package starter.helpers;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

public class doSomething {

    // LinkedIn
    public static Performable clickLinkedInSignIn() {
        return Task.where("{0} click sign in menu",
                Click.on(linkedinPage.SIGN_IN_MENU)
        );
    }

    public static Performable fillValidLinkedInUsername(String username) {
        return Task.where("{0} fill linked username field with " + username,
                Enter.theValue(username)
                        .into(linkedinPage.USERNAME_FIELD)
        );
    }

    public static Performable fillValidLinkedInPassword(String password) {
        return Task.where("{0} fill password field with " + password,
                Enter.theValue(password)
                        .into(linkedinPage.PASSWORD_FIELD)
        );
    }

    public static Performable fillInvalidLinkedInUsername(String invUsername) {
        return Task.where("{0} fill linked username field with " + invUsername,
                Enter.theValue(invUsername)
                        .into(linkedinPage.USERNAME_FIELD)
        );
    }

    public static Performable fillInvalidLinkedInPassword(String invPassword) {
        return Task.where("{0} fill password field with " + invPassword,
                Enter.theValue(invPassword)
                        .into(linkedinPage.PASSWORD_FIELD)
        );
    }

    public static Performable clickLinkedInSignInButton() {
        return Task.where("{0} click sign in button",
                Click.on(linkedinPage.SIGN_IN_BUTTON)
        );
    }

    public static Performable clickLinkedInPeopleButton() {
        return Task.where("{0} click people button",
                Click.on(linkedinPage.PEOPLE_BUTTON)
        );
    }

    public static Performable clickLinkedInPeopleSearchButton() {
        return Task.where("{0} click people search button",
                Click.on(linkedinPage.PEOPLE_SEARCH_BUTTON)
        );
    }

    public static Performable clickLinkedInJobsSearchButton() {
        return Task.where("{0} click people jobs button",
                Click.on(linkedinPage.JOBS_SEARCH_BUTTON)
        );
    }

    public static Performable clickLinkedInJobsButton() {
        return Task.where("{0} click jobs button",
                Click.on(linkedinPage.JOBS_BUTTON)
        );
    }

    public static Performable fillSearchFirstNameField(String first) {
        return Task.where("{0} fill first name with " + first,
                Enter.theValue(first)
                        .into(linkedinPage.FIRST_NAME_FIELD)
        );
    }

    public static Performable fillSearchLastNameField(String last) {
        return Task.where("{0} fill last name with " + last,
                Enter.theValue(last)
                        .into(linkedinPage.LAST_NAME_FIELD)
        );
    }

    public static Performable fillJobsSearchWithKeyword(String keyword) {
        return Task.where("{0} fill search field with " + keyword,
                Enter.theValue(keyword)
                        .into(linkedinPage.JOBS_SEARCH_FIELD)
        );
    }

    public static Performable fillJobsLocationWithValidKeyword(String location) {
        return Task.where("{0} fill search field with " + location,
                Enter.theValue(location)
                        .into(linkedinPage.JOBS_LOCATION_FIELD)
        );
    }

    public static Performable fillJobsLocationWithInvalidKeyword(String invLocation) {
        return Task.where("{0} fill search field with " + invLocation,
                Enter.theValue(invLocation)
                        .into(linkedinPage.JOBS_LOCATION_FIELD)
        );
    }



    // Sepulsa
    public static Performable clickMasukButton() {
        return Task.where("{0} click masuk button",
                Click.on(sepulsaPage.MASUK_BUTTON)
        );
    }

    public static Performable clickHomeButton() {
        return Task.where("{0} click home button",
                Click.on(sepulsaPage.HOME_BUTTON)
        );
    }


    public static Performable fillValidSepulsaUsername(String username) {
        return Task.where("{0} fill linked username field with " + username,
                Enter.theValue(username)
                        .into(sepulsaPage.USERNAME_FIELD)
        );
    }

    public static Performable fillValidSepulsaPassword(String password) {
        return Task.where("{0} fill linked username field with " + password,
                Enter.theValue(password)
                        .into(sepulsaPage.PASSWORD_FIELD)
        );
    }

    public static Performable fillInvalidSepulsaUsername(String invUsername) {
        return Task.where("{0} fill linked username field with " + invUsername,
                Enter.theValue(invUsername)
                        .into(sepulsaPage.USERNAME_FIELD)
        );
    }

    public static Performable fillInvalidSepulsaPassword(String invPassword) {
        return Task.where("{0} fill linked username field with " + invPassword,
                Enter.theValue(invPassword)
                        .into(sepulsaPage.PASSWORD_FIELD)
        );
    }

    public static Performable clickSubmitLoginButton() {
        return Task.where("{0} click submit login button",
                Click.on(sepulsaPage.SUBMIT_LOGIN_BUTTON)
        );
    }


    public static Performable clickPulsaButton() {
        return Task.where("{0} click beli pulsa button",
                Click.on(sepulsaPage.PULSA_BUTTON)
        );
    }


    public static Performable fillNomorHPWithValue(String nomorHp) {
        return Task.where("{0} fill nominal pulsa with " + nomorHp,
                Enter.theValue(nomorHp)
                        .into(sepulsaPage.NOMOR_HP_FIELD)
        );
    }

    public static Performable choosePulsa5rb() {
        return Task.where("{0} choose pulsa 5rb",
                Click.on(sepulsaPage.PULSA_5000)
        );
    }

}
