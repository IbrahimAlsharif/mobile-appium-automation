package Mobile.TestsSpecialist.SignInPopup;

import io.appium.java_client.MobileElement;
import static Base.MobileSetup.MobileSetupTest.serviceProviderMobileFinder;
import static Base.MobileSetup.MobileSetupTest.testDataMobileSpecialist;

public class SignInPopup {
    public static String xpath;
    public static MobileElement getTitle(){
        String xpath = "//android.view.View[@content-desc=\"" +testDataMobileSpecialist.getTitleInSignInPopup()+ "\"]";
        return serviceProviderMobileFinder.getByXpath(xpath, false);

    }
    public static Boolean titleIsDisplayed(){
        return getTitle().isDisplayed();
    }

    public static MobileElement getDescriptionText(){
        return serviceProviderMobileFinder.getByXpath("//android.view.View[@content-desc=\""+testDataMobileSpecialist.getDescriptionTextInSignInPopup()+"\"]", false);
    }
    public static Boolean descriptionTextIsDisplayed(){
        return getDescriptionText().isDisplayed();
    }

    public static MobileElement getMobileField(){
        xpath ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView[1]";
        return serviceProviderMobileFinder.getByXpath(xpath, true);
    }
    public static Boolean mobileFieldIsDisplayed(){
        return getMobileField().isDisplayed();
    }
    public static MobileElement getPasswordField(){
        xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView[2]/android.widget.EditText";
        return serviceProviderMobileFinder.getByXpath(xpath, true);
    }
    public static Boolean passwordFieldIsDisplayed(){
        return getPasswordField().isDisplayed();
    }

    public static MobileElement getForgetPasswordLinked(){
        xpath = "//android.view.View[@content-desc=\""+testDataMobileSpecialist.getForgetPasswordInSignInPopup()+"\"]";
        return serviceProviderMobileFinder.getByXpath(xpath, false);
    }
    public static Boolean forgetPasswordLinkedIsDisplayed(){
        return getForgetPasswordLinked().isDisplayed();
    }
    public static MobileElement getSignInButton(){
        xpath ="//android.widget.Button[@content-desc=\""+testDataMobileSpecialist.getSignInButtonInSignInPopup()+"\"]";
        return serviceProviderMobileFinder.getByXpath(xpath, true);
    }
    public static Boolean signInButtonIsDisplayed(){
        return getSignInButton().isDisplayed();
    }
    public static Boolean signInButtonIsEnabled(){
        return getSignInButton().isEnabled();
    }

}
