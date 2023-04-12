package Web.Tests.HomePage;

import Web.Tests.SubscriptionsPage.SubscriptionPage;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

import static Base.WebSetup.WebSetupTest.testDataWeb;

public class HomePageTest {
    @Test(priority = 1)
    public void logoIsDisplayed() {
        assertTrue(HomePage.logoIsDisplayed());
    }

    @Test(priority = 1)
    public void startImageIsDisplayed() {
        assertTrue(HomePage.startImageIsDisplayed());
    }

    @Test(priority = 1)
    public void startTextIsDisplayed() {
        assertTrue(HomePage.startTextIsDisplayed());
    }

    @Test(priority = 1)
    public void startButtonIsDisplayed() {
        assertTrue(HomePage.startButtonIsDisplayed());
    }

    @Test(priority = 1)
    public void promotionalTextIsDisplayed() {
       assertTrue(HomePage.promotionalTextIsDisplayed());
    }
    @Test(priority = 1)
    public void packagesImageIsDisplayed() {
        assertTrue(HomePage.packagesImageIsDisplayed());
    }
    @Test(priority = 1)
    public void packagesTitleIsDisplayed() {
        assertTrue(HomePage.packagesTitleIsDisplayed());
    }
    @Test(priority = 1)
    public void packagesDescriptionTextIsDisplayed() {
        assertTrue(HomePage.packagesDescriptionTextIsDisplayed());
    }
    @Test(priority = 1)
    public void sessionsImageIsDisplayed() {
        assertTrue(HomePage.sessionsImageIsDisplayed());
    }
    @Test(priority = 1)
    public void sessionsTitleIsDisplayed() {
        assertTrue(HomePage.sessionsTitleIsDisplayed());
    }
    @Test(priority = 1)
    public void sessionsDescriptionTextIsDisplayed() {
        assertTrue(HomePage.sessionsDescriptionTextIsDisplayed());
    }
    @Test(priority = 1)
    public void ratingImageIsDisplayed() {
        assertTrue(HomePage.ratingImageIsDisplayed());
    }
    @Test(priority = 1)
    public void ratingTitleIsDisplayed() {
        assertTrue(HomePage.ratingTitleIsDisplayed());
    }
    @Test(priority = 1)
    public void ratingDescriptionTextIsDisplayed() {
        assertTrue(HomePage.ratingDescriptionTextIsDisplayed());
    }
    @Test(priority = 1)
    public void subscriptionImageIsDisplayed() {
        assertTrue(HomePage.subscriptionImageIsDisplayed());
    }
    @Test(priority = 1)
    public void consultantButtonIsDisplayed() {
        assertTrue(HomePage.consultantButtonIsDisplayed());
    }
    @Test(priority = 1)
    public void startChangeButtonIsDisplayed() {
        assertTrue(HomePage.startChangeButtonIsDisplayed());
    }
    @Test(priority = 1)
    public void googlePlayButtonIsDisplayed() {
        assertTrue(HomePage.googlePlayButtonIsDisplayed());
    }
    @Test(priority = 1)
    public void appStoreButtonIsDisplayed() {
        assertTrue(HomePage.appStoreButtonIsDisplayed());
    }
    @Test(priority = 1)
    public void blogButtonIsDisplayed() {
        assertTrue(HomePage.blogButtonIsDisplayed());
    }
    @Test(priority = 1)
    public void footerGooglePlayButtonIsDisplayed() {
        assertTrue(HomePage.footerGooglePlayButtonIsDisplayed());
    }
    @Test(priority = 1)
    public void footerAppStoreButtonIsDisplayed() {
        assertTrue(HomePage.footerAppStoreButtonIsDisplayed());
    }
    @Test(priority = 2)
    public void openSubscriptionPage() {
        HomePage.clickOnStartButton();
        assertEquals(SubscriptionPage.getSubscriptionTitleText(), testDataWeb.getSubscriptionsTitle());
    }
}
