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
    public static MobileElement getSessionWithSpecialist() {
        String xpath = "//android.view.View[@content-desc=\"" + testDataMobile.getSessionWithSpecialist() + "\"]";
        return clientMobileFinder.getByXpath(xpath, true);
    }

    public static boolean sessionWithSpecialistIsDisplayed() {
        return getSessionWithSpecialist().isDisplayed();
    }

    public static boolean subscriptionsAndPackagesIsDisplayed() {
        return getSubscriptionsAndPackages().isDisplayed();
    }
    public static MobileElement getBronzeSubscription() {
        String xpath = "//android.view.View[@content-desc=\"" + testDataMobile.getBronzeSubscriptionText() + "\"]";
        return clientMobileFinder.getByXpath(xpath, true);
    }

    public static boolean BronzeSubscriptionIsDisplayed() {
        return getBronzeSubscription().isDisplayed();
    }


    public static MobileElement getSilverSubscription() {
        String xpath = "//android.view.View[@content-desc=\"" + testDataMobile.getSilverSubscription() + "\"]";
        return MobileFinder.getByXpath(xpath, true);
    }

    public static boolean silverSubscriptionIsDisplayed() {
        return getSilverSubscription().isDisplayed();
    }
    public static MobileElement getGoldSubscription() {
        String xpath = "//android.view.View[@content-desc=\"" + testDataMobile.getGoldSubscription() + "\"]";
        return MobileFinder.getByXpath(xpath, true);
    }
    public static boolean goldSubscriptionIsDisplayed() {
        return getGoldSubscription().isDisplayed();
    }
    public static MobileElement getPaidSupport() {
        String xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.ImageView";
        return MobileFinder.getByXpath(xpath, true);
    }
    public static boolean paidSupportIsDisplayed() {
        return getPaidSupport().isDisplayed();
    }
    public static MobileElement getThreeMonthsSubscription() {
        String xpath = "//android.view.View[@content-desc=\"" + testDataMobile.getThreeMonthsSubscription() + "\"]";
        return MobileFinder.getByXpath(xpath, true);
    }

    public static boolean threeMonthsSubscriptionIsDisplayed() {
        return getThreeMonthsSubscription().isDisplayed();
    }
public  static  void  clickOnThreeMonthsSubscription(){
    getThreeMonthsSubscription().click();
}
    public static MobileElement getSubscribeButton() {
        String xpath = "//android.widget.Button[@content-desc=\"" + testDataMobile.getSubscribeButton() + "\"]";
        return MobileFinder.getByXpath(xpath, true);
    }

    public static boolean subscribeButtonIsDisplayed() {
        return getSubscribeButton().isDisplayed();
    }
public  static  void  clickOnSubscribeButton(){
    getSubscribeButton().click();
}

}
