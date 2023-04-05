package Mobile.SpecialistTests.WelcomeScreen;

import Base.Utilities;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static Base.SetupTest.driver;

public class WelcomeScreenPOM {
    public static WebElement getLogo(){
        List<WebElement> Images = driver.findElements(By.className("android.widget.ImageView"));
        Utilities.waitForElementToBeVisibleBy(By.className("android.widget.ImageView"));
        return (MobileElement) Images.get(0);
    }
    public static Boolean existanceOfLogo(){
        return getLogo().isDisplayed();
    }
    public static WebElement getWelcomPicture(){
        List<WebElement> Images = driver.findElements(By.className("android.widget.ImageView"));
        return (MobileElement) Images.get(1);
    }
    public static Boolean existanceOfWelcomPicture(){
        return getWelcomPicture().isDisplayed();
    }
    public static WebElement getMainText(){
        return (MobileElement) driver.findElement(MobileBy.AccessibilityId("استشارة منك تغير حياة الآخرين للأفضل"));
    }
    public static Boolean existanceOfMainText(){
        return getMainText().isDisplayed();
    }
    public static WebElement getDescriptionText(){
        return (MobileElement) driver.findElement(MobileBy.AccessibilityId("تبدأ من انضمامك معنا وحتى تصل للعديد من العملاء من خلالنا بطرق تواصل مُيسرة"));
    }
    public static Boolean existanceOfDescriptionText(){
        return getDescriptionText().isDisplayed();
    }
    public static WebElement getLoginButton(){
        return (MobileElement) driver.findElement(MobileBy.AccessibilityId("تسجيل الدخول"));
    }
    public static Boolean existanceOfLoginButton(){
        return getLoginButton().isDisplayed();
    }
    public static WebElement getSignUpButton(){
        return (MobileElement) driver.findElement(MobileBy.AccessibilityId("انشاء حساب جديد"));
    }
    public static Boolean existanceOfSignUpButton(){
        return getSignUpButton().isDisplayed();
    }
}
