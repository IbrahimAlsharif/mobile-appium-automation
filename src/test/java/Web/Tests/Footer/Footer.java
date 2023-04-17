package Web.Tests.Footer;

import Base.WebSetup.WebFinder;
import org.openqa.selenium.WebElement;

public class Footer {

    public static WebElement getGooglePlayButton() {
        String xpath="//IMG[@src='https://famcare.app/wp-content/themes/famkeer/images/Google-Play.svg']";
        return  WebFinder.getByXpath(xpath, true);
    }

    public static boolean googlePlayButtonIsDisplayed() {
        return getGooglePlayButton().isDisplayed();
    }

    public static WebElement getAppStoreButton() {
        String xpath="//IMG[@src='https://famcare.app/wp-content/themes/famkeer/images/App-Store.svg']";
        return  WebFinder.getByXpath(xpath, true);
    }

    public static boolean appStoreButtonIsDisplayed() {
        return getAppStoreButton().isDisplayed();
    }
}
