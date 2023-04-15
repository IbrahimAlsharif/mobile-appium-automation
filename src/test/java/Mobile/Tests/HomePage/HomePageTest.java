package Mobile.Tests.HomePage;
import static Base.MobileSetup.MobileSetupTest.clientMobileFinder;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

public class HomePageTest {

    private String testCaseId;
    @Test(priority =1)
    public void verifyThatTapHomeButtonNavigateHomePage() throws InterruptedException {
        String accessibility = "الرئيسية\n" +
                "علامة التبويب 1 من 5";

        clientMobileFinder.getByAccessibilityId(accessibility,true).click();
        assertTrue(HomePage.NotificationIconIsDisplayed());
    }

    @Test(priority = 2)
    public void NotificationIconIsDisplayed(){
        testCaseId="0";
        assertTrue(HomePage.NotificationIconIsDisplayed());
    }
    @Test(priority = 2)
    public void FamcareLogoIsDisplayed(){
        testCaseId="0";
        assertTrue(HomePage.FamcareLogoIsDisplayed());
    }
    @Test(priority = 2)
    public void IconCartIsDisplayed(){
        testCaseId="0";
        assertTrue(HomePage.CartIconIsDisplayed());
    }
    @Test(priority = 2)
    public void IconJalulaIsDisplayed(){
        testCaseId="0";
        assertTrue(HomePage.JalulaIconIsDisplayed());
    }
    @Test(priority = 2)
    public void MessageWelcomeIsDisplayed(){
        testCaseId="0";
        assertTrue(HomePage.welcomeMessageIsDisplayed());
    }
    @Test(priority = 2)
    public void ButtonFeelingIsDisplayed(){
        testCaseId="0";
        assertTrue(HomePage.FeelingButtonIsDisplayed());
    }
    @Test(priority =2)
    public void SliderAdsIsDisplayed(){
        testCaseId="0";
        assertTrue(HomePage.SliderAdsIsDisplayed());
    }
    @Test(priority = 2)
    public void TitleTypesOfSpecialistsIsDisplayed(){
        testCaseId="0";
        assertTrue(HomePage.TypesOfSpecialistsTitleIsDisplayed());
    }
    @Test(priority = 2)
    public void PsychologistIsDisplayed(){
        testCaseId="0";
        assertTrue(HomePage.PsychologistIsDisplayed());
    }
    @Test(priority = 2)
    public void SocialWorkerIsDisplayed(){
        testCaseId="0";
        assertTrue(HomePage.SocialWorkerIsDisplayed());
    }
    @Test(priority = 2)
    public void EducationalSpecialIsDisplayed(){
        testCaseId="0";
        assertTrue(HomePage.EducationalSpecialistIsDisplayed());
    }
    @Test(priority =2)
    public void PsychologistDoctorIsDisplayed(){
        testCaseId="0";
        assertTrue(HomePage.PsychologistDoctorIsDisplayed());
    }
    @Test(priority = 2)
    public void SupportGroupsIsDisplayed(){
        testCaseId="0";
        assertTrue(HomePage.SupportGroupsIsDisplayed());
    }
    @Test(priority = 2)
    public void intercomIconIsDisplayed(){
        testCaseId="0";
        assertTrue(HomePage.intercomIconIsDisplayed());
    }




}
