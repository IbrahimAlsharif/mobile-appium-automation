package Mobile.Tests.SupportGroup;

import Base.MobileSetup.MobileSetupTest;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SupportGroupsTest {
    private String testCaseId;
    @Test(priority =1)
    public void verifyThatTapDiagnosticButtonNavigateToDiagnosticPage()  {
        TouchAction touchAction=new TouchAction((PerformsTouchActions) MobileSetupTest.androidDriver);
        touchAction.tap(PointOption.point(563, 1931)).release().perform();
    }
    @Test(priority = 2)
    public void TitleAppBarOnBenchmarksPageDisplayed(){
        testCaseId="0";
        Assert.assertTrue(SupportGroups.TitleAppBarOnBenchmarksPageDisplayed());
    }
    @Test(priority = 2)
    public void AllGroupsTextOnSupportGroupsTestPageIsDisplayed(){
        testCaseId="0";
        Assert.assertTrue(SupportGroups.AllGroupsTextOnSupportGroupsTestPageIsDisplayed());
    }
    @Test(priority = 2)
    public void MyGroupsTextOnSupportGroupsTestPageIsDisplayed(){
        testCaseId="0";
        Assert.assertTrue(SupportGroups.MyGroupsTextOnSupportGroupsTestPageIsDisplayed());
    }
  @Test(priority = 2)
    public void UpcomingMeetingsTextOnSupportGroupsTestPageIsDisplayed(){
        testCaseId="0";
        Assert.assertTrue(SupportGroups.UpcomingMeetingsTextOnSupportGroupsTestPageIsDisplayed());
    }
    @Test(priority = 2)
    public void EndingMeetingsTextOnSupportGroupsTestPageIsDisplayed(){
        testCaseId="0";
        Assert.assertTrue(SupportGroups.EndingMeetingsTextOnSupportGroupsTestPageIsDisplayed());
    }


}
