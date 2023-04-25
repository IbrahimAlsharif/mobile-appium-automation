package Web.Tests.AcademyFooter;
// -*- coding: utf-8 -*-

import Base.WebSetup.WebFinder;
import TestRail.APIException;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class AcademyFooterTest {
    private String testCaseId;
    @Test(priority = 1)
    public void logoImageIsDisplayed() {
       testCaseId = "10335";
        Assert.assertTrue(AcademyFooter.logoImageIsDisplayed());
    }
    @AfterMethod
    public void reportResult(ITestResult result) throws APIException, IOException {
        WebFinder.afterMethod(result,testCaseId);
    }
}
