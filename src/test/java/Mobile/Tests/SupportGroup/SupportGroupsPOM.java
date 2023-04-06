package Mobile.Tests.SupportGroup;

import Base.Utilities;
import org.openqa.selenium.WebElement;

import static Base.SetupTest.testDataMobile;

public class SupportGroupsPOM {

    public static WebElement getTitleAppBarOnSupportGroupsTestPage() {
        String xpath="//android.view.View[@content-desc=\""+testDataMobile.getTitleAppBarOnSupportGroupsTestPage()+"\"]";
        return  Utilities.getByXpath(xpath,true);
    }
    public static boolean TitleAppBarOnBenchmarksPageDisplayed(){
        return getTitleAppBarOnSupportGroupsTestPage().isDisplayed();
    }
    public static WebElement getAllGroupsTextOnSupportGroupsTestPage() {
        String xpath="//android.view.View[@content-desc=\""+testDataMobile.getAllGroupsTextOnSupportGroupsTestPage()+"\"]";
        return  Utilities.getByXpath(xpath,true);
    }
    public static boolean AllGroupsTextOnSupportGroupsTestPageIsDisplayed(){
        return getAllGroupsTextOnSupportGroupsTestPage().isDisplayed();
    }
    public static WebElement getMyGroupsTextOnSupportGroupsTestPage() {
        String xpath="//android.view.View[@content-desc=\""+testDataMobile.getMyGroupsTextOnSupportGroupsTestPage()+"\"]";
        return  Utilities.getByXpath(xpath,false);
    }
    public static boolean MyGroupsTextOnSupportGroupsTestPageIsDisplayed(){
        return getMyGroupsTextOnSupportGroupsTestPage().isDisplayed();
    }
    public static WebElement getUpcomingMeetingsTextOnSupportGroupsTestPage() {
        String xpath="//android.view.View[@content-desc=\""+testDataMobile.getUpcomingMeetingsTextOnSupportGroupsTestPage()+"\"]";
        return  Utilities.getByXpath(xpath,false);
    }
    public static boolean UpcomingMeetingsTextOnSupportGroupsTestPageIsDisplayed(){
        return getUpcomingMeetingsTextOnSupportGroupsTestPage().isDisplayed();
    }
    public static WebElement getEndingMeetingsTextOnSupportGroupsTestPage() {
        String xpath="//android.view.View[@content-desc=\""+testDataMobile.getEndingMeetingsTextOnSupportGroupsTestPage()+"\"]";
        return  Utilities.getByXpath(xpath,false);
    }
    public static boolean EndingMeetingsTextOnSupportGroupsTestPageIsDisplayed(){
        return getEndingMeetingsTextOnSupportGroupsTestPage().isDisplayed();
    }



}
