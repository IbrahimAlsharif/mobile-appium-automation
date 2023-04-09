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
      //  for (int i = 0; i < testDataMobile.getPsychologistNameText().length(); i++) {
            getSearchFieldOnPsychologistPage().sendKeys(testDataMobile.getPsychologistNameText(),Keys.TAB);

       // }
       // getSearchFieldOnPsychologistPage().sendKeys(testDataMobile.getPsychologistNameText());
    }
    public static WebElement PsychologistNameOnPsychologistPage() {
        String xpath="//android.view.View[@content-desc=\""+testDataMobile.getPsychologistNameText()+"\"]";
        return  MobileFinder.getByXpath(xpath,false);
    }
    public static boolean PsychologistNameOnPsychologistPageIsDisplayed(){
        return PsychologistNameOnPsychologistPage().isDisplayed();
    }










}
