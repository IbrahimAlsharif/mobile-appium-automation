package Web.Tests.CourseDetailsPage;

import Base.WebSetup.WebFinder;
import org.openqa.selenium.WebElement;

public class CourseDetailsPage {
    public static WebElement getCourseTitle() {
        String xpath="//*[@id=\"main\"]/div[1]/div/div/h1";
        return  WebFinder.getByXpath(xpath, true);
    }

    public static boolean courseTitleIsDisplayed() {
        return getCourseTitle().isDisplayed();
    }

    public static String getCourseTitleText () {
        return getCourseTitle().getText();
    }

   }
