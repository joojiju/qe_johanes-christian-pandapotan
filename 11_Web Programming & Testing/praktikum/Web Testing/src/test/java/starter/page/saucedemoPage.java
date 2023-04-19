package starter.page;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.saucedemo.com/")
public class saucedemoPage extends PageObject {
    public static Target SUBMIT_LOGIN_BUTTON = Target.the("saucedemo submit login button").located(By.id("login-button"));
    public static Target SIDE_NAVBAR_BUTTON = Target.the("saucedemo side navbar button").located(By.id("react-burger-menu-btn"));
    public static Target ABOUT_MENU_BUTTON = Target.the("saucedemo about menu button").located(By.id("about_sidebar_link"));
    public static Target ADD_BACKPACK_BUTTON = Target.the("saucedemo add backpack button").located(By.id("add-to-cart-sauce-labs-backpack"));
    public static Target ADD_JACKET_BUTTON = Target.the("saucedemo add jacket button").located(By.id("add-to-cart-sauce-labs-fleece-jacket"));
    public static Target CART_BUTTON = Target.the("saucedemo cart button").located(By.id("shopping_cart_container"));
    public static Target CHECKOUT_BUTTON = Target.the("saucedemo checkout button").located(By.id("checkout"));
    public static Target CONTINUE_BUTTON = Target.the("saucedemo continue button").located(By.id("continue"));
    public static Target FINISH_BUTTON = Target.the("saucedemo finish button").located(By.id("finish"));

    public static Target USERNAME_FIELD = Target.the("saucedemo username field").located(By.id("user-name"));
    public static Target PASSWORD_FIELD = Target.the("saucedemo password field").located(By.id("password"));
    public static Target FIRSTNAME_FIELD = Target.the("saucedemo firstname field").located(By.id("first-name"));
    public static Target LASTNAME_FIELD = Target.the("saucedemo lastname field").located(By.id("last-name"));
    public static Target POSTALCODE_FIELD = Target.the("saucedemo postalcode field").located(By.id("postal-code"));

    public static Target INVENTORY_PAGE = Target.the("inventory page title").locatedBy("//span[contains(text(),'Products')]");
    public static Target LOGIN_ALERT = Target.the("login alert text").locatedBy("//body/div[@id='root']/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[3]/h3[1]");
    public static Target CHECKOUT_OVERVIEW = Target.the("checkout overview text").locatedBy("//span[contains(text(),'Checkout: Overview')]");
    public static Target CHECKOUT_COMPLETE = Target.the("checkout complete text").locatedBy("//span[contains(text(),'Checkout: Complete!')]");
    public static Target CHECKOUT_FAILED = Target.the("checkout failed text").locatedBy("//body/div[@id='root']/div[@id='page_wrapper']/div[@id='contents_wrapper']/div[@id='checkout_info_container']/div[1]/form[1]/div[1]/div[4]/h3[1]");
}


