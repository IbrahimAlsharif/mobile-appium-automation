package Mobile.Tests.Subscriptions;

import Base.MobileSetup.MobileFinder;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.WebElement;

import static Base.MobileSetup.MobileSetupTest.clientMobileFinder;
import static Base.MobileSetup.MobileSetupTest.testDataMobile;

public class SubscriptionsAndPackages {

    public static MobileElement getSubscriptionsAndPackages() {
        String xpath = "//android.view.View[@content-desc=\"" + testDataMobile.getSubscriptionsAndPackages() + "\"]";
        return clientMobileFinder.getByXpath(xpath, true);
    }

    public static boolean subscriptionsAndPackagesIsDisplayed() {
        return getSubscriptionsAndPackages().isDisplayed();
    }

}
