package Mobile.Tests.SupportGroup;

import Base.MobileSetup.MobileFinder;
import io.appium.java_client.MobileElement;
import  static Base.MobileSetup.MobileSetupTest.testDataMobile;

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

    public static MobileElement getUpcomingMeeting() {
        String xpath="//android.view.View[@content-desc=\""+testDataMobile.getUpcomingMeetingText()+"\"]";
        return  MobileFinder.getByXpath(xpath,true);
    }
    public static boolean UpcomingMeetingOnSupportGroupsTestPageIsDisplayed(){
        return getUpcomingMeeting().isDisplayed();
    }
    public static void ClickOnUpcomingMeeting(){
        getUpcomingMeeting().click();
    }
    public static MobileElement getDetailsMeetingText() {
        String xpath="//android.view.View[@content-desc=\""+testDataMobile.getDetailsMeetingText()+"\"]";
        return  MobileFinder.getByXpath(xpath,true);
    }
    public static boolean DetailsUpcomingMeetingOnDetailsMeetingTestPageIsDisplayed(){
        return getDetailsMeetingText().isDisplayed();
    }

    public static MobileElement getTitleUpcomingMeetingOnDetailsMeetingTestPage() {
        String xpath="//android.view.View[@content-desc=\""+testDataMobile.getTitleUpcomingMeetingOnDetailsMeetingTestPage()+"\"]";
        return  MobileFinder.getByXpath(xpath,false);
    }
    public static boolean TitleUpcomingMeetingOnDetailsMeetingTestPageIsDisplayed(){
        return getTitleUpcomingMeetingOnDetailsMeetingTestPage().isDisplayed();
    }

    public static MobileElement getPriceMeetingOnDetailsMeetingTestPage() {
        String xpath="//android.view.View[@content-desc=\""+testDataMobile.getPriceMeetingOnDetailsMeetingTestPage()+"\"]";
        return  MobileFinder.getByXpath(xpath,false);
    }
    public static boolean PriceMeetingOnDetailsMeetingTestPageIsDisplayed(){
        return getPriceMeetingOnDetailsMeetingTestPage().isDisplayed();
    }
    public static MobileElement getTimeMeetingOnDetailsMeetingTestPage() {
        String xpath="//android.view.View[@content-desc=\""+testDataMobile.getPriceMeetingOnDetailsMeetingTestPage()+"\"]";
        return  MobileFinder.getByXpath(xpath,false);
    }
    public static boolean TimeMeetingOnDetailsMeetingTestPageIsDisplayed(){
        return getTimeMeetingOnDetailsMeetingTestPage().isDisplayed();
    }
    public static MobileElement getRemainingSeatsOnDetailsMeetingTestPage() {
        String xpath="//android.view.View[@content-desc=\""+testDataMobile.getRemainingSeatsOnDetailsMeetingTestPage()+"\"]";
        return  MobileFinder.getByXpath(xpath,false);
    }
    public static boolean RemainingSeatsOnDetailsMeetingTestPageIsDisplayed(){
        return getRemainingSeatsOnDetailsMeetingTestPage().isDisplayed();
    }
    public static MobileElement getTargetGroupTextOnDetailsMeetingTestPage() {
        String xpath="//android.view.View[@content-desc=\""+testDataMobile.getTargetGroupTextOnDetailsMeetingTestPage()+"\"]";
        return  MobileFinder.getByXpath(xpath,false);
    }
    public static boolean TargetGroupTextOnDetailsMeetingTestPageIsDisplayed(){
        return getTargetGroupTextOnDetailsMeetingTestPage().isDisplayed();
    }


}
