package starter.page;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://sepulsa.com")
public class sepulsaPage extends PageObject {

    public static Target MASUK_BUTTON = Target.the("masuk button").located(By.id("button_signin_home"));
    public static Target SUBMIT_LOGIN_BUTTON = Target.the("submit login button").located(By.id("submit_login"));
    public static Target HOME_BUTTON = Target.the("home button").located(By.id("button_home"));
    public static Target PULSA_BUTTON = Target.the("pulsa button").located(By.id("Pulsa"));
    public static Target UANG_ELEKTRONIK_BUTTON = Target.the("uang elektronik button").located(By.id("Uang Elektronik"));
    public static Target GOPAY_BUTTON = Target.the("gopay button").located(By.id("Go-Pay"));
    public static Target SHOPEEPAY_BUTTON = Target.the("shopeepay button").located(By.id("ShopeePay"));
    public static Target BAYAR_SEKARANG_BUTTON = Target.the("bayar sekarang button").located(By.id("submit_payment"));
    public static Target PULSA_20000 = Target.the("pulsa 20rb button").located(By.id("Telkomsel Rp20.000"));
    public static Target GOPAY_25000 = Target.the("gopay 25rb button").located(By.id("GOPAY 25.000"));
    public static Target SHOPEEPAY_15000 = Target.the("shopeepay 15rb button").located(By.id("Saldo ShopeePay 15.000"));
    public static Target VOUCHER_GAME_BUTTON = Target.the("voucher game button").located(By.id("Voucher Game"));
    public static Target TWITCH_BUTTON = Target.the("twitch button").located(By.id("Twitch"));
    public static Target PROFILE_BUTTON = Target.the("profile button").located(By.id("button_profile"));

    public static Target GOPAY_PAYMENT_CHECKBOX = Target.the("gopay payment checkbox").located(By.id("checkbox Gopay"));

    public static Target USERNAME_FIELD = Target.the("sepulsa username").located(By.id("email"));
    public static Target PASSWORD_FIELD = Target.the("sepulsa password").located(By.id("password"));
    public static Target NOMOR_HP_FIELD = Target.the("field nomor handphone").located(By.id("phone_number"));

    public static Target TOTAL_PEMBAYARAN = Target.the("text total pembayaran").located(By.id("total_checkout"));
    public static Target PROFILE_PAGE = Target.the("text Lihat & ubah profil").located(By.id("see_edit_profile"));
    public static Target ALERT_MESSAGE = Target.the("text alert message").located(By.id("alert_description"));
    public static Target PAYMENT_ALERT = Target.the("text alert payment").located(By.id("error_select_payment"));
    public static Target NOMINAL_ALERT = Target.the("text alert nominal").locatedBy("//body/div[@id='__next']/div[1]/div[3]/div[1]/div[2]/div[1]/p[1]");
    public static Target HOME_PAGE = Target.the("text Lainnya").located(By.id("see_all_promotion"));
}
