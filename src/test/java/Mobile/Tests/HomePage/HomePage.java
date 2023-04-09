package Mobile.Tests.HomePage;

import Base.MobileSetup.MobileFinder;
import org.openqa.selenium.WebElement;
import  static Base.MobileSetup.MobileSetupTest.testDataMobile;

public class HomePage {
    public static WebElement getWelcomeMessageText() {
        String xpath="//android.view.View[@content-desc=\""+testDataMobile.getWelcomeMessage()+"\"]";
        return  MobileFinder.getByXpath(xpath, false);
    }
    public static boolean welcomeMessageIsDisplayed(){
        return getWelcomeMessageText().isDisplayed();
    }
    public static WebElement getIconNotification() {

        String xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.ImageView[1]";
        return MobileFinder.getByXpath(xpath,true);

    }
    public static boolean NotificationIconIsDisplayed(){
        return getIconNotification().isDisplayed();
    }

    public static WebElement getFamcareLogo() {
        String xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.ImageView[2]";
        return MobileFinder.getByXpath(xpath,false);

    }
    public static boolean FamcareLogoIsDisplayed(){
        return getFamcareLogo().isDisplayed();
    }
    public static WebElement getCartIcon() {
        String xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.ImageView[3]";
        return MobileFinder.getByXpath(xpath,true);

    }
    public static boolean CartIconIsDisplayed(){
        return getCartIcon().isDisplayed();
    }

    public static WebElement getJalulaIcon() {
        String xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.ImageView[4]";
        return MobileFinder.getByXpath(xpath,false);

    }
    public static boolean JalulaIconIsDisplayed(){
        return getJalulaIcon().isDisplayed();
    }
    public static WebElement getFeelingButton() {
        String xpath="//android.widget.ImageView[@content-desc=\""+testDataMobile.getFeelingButtonText()+"\"]";
        return MobileFinder.getByXpath(xpath,true);

    }
    public static boolean FeelingButtonIsDisplayed(){
        return getFeelingButton().isDisplayed();
    }
    public static WebElement getSliderAds() {
        String xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View[3]/android.view.View/android.view.View";
        return MobileFinder.getByXpath(xpath,true);

    }
    public static boolean SliderAdsIsDisplayed(){
        return getSliderAds().isDisplayed();
    }
    public static WebElement getTitleTypesOfSpecialists() {
        String xpath="//android.view.View[@content-desc=\""+testDataMobile.getTypesOfSpecialistsTitle()+"\"]";
        return MobileFinder.getByXpath(xpath,false);

    }
    public static boolean TypesOfSpecialistsTitleIsDisplayed(){
        return getTitleTypesOfSpecialists().isDisplayed();
    }
    public static WebElement getPsychologistText() {
        String xpath="//android.view.View[@content-desc=\""+testDataMobile.getPsychologistText()+"\"]";
        return MobileFinder.getByXpath(xpath,false);

    }
    public static boolean PsychologistIsDisplayed(){
        return getPsychologistText().isDisplayed();
    }
    public static WebElement getSocialWorkerText() {
        String xpath="//android.view.View[@content-desc=\""+testDataMobile.getSocialWorkerText()+"\"]";
        return MobileFinder.getByXpath(xpath,false);

    }
    public static boolean SocialWorkerIsDisplayed(){
        return getSocialWorkerText().isDisplayed();
    }
    public static WebElement getEducationalSpecialistText() {
        String xpath="//android.view.View[@content-desc=\""+testDataMobile.getEducationalSpecialistText()+"\"]";
        return MobileFinder.getByXpath(xpath,false);

    }
    public static boolean EducationalSpecialistIsDisplayed(){
        return getEducationalSpecialistText().isDisplayed();
    }

    public static WebElement getPsychologistDoctorText() {
        String xpath="//android.view.View[@content-desc=\""+testDataMobile.getPsychologistDoctorText()+"\"]";
        return MobileFinder.getByXpath(xpath,true);

    }
    public static boolean PsychologistDoctorIsDisplayed(){
        return getPsychologistDoctorText().isDisplayed();
    }
    public static WebElement getSupportGroupsText() {
        String xpath="//android.view.View[@content-desc=\""+testDataMobile.getSupportGroupsText()+"\"]";
        return MobileFinder.getByXpath(xpath,true);
    }
    public static boolean SupportGroupsIsDisplayed(){
        return getSupportGroupsText().isDisplayed();
    }

    public static WebElement getIntercomIcon() {
        String xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.widget.ImageView";
       return MobileFinder.getByXpath(xpath,true);
    }
    public static boolean intercomIconIsDisplayed(){
        return getIntercomIcon().isDisplayed();
    }


}
