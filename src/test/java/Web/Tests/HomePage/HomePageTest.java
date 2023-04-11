package Web.Tests.HomePage;

//import Web.Tests.SubscriptionsPage.SubscriptionPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import static Base.WebSetup.WebSetupTest.testDataWeb;

public class HomePageTest {
    @Test(priority = 1)
    public void logoIsDisplayed() {
        Assert.assertTrue(HomePage.logoIsDisplayed());
    }

    @Test(priority = 1)
    public void startImageIsDisplayed() {
        Assert.assertTrue(HomePage.startImageIsDisplayed());
    }

    @Test(priority = 1)
    public void startTextIsDisplayed() {
        Assert.assertTrue(HomePage.startTextIsDisplayed());
    }

    @Test(priority = 1)
    public void startButtonIsDisplayed() {
        Assert.assertTrue(HomePage.startButtonIsDisplayed());
    }

    @Test(priority = 1)
    public void promotionalTextIsDisplayed() {
        Assert.assertTrue(HomePage.promotionalTextIsDisplayed());
    }
    @Test(priority = 1)
    public void packagesImageIsDisplayed() {
        Assert.assertTrue(HomePage.packagesImageIsDisplayed());
    }
    @Test(priority = 1)
    public void packagesTitleIsDisplayed() {
        Assert.assertTrue(HomePage.packagesTitleIsDisplayed());
    }
    @Test(priority = 1)
    public void packagesDescriptionTextIsDisplayed() {
        Assert.assertTrue(HomePage.packagesDescriptionTextIsDisplayed());
    }
    @Test(priority = 1)
    public void sessionsImageIsDisplayed() {
        Assert.assertTrue(HomePage.sessionsImageIsDisplayed());
    }
    @Test(priority = 1)
    public void sessionsTitleIsDisplayed() {
        Assert.assertTrue(HomePage.sessionsTitleIsDisplayed());
    }
    @Test(priority = 1)
    public void sessionsDescriptionTextIsDisplayed() {
        Assert.assertTrue(HomePage.sessionsDescriptionTextIsDisplayed());
    }
    @Test(priority = 1)
    public void ratingImageIsDisplayed() {
        Assert.assertTrue(HomePage.ratingImageIsDisplayed());
    }
    @Test(priority = 1)
    public void ratingTitleIsDisplayed() {
        Assert.assertTrue(HomePage.ratingTitleIsDisplayed());
    }
    @Test(priority = 1)
    public void ratingDescriptionTextIsDisplayed() {
        Assert.assertTrue(HomePage.ratingDescriptionTextIsDisplayed());
    }
    @Test(priority = 1)
    public void subscriptionImageIsDisplayed() {
        Assert.assertTrue(HomePage.subscriptionImageIsDisplayed());
    }
    @Test(priority = 1)
    public void consultantButtonIsDisplayed() {
        Assert.assertTrue(HomePage.consultantButtonIsDisplayed());
    }
    @Test(priority = 1)
    public void startChangeButtonIsDisplayed() {
        Assert.assertTrue(HomePage.startChangeButtonIsDisplayed());
    }
    @Test(priority = 1)
    public void googlePlayButtonIsDisplayed() {
        Assert.assertTrue(HomePage.googlePlayButtonIsDisplayed());
    }
    @Test(priority = 1)
    public void appStoreButtonIsDisplayed() {
        Assert.assertTrue(HomePage.appStoreButtonIsDisplayed());
    }
    @Test(priority = 1)
    public void blogButtonIsDisplayed() {
        Assert.assertTrue(HomePage.blogButtonIsDisplayed());
    }
    @Test(priority = 1)
    public void footerGooglePlayButtonIsDisplayed() {
        Assert.assertTrue(HomePage.footerGooglePlayButtonIsDisplayed());
    }
    @Test(priority = 1)
    public void footerAppStoreButtonIsDisplayed() {
        Assert.assertTrue(HomePage.footerAppStoreButtonIsDisplayed());
    }
//    @Test(priority = 2)
//    public void openSubscriptionPage() {
//        HomePage.clickOnStartButton();
//        Assert.assertEquals(SubscriptionPage.getSubscriptionTitleText(), testDataWeb.getSubscriptionsTitle());
//    }
}
