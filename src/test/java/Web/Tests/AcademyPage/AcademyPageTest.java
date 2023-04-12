package Web.Tests.AcademyPage;

import static org.testng.Assert.*;
import org.testng.annotations.Test;

import static Base.WebSetup.WebSetupTest.testDataWeb;

public class AcademyPageTest {


    @Test(priority = 1)
    public void mainNavbarButtonIsDisplayed() {
        assertTrue(AcademyPage.NavbarButtonIsDisplayed());
    }

    @Test(priority = 2)
    public void academyNavbarButtonIsDisplayed() {
        AcademyPage.clickOnNavbarButton();
        assertTrue(AcademyPage.AcademyNavbarButtonIsDisplayed());
    }

    @Test(priority = 3)
    public void academyNavbarButtonIsClickable() {
        AcademyPage.clickOnAcademyNavbarButton();
        assertTrue(AcademyPage.BrowseCoursesTextIsDisplayed());
    }

    @Test(priority = 5)
    public void psychologicalSideDivIsDisplayed() {
        assertTrue(AcademyPage.PsychologicalSideDivIsDisplayed());
    }

    @Test(priority = 5)
    public void psychologicalSideTextIsCorrect() {
        assertEquals(AcademyPage.getPsychologicalSideText(), testDataWeb.getPsychologicalSideText());
    }

    @Test(priority = 5)
    public void socialSideDivIsDisplayed() {
        assertTrue(AcademyPage.SocialSideDivIsDisplayed());
    }

    @Test(priority = 5)
    public void socialSideTextIsCorrect() {
        assertEquals(AcademyPage.getSocialSideText(), testDataWeb.getSocialSideText());
    }

    @Test(priority = 5)
    public void educationalSideDivIsDisplayed() {
        assertTrue(AcademyPage.EducationalSideDivIsDisplayed());
    }

    @Test(priority = 5)
    public void educationalSideTextIsCorrect() {
        assertEquals(AcademyPage.getEducationalSideText(), testDataWeb.getEducationalSideText());
    }

    @Test(priority = 5)
    public void practitionersDivIsDisplayed() {
        assertTrue(AcademyPage.PractitionersDivIsDisplayed());
    }

    @Test(priority = 5)
    public void practitionersTextIsCorrect() {
        assertEquals(AcademyPage.getPractitionersText(), testDataWeb.getPractitionersText());
    }

    @Test(priority = 6)
    public void registerNowTextIsDisplayed() {
        assertTrue(AcademyPage.RegisterNowTextIsDisplayed());
    }

    @Test(priority = 7)
    public void professionalTrainersDivIsDisplayed() {
        assertTrue(AcademyPage.ProfessionalTrainersDivIsDisplayed());
    }
    @Test(priority = 7)
    public void professionalTrainersTextIsCorrect() {
        assertEquals(AcademyPage.getProfessionalTrainersText(), testDataWeb.getProfessionalTrainersText());
    }
    @Test(priority = 7)
    public void professionalCoursesDivIsDisplayed() {
        assertTrue(AcademyPage.ProfessionalCoursesDivIsDisplayed());
    }
    @Test(priority = 7)
    public void professionalCoursesTextIsCorrect() {
        assertEquals(AcademyPage.getProfessionalCourses(), testDataWeb.getProfessionalCoursesText());
    }
    @Test(priority = 7)
    public void UnlimitedViewingDivIsDisplayed() {
        assertTrue(AcademyPage.UnlimitedViewingDivIsDisplayed());
    }

    @Test(priority = 7)
    public void unlimitedViewingTextIsCorrect() {
        assertEquals(AcademyPage.getUnlimitedViewing(), testDataWeb.getUnlimitedViewingText());
    }
    @Test(priority = 8)
    public void TrainersTextIsDisplayed() {
        assertTrue(AcademyPage.TrainersTextIsDisplayed());
    }
    @Test(priority = 7)
    public void trainersTextIsCorrect() {
        assertEquals(AcademyPage.getTrainerText(), testDataWeb.getTrainerText());
    }
    @Test(priority = 9)
    public void OfficialAgenciesTextIsDisplayed() {
        assertTrue(AcademyPage.OfficialAgenciesTextIsDisplayed());
    }

    @Test(priority = 10)
    public void academyImageIsDisplayed() {
        assertTrue(AcademyPage.academyImageIsDisplayed());
    }

    @Test(priority = 10)
    public void BrowseCoursesButtonIsDisplayed() {
        assertTrue(AcademyPage.BrowseCoursesButtonIsDisplayed());
    }

    @Test(priority = 11)
    public void browseButtonIsClickable() {
        AcademyPage.clickOnBrowseCoursesButton();
        assertTrue(AcademyPage.CoursesTextIsDisplayed());
    }
}
