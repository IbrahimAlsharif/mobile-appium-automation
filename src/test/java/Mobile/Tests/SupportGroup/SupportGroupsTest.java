package Mobile.Tests.SupportGroup;

import Base.SetupTest;
import Base.Utilities;
import Mobile.Tests.MorePage.MorePagePOM;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import static Base.SetupTest.testDataMobile;

public class SupportGroupsTest {
    private String testCaseId;
    @Test(priority =1)
    public void verifyThatTapDiagnosticButtonNavigateToDiagnosticPage()  {
        TouchAction touchAction=new TouchAction((PerformsTouchActions) SetupTest.driver);
        touchAction.tap(PointOption.point(563, 1931)).release().perform();
    }
    @Test(priority = 2)
    public void TitleAppBarOnBenchmarksPageDisplayed(){
        testCaseId="0";
        Assert.assertTrue(SupportGroupsPOM.TitleAppBarOnBenchmarksPageDisplayed());
    }
    @Test(priority = 2)
    public void AllGroupsTextOnSupportGroupsTestPageIsDisplayed(){
        testCaseId="0";
        Assert.assertTrue(SupportGroupsPOM.AllGroupsTextOnSupportGroupsTestPageIsDisplayed());
    }
    @Test(priority = 2)
    public void MyGroupsTextOnSupportGroupsTestPageIsDisplayed(){
        testCaseId="0";
        Assert.assertTrue(SupportGroupsPOM.MyGroupsTextOnSupportGroupsTestPageIsDisplayed());
    }
  @Test(priority = 2)
    public void UpcomingMeetingsTextOnSupportGroupsTestPageIsDisplayed(){
        testCaseId="0";
        Assert.assertTrue(SupportGroupsPOM.UpcomingMeetingsTextOnSupportGroupsTestPageIsDisplayed());
    }
    @Test(priority = 2)
    public void EndingMeetingsTextOnSupportGroupsTestPageIsDisplayed(){
        testCaseId="0";
        Assert.assertTrue(SupportGroupsPOM.EndingMeetingsTextOnSupportGroupsTestPageIsDisplayed());
    }


}
