package Mobile.Tests.HomePage;

import static Base.MobileSetup.MobileSetupTest.androidDriver;
import static org.testng.Assert.*;

import Base.MobileSetup.MobileFinder;
import Mobile.Tests.AllSpecialists.Psychologist;
import Mobile.Tests.SupportGroup.SupportGroups;
import TestRail.APIException;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class HomePageTest {
    private String testCaseId;
    @Test(priority =1)
    public void verifyThatTapHomeButtonNavigateHomePage() throws InterruptedException {
        testCaseId="2693";
        String accessibility = "الرئيسية\n" +
                "علامة التبويب 1 من 5";

        MobileFinder.getByAccessibilityId(accessibility,true).click();
        assertTrue(HomePage.NotificationIconIsDisplayed());
    }

    @Test(priority = 2)
    public void NotificationIconIsDisplayed(){
        testCaseId="3434";
        assertTrue(HomePage.NotificationIconIsDisplayed());
    }
    @Test(priority = 2)
    public void FamcareLogoIsDisplayed(){
        testCaseId="2684";
        assertTrue(HomePage.FamcareLogoIsDisplayed());
    }
    @Test(priority = 2)
    public void PackagesIconIsDisplayed(){
        testCaseId="2687";
        assertTrue(HomePage.CartIconIsDisplayed());
    }
    @Test(priority = 2)
    public void QuestionMarkIconIsDisplayed(){
        testCaseId="2685";
        assertTrue(HomePage.JalulaIconIsDisplayed());
    }
    @Test(priority = 2)
    public void MessageWelcomeIsDisplayed(){
        testCaseId="2689";
        assertTrue(HomePage.welcomeMessageIsDisplayed());
    }
    @Test(priority = 2)
    public void FeelingButtonIsDisplayed(){
        testCaseId="10305";
        assertTrue(HomePage.FeelingButtonIsDisplayed());
    }
    @Test(priority =2)
    public void SliderAdsIsDisplayed(){
        testCaseId="10311";
        assertTrue(HomePage.SliderAdsIsDisplayed());
    }
    @Test(priority = 2)
    public void TitleTypesOfSpecialistsIsDisplayed(){
        testCaseId="3632";
        assertTrue(HomePage.TypesOfSpecialistsTitleIsDisplayed());
    }
    @Test(priority = 2)
    public void PsychologistSpecialistButtonIsDisplayed(){
        testCaseId="5215";
        assertTrue(HomePage.PsychologistIsDisplayed());
    }
    @Test(priority = 2)
    public void SocialSpecialistButtonIsDisplayed(){
        testCaseId="2698";
        assertTrue(HomePage.SocialWorkerIsDisplayed());
    }
    @Test(priority = 2)
    public void EducationalSpecialIsDisplayed(){
        testCaseId="5217";
        assertTrue(HomePage.EducationalSpecialistIsDisplayed());
    }
    @Test(priority =2)
    public void PsychologistDoctorButtonIsDisplayed(){
        testCaseId="5216";
        assertTrue(HomePage.PsychologistDoctorIsDisplayed());
    }
    @Test(priority = 2)
    public void SupportGroupsIsDisplayed(){
        testCaseId="4414";
        assertTrue(HomePage.SupportGroupsIsDisplayed());
    }
    @Test(priority = 2)
    public void intercomIconIsDisplayed(){
        testCaseId="3833";
        assertTrue(HomePage.intercomIconIsDisplayed());
    }

    @AfterMethod
    public void screenShot(ITestResult result) throws APIException, IOException {
        MobileFinder.afterMethod(result,testCaseId);
        System.out.println("After method" + result.getMethod().getMethodName());
    }


}
