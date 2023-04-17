package Web.Tests.Footer;

import Base.WebSetup.WebFinder;
import org.openqa.selenium.WebElement;

public class Footer {

    public static WebElement getFooterGooglePlayButton() {
        String xpath="//IMG[@src='https://famcare.app/wp-content/themes/famkeer/images/Google-Play.svg']";
        return  WebFinder.getByXpath(xpath, true);
    }

    public static boolean footerGooglePlayButtonIsDisplayed() {
        return getFooterGooglePlayButton().isDisplayed();
    }

    public static WebElement getFooterAppStoreButton() {
        String xpath="//IMG[@src='https://famcare.app/wp-content/themes/famkeer/images/App-Store.svg']";
        return  WebFinder.getByXpath(xpath, true);
    }

    public static boolean footerAppStoreButtonIsDisplayed() {
        return getFooterAppStoreButton().isDisplayed();
    }
}
