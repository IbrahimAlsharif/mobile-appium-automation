package Web.Tests.CoursesPage;

import Base.WebFinder;
import org.openqa.selenium.WebElement;

public class CoursesPage {
    public static WebElement getCourseTitle() {
        String xpath="//*[@id=\"main\"]/div/div/article[1]/div/div[2]/div[1]/h4/a";
        return  WebFinder.getByXpath(xpath, true);
    }

    public static boolean courseTitleIsDisplayed() {
        return getCourseTitle().isDisplayed();
    }

    public static void clickOnCourseTitle () {
        getCourseTitle().click();
    }

    public static String getCourseTitleText () {
        return getCourseTitle().getText();
    }

   }
