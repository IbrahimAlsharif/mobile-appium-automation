package Mobile.Tests.MorePage;

import Base.MobileSetup.MobileFinder;
import Base.MobileSetup.MobileSetupTest;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MorePageTest {
    private String testCaseId;
    @Test(priority =1)
    public void verifyThatTapMoreButtonNavigateToMorePage()  {
        TouchAction touchAction=new TouchAction(MobileSetupTest.androidDriver);
        touchAction.tap(PointOption.point(133, 1935)).release().perform();
        touchAction.tap(PointOption.point(133, 1935)).release().perform();
        Assert.assertTrue(MorePage.LanguageIconIsDisplayed());

    }

    @Test(priority = 2)
    public void LanguageIconIsDisplayed(){
        testCaseId="0";
        Assert.assertTrue(MorePage.LanguageIconIsDisplayed());
    }
    @Test(priority = 3)
    public void UserImageIsDisplayed(){
        testCaseId="0";
        Assert.assertTrue(MorePage.UserImageIsDisplayed());
    }
    @Test(priority = 4)
    public void UserDoesNotHaveSubscriptionTitleIsDisplayed(){
        testCaseId="0";
        Assert.assertTrue(MorePage.TheUserDoesNotHaveSubscriptionTitleIsDisplayed());
    }
    @Test(priority = 5)
    public void SubscribeToSubscriptionsTextIsDisplayed(){
        testCaseId="0";
        Assert.assertTrue(MorePage.SubscribeToSubscriptionsTextIsDisplayed());
    }
    @Test(priority = 6)
    public void NumberOfSessionsTextIsDisplayed(){
        testCaseId="0";
        Assert.assertTrue(MorePage.NumberOfSessionsTextIsDisplayed());
    }
    @Test(priority = 7)
    public void NumberOfDaysIsDisplayed(){
        testCaseId="0";
        Assert.assertTrue(MorePage.NumberOfDaysIsDisplayed());
    }
    @Test(priority = 8)
    public void BrowseSubscriptionsButtonIsDisplayed(){
        testCaseId="0";
        Assert.assertTrue(MorePage.BrowseSubscriptionsButtonIsDisplayed());
    }
    @Test(priority = 9)
    public void AnswerAndQuestionButtonIsDisplayed(){
        testCaseId="0";
        Assert.assertTrue(MorePage.AnswerAndQuestionButtonIsDisplayed());
    }
    @Test(priority = 10)
    public void BlogButtonIsDisplayed(){
        testCaseId="0";
        Assert.assertTrue(MorePage.BlogButtonIsDisplayed());
    }
    @Test(priority = 11)
    public void SignInButtonIsDisplayed(){
        testCaseId="0";
        Assert.assertTrue(MorePage.SignInButtonIsDisplayed());
    }
    @Test(priority = 12)
    public void FriendsInviteButtonIsDisplayed(){
        testCaseId="0";
        Assert.assertTrue(MorePage.FriendsInviteButtonIsDisplayed());
    }
    @Test(priority = 13)
    public void FamcareRatingButtonIsDisplayed(){
        testCaseId="0";
        Assert.assertTrue(MorePage.FamcareRatingButtonIsDisplayed());
    }
    @Test(priority = 14)
    public void TechnicalSupportIsDisplayed(){
        testCaseId="0";
        MobileFinder.js.executeScript("arguments[0].scrollIntoView();", MorePage.getTechnicalSupportButton());
        Assert.assertTrue(MorePage.TechnicalSupportIsDisplayed());
    }
    @Test(priority = 15)
    public void InterestNumbersButtonIsDisplayed(){
        testCaseId="0";
        Assert.assertTrue(MorePage.InterestNumbersButtonIsDisplayed());
    }
    @Test(priority = 16)
    public void PrivacyPolicyIsDisplayed(){
        testCaseId="0";
        Assert.assertTrue(MorePage.PrivacyPolicyIsDisplayed());
    }
    @Test(priority = 17)
    public void UseTermsIsDisplayed(){
        testCaseId="0";
        Assert.assertTrue(MorePage.UseTermsIsDisplayed());
    }
}
