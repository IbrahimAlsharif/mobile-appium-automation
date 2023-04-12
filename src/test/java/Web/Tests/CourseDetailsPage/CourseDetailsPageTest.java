package Web.Tests.CourseDetailsPage;

import static org.testng.Assert.*;
import org.testng.annotations.Test;

import static Base.WebSetup.WebSetupTest.testDataWeb;

public class CourseDetailsPageTest {
    @Test(priority = 1)
    public void courseTitleIsDisplayed() {
        assertTrue(CourseDetailsPage.courseTitleIsDisplayed());
    }
    @Test(priority = 2)

    public void joinCourseButtonIsDisplayed() {
        assertTrue(CourseDetailsPage.JoinCourseButtonIsDisplayed());
    }
    @Test(priority = 2)
    public void viewJoinCourseButtonText() {
        assertEquals(CourseDetailsPage.getJoinCourseButtonText(), testDataWeb.getJoinCourseButtonText());
    }
    @Test(priority = 3)
    public void joinButtonIsClickable() {
        CourseDetailsPage.clickOnJoinCourseButton();
        assertTrue(CourseDetailsPage.StoreTextIsDisplayed());
    }
}
