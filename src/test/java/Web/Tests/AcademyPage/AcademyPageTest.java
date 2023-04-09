package Web.Tests.AcademyPage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AcademyPageTest {


    @Test(priority = 1)
    public void navbarbuttonDisplayed() {
        Assert.assertTrue(AcademyPage.NavbarButtonIsDisplayed());
    }

    @Test(priority = 2)
    public void academyNavbarbuttonDisplayed() {
        AcademyPage.clickOnNavbarButton();
        Assert.assertTrue(AcademyPage.AcademyNavbarButtonIsDisplayed());
    }

    @Test(priority = 3)
    public void academyNavbarbuttonisClickable() {
        AcademyPage.clickOnAcademyNavbarButton();
        Assert.assertTrue(AcademyPage.BrowseCoursesTextIsDisplayed());
    }

    @Test(priority = 5)
    public void psychologicalSideDivIsDisplayed() {
        Assert.assertTrue(AcademyPage.PsychologicalSideDivIsDisplayed());
    }

    @Test(priority = 5)
    public void socialSideDivIsDisplayed() {
        Assert.assertTrue(AcademyPage.SocialSideDivIsDisplayed());
    }

    @Test(priority = 5)
    public void educationalSideDivIsDisplayed() {
        Assert.assertTrue(AcademyPage.EducationalSideDivIsDisplayed());
    }

    @Test(priority = 5)
    public void practitionersDivIsDisplayed() {
        Assert.assertTrue(AcademyPage.PractitionersDivIsDisplayed());
    }

    @Test(priority = 6)
    public void registerNowTextIsDisplayed() {
        Assert.assertTrue(AcademyPage.RegisterNowTextIsDisplayed());
    }

    @Test(priority = 7)
    public void professionalTrainersDivIsDisplayed() {
        Assert.assertTrue(AcademyPage.ProfessionalTrainersDivIsDisplayed());
    }

    @Test(priority = 7)
    public void professionalCoursesDivIsDisplayed() {
        Assert.assertTrue(AcademyPage.ProfessionalCoursesDivIsDisplayed());
    }

    @Test(priority = 7)
    public void UnlimitedViewingDivIsDisplayed() {
        Assert.assertTrue(AcademyPage.UnlimitedViewingDivIsDisplayed());
    }

    @Test(priority = 8)
    public void TrainersTextIsDisplayed() {
        Assert.assertTrue(AcademyPage.TrainersTextIsDisplayed());
    }
    @Test(priority = 9)
    public void OfficialAgenciesTextIsDisplayed() {
        Assert.assertTrue(AcademyPage.OfficialAgenciesTextIsDisplayed());
    }
    @Test(priority = 10)
    public void BrowseCoursesButtonIsDisplayed() {
        Assert.assertTrue(AcademyPage.BrowseCoursesButtonIsDisplayed());
    }
    @Test(priority = 11)
    public void browseButtonIsClickable() {
        AcademyPage.clickOnBrowseCoursesButton();
        Assert.assertTrue(AcademyPage.CoursesTextIsDisplayed());
    }
}
