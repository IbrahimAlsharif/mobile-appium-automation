package Mobile.Tests.SupportGroup;

import Base.MobileSetup.MobileFinder;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.testng.Assert;
import org.testng.annotations.Test;

import static Base.MobileSetup.MobileSetupTest.androidDriver;
import static Base.MobileSetup.MobileSetupTest.testDataMobile;
import static org.testng.Assert.*;

public class SupportGroupsTest {
    private String testCaseId;
    @Test(priority =1)
    public void verifyThatTapDiagnosticButtonNavigateToDiagnosticPage()  {
        String accessibility = "مجموعات الدعم\n" +
                "علامة التبويب 3 من 5";
       MobileFinder.getByAccessibilityId(accessibility,false).click();
        Assert.assertTrue(SupportGroups.screenTitleIsDisplayed());
    }
    @Test(priority = 2)
    public void AllGroupsTextIsDisplayed(){
        testCaseId="0";
        assertTrue(SupportGroups.AllGroupsTextOnSupportGroupsTestPageIsDisplayed());
    }
    @Test(priority = 3)
    public void MyGroupsTextIsDisplayed(){
        testCaseId="0";
        assertTrue(SupportGroups.MyGroupsTextOnSupportGroupsTestPageIsDisplayed());
    }
  @Test(priority = 4)
    public void UpcomingMeetingsTextIsDisplayed(){
        testCaseId="0";
       assertTrue(SupportGroups.UpcomingMeetingsTextOnSupportGroupsTestPageIsDisplayed());
    }
    @Test(priority = 6,enabled = false)
    public void EndingMeetingsTextIsDisplayed(){
        testCaseId="0";
        MobileFinder.scrollUntilText(testDataMobile.getEndingMeetingsTextOnSupportGroupsTestPage());
        assertTrue(SupportGroups.EndingMeetingsTextOnSupportGroupsTestPageIsDisplayed());
    }
    @Test(priority = 7)
    public void UpcomingMeetingIsDisplayed(){
        testCaseId="0";
        MobileFinder.scrollUntilText(testDataMobile.getUpcomingMeetingText());
       assertTrue(SupportGroups.UpcomingMeetingIsDisplayed());
    }

}
