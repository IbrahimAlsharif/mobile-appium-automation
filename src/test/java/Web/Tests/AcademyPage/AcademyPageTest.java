package Web.Tests.AcademyPage;

import org.testng.Assert;
import org.testng.annotations.Test;

import static Base.WebSetup.WebSetupTest.testDataWeb;

public class AcademyPageTest {

    private String testCaseId;
    @Test(priority = 1)
    public void mainNavbarButtonIsDisplayed() {
        testCaseId="C10126";
        Assert.assertTrue(AcademyPage.NavbarButtonIsDisplayed());
    }

    @Test(priority = 2)
    public void academyNavbarButtonIsDisplayed() {
        testCaseId="C10129";
        AcademyPage.clickOnNavbarButton();
        Assert.assertTrue(AcademyPage.AcademyNavbarButtonIsDisplayed());
    }

    @Test(priority = 3)
    public void academyNavbarButtonIsClickable() {
        testCaseId="C10132";
        AcademyPage.clickOnAcademyNavbarButton();
        Assert.assertTrue(AcademyPage.BrowseCoursesTextIsDisplayed());
    }

    @Test(priority = 5)
    public void psychologicalSideDivIsDisplayed() {
        testCaseId="C10283";
        Assert.assertTrue(AcademyPage.PsychologicalSideDivIsDisplayed());
    }

    @Test(priority = 5)
    public void psychologicalSideTextIsCorrect() {
        testCaseId="C10149";
        Assert.assertEquals(AcademyPage.getPsychologicalSideText(), testDataWeb.getPsychologicalSideText());
    }

    @Test(priority = 5)
    public void socialSideDivIsDisplayed() {
        testCaseId="C10150";
        Assert.assertTrue(AcademyPage.SocialSideDivIsDisplayed());
    }

    @Test(priority = 5)
    public void socialSideTextIsCorrect() {
        testCaseId="C10151";
        Assert.assertEquals(AcademyPage.getSocialSideText(), testDataWeb.getSocialSideText());
    }

    @Test(priority = 5)
    public void educationalSideDivIsDisplayed() {
        testCaseId="C10153";
        Assert.assertTrue(AcademyPage.EducationalSideDivIsDisplayed());
    }

    @Test(priority = 5)
    public void educationalSideTextIsCorrect() {
        testCaseId="C10155";
        Assert.assertEquals(AcademyPage.getEducationalSideText(), testDataWeb.getEducationalSideText());
    }

    @Test(priority = 5)
    public void practitionersDivIsDisplayed() {
        testCaseId="C10156";
        Assert.assertTrue(AcademyPage.PractitionersDivIsDisplayed());
    }

    @Test(priority = 5)
    public void practitionersTextIsCorrect() {
        testCaseId="C10284";
        Assert.assertEquals(AcademyPage.getPractitionersText(), testDataWeb.getPractitionersText());
    }

    @Test(priority = 6)
    public void registerNowTextIsDisplayed() {
        testCaseId="C10157";
        Assert.assertTrue(AcademyPage.RegisterNowTextIsDisplayed());
    }

    @Test(priority = 7)
    public void professionalTrainersDivIsDisplayed() {
        testCaseId="C10158";
        Assert.assertTrue(AcademyPage.ProfessionalTrainersDivIsDisplayed());
    }
    @Test(priority = 7)
    public void professionalTrainersTextIsCorrect() {
        testCaseId="C10159";
        Assert.assertEquals(AcademyPage.getProfessionalTrainersText(), testDataWeb.getProfessionalTrainersText());
    }
    @Test(priority = 7)
    public void professionalCoursesDivIsDisplayed() {
        testCaseId="C10160";
        Assert.assertTrue(AcademyPage.ProfessionalCoursesDivIsDisplayed());
    }
    @Test(priority = 7)
    public void professionalCoursesTextIsCorrect() {
        testCaseId="C10161";
        Assert.assertEquals(AcademyPage.getProfessionalCourses(), testDataWeb.getProfessionalCoursesText());
    }
    @Test(priority = 7)
    public void UnlimitedViewingDivIsDisplayed() {
        testCaseId="C10162";
        Assert.assertTrue(AcademyPage.UnlimitedViewingDivIsDisplayed());
    }

    @Test(priority = 7)
    public void unlimitedViewingTextIsCorrect() {
        testCaseId="C10163";
        Assert.assertEquals(AcademyPage.getUnlimitedViewing(), testDataWeb.getUnlimitedViewingText());
    }
    @Test(priority = 8)
    public void TrainersTextIsDisplayed() {
        testCaseId="C10164";
        Assert.assertTrue(AcademyPage.TrainersTextIsDisplayed());
    }
    @Test(priority = 7)
    public void trainersTextIsCorrect() {
        testCaseId="C10165";
        Assert.assertEquals(AcademyPage.getTrainerText(), testDataWeb.getTrainerText());
    }
    @Test(priority = 9)
    public void OfficialAgenciesTextIsDisplayed() {
        testCaseId="C10168";
        Assert.assertTrue(AcademyPage.OfficialAgenciesTextIsDisplayed());
    }

    @Test(priority = 10)
    public void academyImageIsDisplayed() {
        testCaseId="C10172";
        Assert.assertTrue(AcademyPage.academyImageIsDisplayed());
    }

    @Test(priority = 10)
    public void BrowseCoursesButtonIsDisplayed() {
        testCaseId="C10174";
        Assert.assertTrue(AcademyPage.BrowseCoursesButtonIsDisplayed());
    }

    @Test(priority = 11)
    public void browseButtonIsClickable() {
        testCaseId="C10177";
        AcademyPage.clickOnBrowseCoursesButton();
        Assert.assertTrue(AcademyPage.CoursesTextIsDisplayed());
    }
}
