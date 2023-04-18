package Mobile.Tests.MorePage;

import Base.MobileSetup.MobileFinder;
import Base.MobileSetup.MobileSetupTest;
import TestRail.APIException;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import static org.testng.Assert.*;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.io.IOException;

import static Base.MobileSetup.MobileSetupTest.testDataMobile;

public class MorePageTest {
    private String testCaseId;
    @Test(priority =1)
    public void verifyThatTapMoreButtonNavigateToMorePage()  {
        testCaseId="10290";
        String accessibility = "المزيد\n" +
                "علامة التبويب 5 من 5";
       MobileFinder.getByAccessibilityId(accessibility,true).click();
        assertTrue(MorePage.SignInButtonIsDisplayed());
    }

    @Test(priority = 2)
    public void LanguageIconIsDisplayed(){
        testCaseId="10291";
        assertTrue(MorePage.LanguageIconIsDisplayed());
    }
    @Test(priority = 3)
    public void UserImageIsDisplayed(){
        testCaseId="10292";
        assertTrue(MorePage.UserImageIsDisplayed());
    }
    @Test(priority = 4)
    public void VerifyTheExistancOfPrimaryText(){
        testCaseId="5134";
        assertTrue(MorePage.TheUserDoesNotHaveSubscriptionTitleIsDisplayed());
    }
    @Test(priority = 5)
    public void VerifyTheExistanceOfsecondaryText(){
        testCaseId="5137";
        assertTrue(MorePage.SubscribeToSubscriptionsTextIsDisplayed());
    }
    @Test(priority = 6)
    public void VerifyTheNumbeOfSessionsCountCircleIs0(){
        testCaseId="5142";
        assertTrue(MorePage.NumberOfSessionsTextIsDisplayed());
    }
    @Test(priority = 7)
    public void VerifyTheNumberOfDaysCountCircleIs0(){
        testCaseId="5147";
        assertTrue(MorePage.NumberOfDaysIsDisplayed());
    }
    @Test(priority = 8)
    public void BrowseSubscriptionsButtonIsDisplayed(){
        testCaseId="10293";
        assertTrue(MorePage.BrowseSubscriptionsButtonIsDisplayed());
    }
    @Test(priority = 9)
    public void AnswerAndQuestionButtonIsDisplayed(){
        testCaseId="10294";
        assertTrue(MorePage.AnswerAndQuestionButtonIsDisplayed());
    }
    @Test(priority = 10)
    public void BlogButtonIsDisplayed(){
        testCaseId="10295";
        assertTrue(MorePage.BlogButtonIsDisplayed());
    }
    @Test(priority = 11)
    public void SignInButtonIsDisplayed(){
        testCaseId="10296";
        assertTrue(MorePage.SignInButtonIsDisplayed());
    }
    @Test(priority = 12)
    public void FriendsInviteButtonIsDisplayed(){
        testCaseId="10297";
        assertTrue(MorePage.FriendsInviteButtonIsDisplayed());
    }
    @Test(priority = 13)
    public void FamcareRatingButtonIsDisplayed(){
        testCaseId="10298";
        assertTrue(MorePage.FamcareRatingButtonIsDisplayed());
    }
    @Test(priority = 14)
    public void TechnicalSupportIsDisplayed(){
        testCaseId="10299";
        MobileSetupTest.androidDriver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().description(\""+testDataMobile.getTechnicalSupportButton()+"\"))");
        assertTrue(MorePage.TechnicalSupportIsDisplayed());
    }
    @Test(priority = 15)
    public void InterestNumbersButtonIsDisplayed(){
        testCaseId="10300";
        assertTrue(MorePage.InterestNumbersButtonIsDisplayed());
    }
    @Test(priority = 16)
    public void PrivacyPolicyIsDisplayed(){
        testCaseId="10301";
        assertTrue(MorePage.PrivacyPolicyIsDisplayed());
    }
    @Test(priority = 17)
    public void UseTermsIsDisplayed(){
        testCaseId="10302";
        assertTrue(MorePage.UseTermsIsDisplayed());
    }
    @AfterMethod
    public void screenShot(ITestResult result) throws APIException, IOException {
        MobileFinder.afterMethod(result,testCaseId);
        System.out.println("After method" + result.getMethod().getMethodName());
    }
}
