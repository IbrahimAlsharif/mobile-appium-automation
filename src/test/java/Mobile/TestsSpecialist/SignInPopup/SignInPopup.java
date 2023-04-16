package Mobile.TestsSpecialist.SignInPopup;

import Base.MobileSetup.MobileFinder;
import io.appium.java_client.MobileElement;

import static Base.MobileSetup.MobileSetupTest.testDataMobileSpecialist;

public class SignInPopup {
    //Title
    public static MobileElement getTitle(){
        return MobileFinder.getByXpath(testDataMobileSpecialist.(), false);
    }
    //TitleIsDisplayed
    public static Boolean titleIsDisplayed(){
        return getTitle().isDisplayed();
    }

    //Description
    public static MobileElement getDescriptionText(){
        return MobileFinder.getByXpath(testDataMobileSpecialist.(), false);
    }
    //DescriptionIsDisplayed
    public static Boolean descriptionTextIsDisplayed(){
        return getDescriptionText().isDisplayed();
    }

    //MobileField
    public static MobileElement getMobileField(){
        return MobileFinder.getByXpath(testDataMobileSpecialist.(), false);
    }
    //MobileFieldIsDisplayed
    public static Boolean mobileFieldIsDisplayed(){
        return getMobileField().isDisplayed();
    }
    //PasswordField
    public static MobileElement getPasswordField(){
        return MobileFinder.getByXpath(testDataMobileSpecialist.(), false);
    }
    //PasswordFieldIsDisplayed
    public static Boolean passwordFieldIsDisplayed(){
        return getPasswordField().isDisplayed();
    }

    //ForgetPassword
    public static MobileElement getForgetPasswordLinked(){
        return MobileFinder.getByXpath(testDataMobileSpecialist.(), false);
    }
    //ForgetPasswordIsDisplayed
    public static Boolean forgetPasswordLinkedIsDisplayed(){
        return getForgetPasswordLinked().isDisplayed();
    }

    //SignInButton
    public static MobileElement getSignInButton(){
        return MobileFinder.getByXpath(testDataMobileSpecialist.(), false);
    }
    //SignInButtonIsDisplayed
    public static Boolean signInButtonIsDisplayed(){
        return getSignInButton().isDisplayed();
    }

}
