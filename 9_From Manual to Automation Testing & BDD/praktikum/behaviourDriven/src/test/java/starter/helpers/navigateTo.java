package starter.helpers;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class navigateTo {
    public static Performable theLinkedInLandingPage() {
        return Task.where("{0} opens the LinkedIn landing page",
                Open.browserOn().the(linkedinPage.class));
    }
    public static Performable theSepulsaHomePage() {
        return Task.where("{0} opens the Sepulsa home page",
                Open.browserOn().the(sepulsaPage.class));
    }
}
