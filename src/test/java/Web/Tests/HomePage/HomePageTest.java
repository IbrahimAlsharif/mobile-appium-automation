package Web.Tests.HomePage;

import Web.Tests.SubscriptionsPage.SubscriptionPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import static Base.WebSetup.WebSetupTest.testDataWeb;

public class HomePageTest {
    private String testCaseId;
    @Test(priority = 1)
    public void logoIsDisplayed() {
        testCaseId="C10125";
        Assert.assertTrue(HomePage.logoIsDisplayed());
    }

    @Test(priority = 1)
    public void startImageIsDisplayed() {
        testCaseId="C10127";
        Assert.assertTrue(HomePage.startImageIsDisplayed());
    }

    @Test(priority = 1)
    public void startTextIsDisplayed() {
        testCaseId="C10128";
        Assert.assertTrue(HomePage.startTextIsDisplayed());
    }

    @Test(priority = 1)
    public void startButtonIsDisplayed() {
        testCaseId="C10130";
        Assert.assertTrue(HomePage.startButtonIsDisplayed());
    }

    @Test(priority = 1)
    public void promotionalTextIsDisplayed() {
        testCaseId="C10131";
        Assert.assertTrue(HomePage.promotionalTextIsDisplayed());
    }
    @Test(priority = 1)
    public void packagesImageIsDisplayed() {
        testCaseId="C10133";
        Assert.assertTrue(HomePage.packagesImageIsDisplayed());
    }
    @Test(priority = 1)
    public void packagesTitleIsDisplayed() {
        testCaseId="C10134";
        Assert.assertTrue(HomePage.packagesTitleIsDisplayed());
    }
    @Test(priority = 1)
    public void packagesDescriptionTextIsDisplayed() {
        testCaseId="C10135";
        Assert.assertTrue(HomePage.packagesDescriptionTextIsDisplayed());
    }
    @Test(priority = 1)
    public void sessionsImageIsDisplayed() {
        testCaseId="C10136";
        Assert.assertTrue(HomePage.sessionsImageIsDisplayed());
    }
    @Test(priority = 1)
    public void sessionsTitleIsDisplayed() {
        testCaseId="C10137";
        Assert.assertTrue(HomePage.sessionsTitleIsDisplayed());
    }
    @Test(priority = 1)
    public void sessionsDescriptionTextIsDisplayed() {
        testCaseId="C10138";
        Assert.assertTrue(HomePage.sessionsDescriptionTextIsDisplayed());
    }
    @Test(priority = 1)
    public void ratingImageIsDisplayed() {
        testCaseId="C10139";
        Assert.assertTrue(HomePage.ratingImageIsDisplayed());
    }
    @Test(priority = 1)
    public void ratingTitleIsDisplayed() {
        testCaseId="C10140";
        Assert.assertTrue(HomePage.ratingTitleIsDisplayed());
    }
    @Test(priority = 1)
    public void ratingDescriptionTextIsDisplayed() {
        testCaseId="C10141";
        Assert.assertTrue(HomePage.ratingDescriptionTextIsDisplayed());
    }
    @Test(priority = 1)
    public void subscriptionImageIsDisplayed() {
        testCaseId="C10142";
        Assert.assertTrue(HomePage.subscriptionImageIsDisplayed());
    }
    @Test(priority = 1)
    public void consultantButtonIsDisplayed() {
        testCaseId="C10143";
        Assert.assertTrue(HomePage.consultantButtonIsDisplayed());
    }
    @Test(priority = 1)
    public void startChangeButtonIsDisplayed() {
        testCaseId="C10144";
        Assert.assertTrue(HomePage.startChangeButtonIsDisplayed());
    }
    @Test(priority = 1)
    public void googlePlayButtonIsDisplayed() {
        testCaseId="C10336";
        Assert.assertTrue(HomePage.googlePlayButtonIsDisplayed());
    }
    @Test(priority = 1)
    public void appStoreButtonIsDisplayed() {
        testCaseId="C10337";
        Assert.assertTrue(HomePage.appStoreButtonIsDisplayed());
    }
    @Test(priority = 1)
    public void blogButtonIsDisplayed() {
        testCaseId="C10147";
        Assert.assertTrue(HomePage.blogButtonIsDisplayed());
    }

    @Test(priority = 2)
    public void openSubscriptionPage() {
        testCaseId="C10148";
        HomePage.clickOnStartButton();
        Assert.assertEquals(SubscriptionPage.getSubscriptionTitleText(), testDataWeb.getSubscriptionsTitle());
    }
}
