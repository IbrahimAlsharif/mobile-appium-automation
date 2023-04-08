package Web.Tests.AcademyPage;

import Base.WebFinder;
import org.openqa.selenium.WebElement;

public class AcademyPage {

    public static WebElement getNavbarButton() {
        String xpath = "//button[@data-target='#navbarContent']";
        return WebFinder.getByXpath(xpath, true);
    }

    public static boolean NavbarButtonIsDisplayed() {
        return getNavbarButton().isDisplayed();
    }

    public static void clickOnNavbarButton() {
        getNavbarButton().click();
    }

    public static WebElement getAcademyNavbarButton() {
        String xpath = "//*[@id=\"menu-item-1227\"]/a";
        return WebFinder.getByXpath(xpath, true);
    }

    public static boolean AcademyNavbarButtonIsDisplayed() {
        return getAcademyNavbarButton().isDisplayed();
    }

    public static void clickOnAcademyNavbarButton() {
        getAcademyNavbarButton().click();
    }

    public static WebElement getBrowseCoursesText() {
        String xpath = "//*[@id=\"main-content\"]/div/section[2]/div[2]/div/div/section[1]/div/div/div/div/div/h1";
        return WebFinder.getByXpath(xpath, false);
    }

    public static boolean BrowseCoursesTextIsDisplayed() {
        return getBrowseCoursesText().isDisplayed();
    }

    public static WebElement getAcademyImage() {
        String xpath="//img[@alt='ما هو مرض الذهان العقلي']";
        return  WebFinder.getByXpath(xpath, false);
    }
    public static boolean academyImageIsDisplayed() {
        return getAcademyImage().isDisplayed();
    }

    public static WebElement getBrowseCoursesButton() {
        String xpath = "//a[@id='slider-1-slide-1-layer-1']";
        return WebFinder.getByXpath(xpath, true);
    }
    public static boolean BrowseCoursesButtonIsDisplayed() {
        return getBrowseCoursesButton().isDisplayed();
    }

    public static void clickOnBrowseCoursesButton() {
        getBrowseCoursesButton().click();
    }

    public static WebElement getCoursesText() {
        String xpath = "//DIV[@class='page-header_title'][text()='الدورات']";
        return WebFinder.getByXpath(xpath, true);
    }
    public static boolean CoursesTextIsDisplayed() {
        return getCoursesText().isDisplayed();
    }
    public static WebElement getPsychologicalSideDiv() {
        String xpath = "//div[@data-id='a28c3ce']";
        return WebFinder.getByXpath(xpath, true);
    }
    public static boolean PsychologicalSideDivIsDisplayed() {
        return getPsychologicalSideDiv().isDisplayed();
    }

    public static WebElement getSocialSideDiv() {
        String xpath = "//div[@data-id='d873bc4']";
        return WebFinder.getByXpath(xpath, true);
    }
    public static boolean SocialSideDivIsDisplayed() {
        return getSocialSideDiv().isDisplayed();
    }
    public static WebElement getEducationalSideDiv() {
        String xpath = "//div[@data-id='b40ee71']";
        return WebFinder.getByXpath(xpath, true);
    }
    public static boolean EducationalSideDivIsDisplayed() {
        return getEducationalSideDiv().isDisplayed();
    }

    public static WebElement getPractitionersDiv() {
        String xpath = "//div[@data-id='d6a9f46']";
        return WebFinder.getByXpath(xpath, true);
    }
    public static boolean PractitionersDivIsDisplayed() {
        return getPractitionersDiv().isDisplayed();
    }
    public static WebElement getRegisterNowText() {
        String xpath = "//*[@id=\"main-content\"]/div/section[3]/div/div/div/div[1]/div/h2";
        return WebFinder.getByXpath(xpath, true);
    }
    public static boolean RegisterNowTextIsDisplayed() {
        return getRegisterNowText().isDisplayed();
    }

    public static WebElement getProfessionalTrainersDiv() {
        String xpath = "//div[@data-id='daee9f3']";
        return WebFinder.getByXpath(xpath, true);
    }
    public static boolean ProfessionalTrainersDivIsDisplayed() {
        return getProfessionalTrainersDiv().isDisplayed();
    }
    public static WebElement getProfessionalCoursesDiv() {
        String xpath = "//div[@data-id='544cd38']";
        return WebFinder.getByXpath(xpath, true);
    }
    public static boolean ProfessionalCoursesDivIsDisplayed() {
        return getProfessionalCoursesDiv().isDisplayed();
    }
    public static WebElement getUnlimitedViewingDiv() {
        String xpath = "//div[@data-id='4af28cd']";
        return WebFinder.getByXpath(xpath, true);
    }
    public static boolean UnlimitedViewingDivIsDisplayed() {
        return getUnlimitedViewingDiv().isDisplayed();
    }

    public static WebElement getTrainersText() {
        String xpath = "//*[@id=\"main-content\"]/div/section[7]/div/div/div/div[1]/div/h2";
        return WebFinder.getByXpath(xpath, true);
    }
    public static boolean TrainersTextIsDisplayed() {
        return getTrainersText().isDisplayed();
    }


}
