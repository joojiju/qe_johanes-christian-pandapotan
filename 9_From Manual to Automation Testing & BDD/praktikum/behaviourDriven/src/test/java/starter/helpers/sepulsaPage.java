package starter.helpers;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://sepulsa.com")
public class sepulsaPage extends PageObject{

    public static Target MASUK_BUTTON = Target.the("masuk button").located(By.id("button_signin_home"));
    public static Target SUBMIT_LOGIN_BUTTON = Target.the("submit login button").located(By.id("submit_login"));
    public static Target HOME_BUTTON = Target.the("home button").located(By.id("button_home"));
    public static Target PULSA_BUTTON = Target.the("pulsa button").located(By.id("Pulsa"));
    public static Target PULSA_5000 = Target.the("pulsa 5rb button").located(By.id("Telkomsel Rp5.000"));

    public static Target USERNAME_FIELD = Target.the("sepulsa username").located(By.id("email"));
    public static Target PASSWORD_FIELD = Target.the("sepulsa password").located(By.id("password"));
    public static Target NOMOR_HP_FIELD = Target.the("field nomor handphone").located(By.id("phone_number"));

    public static Target TOTAL_PEMBAYARAN = Target.the("text total pembayaran").located(By.id("total_checkout"));
    public static Target ALERT_MESSAGE = Target.the("text alert message").located(By.id("alert_description"));
    public static Target HOME_PAGE = Target.the("text Lainnya").located(By.id("see_all_promotion"));
}
