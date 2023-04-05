package Mobile.Tests.MorePage;

import Base.SetupTest;
import Mobile.Tests.LanguageChoose.LanguageChoose;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.testng.Assert;
import org.testng.annotations.Test;
import static Base.SetupTest.testData;

public class MorePageTest {
    private String testCaseId;
    @Test(priority =1)
    public void verifyThatTapMoreButtonNavigateToMorePage()  {
        TouchAction touchAction=new TouchAction(SetupTest.driver);
        touchAction.tap(PointOption.point(133, 1935)).release().perform();
        Assert.assertTrue(MorePagePOM.LanguageIconIsDisplayed());

    }

    @Test(priority = 2)
    public void LanguageIconIsDisplayed(){
        testCaseId="0";
        Assert.assertTrue(MorePagePOM.LanguageIconIsDisplayed());
    }
    @Test(priority = 3)
    public void UserImageIsDisplayed(){
        testCaseId="0";
        Assert.assertTrue(MorePagePOM.UserImageIsDisplayed());
    }
    @Test(priority = 4)
    public void UserDoesNotHaveSubscriptionTitleIsDisplayed(){
        testCaseId="0";
        Assert.assertTrue(MorePagePOM.TheUserDoesNotHaveSubscriptionTitleIsDisplayed());
    }
    @Test(priority = 5)
    public void SubscribeToSubscriptionsTextIsDisplayed(){
        testCaseId="0";
        Assert.assertTrue(MorePagePOM.SubscribeToSubscriptionsTextIsDisplayed());
    }
    @Test(priority = 6)
    public void NumberOfSessionsTextIsDisplayed(){
        testCaseId="0";
        Assert.assertTrue(MorePagePOM.NumberOfSessionsTextIsDisplayed());
    }
    @Test(priority = 7)
    public void NumberOfDaysIsDisplayed(){
        testCaseId="0";
        Assert.assertTrue(MorePagePOM.NumberOfDaysIsDisplayed());
    }
    @Test(priority = 8)
    public void BrowseSubscriptionsButtonIsDisplayed(){
        testCaseId="0";
        Assert.assertTrue(MorePagePOM.BrowseSubscriptionsButtonIsDisplayed());
    }
    @Test(priority = 9)
    public void AnswerAndQuestionButtonIsDisplayed(){
        testCaseId="0";
        Assert.assertTrue(MorePagePOM.AnswerAndQuestionButtonIsDisplayed());
    }
    @Test(priority = 10)
    public void BlogButtonIsDisplayed(){
        testCaseId="0";
        Assert.assertTrue(MorePagePOM.BlogButtonIsDisplayed());
    }
    @Test(priority = 11)
    public void SignInButtonIsDisplayed(){
        testCaseId="0";
        Assert.assertTrue(MorePagePOM.SignInButtonIsDisplayed());
    }
    @Test(priority = 12)
    public void FriendsInviteButtonIsDisplayed(){
        testCaseId="0";
        Assert.assertTrue(MorePagePOM.FriendsInviteButtonIsDisplayed());
    }
    @Test(priority = 13)
    public void FamcareRatingButtonIsDisplayed(){
        testCaseId="0";
        Assert.assertTrue(MorePagePOM.FamcareRatingButtonIsDisplayed());
    }
    @Test(priority = 14)
    public void TechnicalSupportIsDisplayed(){
        testCaseId="0";
        SetupTest.driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().description(\""+testData.getTechnicalSupportButton()+"\"))");//scroll down to the element and click
        Assert.assertTrue(MorePagePOM.TechnicalSupportIsDisplayed());
    }
    @Test(priority = 15)
    public void InterestNumbersButtonIsDisplayed(){
        testCaseId="0";
        Assert.assertTrue(MorePagePOM.InterestNumbersButtonIsDisplayed());
    }
    @Test(priority = 16)
    public void PrivacyPolicyIsDisplayed(){
        testCaseId="0";
        Assert.assertTrue(MorePagePOM.PrivacyPolicyIsDisplayed());
    }
    @Test(priority = 17)
    public void UseTermsIsDisplayed(){
        testCaseId="0";
        Assert.assertTrue(MorePagePOM.UseTermsIsDisplayed());
    }
}
