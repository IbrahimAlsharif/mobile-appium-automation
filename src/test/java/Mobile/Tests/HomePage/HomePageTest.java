package Mobile.Tests.HomePage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest {
    private String testCaseId;

    @Test(priority = 1)
    public void NotificationIconIsDisplayed(){
        testCaseId="0";
        Assert.assertTrue(HomePage.NotificationIconIsDisplayed());
    }
    @Test(priority = 1)
    public void FamcareLogoIsDisplayed(){
        testCaseId="0";
        Assert.assertTrue(HomePage.FamcareLogoIsDisplayed());
    }
    @Test(priority = 1)
    public void IconCartIsDisplayed(){
        testCaseId="0";
        Assert.assertTrue(HomePage.CartIconIsDisplayed());
    }
    @Test(priority = 1)
    public void IconJalulaIsDisplayed(){
        testCaseId="0";
        Assert.assertTrue(HomePage.JalulaIconIsDisplayed());
    }
    @Test(priority = 1)
    public void MessageWelcomeIsDisplayed(){
        testCaseId="0";
        Assert.assertTrue(HomePage.welcomeMessageIsDisplayed());
    }
    @Test(priority = 1)
    public void ButtonFeelingIsDisplayed(){
        testCaseId="0";
        Assert.assertTrue(HomePage.FeelingButtonIsDisplayed());
    }
    @Test(priority = 1)
    public void SliderAdsIsDisplayed(){
        testCaseId="0";
        Assert.assertTrue(HomePage.SliderAdsIsDisplayed());
    }
    @Test(priority = 1)
    public void TitleTypesOfSpecialistsIsDisplayed(){
        testCaseId="0";
        Assert.assertTrue(HomePage.TypesOfSpecialistsTitleIsDisplayed());
    }
    @Test(priority = 1)
    public void PsychologistIsDisplayed(){
        testCaseId="0";
        Assert.assertTrue(HomePage.PsychologistIsDisplayed());
    }
    @Test(priority = 1)
    public void SocialWorkerIsDisplayed(){
        testCaseId="0";
        Assert.assertTrue(HomePage.SocialWorkerIsDisplayed());
    }
    @Test(priority = 1)
    public void EducationalSpecialIsDisplayed(){
        testCaseId="0";
        Assert.assertTrue(HomePage.EducationalSpecialistIsDisplayed());
    }
    @Test(priority = 1)
    public void PsychologistDoctorIsDisplayed(){
        testCaseId="0";
        Assert.assertTrue(HomePage.PsychologistDoctorIsDisplayed());
    }
    @Test(priority = 1)
    public void SupportGroupsIsDisplayed(){
        testCaseId="0";
        Assert.assertTrue(HomePage.SupportGroupsIsDisplayed());
    }
    @Test(priority = 1)
    public void intercomIconIsDisplayed(){
        testCaseId="0";
        Assert.assertTrue(HomePage.intercomIconIsDisplayed());
    }




}
