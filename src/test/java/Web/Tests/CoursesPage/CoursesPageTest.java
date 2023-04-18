package Web.Tests.CoursesPage;

import Web.Tests.CourseDetailsPage.CourseDetailsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

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
}
