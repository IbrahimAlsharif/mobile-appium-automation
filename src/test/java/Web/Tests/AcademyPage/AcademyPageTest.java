package Web.Tests.AcademyPage;

import Base.WebSetup.WebFinder;
import TestRail.APIException;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.io.IOException;

import static Base.WebSetup.WebSetupTest.testDataWeb;

public class AcademyPageTest {

    private String testCaseId;
    @Test(priority = 1)
    public void mainNavbarButtonIsDisplayed() {
        testCaseId="10126";
        Assert.assertTrue(AcademyPage.NavbarButtonIsDisplayed());
    }

    @Test(priority = 2)
    public void academyNavbarButtonIsDisplayed() {
        testCaseId="10129";
        AcademyPage.clickOnNavbarButton();
        Assert.assertTrue(AcademyPage.AcademyNavbarButtonIsDisplayed());
    }

    @Test(priority = 3)
    public void academyNavbarButtonIsClickable() {
        testCaseId="10132";
        AcademyPage.clickOnAcademyNavbarButton();
        Assert.assertTrue(AcademyPage.BrowseCoursesTextIsDisplayed());
    }

    @Test(priority = 5)
    public void psychologicalSideDivIsDisplayed() {
        testCaseId="10283";
        Assert.assertTrue(AcademyPage.PsychologicalSideDivIsDisplayed());
    }

    @Test(priority = 5)
    public void psychologicalSideTextIsCorrect() {
        testCaseId="10149";
        Assert.assertEquals(AcademyPage.getPsychologicalSideText(), testDataWeb.getPsychologicalSideText());
    }

    @Test(priority = 5)
    public void socialSideDivIsDisplayed() {
        testCaseId="10150";
        Assert.assertTrue(AcademyPage.SocialSideDivIsDisplayed());
    }

    @Test(priority = 5)
    public void socialSideTextIsCorrect() {
        testCaseId="10151";
        Assert.assertEquals(AcademyPage.getSocialSideText(), testDataWeb.getSocialSideText());
    }

    @Test(priority = 5)
    public void educationalSideDivIsDisplayed() {
        testCaseId="10153";
        Assert.assertTrue(AcademyPage.EducationalSideDivIsDisplayed());
    }

    @Test(priority = 5)
    public void educationalSideTextIsCorrect() {
        testCaseId="10155";
        Assert.assertEquals(AcademyPage.getEducationalSideText(), testDataWeb.getEducationalSideText());
    }

    @Test(priority = 5)
    public void practitionersDivIsDisplayed() {
        testCaseId="10156";
        Assert.assertTrue(AcademyPage.PractitionersDivIsDisplayed());
    }

    @Test(priority = 5)
    public void practitionersTextIsCorrect() {
        testCaseId="10284";
        Assert.assertEquals(AcademyPage.getPractitionersText(), testDataWeb.getPractitionersText());
    }

    @Test(priority = 6)
    public void registerNowTextIsDisplayed() {
        testCaseId="10157";
        Assert.assertTrue(AcademyPage.RegisterNowTextIsDisplayed());
    }

    @Test(priority = 7)
    public void professionalTrainersDivIsDisplayed() {
        testCaseId="10158";
        Assert.assertTrue(AcademyPage.ProfessionalTrainersDivIsDisplayed());
    }
    @Test(priority = 7)
    public void professionalTrainersTextIsCorrect() {
        testCaseId="10159";
        Assert.assertEquals(AcademyPage.getProfessionalTrainersText(), testDataWeb.getProfessionalTrainersText());
    }
    @Test(priority = 7)
    public void professionalCoursesDivIsDisplayed() {
        testCaseId="10160";
        Assert.assertTrue(AcademyPage.ProfessionalCoursesDivIsDisplayed());
    }
    @Test(priority = 7)
    public void professionalCoursesTextIsCorrect() {
        testCaseId="10161";
        Assert.assertEquals(AcademyPage.getProfessionalCourses(), testDataWeb.getProfessionalCoursesText());
    }
    @Test(priority = 7)
    public void UnlimitedViewingDivIsDisplayed() {
        testCaseId="10162";
        Assert.assertTrue(AcademyPage.UnlimitedViewingDivIsDisplayed());
    }

    @Test(priority = 7)
    public void unlimitedViewingTextIsCorrect() {
        testCaseId="10163";
        Assert.assertEquals(AcademyPage.getUnlimitedViewing(), testDataWeb.getUnlimitedViewingText());
    }
    @Test(priority = 8)
    public void TrainersTextIsDisplayed() {
        testCaseId="10164";
        Assert.assertTrue(AcademyPage.TrainersTextIsDisplayed());
    }
    @Test(priority = 7)
    public void trainersTextIsCorrect() {
        testCaseId="10165";
        Assert.assertEquals(AcademyPage.getTrainerText(), testDataWeb.getTrainerText());
    }
    @Test(priority = 9)
    public void OfficialAgenciesTextIsDisplayed() {
        testCaseId="10168";
        Assert.assertTrue(AcademyPage.OfficialAgenciesTextIsDisplayed());
    }

    @Test(priority = 10)
    public void academyImageIsDisplayed() {
        testCaseId="10172";
        Assert.assertTrue(AcademyPage.academyImageIsDisplayed());
    }

    @Test(priority = 10)
    public void BrowseCoursesButtonIsDisplayed() {
        testCaseId="10174";
        Assert.assertTrue(AcademyPage.BrowseCoursesButtonIsDisplayed());
    }

    @Test(priority = 11)
    public void browseButtonIsClickable() {
        testCaseId="10177";
        AcademyPage.clickOnBrowseCoursesButton();
        Assert.assertTrue(AcademyPage.CoursesTextIsDisplayed());
    }
    @AfterMethod
    public void reportResult(ITestResult result) throws APIException, IOException {
        WebFinder.afterMethod(result,testCaseId);
    }
}
