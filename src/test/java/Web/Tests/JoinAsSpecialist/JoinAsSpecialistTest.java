package Web.Tests.JoinAsSpecialist;

import Web.Tests.Navbar.Navbar;
import org.testng.Assert;
import org.testng.annotations.Test;

import static Base.WebSetup.WebSetupTest.testDataWeb;

public class JoinAsSpecialistTest {
    @Test(priority = 1)
    public void navbarButtonDisplayed() {
        Assert.assertTrue(Navbar.navbarButtonIsDisplayed());
    }

    @Test(priority = 2)
    public void clickOnNavbarButton() {
        Navbar.clickOnNavbarButton();
        Assert.assertTrue(Navbar.navbarButtonIsDisplayed());
    }

    @Test(priority = 3)
    public void joinAsSpecialistButtonDisplayed() {
        Assert.assertTrue(Navbar.joinAsSpecialistButtonIsDisplayed());
    }

    @Test(priority = 4)
    public void openSpecialistForm() {
        Navbar.clickOnJoinAsSpecialistButton();
        Assert.assertEquals(JoinAsSpecialist.joinAsSpecialistTitleText(), testDataWeb.getJoinAsSpecialistTitleText());
    }

    @Test(priority = 5)
    public void nameFieldISDisplayed() {
        Assert.assertTrue(JoinAsSpecialist.nameFieldISDisplayed());
    }

    @Test(priority = 5)
    public void mobileFieldISDisplayed() {
        Assert.assertTrue(JoinAsSpecialist.mobileFieldISDisplayed());
    }

    @Test(priority = 5)
    public void degreeFieldISDisplayed() {
        Assert.assertTrue(JoinAsSpecialist.degreeFieldISDisplayed());
    }

    @Test(priority = 5)
    public void specializationFieldISDisplayed() {
        Assert.assertTrue(JoinAsSpecialist.specializationFieldISDisplayed());
    }

    @Test(priority = 5)
    public void numExperienceFieldISDisplayed() {
        Assert.assertTrue(JoinAsSpecialist.numExperienceFieldISDisplayed());
    }

    @Test(priority = 5)
    public void socialMediaFieldISDisplayed() {
        Assert.assertTrue(JoinAsSpecialist.socialMediaFieldISDisplayed());
    }

    @Test(priority = 5)
    public void submitButtonISDisplayed() {
        Assert.assertTrue(JoinAsSpecialist.submitButtonISDisplayed());
    }

    @Test(priority = 6)
    public void inputOnNameField() {
        JoinAsSpecialist.inputOnNameField();
        Assert.assertEquals(JoinAsSpecialist.getNameInputText(), testDataWeb.getSpecialistName());
    }

    @Test(priority = 7)
    public void inputOnMobileField() {
        JoinAsSpecialist.inputOnMobileField();
        Assert.assertEquals(JoinAsSpecialist.getMobileInputText(), testDataWeb.getSpecialistMobile());
    }

    @Test(priority = 8)
    public void inputOnDegreeField() {
        JoinAsSpecialist.inputOnDegreeField();
        Assert.assertEquals(JoinAsSpecialist.getDegreeInputText(), testDataWeb.getSpecialistDegree());
    }

    @Test(priority = 9)
    public void inputOnSpecializationField() {
        JoinAsSpecialist.inputOnSpecializationField();
        Assert.assertEquals(JoinAsSpecialist.getSpecializationInputText(), testDataWeb.getSpecialistSpecialization());
    }

    @Test(priority = 10)
    public void inputOnNumExperienceField() {
        JoinAsSpecialist.inputOnNumExperienceField();
        Assert.assertEquals(JoinAsSpecialist.getNumExperienceInputText(), testDataWeb.getSpecialistNumExperience());
    }

    @Test(priority = 11)
    public void inputOnSocialMediaField() {
        JoinAsSpecialist.inputOnSocialMediaField();
        Assert.assertEquals(JoinAsSpecialist.getSocialMediaInputText(), testDataWeb.getSpecialistSocialMedia());
    }

    @Test(priority = 12)
    public void clickOnSubmitButton() {
        JoinAsSpecialist.clickOnSubmitButton();
        Assert.assertEquals(JoinAsSpecialist.getSuccessMessageText(), testDataWeb.getSuccessMessageText());
    }

    @Test(priority = 13)
    public void successMessageISDisplayed() {
        Assert.assertTrue(JoinAsSpecialist.successMessageISDisplayed());
    }
}