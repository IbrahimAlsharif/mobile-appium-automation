package Web.Tests.Navbar;

import Base.WebSetup.WebFinder;
import org.openqa.selenium.WebElement;

public class Navbar {
    public static WebElement getNavbarButton() {
        String xpath = "//button[@data-target='#navbarContent']";
        return WebFinder.getByXpath(xpath, true);
    }

    public static boolean navbarButtonIsDisplayed() {
        return getNavbarButton().isDisplayed();
    }

    public static void clickOnNavbarButton() {
        getNavbarButton().click();
    }

    public static WebElement getAcademyNavbarButton() {
        String xpath = "//*[@id=\"menu-item-1227\"]/a";
        return WebFinder.getByXpath(xpath, true);
    }

    public static boolean academyNavbarButtonIsDisplayed() {
        return getAcademyNavbarButton().isDisplayed();
    }

    public static void clickOnAcademyNavbarButton() {
        getAcademyNavbarButton().click();
    }

    public static WebElement getJoinAsSpecialistButton() {
        String xpath = "//*[@id=\"navbarContent\"]/button";
        return WebFinder.getByXpath(xpath, true);
    }

    public static boolean joinAsSpecialistButtonIsDisplayed() {
        return getJoinAsSpecialistButton().isDisplayed();
    }

    public static void clickOnJoinAsSpecialistButton() {
        getJoinAsSpecialistButton().click();
    }
}
