package Mobile.Tests.SupportGroup;

import Base.MobileSetup.MobileFinder;
import io.appium.java_client.MobileElement;

import static Base.MobileSetup.MobileSetupTest.clientMobileFinder;
import  static Base.MobileSetup.MobileSetupTest.testDataMobile;

public class SupportGroups {

    public static MobileElement getScreenTitle() {
        String xpath="//android.view.View[@content-desc=\""+testDataMobile.getTitleAppBarOnSupportGroupsTestPage()+"\"]";
        return  clientMobileFinder.getByXpath(xpath,true);
    }
    public static boolean screenTitleIsDisplayed(){
        return getScreenTitle().isDisplayed();
    }
    public static MobileElement getAllGroupsTextOnSupportGroupsTestPage() {
        String xpath="//android.view.View[@content-desc=\""+testDataMobile.getTitleAppBarOnSupportGroupsTestPage()+"\"]";
        return  clientMobileFinder.getByXpath(xpath,true);
    }
    public static boolean AllGroupsTextOnSupportGroupsTestPageIsDisplayed(){
        return getAllGroupsTextOnSupportGroupsTestPage().isDisplayed();
    }
    public static MobileElement getMyGroupsTextOnSupportGroupsTestPage() {
        String xpath="//android.view.View[@content-desc=\""+testDataMobile.getMyGroupsTextOnSupportGroupsTestPage()+"\"]";
        return  clientMobileFinder.getByXpath(xpath,false);
    }
    public static boolean MyGroupsTextOnSupportGroupsTestPageIsDisplayed(){
        return getMyGroupsTextOnSupportGroupsTestPage().isDisplayed();
    }
    public static MobileElement getUpcomingMeetingsTextOnSupportGroupsTestPage() {
        String xpath="//android.view.View[@content-desc=\""+testDataMobile.getUpcomingMeetingsTextOnSupportGroupsTestPage()+"\"]";
        return  clientMobileFinder.getByXpath(xpath,false);
    }
    public static boolean UpcomingMeetingsTextOnSupportGroupsTestPageIsDisplayed(){
        return getUpcomingMeetingsTextOnSupportGroupsTestPage().isDisplayed();
    }
    public static MobileElement getEndingMeetingsTextOnSupportGroupsTestPage() {
        String xpath="//android.view.View[@content-desc=\""+testDataMobile.getEndingMeetingsTextOnSupportGroupsTestPage()+"\"]";
        return  clientMobileFinder.getByXpath(xpath,false);
    }
    public static boolean EndingMeetingsTextOnSupportGroupsTestPageIsDisplayed(){
        return getEndingMeetingsTextOnSupportGroupsTestPage().isDisplayed();
    }

    public static MobileElement getUpcomingMeeting() {
        String xpath="//android.view.View[@content-desc=\""+testDataMobile.getUpcomingMeetingText()+"\"]";
        return  clientMobileFinder.getByXpath(xpath,true);
    }
    public static boolean UpcomingMeetingIsDisplayed(){
        return getUpcomingMeeting().isDisplayed();
    }
    public static void ClickOnUpcomingMeeting(){
        getUpcomingMeeting().click();
    }




}
