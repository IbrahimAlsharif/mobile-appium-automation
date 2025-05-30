package Mobile.TestsSpecialist.WelcomeScreen;

import Base.MobileSetup.MobileFinder;
import io.appium.java_client.MobileElement;

import static Base.MobileSetup.MobileSetupTest.serviceProviderMobileFinder;
import static Base.MobileSetup.MobileSetupTest.testDataMobileSpecialist;
public class WelcomeScreen {
    public static String ImagesXpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.widget.ImageView";
    public static MobileElement getLogo(){
        String xpath = ImagesXpath + "[1]";
        return serviceProviderMobileFinder.getByXpath(xpath, false);
    }
    public static Boolean existanceOfLogo(){
        return getLogo().isDisplayed();
    }
    public static MobileElement getWelcomPicture(){
        String xpath = ImagesXpath + "[2]";
        return  serviceProviderMobileFinder.getByXpath(xpath, false);
    }
    public static Boolean existanceOfWelcomPicture(){
        return getWelcomPicture().isDisplayed();
    }
    public static MobileElement getMainText(){
        return serviceProviderMobileFinder.getByAccessibilityId(testDataMobileSpecialist.getMainTextInWelcomeScreen(), false);
    }
    public static Boolean existanceOfMainText(){
        return getMainText().isDisplayed();
    }
    public static MobileElement getDescriptionText(){
        return serviceProviderMobileFinder.getByAccessibilityId(testDataMobileSpecialist.getDescriptionTextInWelcomeScreen(),false);
    }
    public static Boolean existanceOfDescriptionText(){
        return getDescriptionText().isDisplayed();
    }
    public static MobileElement getLoginButton(){
        return serviceProviderMobileFinder.getByAccessibilityId(testDataMobileSpecialist.getLoginButtonInWelcomeScreen(),true);
    }
    public static Boolean existanceOfLoginButton(){
        return getLoginButton().isDisplayed();
    }
    public static MobileElement getSignUpButton(){
        return serviceProviderMobileFinder.getByAccessibilityId(testDataMobileSpecialist.getSignUpButtonInWelcomeScreen(),true);
    }
    public static Boolean existanceOfSignUpButton(){
        return getSignUpButton().isDisplayed();
    }
}
