package MobileTests.HomePage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest {
    private String testCaseId;

    @Test(priority = 1)
    public void NotificationIconIsDisplayed(){
        testCaseId="0";
        Assert.assertTrue(HomePagePOM.NotificationIconIsDisplayed());
    }
    @Test(priority = 1)
    public void FamcareLogoIsDisplayed(){
        testCaseId="0";
        Assert.assertTrue(HomePagePOM.FamcareLogoIsDisplayed());
    }
    @Test(priority = 1)
    public void IconCartIsDisplayed(){
        testCaseId="0";
        Assert.assertTrue(HomePagePOM.CartIconIsDisplayed());
    }
    @Test(priority = 1)
    public void IconJalulaIsDisplayed(){
        testCaseId="0";
        Assert.assertTrue(HomePagePOM.JalulaIconIsDisplayed());
    }
    @Test(priority = 1)
    public void MessageWelcomeIsDisplayed(){
        testCaseId="0";
        Assert.assertTrue(HomePagePOM.welcomeMessageIsDisplayed());
    }
    @Test(priority = 1)
    public void ButtonFeelingIsDisplayed(){
        testCaseId="0";
        Assert.assertTrue(HomePagePOM.FeelingButtonIsDisplayed());
    }
    @Test(priority = 1)
    public void SliderAdsIsDisplayed(){
        testCaseId="0";
        Assert.assertTrue(HomePagePOM.SliderAdsIsDisplayed());
    }
    @Test(priority = 1)
    public void TitleTypesOfSpecialistsIsDisplayed(){
        testCaseId="0";
        Assert.assertTrue(HomePagePOM.TypesOfSpecialistsTitleIsDisplayed());
    }
    @Test(priority = 1)
    public void PsychologistIsDisplayed(){
        testCaseId="0";
        Assert.assertTrue(HomePagePOM.PsychologistIsDisplayed());
    }
    @Test(priority = 1)
    public void SocialWorkerIsDisplayed(){
        testCaseId="0";
        Assert.assertTrue(HomePagePOM.SocialWorkerIsDisplayed());
    }
    @Test(priority = 1)
    public void EducationalSpecialIsDisplayed(){
        testCaseId="0";
        Assert.assertTrue(HomePagePOM.EducationalSpecialistIsDisplayed());
    }
    @Test(priority = 1)
    public void PsychologistDoctorIsDisplayed(){
        testCaseId="0";
        Assert.assertTrue(HomePagePOM.PsychologistDoctorIsDisplayed());
    }
    @Test(priority = 1)
    public void SupportGroupsIsDisplayed(){
        testCaseId="0";
        Assert.assertTrue(HomePagePOM.SupportGroupsIsDisplayed());
    }
    @Test(priority = 1)
    public void intercomIconIsDisplayed(){
        testCaseId="0";
        Assert.assertTrue(HomePagePOM.intercomIconIsDisplayed());
    }




}
