package Web.Tests.CourseDetailsPage;

import Base.Utilities;
import org.openqa.selenium.WebElement;

public class CourseDetailsPage {
    public static WebElement getCourseTitle() {
        String xpath="//*[@id=\"main\"]/div[1]/div/div/h1";
        return  Utilities.getByXpath(xpath, true);
    }

    public static boolean courseTitleIsDisplayed() {
        return getCourseTitle().isDisplayed();
    }

    public static String getCourseTitleText () {
        return getCourseTitle().getText();
    }

   }
