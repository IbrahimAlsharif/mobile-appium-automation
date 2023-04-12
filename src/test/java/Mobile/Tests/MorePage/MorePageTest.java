package Mobile.Tests.MorePage;

import Base.MobileSetup.MobileFinder;
import Base.MobileSetup.MobileSetupTest;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

import static Base.MobileSetup.MobileSetupTest.testDataMobile;

public class MorePageTest {
    private String testCaseId;
    @Test(priority =1)
    public void verifyThatTapMoreButtonNavigateToMorePage()  {
        String accessibility = "المزيد\n" +
                "علامة التبويب 5 من 5";
       MobileFinder.getByAccessibilityId(accessibility,false).click();
        assertTrue(MorePage.LanguageIconIsDisplayed());
    }

    @Test(priority = 2)
    public void LanguageIconIsDisplayed(){
        testCaseId="0";
        assertTrue(MorePage.LanguageIconIsDisplayed());
    }
    @Test(priority = 3)
    public void UserImageIsDisplayed(){
        testCaseId="0";
        assertTrue(MorePage.UserImageIsDisplayed());
    }
    @Test(priority = 4)
    public void UserDoesNotHaveSubscriptionTitleIsDisplayed(){
        testCaseId="0";
        assertTrue(MorePage.TheUserDoesNotHaveSubscriptionTitleIsDisplayed());
    }
    @Test(priority = 5)
    public void SubscribeToSubscriptionsTextIsDisplayed(){
        testCaseId="0";
        assertTrue(MorePage.SubscribeToSubscriptionsTextIsDisplayed());
    }
    @Test(priority = 6)
    public void NumberOfSessionsTextIsDisplayed(){
        testCaseId="0";
        assertTrue(MorePage.NumberOfSessionsTextIsDisplayed());
    }
    @Test(priority = 7)
    public void NumberOfDaysIsDisplayed(){
        testCaseId="0";
        assertTrue(MorePage.NumberOfDaysIsDisplayed());
    }
    @Test(priority = 8)
    public void BrowseSubscriptionsButtonIsDisplayed(){
        testCaseId="0";
        assertTrue(MorePage.BrowseSubscriptionsButtonIsDisplayed());
    }
    @Test(priority = 9)
    public void AnswerAndQuestionButtonIsDisplayed(){
        testCaseId="0";
        assertTrue(MorePage.AnswerAndQuestionButtonIsDisplayed());
    }
    @Test(priority = 10)
    public void BlogButtonIsDisplayed(){
        testCaseId="0";
        assertTrue(MorePage.BlogButtonIsDisplayed());
    }
    @Test(priority = 11)
    public void SignInButtonIsDisplayed(){
        testCaseId="0";
        assertTrue(MorePage.SignInButtonIsDisplayed());
    }
    @Test(priority = 12)
    public void FriendsInviteButtonIsDisplayed(){
        testCaseId="0";
        assertTrue(MorePage.FriendsInviteButtonIsDisplayed());
    }
    @Test(priority = 13)
    public void FamcareRatingButtonIsDisplayed(){
        testCaseId="0";
        assertTrue(MorePage.FamcareRatingButtonIsDisplayed());
    }
    @Test(priority = 14)
    public void TechnicalSupportIsDisplayed(){
        testCaseId="0";
        MobileSetupTest.androidDriver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().description(\""+testDataMobile.getTechnicalSupportButton()+"\"))");
        assertTrue(MorePage.TechnicalSupportIsDisplayed());
    }
    @Test(priority = 15)
    public void InterestNumbersButtonIsDisplayed(){
        testCaseId="0";
        assertTrue(MorePage.InterestNumbersButtonIsDisplayed());
    }
    @Test(priority = 16)
    public void PrivacyPolicyIsDisplayed(){
        testCaseId="0";
        assertTrue(MorePage.PrivacyPolicyIsDisplayed());
    }
    @Test(priority = 17)
    public void UseTermsIsDisplayed(){
        testCaseId="0";
        assertTrue(MorePage.UseTermsIsDisplayed());
    }
}
