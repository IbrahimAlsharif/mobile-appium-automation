package Web.Tests.CourseDetailsPage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CourseDetailsPageTest {
    @Test(priority = 1)
    public void courseTitleIsDisplayed() {
        Assert.assertTrue(CourseDetailsPage.courseTitleIsDisplayed());
    }

}
