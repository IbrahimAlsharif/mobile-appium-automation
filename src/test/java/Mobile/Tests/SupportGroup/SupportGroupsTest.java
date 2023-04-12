package Mobile.Tests.SupportGroup;

import Base.MobileSetup.MobileFinder;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.testng.Assert;
import org.testng.annotations.Test;

import static Base.MobileSetup.MobileSetupTest.androidDriver;
import static Base.MobileSetup.MobileSetupTest.testDataMobile;

public class SupportGroupsTest {
    private String testCaseId;
    @Test(priority =1)
    public void verifyThatTapDiagnosticButtonNavigateToDiagnosticPage()  {
        TouchAction touchAction=new TouchAction((PerformsTouchActions) androidDriver);
        touchAction.tap(PointOption.point(563, 1931)).release().perform();
        Assert.assertTrue(SupportGroups.screenTitleIsDisplayed());

    }
    @Test(priority = 2)
    public void TitleAppBarIsDisplayed(){
        testCaseId="0";
        Assert.assertTrue(SupportGroups.screenTitleIsDisplayed());
    }
    @Test(priority = 3)
    public void AllGroupsTextIsDisplayed(){
        testCaseId="0";
        Assert.assertTrue(SupportGroups.AllGroupsTextOnSupportGroupsTestPageIsDisplayed());
    }
    @Test(priority = 4)
    public void MyGroupsTextIsDisplayed(){
        testCaseId="0";
        Assert.assertTrue(SupportGroups.MyGroupsTextOnSupportGroupsTestPageIsDisplayed());
    }
  @Test(priority = 5)
    public void UpcomingMeetingsTextIsDisplayed(){
        testCaseId="0";
        Assert.assertTrue(SupportGroups.UpcomingMeetingsTextOnSupportGroupsTestPageIsDisplayed());
    }
    @Test(priority = 6,enabled = false)
    public void EndingMeetingsTextIsDisplayed(){
        testCaseId="0";
        MobileFinder.scrollUntilText(testDataMobile.getEndingMeetingsTextOnSupportGroupsTestPage());
        Assert.assertTrue(SupportGroups.EndingMeetingsTextOnSupportGroupsTestPageIsDisplayed());
    }
    @Test(priority = 7)
    public void UpcomingMeetingIsDisplayed(){
        testCaseId="0";
        MobileFinder.scrollUntilText(testDataMobile.getUpcomingMeetingText());
        Assert.assertTrue(SupportGroups.UpcomingMeetingIsDisplayed());
    }

}
