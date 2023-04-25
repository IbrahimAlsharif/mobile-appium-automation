package Web.Tests.Footer;
// -*- coding: utf-8 -*-

import Base.WebSetup.WebFinder;
import TestRail.APIException;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class FooterTest {
    private String testCaseId;
    @Test(priority = 1)
    public void googlePlayButtonIsDisplayed() {
        testCaseId="10154";
        Assert.assertTrue(Footer.googlePlayButtonIsDisplayed());
    }
    @Test(priority = 1)
    public void appStoreButtonIsDisplayed() {
        testCaseId="10152";
        Assert.assertTrue(Footer.appStoreButtonIsDisplayed());
    }
    @AfterMethod
    public void reportResult(ITestResult result) throws APIException, IOException {
        WebFinder.afterMethod(result,testCaseId);
    }
}
