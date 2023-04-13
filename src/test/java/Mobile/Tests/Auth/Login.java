package Mobile.Tests.Auth;

import Base.MobileSetup.MobileFinder;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import static Base.MobileSetup.MobileSetupTest.testDataMobile;
import static org.aspectj.weaver.Shadow.Initialization;

public class Login {

    public static MobileElement getSignInButton() {
        String xpath = "//android.view.View[@content-desc=\"" + testDataMobile.getSignInButton() + "\"]";
        return MobileFinder.getByXpath(xpath, true);
    }

    public static void ClickOnSignInButton() {
        getSignInButton().click();
    }


    public static MobileElement getLogInByPhoneButton() {
        String xpath = "//android.widget.ImageView[@content-desc=\"" +testDataMobile.getLogInByPhone()+ "\"]";
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
    public static void InputOnPhoneField(String phone) {
        getPhoneField().sendKeys(phone);
    }
    public static MobileElement getPasswordField() {
        String xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView[2]/android.widget.EditText";
        return MobileFinder.getByXpath(xpath, true);
    }
    public static void ClickOnPasswordField() {
        getPasswordField().click();
    }
    public static void InputOnPasswordField(String Password) {
        getPasswordField().sendKeys(Password);
    }
    public static MobileElement getLogInButton() {
        String xpath = "//android.widget.Button[@content-desc=\""+testDataMobile.getLogInButton()+"\"]";
        return MobileFinder.getByXpath(xpath, true);
    }
    public static boolean LogInButtonIsDisplayed() {
        return getLogInButton().isDisplayed();
    }
    public static void ClickOnLogInButton() {
        getLogInButton().click();
    }
    public static MobileElement getLogInTitle() {
        String xpath = "//android.view.View[@content-desc=\"" +testDataMobile.getLogInButton()+ "\"]";
        return MobileFinder.getByXpath(xpath, false);
    }
    public static boolean LogInTitleIsDisplayed() {
        return getLogInTitle().isDisplayed();
    }
    public static WebElement getWelcomeMessageText() {
        String xpath="//android.view.View[@content-desc=\""+testDataMobile.getWelcomeMessage()+"\"]";
        return  MobileFinder.getByXpath(xpath, false);
    }
    public static boolean welcomeMessageIsDisplayed(){
        return getWelcomeMessageText().isDisplayed();
    }
    public static WebElement getUserNameText() {
        String xpath="//android.view.View[@content-desc=\""+testDataMobile.getUserNameTextAfterLogin()+"\"]";
        return  MobileFinder.getByXpath(xpath, false);
    }
    public static boolean UserNameIsDisplayed(){
        return getUserNameText().isDisplayed();
    }



}