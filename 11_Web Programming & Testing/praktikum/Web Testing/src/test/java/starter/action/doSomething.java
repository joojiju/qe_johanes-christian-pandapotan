package starter.action;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import starter.page.saucedemoPage;
import starter.page.sepulsaPage;

public class doSomething {
    // Sauce Demo
    public static Performable fillSauceDemoUsername(String username) {
        return Task.where("{0} fill saucedemo username field with " + username,
                Enter.theValue(username)
                        .into(saucedemoPage.USERNAME_FIELD)
        );
    }

    public static Performable fillSauceDemoPassword(String password) {
        return Task.where("{0} fill saucedemo username field with " + password,
                Enter.theValue(password)
                        .into(saucedemoPage.PASSWORD_FIELD)
        );
    }

    public static Performable clickSauceDemoSubmitLoginButton() {
        return Task.where("{0} click saucedemo submit login button",
                Click.on(saucedemoPage.SUBMIT_LOGIN_BUTTON)
        );
    }

    public static Performable clickSauceDemoSideNavbarButton() {
        return Task.where("{0} click saucedemo side navbar button",
                Click.on(saucedemoPage.SIDE_NAVBAR_BUTTON)
        );
    }

    public static Performable clickSauceDemoAboutMenuButton() {
        return Task.where("{0} click saucedemo about menu button",
                Click.on(saucedemoPage.ABOUT_MENU_BUTTON)
        );
    }

    public static Performable addSauceLabsBackpackItemsButton() {
        return Task.where("{0} click saucedemo add backpack button",
                Click.on(saucedemoPage.ADD_BACKPACK_BUTTON)
        );
    }

    public static Performable addSauceLabsFleeceJacketItemsButton() {
        return Task.where("{0} click saucedemo add jacket button",
                Click.on(saucedemoPage.ADD_JACKET_BUTTON)
        );
    }

    public static Performable clickSauceDemoCartButton() {
        return Task.where("{0} click saucedemo cart button",
                Click.on(saucedemoPage.CART_BUTTON)
        );
    }

    public static Performable clickSauceDemoCheckoutButton() {
        return Task.where("{0} click saucedemo checkout button",
                Click.on(saucedemoPage.CHECKOUT_BUTTON)
        );
    }

    public static Performable fillSauceDemoCheckoutFirstname(String firstname) {
        return Task.where("{0} fill saucedemo firstname field with " + firstname,
                Enter.theValue(firstname)
                        .into(saucedemoPage.FIRSTNAME_FIELD)
        );
    }

    public static Performable fillSauceDemoCheckoutLastname(String lastname) {
        return Task.where("{0} fill saucedemo lastname field with " + lastname,
                Enter.theValue(lastname)
                        .into(saucedemoPage.LASTNAME_FIELD)
        );
    }

    public static Performable fillSauceDemoCheckoutPostalCode(String postalcode) {
        return Task.where("{0} fill saucedemo postalcode field with " + postalcode,
                Enter.theValue(postalcode)
                        .into(saucedemoPage.POSTALCODE_FIELD)
        );
    }

    public static Performable clickSauceDemoContinueButton() {
        return Task.where("{0} click saucedemo continue button",
                Click.on(saucedemoPage.CONTINUE_BUTTON)
        );
    }

    public static Performable clickSauceDemoFinishButton() {
        return Task.where("{0} click saucedemo finish button",
                Click.on(saucedemoPage.FINISH_BUTTON)
        );
    }

    // Sepulsa
    public static Performable clickMasukButton() {
        return Task.where("{0} click masuk button",
                Click.on(sepulsaPage.MASUK_BUTTON)
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

    public static Performable clickHomeButton() {
        return Task.where("{0} click home button",
                Click.on(sepulsaPage.HOME_BUTTON)
        );
    }


    public static Performable clickPulsaButton() {
        return Task.where("{0} click beli pulsa button",
                Click.on(sepulsaPage.PULSA_BUTTON)
        );
    }

    public static Performable clickUangElektronikButton() {
        return Task.where("{0} click uang elektronik button",
                Click.on(sepulsaPage.UANG_ELEKTRONIK_BUTTON)
        );
    }

    public static Performable clickGoPayButton() {
        return Task.where("{0} click gopay button",
                Click.on(sepulsaPage.GOPAY_BUTTON)
        );
    }

    public static Performable clickShopeePayButton() {
        return Task.where("{0} click shopeepay button",
                Click.on(sepulsaPage.SHOPEEPAY_BUTTON)
        );
    }

    public static Performable chooseShopeePay15rb() {
        return Task.where("{0} choose shopeepay 15rb",
                Click.on(sepulsaPage.SHOPEEPAY_15000)
        );
    }

    public static Performable clickGoPayPaymentMethod() {
        return Task.where("{0} click gopay payment button",
                Click.on(sepulsaPage.GOPAY_PAYMENT_CHECKBOX)
        );
    }

    public static Performable clickBayarSekarangButton() {
        return Task.where("{0} click bayar sekarang button",
                Click.on(sepulsaPage.BAYAR_SEKARANG_BUTTON)
        );
    }

    public static Performable clickVoucherGameButton() {
        return Task.where("{0} click voucher game button",
                Click.on(sepulsaPage.VOUCHER_GAME_BUTTON)
        );
    }

    public static Performable clickTwitchButton() {
        return Task.where("{0} click twitch button",
                Click.on(sepulsaPage.TWITCH_BUTTON)
        );
    }

    public static Performable fillNomorHPWithValue(String nomorHp) {
        return Task.where("{0} fill nominal pulsa with " + nomorHp,
                Enter.theValue(nomorHp)
                        .into(sepulsaPage.NOMOR_HP_FIELD)
        );
    }

    public static Performable choosePulsa20rb() {
        return Task.where("{0} choose pulsa 20rb",
                Click.on(sepulsaPage.PULSA_20000)
        );
    }

    public static Performable chooseGoPay25rb() {
        return Task.where("{0} choose gopay 25rb",
                Click.on(sepulsaPage.GOPAY_25000)
        );
    }

    public static Performable clickProfileButton() {
        return Task.where("{0} click profile button",
                Click.on(sepulsaPage.PROFILE_BUTTON)
        );
    }
}

