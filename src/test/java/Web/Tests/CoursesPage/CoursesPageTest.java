package Web.Tests.CoursesPage;
// -*- coding: utf-8 -*-

import Base.WebSetup.WebFinder;
import TestRail.APIException;
import Web.Tests.CourseDetailsPage.CourseDetailsPage;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.io.IOException;

import static Base.WebSetup.WebSetupTest.testDataWeb;

public class CoursesPageTest {
    private String testCaseId;
    @Test(priority = 1)
    public void courseTitleIsDisplayed() {
        testCaseId="10271";
        Assert.assertTrue(CoursesPage.courseTitleIsDisplayed());
    }

    @Test(priority = 2)
    public void openCourseDetailsPage() {
        testCaseId="10272";
        CoursesPage.clickOnCourseTitle();
        Assert.assertEquals(CourseDetailsPage.getCourseTitleText(), testDataWeb.getCourseTitle());
    }
    @AfterMethod
    public void reportResult(ITestResult result) throws APIException, IOException {
        WebFinder.afterMethod(result,testCaseId);
    }
}
