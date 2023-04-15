package Mobile.TestsSpecialist.SignUpScreen;

import Base.MobileSetup.MobileFinder;
import com.github.javafaker.Bool;
import io.appium.java_client.MobileElement;

import static Base.MobileSetup.MobileSetupTest.serviceProviderMobileFinder;
import static Base.MobileSetup.MobileSetupTest.testDataMobileSpecialist;

public class SignUpScreen {

    public static MobileElement getCloseButton(){
        return serviceProviderMobileFinder.getByAccessibilityId("A red up arrow", true);
    }
    public static Boolean closeButtonIsDisplayed(){
        return getCloseButton().isDisplayed();
    }
    public static MobileElement getTitle(){
        return serviceProviderMobileFinder.getByAccessibilityId(testDataMobileSpecialist.getTitleInSignUpScreen(), false);
    }
    public static Boolean titleIsDisplayed(){
        return getTitle().isDisplayed();
    }
    public static MobileElement getLogo(){
        String xpath= "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.ImageView[1]";
        return serviceProviderMobileFinder.getByXpath(xpath,false);
    }
    public static Boolean logoIsDisplayed(){
        return getLogo().isDisplayed();
    }
    public static MobileElement getMainText(){
        return serviceProviderMobileFinder.getByAccessibilityId(testDataMobileSpecialist.getMainTextInSignUpScreen(), false);
    }
    public static Boolean mainTextIsDisplayed(){
        return getMainText().isDisplayed();
    }
    public static MobileElement getDescriptionText(){
        return serviceProviderMobileFinder.getByAccessibilityId(testDataMobileSpecialist.getDescriptionTextInSignUpScreen(), false);
    }
    public static Boolean descriptionTextIsDisplayed(){
        return getDescriptionText().isDisplayed();
    }
    public static MobileElement getRegisterButton(){
        return serviceProviderMobileFinder.getByAccessibilityId(testDataMobileSpecialist.getRegisterTextInSignUpScreen(), true);
    }
    public static Boolean registerButtonIsDisplayed(){
        return getRegisterButton().isDisplayed();
    }

    public static MobileElement getHaveAccountText(){
        return serviceProviderMobileFinder.getByAccessibilityId(testDataMobileSpecialist.getHaveAccountTextInSignUpScreen(), false);
    }
    public static Boolean haveAccountTextIsDisplayed(){
        return getHaveAccountText().isDisplayed();
    }
    public static MobileElement getLoginLinkedText(){
        return serviceProviderMobileFinder.getByAccessibilityId(testDataMobileSpecialist.getLoginLinkedTextInSignUpScreen(), true);
    }
    public static Boolean loginLinkedTextIsDisplayed(){
        return getLoginLinkedText().isDisplayed();
    }
    public static MobileElement getBottomBarText(){
        return serviceProviderMobileFinder.getByAccessibilityId(testDataMobileSpecialist.getBottomBarTextInSignUpScreen(), false);
    }
    public static Boolean bottomBarTextIsDisplayed(){
        return getBottomBarText().isDisplayed();
    }
    public static MobileElement getPrivacyPolicyText(){
        return serviceProviderMobileFinder.getByAccessibilityId(testDataMobileSpecialist.getPrivacyPolicyTextInSignUpScreen(), true);
    }
    public static Boolean privacyPolicyTextIsDisplayed(){
        return getPrivacyPolicyText().isDisplayed();
    }
    public static MobileElement getAndText(){
        return serviceProviderMobileFinder.getByAccessibilityId(testDataMobileSpecialist.getAndTextInSignUpScreen(), false);
    }
    public static Boolean andTextIsDisplayed(){
        return getAndText().isDisplayed();
    }
    public static MobileElement getTermsUseText(){
        return serviceProviderMobileFinder.getByAccessibilityId(testDataMobileSpecialist.getTermsUseTextInSignUpScreen(), true);
    }
    public static Boolean termsUseTextIsDisplayed(){
        return getTermsUseText().isDisplayed();
    }
}
