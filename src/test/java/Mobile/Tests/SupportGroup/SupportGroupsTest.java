package Mobile.Tests.SupportGroup;

import Base.MobileSetup.MobileFinder;
import TestRail.APIException;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.io.IOException;

import static Base.MobileSetup.MobileSetupTest.clientAndroidDriver;
import static Base.MobileSetup.MobileSetupTest.clientMobileFinder;
import static Base.MobileSetup.MobileSetupTest.testDataMobile;
import static org.testng.Assert.*;

public class SupportGroupsTest {
    private String testCaseId;
    @Test(priority =1)
    public void verifyThatTapSupportGroupsButtonNavigateToSupportGroupsPage()  {
        testCaseId="4426";
        String accessibility = "مجموعات الدعم\n" +
                "علامة التبويب 3 من 5";
        clientMobileFinder.getByAccessibilityId(accessibility,false).click();
       assertTrue(SupportGroups.screenTitleIsDisplayed());
    }
    @Test(priority = 2)

    public void VerifyTheExistanceOfAllGroupsText(){
        testCaseId="10331";
        assertTrue(SupportGroups.AllGroupsTextOnSupportGroupsTestPageIsDisplayed());
    }
    @Test(priority = 3)
    public void VerifyTheExistanceOfMyGroupsText(){
        testCaseId="10332";
        assertTrue(SupportGroups.MyGroupsTextOnSupportGroupsTestPageIsDisplayed());
    }
  @Test(priority = 4)
    public void UpcomingMeetingsTextIsDisplayed(){
        testCaseId="10333";
       assertTrue(SupportGroups.UpcomingMeetingsTextOnSupportGroupsTestPageIsDisplayed());
    }
    @Test(priority = 6,enabled = false)
    public void EndingMeetingsTextIsDisplayed(){
        testCaseId="0";
        MobileFinder.scrollUntilText(testDataMobile.getEndingMeetingsTextOnSupportGroupsTestPage());
        assertTrue(SupportGroups.EndingMeetingsTextOnSupportGroupsTestPageIsDisplayed());
    }
    @Test(priority = 7,enabled = false)
    public void UpcomingMeetingIsDisplayed(){
        testCaseId="0";
        MobileFinder.scrollUntilText(testDataMobile.getUpcomingMeetingText());
       assertTrue(SupportGroups.UpcomingMeetingIsDisplayed());
    }
    @AfterMethod
    public void screenShot(ITestResult result) throws APIException, IOException {
        MobileFinder.afterMethod(result,testCaseId);
        System.out.println("After method" + result.getMethod().getMethodName());
    }

}
