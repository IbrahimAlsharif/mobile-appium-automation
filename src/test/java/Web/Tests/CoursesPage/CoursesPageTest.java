package Web.Tests.CoursesPage;

import Web.Tests.CourseDetailsPage.CourseDetailsPage;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

import static Base.WebSetup.WebSetupTest.testDataWeb;

public class CoursesPageTest {
    @Test(priority = 1)
    public void courseTitleIsDisplayed() {
        assertTrue(CoursesPage.courseTitleIsDisplayed());
    }

    @Test(priority = 2)
    public void openCourseDetailsPage() {
        CoursesPage.clickOnCourseTitle();
        assertEquals(CourseDetailsPage.getCourseTitleText(), testDataWeb.getCourseTitle());
    }
}
