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
        Utilities.waitForElementToBeVisibleBy(By.xpath(xpath));
        By xPath = By.xpath(xpath);
        return  (MobileElement) driver.findElement(xPath);
    }
    public static Boolean existanceOfWelcomPicture(){
        return getWelcomPicture().isDisplayed();
    }
    public static WebElement getMainText(){
        return (MobileElement) driver.findElement(MobileBy.AccessibilityId(testDataMobileSpecialist.getMainTextInWelcomeScreen()));
    }
    public static Boolean existanceOfMainText(){
        return getMainText().isDisplayed();
    }
    public static WebElement getDescriptionText(){
        return (MobileElement) driver.findElement(MobileBy.AccessibilityId(testDataMobileSpecialist.getDescriptionTextInWelcomeScreen()));
    }
    public static Boolean existanceOfDescriptionText(){
        return getDescriptionText().isDisplayed();
    }
    public static WebElement getLoginButton(){
        return (MobileElement) driver.findElement(MobileBy.AccessibilityId(testDataMobileSpecialist.getLoginButtonInWelcomeScreen()));
    }
    public static Boolean existanceOfLoginButton(){
        return getLoginButton().isDisplayed();
    }
    public static WebElement getSignUpButton(){
        return (MobileElement) driver.findElement(MobileBy.AccessibilityId(testDataMobileSpecialist.getSignUpButtonInWelcomeScreen()));
    }
    public static Boolean existanceOfSignUpButton(){
        return getSignUpButton().isDisplayed();
    }
}
