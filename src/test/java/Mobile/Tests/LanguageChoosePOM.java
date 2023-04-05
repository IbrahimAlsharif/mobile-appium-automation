package Mobile.Tests;
import  static Base.SetupTest.testData;
import Base.Utilities;
import org.openqa.selenium.WebElement;


public class LanguageChoosePOM {
    public static WebElement getWelcomeLabel() {
        String xpath="//android.view.View[@content-desc=\"Welcome to your safe space\"]";
        return Utilities.getByXpath(xpath,false);

    }

    public static boolean welcomeTextIsDisplayed() {
        return getWelcomeLabel().isDisplayed();
    }

    public static String getWelcomeLabelText() {
        return getWelcomeLabel().getAttribute("content-desc");
    }

    public static WebElement getMainImage(){
        String xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.widget.ImageView[1]";
        return Utilities.getByXpath(xpath,false);

    }
    public static boolean mainImageIsDisplayed(){
        return getMainImage().isDisplayed();
    }

    public static WebElement getWelcomeDescription() {
        String xpath="//android.view.View[@content-desc=\"You can now choose your own service language to be more comfortable with the language that suits you best\"]";
        return Utilities.getByXpath(xpath,false);

    }
    public static boolean welcomeDescriptionIsDisplayed() {
        return getWelcomeDescription().isDisplayed();
    }

    public static WebElement getSelectArabicText() {
        String xpath="//android.widget.ImageView[@content-desc=\""+testData.getArabicLanguageText()+"\"]";
        return Utilities.getByXpath(xpath,false);

    }
    public static void ClickOnSelectArabicText(){
        getSelectArabicText().click();
    }
    public static WebElement getChooseButton() {
        String xpath="//android.widget.Button[@content-desc=\""+testData.getChooseButtonText()+"\"]";
        return Utilities.getByXpath(xpath,true);

    }
    public static void ClickOnChooseButton(){
        getChooseButton().click();
    }
    public static String getChooseButtonText() {
        return getChooseButton().getAttribute("content-desc");
    }
    public static WebElement getIgnoreButton() {
        String xpath="//android.widget.Button[@content-desc=\""+testData.getIgnoreButtonText()+"\"]";
        return Utilities.getByXpath(xpath,false);

    }
    public static void ClickOnIgnoreButton(){
        getIgnoreButton().click();
    }
    public static boolean IgnoreButtonIsDisplayed(){
        return getIgnoreButton().isDisplayed();
    }


}
