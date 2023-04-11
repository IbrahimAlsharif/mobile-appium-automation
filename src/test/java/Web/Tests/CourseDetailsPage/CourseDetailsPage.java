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

    public static WebElement getJoinCourseButton() {
        String xpath="//a[@class='btn-join']";
        return  WebFinder.getByXpath(xpath, true);
    }
    public static boolean JoinCourseButtonIsDisplayed() {
        return getJoinCourseButton().isDisplayed();
    }
    public static String getJoinCourseButtonText () {
        return getJoinCourseButton().getText();
    }
    public static void clickOnJoinCourseButton() {
        getJoinCourseButton().click();
    }
    public static WebElement getStoreText() {
        String xpath="//div[@class='page-header_title']";
        return  WebFinder.getByXpath(xpath, false);
    }
    public static boolean StoreTextIsDisplayed() {
        return getStoreText().isDisplayed();
    }


}
