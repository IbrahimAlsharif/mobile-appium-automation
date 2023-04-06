package Mobile.Tests.MyConversations;

import Base.SetupTest;
import Base.Utilities;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static Base.SetupTest.testDataMobile;

public class MyConversationsPOM {
    public static WebElement getTitleAppBarOnMyConversationsPage() {
        String xpath="//android.view.View[@content-desc=\""+testDataMobile.getTitleAppBarOnMyConversationsPage()+"\"]";
        return  Utilities.getByXpath(xpath,false);
    }
    public static boolean TitleAppBarOnMyConversationsDisplayed(){
        return getTitleAppBarOnMyConversationsPage().isDisplayed();
    }
    public static WebElement getSearchFieldOnMyConversationsPage() {
        String xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText";
        return  Utilities.getByXpath(xpath,false);
    }
    public static boolean SearchFieldOnMyConversationsDisplayed(){
        return getSearchFieldOnMyConversationsPage().isDisplayed();
    }
    public static WebElement getFilterIconFieldOnMyConversationsPage() {
        String xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.ImageView[1]";
        return  Utilities.getByXpath(xpath,false);
    }
    public static boolean FilterIconOnMyConversationsDisplayed(){
        return getFilterIconFieldOnMyConversationsPage().isDisplayed();
    }
    public static WebElement getChatIconFieldOnMyConversationsPage() {
        String xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.ImageView[2]";
        return  Utilities.getByXpath(xpath,false);
    }
    public static boolean ChatIconOnMyConversationsDisplayed(){
        return getFilterIconFieldOnMyConversationsPage().isDisplayed();
    }
    public static WebElement getEmptyChatTitleOnMyConversationsPage() {
        String xpath="//android.view.View[@content-desc=\""+testDataMobile.getEmptyChatTitleOnMyConversationsPage()+"\"]";
        return  Utilities.getByXpath(xpath,false);
    }
    public static boolean EmptyChatTitleOnMyConversationsDisplayed(){
        return getEmptyChatTitleOnMyConversationsPage().isDisplayed();
    }
    public static WebElement getEmptyChatSubTitleOnMyConversationsPage() {
        String xpath="//android.view.View[@content-desc=\""+testDataMobile.getEmptyChatSubTitleOnMyConversationsPage()+"\"]";
        return  Utilities.getByXpath(xpath,false);
    }
    public static boolean EmptyChatSubTitleOnMyConversationsDisplayed(){
        return getEmptyChatSubTitleOnMyConversationsPage().isDisplayed();
    }
    public static WebElement getSpecialistsBrowseButtonOnMyConversationsPage() {
        String xpath="//android.widget.Button[@content-desc=\""+testDataMobile.getSpecialistsBrowseButtonOnMyConversationsPage()+"\"]";
        return  Utilities.getByXpath(xpath,false);
    }
    public static boolean SpecialistsBrowseButtonOnMyConversationsDisplayed(){
        return getSpecialistsBrowseButtonOnMyConversationsPage().isDisplayed();
    }
}
