package Mobile.TestsSpecialist.SignInScreen;

import Base.MobileSetup.MobileFinder;
import io.appium.java_client.MobileElement;

import static Base.MobileSetup.MobileSetupTest.testDataMobileSpecialist;

public class SignInScreen {
    public static MobileElement getCloseButton(){
        return MobileFinder.getByAccessibilityId("A red up arrow", true);
    }
    public static Boolean closeButtonIsDisplayed(){
        return getCloseButton().isDisplayed();
    }
    public static MobileElement getTitle(){
        return MobileFinder.getByAccessibilityId(testDataMobileSpecialist.getTitleInSignInScreen(), false);
    }
    public static Boolean titleIsDisplayed(){
        return getTitle().isDisplayed();
    }
    public static MobileElement getLogo(){
        String xpath= "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.ImageView[1]";
        return MobileFinder.getByXpath(xpath,false);
    }
    public static Boolean logoIsDisplayed(){
        return getLogo().isDisplayed();
    }
    public static MobileElement getMainText(){
        return MobileFinder.getByAccessibilityId(testDataMobileSpecialist.getMainTextInSignInScreen(), false);
    }
    public static Boolean mainTextIsDisplayed(){
        return getMainText().isDisplayed();
    }
    public static MobileElement getDescriptionText(){
        return MobileFinder.getByAccessibilityId(testDataMobileSpecialist.getDescriptionTextInSignInScreen(), false);
    }
    public static Boolean descriptionTextIsDisplayed(){
        return getDescriptionText().isDisplayed();
    }
    public static MobileElement getLoginButton(){
        return MobileFinder.getByAccessibilityId(testDataMobileSpecialist.getLoginButtonInSignInScreen(), true);
    }
    public static Boolean loginButtonIsDisplayed(){
        return getLoginButton().isDisplayed();
    }

    public static MobileElement getHaveNotAccountText(){
        return MobileFinder.getByAccessibilityId(testDataMobileSpecialist.getHaveNotAccountTextInSignInScreen(), false);
    }
    public static Boolean haveNotAccountTextIsDisplayed(){
        return getHaveNotAccountText().isDisplayed();
    }
    public static MobileElement getSignUpLinkedText(){
        return MobileFinder.getByAccessibilityId(testDataMobileSpecialist.getSignUpLinkedTextInSignInScreen(), true);
    }
    public static Boolean signUpLinkedTextIsDisplayed(){
        return getSignUpLinkedText().isDisplayed();
    }
    public static MobileElement getBottomBarText(){
        return MobileFinder.getByAccessibilityId(testDataMobileSpecialist.getBottomBarTextInSignInScreen(), false);
    }
    public static Boolean bottomBarTextIsDisplayed(){
        return getBottomBarText().isDisplayed();
    }
    public static MobileElement getPrivacyPolicyText(){
        return MobileFinder.getByAccessibilityId(testDataMobileSpecialist.getPrivacyPolicyTextInSignInScreen(), true);
    }
    public static Boolean privacyPolicyTextIsDisplayed(){
        return getPrivacyPolicyText().isDisplayed();
    }
    public static MobileElement getAndText(){
        return MobileFinder.getByAccessibilityId(testDataMobileSpecialist.getAndTextInSignInScreen(), false);
    }
    public static Boolean andTextIsDisplayed(){
        return getAndText().isDisplayed();
    }
    public static MobileElement getTermsUseText(){
        return MobileFinder.getByAccessibilityId(testDataMobileSpecialist.getTermsUseTextInSignInScreen(), true);
    }
    public static Boolean termsUseTextIsDisplayed(){
        return getTermsUseText().isDisplayed();
    }
}
