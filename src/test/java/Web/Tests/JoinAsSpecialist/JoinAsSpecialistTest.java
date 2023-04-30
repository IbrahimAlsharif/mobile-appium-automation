package Web.Tests.JoinAsSpecialist;

//import Base.WebSetup.WebFinder;
//import TestRail.APIException;
import Web.Tests.Navbar.Navbar;
import org.testng.Assert;
//import org.testng.ITestResult;
//import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

//import java.io.IOException;

import static Base.WebSetup.WebSetupTest.testDataWeb;

public class JoinAsSpecialistTest {
    private String testCaseId;
    @Test(priority = 1)
    public void navbarButtonDisplayed() {
        testCaseId="10126";
        Assert.assertTrue(Navbar.navbarButtonIsDisplayed());
    }

    @Test(priority = 2)
    public void clickOnNavbarButton() {
        testCaseId="10323";
        Navbar.clickOnNavbarButton();
        Assert.assertTrue(Navbar.navbarButtonIsDisplayed());
    }

    @Test(priority = 3)
    public void joinAsSpecialistButtonDisplayed() {
        testCaseId="10303";
        Assert.assertTrue(Navbar.joinAsSpecialistButtonIsDisplayed());
    }

    @Test(priority = 4)
    public void openSpecialistForm() {
        testCaseId="10304";
        Navbar.clickOnJoinAsSpecialistButton();
        Assert.assertEquals(JoinAsSpecialist.joinAsSpecialistTitleText(), testDataWeb.getJoinAsSpecialistTitleText());
    }

    @Test(priority = 5)
    public void nameFieldISDisplayed() {
        testCaseId="10306";
        Assert.assertTrue(JoinAsSpecialist.nameFieldISDisplayed());
    }

    @Test(priority = 5)
    public void mobileFieldISDisplayed() {
        testCaseId="10307";
        Assert.assertTrue(JoinAsSpecialist.mobileFieldISDisplayed());
    }

    @Test(priority = 5)
    public void degreeFieldISDisplayed() {
        testCaseId="10308";
        Assert.assertTrue(JoinAsSpecialist.degreeFieldISDisplayed());
    }

    @Test(priority = 5)
    public void specializationFieldISDisplayed() {
        testCaseId="10309";
        Assert.assertTrue(JoinAsSpecialist.specializationFieldISDisplayed());
    }

    @Test(priority = 5)
    public void numExperienceFieldISDisplayed() {
        testCaseId="10310";
        Assert.assertTrue(JoinAsSpecialist.numExperienceFieldISDisplayed());
    }

    @Test(priority = 5)
    public void socialMediaFieldISDisplayed() {
        testCaseId="10312";
        Assert.assertTrue(JoinAsSpecialist.socialMediaFieldISDisplayed());
    }

    @Test(priority = 5)
    public void submitButtonISDisplayed() {
        testCaseId="10313";
        Assert.assertTrue(JoinAsSpecialist.submitButtonISDisplayed());
    }

    @Test(priority = 6)
    public void inputOnNameField() {
        testCaseId="10314";
        JoinAsSpecialist.inputOnNameField();
        Assert.assertEquals(JoinAsSpecialist.getNameInputText(), testDataWeb.getSpecialistName());
    }

    @Test(priority = 7)
    public void inputOnMobileField() {
        testCaseId="10315";
        JoinAsSpecialist.inputOnMobileField();
        Assert.assertEquals(JoinAsSpecialist.getMobileInputText(), testDataWeb.getSpecialistMobile());
    }

    @Test(priority = 8)
    public void inputOnDegreeField() {
        testCaseId="10316";
        JoinAsSpecialist.inputOnDegreeField();
        Assert.assertEquals(JoinAsSpecialist.getDegreeInputText(), testDataWeb.getSpecialistDegree());
    }

    @Test(priority = 9)
    public void inputOnSpecializationField() {
        testCaseId="10317";
        JoinAsSpecialist.inputOnSpecializationField();
        Assert.assertEquals(JoinAsSpecialist.getSpecializationInputText(), testDataWeb.getSpecialistSpecialization());
    }

    @Test(priority = 10)
    public void inputOnNumExperienceField() {
        testCaseId="10318";
        JoinAsSpecialist.inputOnNumExperienceField();
        Assert.assertEquals(JoinAsSpecialist.getNumExperienceInputText(), testDataWeb.getSpecialistNumExperience());
    }

    @Test(priority = 11)
    public void inputOnSocialMediaField() {
        testCaseId="10319";
        JoinAsSpecialist.inputOnSocialMediaField();
        Assert.assertEquals(JoinAsSpecialist.getSocialMediaInputText(), testDataWeb.getSpecialistSocialMedia());
    }

    @Test(priority = 12)
    public void clickOnSubmitButton() {
        testCaseId="10320";
        JoinAsSpecialist.clickOnSubmitButton();
        Assert.assertEquals(JoinAsSpecialist.getSuccessMessageText(), testDataWeb.getSuccessMessageText());
    }

    @Test(priority = 13)
    public void successMessageISDisplayed() {
        testCaseId="10321";
        Assert.assertTrue(JoinAsSpecialist.successMessageISDisplayed());
    }
//    @AfterMethod
//    public void reportResult(ITestResult result) throws APIException, IOException {
//        WebFinder.afterMethod(result,testCaseId);
//    }
}