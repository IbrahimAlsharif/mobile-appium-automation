package Web.Tests.CoursesPage;

import Web.Tests.CourseDetailsPage.CourseDetailsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import static Base.SetupTest.testDataWeb;

public class CoursesPageTest {
    @Test(priority = 1)
    public void courseTitleIsDisplayed() {
        Assert.assertTrue(CoursesPage.courseTitleIsDisplayed());
    }

    @Test(priority = 2)
    public void openCourseDetailsPage() {
        CoursesPage.clickOnCourseTitle();
        Assert.assertEquals(CourseDetailsPage.getCourseTitleText(), testDataWeb.getCourseTitle());
    }
}
