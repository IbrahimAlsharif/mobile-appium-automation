package mobile_tests;
import  static Base.Initialization.testData;

import Base.Utilities;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

import static Base.Initialization.driver;

public class LanguageChoosePOM {
    public static MobileElement getWelcomeLabel() {
        String xpath="//android.view.View[@content-desc=\"Welcome to your safe space\"]";
        Utilities.waitForElementToBeVisibleBy(By.xpath(xpath));
        return (MobileElement) driver.findElementByXPath(xpath);
    }

    public static boolean welcomeTextIsDisplayed() {
        return getWelcomeLabel().isDisplayed();
    }

    public static String getWelcomeLabelText() {
        return getWelcomeLabel().getAttribute("content-desc");
    }

    public static MobileElement getMainImage(){
        String xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.widget.ImageView[1]";
        Utilities.waitForElementToBeVisibleBy(By.xpath(xpath));
        return (MobileElement) driver.findElementByXPath(xpath);
    }
    public static boolean mainImageIsDisplayed(){
        return getMainImage().isDisplayed();
    }

    public static MobileElement getWelcomeDescription() {
        String xpath="//android.view.View[@content-desc=\"You can now choose your own service language to be more comfortable with the language that suits you best\"]";
       Utilities.waitForElementToBeVisibleBy(By.xpath(xpath));
        return (MobileElement) driver.findElementByXPath(xpath);
    }
    public static boolean welcomeDescriptionIsDisplayed() {
        return getWelcomeDescription().isDisplayed();
    }

    public static MobileElement getSelectArabicText() {
        String xpath="//android.widget.ImageView[@content-desc=\""+testData.getArabicLanguageText()+"\"]";
        Utilities.waitForElementToBeVisibleBy(By.xpath(xpath));
        Utilities.waitForElementToBeClickableBy(By.xpath(xpath));
        return (MobileElement) driver.findElementByXPath(xpath);
    }
    public static void ClickOnSelectArabicText(){
        getSelectArabicText().click();
    }
    public static MobileElement getChooseButton() {
        String xpath="//android.widget.Button[@content-desc=\""+testData.getChooseButtonText()+"\"]";
        Utilities.waitForElementToBeVisibleBy(By.xpath(xpath));
        Utilities.waitForElementToBeClickableBy(By.xpath(xpath));
        return (MobileElement) driver.findElementByXPath(xpath);
    }
    public static void ClickOnChooseButton(){
        getChooseButton().click();
    }
    public static String getChooseButtonText() {
        return getChooseButton().getAttribute("content-desc");
    }
    public static MobileElement getIgnoreButton() {
        String xpath="//android.widget.Button[@content-desc=\""+testData.getIgnoreButtonText()+"\"]";
        Utilities.waitForElementToBeVisibleBy(By.xpath(xpath));
        Utilities.waitForElementToBeClickableBy(By.xpath(xpath));
        return (MobileElement) driver.findElementByXPath(xpath);
    }
    public static void ClickOnIgnoreButton(){
        getIgnoreButton().click();
    }
    public static boolean IgnoreButtonIsDisplayed(){
        return getIgnoreButton().isDisplayed();
    }


}
