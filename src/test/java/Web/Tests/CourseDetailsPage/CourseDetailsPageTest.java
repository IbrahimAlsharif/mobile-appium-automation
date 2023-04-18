package Web.Tests.CourseDetailsPage;

import org.testng.Assert;
import org.testng.annotations.Test;

import static Base.WebSetup.WebSetupTest.testDataWeb;

public class CourseDetailsPageTest {
    private String testCaseId;
    @Test(priority = 1)
    public void courseTitleIsDisplayed() {
        testCaseId="10263";
        Assert.assertTrue(CourseDetailsPage.courseTitleIsDisplayed());
    }
    @Test(priority = 2)

    public void joinCourseButtonIsDisplayed() {
        testCaseId="10265";
        Assert.assertTrue(CourseDetailsPage.JoinCourseButtonIsDisplayed());
    }
    @Test(priority = 2)
    public void viewJoinCourseButtonText() {
        testCaseId="10268";
        Assert.assertEquals(CourseDetailsPage.getJoinCourseButtonText(), testDataWeb.getJoinCourseButtonText());
    }
    @Test(priority = 3)
    public void joinButtonIsClickable() {
        testCaseId="10269";
        CourseDetailsPage.clickOnJoinCourseButton();
        Assert.assertTrue(CourseDetailsPage.StoreTextIsDisplayed());
    }
}
