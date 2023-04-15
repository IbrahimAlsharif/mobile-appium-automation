package Mobile.Tests.MyConversations;

import Base.MobileSetup.MobileFinder;
import io.appium.java_client.MobileElement;

import static Base.MobileSetup.MobileSetupTest.clientMobileFinder;
import  static Base.MobileSetup.MobileSetupTest.testDataMobile;

public class MyConversations {
    public static MobileElement getTitleAppBarOnMyConversationsPage() {
        String xpath="//android.view.View[@content-desc=\""+testDataMobile.getTitleAppBarOnMyConversationsPage()+"\"]";
        return  clientMobileFinder.getByXpath(xpath,false);
    }
    public static boolean TitleAppBarOnMyConversationsDisplayed(){
        return getTitleAppBarOnMyConversationsPage().isDisplayed();
    }
    public static MobileElement getSearchFieldOnMyConversationsPage() {
        String xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText";
        return  clientMobileFinder.getByXpath(xpath,false);
    }
    public static boolean SearchFieldOnMyConversationsDisplayed(){
        return getSearchFieldOnMyConversationsPage().isDisplayed();
    }
    public static MobileElement getFilterIconFieldOnMyConversationsPage() {
        String xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.ImageView[1]";
        return  clientMobileFinder.getByXpath(xpath,false);
    }
    public static boolean FilterIconOnMyConversationsDisplayed(){
        return getFilterIconFieldOnMyConversationsPage().isDisplayed();
    }
    public static MobileElement getChatIconFieldOnMyConversationsPage() {
        String xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.ImageView[2]";
        return  clientMobileFinder.getByXpath(xpath,false);
    }
    public static boolean ChatIconOnMyConversationsDisplayed(){
        return getFilterIconFieldOnMyConversationsPage().isDisplayed();
    }
    public static MobileElement getEmptyChatTitleOnMyConversationsPage() {
        String xpath="//android.view.View[@content-desc=\""+testDataMobile.getEmptyChatTitleOnMyConversationsPage()+"\"]";
        return  clientMobileFinder.getByXpath(xpath,false);
    }
    public static boolean EmptyChatTitleOnMyConversationsDisplayed(){
        return getEmptyChatTitleOnMyConversationsPage().isDisplayed();
    }
    public static MobileElement getEmptyChatSubTitleOnMyConversationsPage() {
        String xpath="//android.view.View[@content-desc=\""+testDataMobile.getEmptyChatSubTitleOnMyConversationsPage()+"\"]";
        return  clientMobileFinder.getByXpath(xpath,false);
    }
    public static boolean EmptyChatSubTitleOnMyConversationsDisplayed(){
        return getEmptyChatSubTitleOnMyConversationsPage().isDisplayed();
    }
    public static MobileElement getSpecialistsBrowseButtonOnMyConversationsPage() {
        String xpath="//android.widget.Button[@content-desc=\""+testDataMobile.getSpecialistsBrowseButtonOnMyConversationsPage()+"\"]";
        return  clientMobileFinder.getByXpath(xpath,false);
    }
    public static boolean SpecialistsBrowseButtonOnMyConversationsDisplayed(){
        return getSpecialistsBrowseButtonOnMyConversationsPage().isDisplayed();
    }
}
