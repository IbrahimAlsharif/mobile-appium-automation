package Web.Tests.HomePage;
// -*- coding: utf-8 -*-

import Base.WebSetup.WebFinder;
import TestRail.APIException;
import Web.Tests.SubscriptionsPage.SubscriptionPage;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.io.IOException;

import static Base.WebSetup.WebSetupTest.testDataWeb;

public class HomePageTest {
    private String testCaseId;
    @Test(priority = 1)
    public void logoIsDisplayed() {
        testCaseId="10125";
        Assert.assertTrue(HomePage.logoIsDisplayed());
    }

    @Test(priority = 1)
    public void startImageIsDisplayed() {
        testCaseId="10127";
        Assert.assertTrue(HomePage.startImageIsDisplayed());
    }

    @Test(priority = 1)
    public void startTextIsDisplayed() {
        testCaseId="10128";
        Assert.assertTrue(HomePage.startTextIsDisplayed());
    }

    @Test(priority = 1)
    public void startButtonIsDisplayed() {
        testCaseId="10130";
        Assert.assertTrue(HomePage.startButtonIsDisplayed());
    }

    @Test(priority = 1)
    public void promotionalTextIsDisplayed() {
        testCaseId="10131";
        Assert.assertTrue(HomePage.promotionalTextIsDisplayed());
    }
    @Test(priority = 1)
    public void packagesImageIsDisplayed() {
        testCaseId="10133";
        Assert.assertTrue(HomePage.packagesImageIsDisplayed());
    }
    @Test(priority = 1)
    public void packagesTitleIsDisplayed() {
        testCaseId="10134";
        Assert.assertTrue(HomePage.packagesTitleIsDisplayed());
    }
    @Test(priority = 1)
    public void packagesDescriptionTextIsDisplayed() {
        testCaseId="10135";
        Assert.assertTrue(HomePage.packagesDescriptionTextIsDisplayed());
    }
    @Test(priority = 1)
    public void sessionsImageIsDisplayed() {
        testCaseId="10136";
        Assert.assertTrue(HomePage.sessionsImageIsDisplayed());
    }
    @Test(priority = 1)
    public void sessionsTitleIsDisplayed() {
        testCaseId="10137";
        Assert.assertTrue(HomePage.sessionsTitleIsDisplayed());
    }
    @Test(priority = 1)
    public void sessionsDescriptionTextIsDisplayed() {
        testCaseId="10138";
        Assert.assertTrue(HomePage.sessionsDescriptionTextIsDisplayed());
    }
    @Test(priority = 1)
    public void ratingImageIsDisplayed() {
        testCaseId="10139";
        Assert.assertTrue(HomePage.ratingImageIsDisplayed());
    }
    @Test(priority = 1)
    public void ratingTitleIsDisplayed() {
        testCaseId="10140";
        Assert.assertTrue(HomePage.ratingTitleIsDisplayed());
    }
    @Test(priority = 1)
    public void ratingDescriptionTextIsDisplayed() {
        testCaseId="10141";
        Assert.assertTrue(HomePage.ratingDescriptionTextIsDisplayed());
    }
    @Test(priority = 1)
    public void subscriptionImageIsDisplayed() {
        testCaseId="10142";
        Assert.assertTrue(HomePage.subscriptionImageIsDisplayed());
    }
    @Test(priority = 1)
    public void consultantButtonIsDisplayed() {
        testCaseId="10143";
        Assert.assertTrue(HomePage.consultantButtonIsDisplayed());
    }
    @Test(priority = 1)
    public void startChangeButtonIsDisplayed() {
        testCaseId="10144";
        Assert.assertTrue(HomePage.startChangeButtonIsDisplayed());
    }
    @Test(priority = 1)
    public void googlePlayButtonIsDisplayed() {
        testCaseId="10336";
        Assert.assertTrue(HomePage.googlePlayButtonIsDisplayed());
    }
    @Test(priority = 1)
    public void appStoreButtonIsDisplayed() {
        testCaseId="10337";
        Assert.assertTrue(HomePage.appStoreButtonIsDisplayed());
    }
    @Test(priority = 1)
    public void blogButtonIsDisplayed() {
        testCaseId="10147";
        Assert.assertTrue(HomePage.blogButtonIsDisplayed());
    }

    @Test(priority = 2)
    public void openSubscriptionPage() {
        testCaseId="10148";
        HomePage.clickOnStartButton();
        Assert.assertEquals(SubscriptionPage.getSubscriptionTitleText(), testDataWeb.getSubscriptionsTitle());
    }
    @AfterMethod
    public void reportResult(ITestResult result) throws APIException, IOException {
        WebFinder.afterMethod(result,testCaseId);
    }
}
