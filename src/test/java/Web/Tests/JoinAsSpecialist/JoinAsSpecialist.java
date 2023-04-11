package Web.Tests.JoinAsSpecialist;

import Base.WebSetup.WebFinder;
import org.openqa.selenium.WebElement;

import static Base.WebSetup.WebSetupTest.testDataWeb;

public class JoinAsSpecialist {
    public static WebElement getJoinAsSpecialistTitle() {
        String xpath = "//*[@id=\"wpcf7-f1890-o2\"]/form/h2";
        return WebFinder.getByXpath(xpath, false);
    }

    public static String joinAsSpecialistTitleText() {
        return getJoinAsSpecialistTitle().getText();
    }

    public static WebElement getNameField() {
        String xpath = "//*[@id=\"wpcf7-f1890-o2\"]/form/div[2]/input";
        return WebFinder.getByXpath(xpath, false);
    }

    public static boolean nameFieldISDisplayed() {
        return getNameField().isDisplayed();
    }

    public static void inputOnNameField() {
        getNameField().sendKeys(testDataWeb.getSpecialistName());
    }

    public static String getNameInputText() {
        return getNameField().getAttribute("value");
    }

    public static WebElement getMobileField() {
        String xpath = "//*[@id=\"wpcf7-f1890-o2\"]/form/div[3]/input";
        return WebFinder.getByXpath(xpath, false);
    }

    public static boolean mobileFieldISDisplayed() {
        return getMobileField().isDisplayed();
    }

    public static void inputOnMobileField() {
        getMobileField().sendKeys(testDataWeb.getSpecialistMobile());
    }

    public static String getMobileInputText() {
        return getMobileField().getAttribute("value");
    }

    public static WebElement getDegreeField() {
        String xpath = "//*[@id=\"wpcf7-f1890-o2\"]/form/div[4]/input";
        return WebFinder.getByXpath(xpath, false);
    }

    public static boolean degreeFieldISDisplayed() {
        return getDegreeField().isDisplayed();
    }

    public static void inputOnDegreeField() {
        getDegreeField().sendKeys(testDataWeb.getSpecialistDegree());
    }

    public static String getDegreeInputText() {
        return getDegreeField().getAttribute("value");
    }

    public static WebElement getSpecializationField() {
        String xpath = "//*[@id=\"wpcf7-f1890-o2\"]/form/div[5]/input";
        return WebFinder.getByXpath(xpath, false);
    }

    public static boolean specializationFieldISDisplayed() {
        return getSpecializationField().isDisplayed();
    }

    public static void inputOnSpecializationField() {
        getSpecializationField().sendKeys(testDataWeb.getSpecialistSpecialization());
    }

    public static String getSpecializationInputText() {
        return getSpecializationField().getAttribute("value");
    }

    public static WebElement getNumExperienceField() {
        String xpath = "//*[@id=\"wpcf7-f1890-o2\"]/form/div[6]/input";
        return WebFinder.getByXpath(xpath, false);
    }

    public static boolean numExperienceFieldISDisplayed() {
        return getNumExperienceField().isDisplayed();
    }

    public static void inputOnNumExperienceField() {
        getNumExperienceField().sendKeys(testDataWeb.getSpecialistNumExperience());
    }

    public static String getNumExperienceInputText() {
        return getNumExperienceField().getAttribute("value");
    }

    public static WebElement getSocialMediaField() {
        String xpath = "//*[@id=\"wpcf7-f1890-o2\"]/form/div[7]/input";
        return WebFinder.getByXpath(xpath, false);
    }

    public static boolean socialMediaFieldISDisplayed() {
        return getSocialMediaField().isDisplayed();
    }

    public static void inputOnSocialMediaField() {
        getSocialMediaField().sendKeys(testDataWeb.getSpecialistSocialMedia());
    }

    public static String getSocialMediaInputText() {
        return getSocialMediaField().getAttribute("value");
    }

    public static WebElement getSubmitButton() {
        String xpath = "//*[@id=\"wpcf7-f1890-o2\"]/form/input";
        return WebFinder.getByXpath(xpath, true);
    }

    public static boolean submitButtonISDisplayed() {
        return getSubmitButton().isDisplayed();
    }

    public static void clickOnSubmitButton() {
        getSubmitButton().click();
    }

    public static WebElement getSuccessMessage() {
        String xpath = "//*[@id=\"wpcf7-f1890-o2\"]/form/div[8]";
        return WebFinder.getByXpath(xpath, false);
    }

    public static boolean successMessageISDisplayed() {
        return getSuccessMessage().isDisplayed();
    }

    public static String getSuccessMessageText() {
        return getSuccessMessage().getText();
    }
}