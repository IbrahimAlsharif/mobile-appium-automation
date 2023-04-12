package Mobile.Tests.Auth;

import Base.MobileSetup.MobileFinder;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.Keys;

import static Base.MobileSetup.MobileSetupTest.testDataMobile;

public class Login {

    public static MobileElement getSignInButton() {
        String xpath = "//android.view.View[@content-desc=\"" + testDataMobile.getSignInButton() + "\"]";
        return MobileFinder.getByXpath(xpath, true);
    }

    public static void ClickOnSignInButton() {
        getSignInButton().click();
    }


    public static MobileElement getLogInByPhoneButton() {
        String xpath = "//android.widget.ImageView[@content-desc=\"" + testDataMobile.getLogInByPhone() + "\"]";
        return MobileFinder.getByXpath(xpath, false);
    }

    public static boolean LogInByPhoneButtonIsDisplayed() {
        return getLogInByPhoneButton().isDisplayed();
    }

    public static void ClickOnLogInByPhoneButton() {
        getLogInByPhoneButton().click();
    }


    public static MobileElement getPhoneField() {
        String xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView[1]";
        return MobileFinder.getByXpath(xpath, false);
    }
    public static void ClickOnPhoneField() {
        getPhoneField().click();
    }
    public static void InputOnPhoneField(String phone){
        getPhoneField().sendKeys(phone, Keys.TAB);

    }

}