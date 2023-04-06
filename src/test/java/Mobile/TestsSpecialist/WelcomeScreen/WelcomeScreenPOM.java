package Mobile.TestsSpecialist.WelcomeScreen;

import Base.Utilities;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static Base.SetupTest.*;

public class WelcomeScreenPOM {
    public static String ImagesXpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.widget.ImageView";
    public static WebElement getLogo(){
        String xpath = ImagesXpath + "[1]";
        return Utilities.getByXpath(xpath, false);
    }
    public static Boolean existanceOfLogo(){
        return getLogo().isDisplayed();
    }
    public static WebElement getWelcomPicture(){
        String xpath = ImagesXpath + "[2]";
        return  Utilities.getByXpath(xpath, false);
    }
    public static Boolean existanceOfWelcomPicture(){
        return getWelcomPicture().isDisplayed();
    }
    public static WebElement getMainText(){
        return Utilities.getByAccessibilityId(testDataMobileSpecialist.getMainTextInWelcomeScreen(), false);
    }
    public static Boolean existanceOfMainText(){
        return getMainText().isDisplayed();
    }
    public static WebElement getDescriptionText(){
        return Utilities.getByAccessibilityId(testDataMobileSpecialist.getDescriptionTextInWelcomeScreen(),false);
    }
    public static Boolean existanceOfDescriptionText(){
        return getDescriptionText().isDisplayed();
    }
    public static WebElement getLoginButton(){
        return Utilities.getByAccessibilityId(testDataMobileSpecialist.getLoginButtonInWelcomeScreen(),true);
    }
    public static Boolean existanceOfLoginButton(){
        return getLoginButton().isDisplayed();
    }
    public static WebElement getSignUpButton(){
        return Utilities.getByAccessibilityId(testDataMobileSpecialist.getSignUpButtonInWelcomeScreen(),true);
    }
    public static Boolean existanceOfSignUpButton(){
        return getSignUpButton().isDisplayed();
    }
}
