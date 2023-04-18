package Mobile.Tests.MyConversations;

import Base.MobileSetup.MobileFinder;
import TestRail.APIException;
import Base.MobileSetup.MobileSetupTest;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import static org.testng.Assert.*;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.io.IOException;

import static Base.MobileSetup.MobileSetupTest.clientAndroidDriver;


public class MyConversationsTest {
    private String testCaseId;
    private static MobileFinder mobileFinder = new MobileFinder(MobileSetupTest.clientAndroidDriver);

    @Test(priority =1)
    public void verifyThatTapMyConversationsButtonNavigateToMyConversationsPage() throws InterruptedException {
        testCaseId="4233";
        String accessibility = "محادثاتي\n" +
                "علامة التبويب 2 من 5";
        mobileFinder.getByAccessibilityId(accessibility,false);
        Thread.sleep(9000);
        assertTrue(MyConversations.TitleAppBarOnMyConversationsDisplayed());

    }
    @Test(priority = 2)
    public void PageTitleDisplayed(){
        testCaseId="10325";
        assertTrue(MyConversations.TitleAppBarOnMyConversationsDisplayed());
    }
    @Test(priority = 2)
    public void SearchFieldDisplayed(){
        testCaseId="4234";
        assertTrue(MyConversations.SearchFieldOnMyConversationsDisplayed());
    }
    @Test(priority = 2)
    public void FilterIconIsDisplayed(){
        testCaseId="10324";
        assertTrue(MyConversations.FilterIconOnMyConversationsDisplayed());
    }
    @Test(priority = 2)
    public void ChatIconIsDisplayed(){
        testCaseId  ="10326";
        assertTrue(MyConversations.ChatIconOnMyConversationsDisplayed());
    }
    @Test(priority = 2)
    public void VerifyTheExistancOfPrimaryText(){
        testCaseId  ="10327";
        assertTrue(MyConversations.EmptyChatTitleOnMyConversationsDisplayed());
    }
   @Test(priority = 2)
    public void VerifyTheExistanceOfsecondaryText(){
       testCaseId  ="10328";
        assertTrue(MyConversations.EmptyChatSubTitleOnMyConversationsDisplayed());
    }
    @Test(priority = 2)
    public void SpecialistsBrowseButtonDisplayed(){
        testCaseId  ="10329";
        assertTrue(MyConversations.SpecialistsBrowseButtonOnMyConversationsDisplayed());
    }
    @AfterMethod
    public void reportResult(ITestResult result) throws APIException, IOException {
        MobileFinder.afterMethod(result,testCaseId);
        System.out.println("After method" + result.getMethod().getMethodName());
    }


}
