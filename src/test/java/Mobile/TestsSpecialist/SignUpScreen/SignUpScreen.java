package Mobile.TestsSpecialist.SignUpScreen;

import Base.MobileSetup.MobileFinder;
import com.github.javafaker.Bool;
import io.appium.java_client.MobileElement;

import static Base.MobileSetup.MobileSetupTest.testDataMobileSpecialist;

public class SignUpScreen {

    public static MobileElement getCloseButton(){
        return MobileFinder.getByAccessibilityId("A red up arrow", true);
    }
    public static Boolean closeButtonIsDisplayed(){
        return getCloseButton().isDisplayed();
    }
    public static MobileElement getTitle(){
        return MobileFinder.getByAccessibilityId(testDataMobileSpecialist.getTitleInSignUpScreen(), false);
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
        return MobileFinder.getByAccessibilityId(testDataMobileSpecialist.getMainTextInSignUpScreen(), false);
    }
    public static Boolean mainTextIsDisplayed(){
        return getMainText().isDisplayed();
    }
    public static MobileElement getDescriptionText(){
        return MobileFinder.getByAccessibilityId(testDataMobileSpecialist.getDescriptionTextInSignUpScreen(), false);
    }
    public static Boolean descriptionTextIsDisplayed(){
        return getDescriptionText().isDisplayed();
    }
    public static MobileElement getRegisterButton(){
        return MobileFinder.getByAccessibilityId(testDataMobileSpecialist.getRegisterTextInSignUpScreen(), true);
    }
    public static Boolean registerButtonIsDisplayed(){
        return getRegisterButton().isDisplayed();
    }

    public static MobileElement getHaveAccountText(){
        return MobileFinder.getByAccessibilityId(testDataMobileSpecialist.getHaveAccountTextInSignUpScreen(), false);
    }
    public static Boolean haveAccountTextIsDisplayed(){
        return getHaveAccountText().isDisplayed();
    }
    public static MobileElement getLoginLinkedText(){
        return MobileFinder.getByAccessibilityId(testDataMobileSpecialist.getLoginLinkedTextInSignUpScreen(), true);
    }
    public static Boolean loginLinkedTextIsDisplayed(){
        return getLoginLinkedText().isDisplayed();
    }
    public static MobileElement getBottomBarText(){
        return MobileFinder.getByAccessibilityId(testDataMobileSpecialist.getBottomBarTextInSignUpScreen(), false);
    }
    public static Boolean bottomBarTextIsDisplayed(){
        return getBottomBarText().isDisplayed();
    }
    public static MobileElement getPrivacyPolicyText(){
        return MobileFinder.getByAccessibilityId(testDataMobileSpecialist.getPrivacyPolicyTextInSignUpScreen(), true);
    }
    public static Boolean privacyPolicyTextIsDisplayed(){
        return getPrivacyPolicyText().isDisplayed();
    }
    public static MobileElement getAndText(){
        return MobileFinder.getByAccessibilityId(testDataMobileSpecialist.getAndTextInSignUpScreen(), false);
    }
    public static Boolean andTextIsDisplayed(){
        return getAndText().isDisplayed();
    }
    public static MobileElement getTermsUseText(){
        return MobileFinder.getByAccessibilityId(testDataMobileSpecialist.getTermsUseTextInSignUpScreen(), true);
    }
    public static Boolean termsUseTextIsDisplayed(){
        return getTermsUseText().isDisplayed();
    }
}
