package Mobile.Tests.AllSpecialists;


import Base.MobileSetup.MobileFinder;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import  static Base.MobileSetup.MobileSetupTest.testDataMobile;




public class Psychologist {


    public static WebElement getSceeenTitle() {
        String xpath="//android.view.View[@content-desc=\""+testDataMobile.getTitleAppBarOnPsychologistPage()+"\"]";
        return  MobileFinder.getByXpath(xpath,false);
    }
    public static boolean ScreenTitleIsDisplayed(){
        return getSceeenTitle().isDisplayed();
    }
    public static WebElement getSearchField() {
        String xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.widget.EditText";
        return  MobileFinder.getByXpath(xpath,true);
    }
    public static boolean SearchFieldIsDisplayed(){
        return getSearchField().isDisplayed();
    }
    public static WebElement getFilter() {
        String xpath="//android.widget.ImageView[@content-desc=\""+testDataMobile.getFilterOnPsychologistPageText()+"\"]";
        return  MobileFinder.getByXpath(xpath,false);
    }

    public static boolean FilterIsDisplayed(){
        return getFilter().isDisplayed();
    }
    public static void InputOnSearchField(){
        getSearchField().sendKeys("ب",Keys.TAB);

    }
    public static WebElement PsychologistName() {
        String xpath="//android.view.View[@content-desc=\""+testDataMobile.getPsychologistNameText()+"\")]";
        return  MobileFinder.getByXpath(xpath,false);
    }
    public static boolean PsychologistNameIsDisplayed(){
        return PsychologistName().isDisplayed();
    }
   public static void ClickOnPsychologist(){
    PsychologistName().click();}
    public static WebElement getSpecialistName() {
        String xpath="//android.view.View[@content-desc=\""+testDataMobile.getSpecialistNameOnDetailsPsychologistPage()+"\"]";
        return  MobileFinder.getByXpath(xpath,false);
    }
    public static boolean SpecialistNameIsDisplayed(){
        return getSpecialistName().isDisplayed();
    }
    public static WebElement getSpecialisOfType() {
        String xpath="//android.view.View[@content-desc=\""+testDataMobile.getSpecialisOfTypeOnDetailsPsychologistPage()+"\"]";
        return  MobileFinder.getByXpath(xpath,false);
    }
    public static boolean SpecialisOfTypeIsDisplayed(){
        return getSpecialisOfType().isDisplayed();
    }
    public static WebElement getSpecialistRate() {
        String xpath="//android.view.View[@content-desc=\""+testDataMobile.getSpecialistRateOnDetailsPsychologistPage()+"\"]";
        return  MobileFinder.getByXpath(xpath,false);
    }
    public static boolean SpecialistRateIsDisplayed(){
        return getSpecialistRate().isDisplayed();
    }
    public static WebElement getExperienceOfYears() {

        String xpath="//android.view.View[@content-desc=\""+testDataMobile.getExperienceOfYearsOnDetailsPsychologistPage()+"\"]";
        return  MobileFinder.getByXpath(xpath,false);
    }
    public static boolean ExperienceOfYearsIsDisplayed(){
        return getSpecialistRate().isDisplayed();
    }
    public static WebElement getDateOfJoin() {

        String xpath="//android.view.View[@content-desc=\""+testDataMobile.getDateOfJoinOnDetailsPsychologistPage()+"\"]";
        return  MobileFinder.getByXpath(xpath,false);
    }
    public static boolean DateOfJoinIsDisplayed(){
        return getDateOfJoin().isDisplayed();
    }
    public static WebElement getBriefAboutMeTitle() {

        String xpath="//android.view.View[@content-desc=\""+testDataMobile.getBriefAboutMeOnDetailsPsychologistPage()+"\"]";
        return  MobileFinder.getByXpath(xpath,false);
    }
    public static boolean BriefAboutMeTitleIsDisplayed(){
        return getBriefAboutMeTitle().isDisplayed();
    }
    public static WebElement getSessionsPresentationWritten() {
        String xpath="//android.view.View[@content-desc=\""+testDataMobile.getSessionsPresentationWrittenOnDetailsPsychologistPage()+"\"]";
        return  MobileFinder.getByXpath(xpath,false);
    }
    public static boolean SessionsPresentationWrittenIsDisplayed(){
        return getSessionsPresentationWritten().isDisplayed();
    }
    public static WebElement getSessionsPresentationAudio() {
        String xpath="//android.view.View[@content-desc=\""+testDataMobile.getSessionsPresentationAudioOnDetailsPsychologistPage()+"\"]";
        return  MobileFinder.getByXpath(xpath,false);
    }
    public static boolean SessionsPresentationAudioIsDisplayed(){
        return getSessionsPresentationWritten().isDisplayed();
    }
    public static WebElement getSessionsPresentationVideo() {
        String xpath="//android.view.View[@content-desc=\""+testDataMobile.getSessionsPresentationVideoOnDetailsPsychologistPage()+"\"]";
        return  MobileFinder.getByXpath(xpath,false);
    }
    public static boolean SessionsPresentationVideoIsDisplayed(){
        return getSessionsPresentationWritten().isDisplayed();
    }
 public static WebElement getSubSpecialties() {
        String xpath="//android.view.View[@content-desc=\""+testDataMobile.getSubSpecialtiesOnDetailsPsychologistPage()+"\"]";
        return  MobileFinder.getByXpath(xpath,false);
    }
    public static boolean SubSpecialtiesIsDisplayed(){
        return getSubSpecialties().isDisplayed();
    }
    public static WebElement getSubSpecialtiesTitle() {
        String xpath="//android.view.View[@content-desc=\""+testDataMobile.getSubSpecialtiesTitleOnDetailsPsychologistPage()+"\"]";
        return  MobileFinder.getByXpath(xpath,false);
    }
    public static boolean SubSpecialtiesTitleIsDisplayed(){
        return getSubSpecialtiesTitle().isDisplayed();
    }
    public static WebElement getLanguageTitle() {
        String xpath="//android.view.View[@content-desc=\""+testDataMobile.getLanguageTitleOnDetailsPsychologistPage()+"\"]";
        return  MobileFinder.getByXpath(xpath,false);
    }
    public static boolean LanguageTitleLanguageIsDisplayed(){
        return getLanguageTitle().isDisplayed();
    }
    public static WebElement getSpecialistLanguage() {
        String xpath="//android.view.View[@content-desc=\""+testDataMobile.getSpecialistLanguageOnDetailsPsychologistPage()+"\"]";
        return  MobileFinder.getByXpath(xpath,false);
    }
    public static boolean SpecialistLanguageIsDisplayed(){
        return getSpecialistLanguage().isDisplayed();
    }
    public static WebElement getSpecialistRatesTitle() {
        String xpath="//android.view.View[@content-desc=\""+testDataMobile.getSpecialistRatesTitleOnDetailsPsychologistPage()+"\"]";
        return  MobileFinder.getByXpath(xpath,false);
    }
    public static boolean SpecialistRatesTitleIsDisplayed(){
        return getSpecialistRatesTitle().isDisplayed();
    }
    public static WebElement getUserByCommentText() {
        String xpath="//android.view.ImageView[@content-desc=\""+testDataMobile.getUserByCommentTextOnDetailsPsychologistPage()+"\"]";
        return  MobileFinder.getByXpath(xpath,false);
    }
    public static boolean UserByCommentTextIsDisplayed(){
        return getUserByCommentText().isDisplayed();
    }

    public static WebElement getBookLaterDateButton() {
        String xpath="//android.view.Button[@content-desc=\""+testDataMobile.getBookLaterDateButtonOnDetailsPsychologistPage()+"\"]";
        return  MobileFinder.getByXpath(xpath,false);
    }
    public static boolean BookLaterDateButtonIsDisplayed(){
        return getBookLaterDateButton().isDisplayed();
    }
    public static void ClickOnBookLaterDateButton(){
        getBookLaterDateButton().click();}










}
