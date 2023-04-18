package Mobile.Tests.Language;
import static Base.MobileSetup.MobileSetupTest.clientMobileFinder;
import  static Base.MobileSetup.MobileSetupTest.testDataMobile;
import io.appium.java_client.MobileElement;


public class LanguageChoose {
    public static MobileElement getWelcomeLabel() {
        String xpath="//android.view.View[@content-desc=\"Welcome to your safe space\"]";
        return clientMobileFinder.getByXpath(xpath,false);
    }

    public static boolean welcomeTextIsDisplayed() {
        return getWelcomeLabel().isDisplayed();
    }

    public static String getWelcomeLabelText() {
        return getWelcomeLabel().getAttribute("content-desc");
    }

    public static MobileElement getMainImage(){
        String xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.widget.ImageView[1]";
        return clientMobileFinder.getByXpath(xpath,false);

    }
    public static boolean mainImageIsDisplayed(){
        return getMainImage().isDisplayed();
    }

    public static MobileElement getWelcomeDescription() {
        String xpath="//android.view.View[@content-desc=\"You can now choose your own service language to be more comfortable with the language that suits you best\"]";
        return clientMobileFinder.getByXpath(xpath,false);

    }
    public static boolean welcomeDescriptionIsDisplayed() {
        return getWelcomeDescription().isDisplayed();
    }

    public static MobileElement getSelectArabicText() {
        String xpath="//android.widget.ImageView[@content-desc=\""+testDataMobile.getArabicLanguageText()+"\"]";
        return clientMobileFinder.getByXpath(xpath,false);

    }
    public static void ClickOnSelectArabicText(){
        getSelectArabicText().click();
    }
    public static MobileElement getChooseButton() {
        String xpath="//android.widget.Button[@content-desc=\""+testDataMobile.getChooseButtonText()+"\"]";
        return clientMobileFinder.getByXpath(xpath,true);

    }
    public static void ClickOnChooseButton(){
        getChooseButton().click();
    }
    public static String getChooseButtonText() {
        return getChooseButton().getAttribute("content-desc");
    }
    public static MobileElement getIgnoreButton() {
        String xpath="//android.widget.Button[@content-desc=\""+testDataMobile.getIgnoreButtonText()+"\"]";
        return clientMobileFinder.getByXpath(xpath,false);

    }
    public static void ClickOnIgnoreButton(){
        getIgnoreButton().click();
    }
    public static boolean IgnoreButtonIsDisplayed(){
        return getIgnoreButton().isDisplayed();
    }


}
