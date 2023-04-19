package Mobile.Tests.AllSpecialists;

import Mobile.Tests.HomePage.HomePage;
import Mobile.Tests.Subscriptions.SubscriptionsAndPackages;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.testng.Assert;
import org.testng.annotations.Test;

import static Base.MobileSetup.MobileSetupTest.*;
import static org.testng.Assert.assertTrue;


public class PsychologistTest {

    @Test(priority = 1, enabled = false)
    public void verifyThatTapMyConversationsButtonNavigateToMyConversationsPage() throws InterruptedException {
        TouchAction touchAction = new TouchAction((PerformsTouchActions) clientAndroidDriver);
        touchAction.tap(PointOption.point(956, 1946)).release().perform();
        Thread.sleep(9000);
        assertTrue(Psychologist.ScreenTitleIsDisplayed());

    }

    @Test(priority = 2)
    public void NavigateToPsychologistPage() {
        HomePage.ClickOnPsychologist();
        assertTrue(Psychologist.ScreenTitleIsDisplayed());
    }

    @Test(priority = 3)
    public void SearchFieldIsDisplayed() {
        assertTrue(Psychologist.SearchFieldIsDisplayed());
    }

    @Test(priority = 4)
    public void FilterIsDisplayed() {
        assertTrue(Psychologist.FilterIsDisplayed());
    }

    @Test(priority = 5)
    public void InputOnSearchField() throws InterruptedException {
        Psychologist.getSearchField().click();
        Thread.sleep(4000);
        Psychologist.InputOnSearchField(testDataMobile.getSpecialistNameOnDetailsPsychologistPage());
        Assert.assertEquals(Psychologist.getSearchField().getText(), testDataMobile.getSpecialistNameOnDetailsPsychologistPage());


    }

    @Test(priority = 6)
    public void PsychologistNameIsDisplayed() {
        clientAndroidDriver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().description(\"" + testDataMobile.getPsychologistNameText() + "\"))").click();
        assertTrue(Psychologist.SpecialistNameIsDisplayed());
    }

    @Test(priority = 7)
    public void SpecialisOfTypeIsDisplayed() {
        assertTrue(Psychologist.SpecialisOfTypeIsDisplayed());
    }

    @Test(priority = 8, enabled = false)
    public void SpecialistRateIsDisplayed() {
        assertTrue(Psychologist.SpecialistRateIsDisplayed());
    }

    @Test(priority = 9)
    public void ExperienceOfYearsIsDisplayed() {
        assertTrue(Psychologist.ExperienceOfYearsIsDisplayed());
    }

    @Test(priority = 10)
    public void DateOfJoinIsDisplayed() {
        assertTrue(Psychologist.DateOfJoinIsDisplayed());
    }

    @Test(priority = 11)
    public void BriefAboutMeTitleIsDisplayed() {
        assertTrue(Psychologist.BriefAboutMeTitleIsDisplayed());
    }

    @Test(priority = 12)
    public void SessionsPresentationWrittenIsDisplayed() {
        assertTrue(Psychologist.SessionsPresentationWrittenIsDisplayed());
    }

    @Test(priority = 13)
    public void SessionsPresentationAudioIsDisplayed() {
        assertTrue(Psychologist.SessionsPresentationAudioIsDisplayed());
    }

    @Test(priority = 14)
    public void SessionsPresentationVideoOnDetailsPsychologistPageIsDisplayed() {
        assertTrue(Psychologist.SessionsPresentationVideoIsDisplayed());
    }

    @Test(priority = 15)
    public void SubSpecialtiesIsDisplayed() {
        assertTrue(Psychologist.SubSpecialtiesIsDisplayed());
    }

    @Test(priority = 16)
    public void SubSpecialtiesTitleIsDisplayed() {
        assertTrue(Psychologist.SubSpecialtiesTitleIsDisplayed());
    }

    @Test(priority = 17)
    public void LanguageTitleLanguageIsDisplayed() {
        assertTrue(Psychologist.LanguageTitleLanguageIsDisplayed());
    }

    @Test(priority = 18)
    public void SpecialistLanguagIsDisplayed() {
        assertTrue(Psychologist.SpecialistLanguageIsDisplayed());
    }

    @Test(priority = 19)
    public void SpecialistRatesTitleIsDisplayed() {
        assertTrue(Psychologist.SpecialistRatesTitleIsDisplayed());
    }

    @Test(priority = 20, enabled = false)
    public void UserByCommentTextIsDisplayed() {
        assertTrue(Psychologist.UserByCommentTextIsDisplayed());
    }

    @Test(priority = 21)
    public void BookLaterDateButtonIsDisplayed() {
        assertTrue(Psychologist.BookLaterDateButtonIsDisplayed());
    }

    @Test(priority = 22)
    public void NavigationToSubscriptionsAndPackages() {
        String accessibility = "حجز موعد لاحق";
        clientMobileFinder.getByAccessibilityId(accessibility, true).click();
        assertTrue(SubscriptionsAndPackages.subscriptionsAndPackagesIsDisplayed());
    }


}
