package starter.navigation;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import starter.page.saucedemoPage;
import starter.page.saucelabsPage;
import starter.page.sepulsaPage;

public class navigateTo {
    public static Performable theSepulsaHomePage() {
        return Task.where("{0} opens the Sepulsa home page",
                Open.browserOn().the(sepulsaPage.class));
    }

    public static Performable theSauceDemoLoginPage() {
        return Task.where("{0} opens the SauceDemo login page",
                Open.browserOn().the(saucedemoPage.class));
    }

    public static Performable theSauceDemoAbout404Page() {
        return Task.where("{0} opens the About 404 page",
                Open.browserOn().the(saucelabsPage.class));
    }
}
