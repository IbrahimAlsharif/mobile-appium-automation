package Mobile.Tests.SupportGroup;

import Base.MobileFinder;
import io.appium.java_client.MobileElement;

import static Base.WebSetupTest.testDataMobile;

public class SupportGroups {

    public static MobileElement getTitleAppBarOnSupportGroupsTestPage() {
        String xpath="//android.view.View[@content-desc=\""+testDataMobile.getTitleAppBarOnSupportGroupsTestPage()+"\"]";
        return  MobileFinder.getByXpath(xpath,true);
    }
    public static boolean TitleAppBarOnBenchmarksPageDisplayed(){
        return getTitleAppBarOnSupportGroupsTestPage().isDisplayed();
    }
    public static MobileElement getAllGroupsTextOnSupportGroupsTestPage() {
        String xpath="//android.view.View[@content-desc=\""+testDataMobile.getTitleAppBarOnSupportGroupsTestPage()+"\"]";
        return  MobileFinder.getByXpath(xpath,true);
    }
    public static boolean AllGroupsTextOnSupportGroupsTestPageIsDisplayed(){
        return getAllGroupsTextOnSupportGroupsTestPage().isDisplayed();
    }
    public static MobileElement getMyGroupsTextOnSupportGroupsTestPage() {
        String xpath="//android.view.View[@content-desc=\""+testDataMobile.getMyGroupsTextOnSupportGroupsTestPage()+"\"]";
        return  MobileFinder.getByXpath(xpath,false);
    }
    public static boolean MyGroupsTextOnSupportGroupsTestPageIsDisplayed(){
        return getMyGroupsTextOnSupportGroupsTestPage().isDisplayed();
    }
    public static MobileElement getUpcomingMeetingsTextOnSupportGroupsTestPage() {
        String xpath="//android.view.View[@content-desc=\""+testDataMobile.getUpcomingMeetingsTextOnSupportGroupsTestPage()+"\"]";
        return  MobileFinder.getByXpath(xpath,false);
    }
    public static boolean UpcomingMeetingsTextOnSupportGroupsTestPageIsDisplayed(){
        return getUpcomingMeetingsTextOnSupportGroupsTestPage().isDisplayed();
    }
    public static MobileElement getEndingMeetingsTextOnSupportGroupsTestPage() {
        String xpath="//android.view.View[@content-desc=\""+testDataMobile.getEndingMeetingsTextOnSupportGroupsTestPage()+"\"]";
        return  MobileFinder.getByXpath(xpath,false);
    }
    public static boolean EndingMeetingsTextOnSupportGroupsTestPageIsDisplayed(){
        return getEndingMeetingsTextOnSupportGroupsTestPage().isDisplayed();
    }



}
