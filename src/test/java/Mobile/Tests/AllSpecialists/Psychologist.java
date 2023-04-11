package Mobile.Tests.AllSpecialists;


import Base.MobileSetup.MobileFinder;
import net.bytebuddy.asm.Advice;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.security.Key;

import  static Base.MobileSetup.MobileSetupTest.testDataMobile;




public class Psychologist {


    public static WebElement getTitleAppBarOnPsychologistPage() {
        String xpath="//android.view.View[@content-desc=\""+testDataMobile.getTitleAppBarOnPsychologistPage()+"\"]";
        return  MobileFinder.getByXpath(xpath,false);
    }
    public static boolean TitleAppBarOnMyConversationsDisplayed(){
        return getTitleAppBarOnPsychologistPage().isDisplayed();
    }
    public static WebElement getSearchFieldOnPsychologistPage() {
        String xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.widget.EditText";
        return  MobileFinder.getByXpath(xpath,true);
    }
    public static boolean SearchFieldOnPsychologistPageIsDisplayed(){
        return getSearchFieldOnPsychologistPage().isDisplayed();
    }
    public static WebElement getFilterOnPsychologistPage() {
        String xpath="//android.widget.ImageView[@content-desc=\""+testDataMobile.getFilterOnPsychologistPageText()+"\"]";
        return  MobileFinder.getByXpath(xpath,false);
    }
    public static boolean FilterOnPsychologistPageIsDisplayed(){
        return getFilterOnPsychologistPage().isDisplayed();
    }
    public static void InputOnSearchField(){
        getSearchFieldOnPsychologistPage().sendKeys("ب",Keys.TAB);

    }
    public static WebElement PsychologistNameOnPsychologistPage() {

      //  String xpath="//android.view.View[contains(@content-desc="kk")]";
       String xpath="//android.view.View[@content-desc=\""+testDataMobile.getPsychologistNameText()+"\")]";
       // String xpath="//android.view.View[contains(@text,'بدور الراضي')]";


        return  MobileFinder.getByXpath(xpath,false);
    }
    public static boolean PsychologistNameOnPsychologistPageIsDisplayed(){
        return PsychologistNameOnPsychologistPage().isDisplayed();
    }
   public static void ClickOnPsychologist(){
    PsychologistNameOnPsychologistPage().click();}
    public static WebElement getSpecialistNameOnDetailsPsychologistPage() {
        String xpath="//android.view.View[@content-desc=\""+testDataMobile.getSpecialistNameOnDetailsPsychologistPage()+"\"]";
        return  MobileFinder.getByXpath(xpath,false);
    }
    public static boolean SpecialistNameOnDetailsPsychologistPageIsDisplayed(){
        return getSpecialistNameOnDetailsPsychologistPage().isDisplayed();
    }
    public static WebElement getSpecialisOfTypeOnDetailsPsychologistPage() {
        String xpath="//android.view.View[@content-desc=\""+testDataMobile.getSpecialisOfTypeOnDetailsPsychologistPage()+"\"]";
        return  MobileFinder.getByXpath(xpath,false);
    }
    public static boolean SpecialisOfTypeOnDetailsPsychologistPageIsDisplayed(){
        return getSpecialisOfTypeOnDetailsPsychologistPage().isDisplayed();
    }
    public static WebElement getSpecialistRateOnDetailsPsychologistPage() {
        String xpath="//android.view.View[@content-desc=\""+testDataMobile.getSpecialistRateOnDetailsPsychologistPage()+"\"]";
        return  MobileFinder.getByXpath(xpath,false);
    }
    public static boolean SpecialistRateOnDetailsPsychologistPageIsDisplayed(){
        return getSpecialistRateOnDetailsPsychologistPage().isDisplayed();
    }
    public static WebElement getExperienceOfYearsOnDetailsPsychologistPage() {

        String xpath="//android.view.View[@content-desc=\""+testDataMobile.getExperienceOfYearsOnDetailsPsychologistPage()+"\"]";
        return  MobileFinder.getByXpath(xpath,false);
    }
    public static boolean ExperienceOfYearsOnDetailsPsychologistPageIsDisplayed(){
        return getSpecialistRateOnDetailsPsychologistPage().isDisplayed();
    }
    public static WebElement getDateOfJoinOnDetailsPsychologistPage() {

        String xpath="//android.view.View[@content-desc=\""+testDataMobile.getDateOfJoinOnDetailsPsychologistPage()+"\"]";
        return  MobileFinder.getByXpath(xpath,false);
    }
    public static boolean DateOfJoinOnDetailsPsychologistPageIsDisplayed(){
        return getDateOfJoinOnDetailsPsychologistPage().isDisplayed();
    }
    public static WebElement getBriefAboutMeOnDetailsPsychologistPage() {

        String xpath="//android.view.View[@content-desc=\""+testDataMobile.getBriefAboutMeOnDetailsPsychologistPage()+"\"]";
        return  MobileFinder.getByXpath(xpath,false);
    }
    public static boolean BriefAboutMeOnDetailsPsychologistPageIsDisplayed(){
        return getBriefAboutMeOnDetailsPsychologistPage().isDisplayed();
    }
    public static WebElement getSessionsPresentationWrittenOnDetailsPsychologistPage() {
        String xpath="//android.view.View[@content-desc=\""+testDataMobile.getSessionsPresentationWrittenOnDetailsPsychologistPage()+"\"]";
        return  MobileFinder.getByXpath(xpath,false);
    }
    public static boolean SessionsPresentationWrittenOnDetailsPsychologistPageIsDisplayed(){
        return getSessionsPresentationWrittenOnDetailsPsychologistPage().isDisplayed();
    }
    public static WebElement getSessionsPresentationAudioOnDetailsPsychologistPage() {
        String xpath="//android.view.View[@content-desc=\""+testDataMobile.getSessionsPresentationAudioOnDetailsPsychologistPage()+"\"]";
        return  MobileFinder.getByXpath(xpath,false);
    }
    public static boolean SessionsPresentationAudioOnDetailsPsychologistPageIsDisplayed(){
        return getSessionsPresentationWrittenOnDetailsPsychologistPage().isDisplayed();
    }
    public static WebElement getSessionsPresentationVideoOnDetailsPsychologistPage() {
        String xpath="//android.view.View[@content-desc=\""+testDataMobile.getSessionsPresentationVideoOnDetailsPsychologistPage()+"\"]";
        return  MobileFinder.getByXpath(xpath,false);
    }
    public static boolean SessionsPresentationVideoOnDetailsPsychologistPageIsDisplayed(){
        return getSessionsPresentationWrittenOnDetailsPsychologistPage().isDisplayed();
    }
 public static WebElement getSubSpecialtiesOnDetailsPsychologistPage() {
        String xpath="//android.view.View[@content-desc=\""+testDataMobile.getSubSpecialtiesOnDetailsPsychologistPage()+"\"]";
        return  MobileFinder.getByXpath(xpath,false);
    }
    public static boolean SubSpecialtiesOnDetailsPsychologistPageIsDisplayed(){
        return getSubSpecialtiesOnDetailsPsychologistPage().isDisplayed();
    }










}
