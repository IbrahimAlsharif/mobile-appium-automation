package Mobile.Tests.HomePage;

import Base.Utilities;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import static Base.SetupTest.driver;
import static Base.SetupTest.testData;

public class HomePagePOM {
    public static MobileElement getWelcomeMessageText() {
        String xpath="//android.view.View[@content-desc=\""+testData.getWelcomeMessage()+"\"]";
        Utilities.waitForElementToBeVisibleBy(By.xpath(xpath));
        Utilities.waitForElementToBeClickableBy(By.xpath(xpath));
        By xPath = By.xpath(xpath);
        return  (MobileElement) driver.findElement(xPath);
    }
    public static boolean welcomeMessageIsDisplayed(){
        return getWelcomeMessageText().isDisplayed();
    }
    public static MobileElement getIconNotification() {

        String xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.ImageView[1]";
        Utilities.waitForElementToBeVisibleBy(By.xpath(xpath));
        Utilities.waitForElementToBeClickableBy(By.xpath(xpath));
        By xPath = By.xpath(xpath);
        return  (MobileElement) driver.findElement(xPath);
//        return (MobileElement) driver.findElementByXPath(xpath);
    }
    public static boolean NotificationIconIsDisplayed(){
        return getIconNotification().isDisplayed();
    }

    public static MobileElement getFamcareLogo() {
        String xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.ImageView[2]";
        Utilities.waitForElementToBeVisibleBy(By.xpath(xpath));
        Utilities.waitForElementToBeClickableBy(By.xpath(xpath));
        By xPath = By.xpath(xpath);
        return  (MobileElement) driver.findElement(xPath);
//        return (MobileElement) driver.findElementByXPath(xpath);
    }
    public static boolean FamcareLogoIsDisplayed(){
        return getFamcareLogo().isDisplayed();
    }
    public static MobileElement getCartIcon() {
        String xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.ImageView[3]";
        Utilities.waitForElementToBeVisibleBy(By.xpath(xpath));
        Utilities.waitForElementToBeClickableBy(By.xpath(xpath));
        By xPath = By.xpath(xpath);
        return  (MobileElement) driver.findElement(xPath);
//        return (MobileElement) driver.findElementByXPath(xpath);
    }
    public static boolean CartIconIsDisplayed(){
        return getCartIcon().isDisplayed();
    }

    public static MobileElement getJalulaIcon() {
        String xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.ImageView[4]";
        Utilities.waitForElementToBeVisibleBy(By.xpath(xpath));
        Utilities.waitForElementToBeClickableBy(By.xpath(xpath));
        By xPath = By.xpath(xpath);
        return  (MobileElement) driver.findElement(xPath);
//        return (MobileElement) driver.findElementByXPath(xpath);
    }
    public static boolean JalulaIconIsDisplayed(){
        return getJalulaIcon().isDisplayed();
    }
    public static MobileElement getFeelingButton() {
        String xpath="//android.widget.ImageView[@content-desc=\""+testData.getFeelingButtonText()+"\"]";
        Utilities.waitForElementToBeVisibleBy(By.xpath(xpath));
        Utilities.waitForElementToBeClickableBy(By.xpath(xpath));
        By xPath = By.xpath(xpath);
        return  (MobileElement) driver.findElement(xPath);
//        return (MobileElement) driver.findElementByXPath(xpath);
    }
    public static boolean FeelingButtonIsDisplayed(){
        return getFeelingButton().isDisplayed();
    }
    public static MobileElement getSliderAds() {
        String xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View[3]/android.view.View/android.view.View";
        Utilities.waitForElementToBeVisibleBy(By.xpath(xpath));
        Utilities.waitForElementToBeClickableBy(By.xpath(xpath));
        By xPath = By.xpath(xpath);
        return  (MobileElement) driver.findElement(xPath);
//        return (MobileElement) driver.findElementByXPath(xpath);
    }
    public static boolean SliderAdsIsDisplayed(){
        return getSliderAds().isDisplayed();
    }
    public static MobileElement getTitleTypesOfSpecialists() {
        String xpath="//android.view.View[@content-desc=\""+testData.getTypesOfSpecialistsTitle()+"\"]";
        Utilities.waitForElementToBeVisibleBy(By.xpath(xpath));
        Utilities.waitForElementToBeClickableBy(By.xpath(xpath));
        By xPath = By.xpath(xpath);
        return  (MobileElement) driver.findElement(xPath);
//        return (MobileElement) driver.findElementByXPath(xpath);
    }
    public static boolean TypesOfSpecialistsTitleIsDisplayed(){
        return getTitleTypesOfSpecialists().isDisplayed();
    }
    public static MobileElement getPsychologistText() {
        String xpath="//android.view.View[@content-desc=\""+testData.getPsychologistText()+"\"]";
        Utilities.waitForElementToBeVisibleBy(By.xpath(xpath));
        Utilities.waitForElementToBeClickableBy(By.xpath(xpath));
        By xPath = By.xpath(xpath);
        return  (MobileElement) driver.findElement(xPath);
//        return (MobileElement) driver.findElementByXPath(xpath);
    }
    public static boolean PsychologistIsDisplayed(){
        return getPsychologistText().isDisplayed();
    }
    public static MobileElement getSocialWorkerText() {
        String xpath="//android.view.View[@content-desc=\""+testData.getSocialWorkerText()+"\"]";
        Utilities.waitForElementToBeVisibleBy(By.xpath(xpath));
        Utilities.waitForElementToBeClickableBy(By.xpath(xpath));
        By xPath = By.xpath(xpath);
        return  (MobileElement) driver.findElement(xPath);
//        return (MobileElement) driver.findElementByXPath(xpath);
    }
    public static boolean SocialWorkerIsDisplayed(){
        return getSocialWorkerText().isDisplayed();
    }
    public static MobileElement getEducationalSpecialistText() {
        String xpath="//android.view.View[@content-desc=\""+testData.getEducationalSpecialistText()+"\"]";
        Utilities.waitForElementToBeVisibleBy(By.xpath(xpath));
        Utilities.waitForElementToBeClickableBy(By.xpath(xpath));
        By xPath = By.xpath(xpath);
        return  (MobileElement) driver.findElement(xPath);
//        return (MobileElement) driver.findElementByXPath(xpath);
    }
    public static boolean EducationalSpecialistIsDisplayed(){
        return getEducationalSpecialistText().isDisplayed();
    }

    public static MobileElement getPsychologistDoctorText() {
        String xpath="//android.view.View[@content-desc=\""+testData.getPsychologistDoctorText()+"\"]";
        Utilities.waitForElementToBeVisibleBy(By.xpath(xpath));
        Utilities.waitForElementToBeClickableBy(By.xpath(xpath));
        By xPath = By.xpath(xpath);
        return  (MobileElement) driver.findElement(xPath);
//        return (MobileElement) driver.findElementByXPath(xpath);
    }
    public static boolean PsychologistDoctorIsDisplayed(){
        return getPsychologistDoctorText().isDisplayed();
    }
    public static MobileElement getSupportGroupsText() {
        String xpath="//android.view.View[@content-desc=\""+testData.getSupportGroupsText()+"\"]";
        Utilities.waitForElementToBeVisibleBy(By.xpath(xpath));
        Utilities.waitForElementToBeClickableBy(By.xpath(xpath));
        By xPath = By.xpath(xpath);
        return  (MobileElement) driver.findElement(xPath);
//        return (MobileElement) driver.findElementByXPath(xpath);
    }
    public static boolean SupportGroupsIsDisplayed(){
        return getSupportGroupsText().isDisplayed();
    }

    public static MobileElement getIntercomIcon() {
        String xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.widget.ImageView";
        Utilities.waitForElementToBeVisibleBy(By.xpath(xpath));
        Utilities.waitForElementToBeClickableBy(By.xpath(xpath));
        By xPath = By.xpath(xpath);
        return  (MobileElement) driver.findElement(xPath);
//        return (MobileElement) driver.findElementByXPath(xpath);
    }
    public static boolean intercomIconIsDisplayed(){
        return getIntercomIcon().isDisplayed();
    }



}
