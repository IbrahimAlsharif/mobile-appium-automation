package Web.Tests.CoursesPage;

import Web.Tests.CourseDetailsPage.CourseDetailsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import static Base.WebSetup.WebSetupTest.testDataWeb;

public class CoursesPageTest {
    private String testCaseId;
    @Test(priority = 1)
    public void courseTitleIsDisplayed() {
        testCaseId = "C10271";
        Assert.assertTrue(CoursesPage.courseTitleIsDisplayed());
    }

    @Test(priority = 2)
    public void openCourseDetailsPage() {
        testCaseId = "C10272";
        CoursesPage.clickOnCourseTitle();
        Assert.assertEquals(CourseDetailsPage.getCourseTitleText(), testDataWeb.getCourseTitle());
    }
}
