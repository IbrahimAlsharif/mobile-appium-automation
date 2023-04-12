package Web.Tests.JoinAsSpecialist;

import Web.Tests.Navbar.Navbar;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

import static Base.WebSetup.WebSetupTest.testDataWeb;

public class JoinAsSpecialistTest {
    @Test(priority = 1)
    public void navbarButtonDisplayed() {
        assertTrue(Navbar.navbarButtonIsDisplayed());
    }

    @Test(priority = 2)
    public void clickOnNavbarButton() {
        Navbar.clickOnNavbarButton();
        assertTrue(Navbar.navbarButtonIsDisplayed());
    }

    @Test(priority = 3)
    public void joinAsSpecialistButtonDisplayed() {
        assertTrue(Navbar.joinAsSpecialistButtonIsDisplayed());
    }

    @Test(priority = 4)
    public void openSpecialistForm() {
        Navbar.clickOnJoinAsSpecialistButton();
        assertEquals(JoinAsSpecialist.joinAsSpecialistTitleText(), testDataWeb.getJoinAsSpecialistTitleText());
    }

    @Test(priority = 5)
    public void nameFieldISDisplayed() {
        assertTrue(JoinAsSpecialist.nameFieldISDisplayed());
    }

    @Test(priority = 5)
    public void mobileFieldISDisplayed() {
        assertTrue(JoinAsSpecialist.mobileFieldISDisplayed());
    }

    @Test(priority = 5)
    public void degreeFieldISDisplayed() {
        assertTrue(JoinAsSpecialist.degreeFieldISDisplayed());
    }

    @Test(priority = 5)
    public void specializationFieldISDisplayed() {
        assertTrue(JoinAsSpecialist.specializationFieldISDisplayed());
    }

    @Test(priority = 5)
    public void numExperienceFieldISDisplayed() {
        assertTrue(JoinAsSpecialist.numExperienceFieldISDisplayed());
    }

    @Test(priority = 5)
    public void socialMediaFieldISDisplayed() {
        assertTrue(JoinAsSpecialist.socialMediaFieldISDisplayed());
    }

    @Test(priority = 5)
    public void submitButtonISDisplayed() {
        assertTrue(JoinAsSpecialist.submitButtonISDisplayed());
    }

    @Test(priority = 6)
    public void inputOnNameField() {
        JoinAsSpecialist.inputOnNameField();
        assertEquals(JoinAsSpecialist.getNameInputText(), testDataWeb.getSpecialistName());
    }

    @Test(priority = 7)
    public void inputOnMobileField() {
        JoinAsSpecialist.inputOnMobileField();
        assertEquals(JoinAsSpecialist.getMobileInputText(), testDataWeb.getSpecialistMobile());
    }

    @Test(priority = 8)
    public void inputOnDegreeField() {
        JoinAsSpecialist.inputOnDegreeField();
        assertEquals(JoinAsSpecialist.getDegreeInputText(), testDataWeb.getSpecialistDegree());
    }

    @Test(priority = 9)
    public void inputOnSpecializationField() {
        JoinAsSpecialist.inputOnSpecializationField();
        assertEquals(JoinAsSpecialist.getSpecializationInputText(), testDataWeb.getSpecialistSpecialization());
    }

    @Test(priority = 10)
    public void inputOnNumExperienceField() {
        JoinAsSpecialist.inputOnNumExperienceField();
        assertEquals(JoinAsSpecialist.getNumExperienceInputText(), testDataWeb.getSpecialistNumExperience());
    }

    @Test(priority = 11)
    public void inputOnSocialMediaField() {
        JoinAsSpecialist.inputOnSocialMediaField();
        assertEquals(JoinAsSpecialist.getSocialMediaInputText(), testDataWeb.getSpecialistSocialMedia());
    }

    @Test(priority = 12)
    public void clickOnSubmitButton() {
        JoinAsSpecialist.clickOnSubmitButton();
        assertEquals(JoinAsSpecialist.getSuccessMessageText(), testDataWeb.getSuccessMessageText());
    }

    @Test(priority = 13)
    public void successMessageISDisplayed() {
        assertTrue(JoinAsSpecialist.successMessageISDisplayed());
    }
}