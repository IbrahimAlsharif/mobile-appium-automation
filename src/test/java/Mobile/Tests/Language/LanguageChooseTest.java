package Mobile.Tests.Language;

import Base.MobileSetup.MobileFinder;
import Mobile.Tests.HomePage.HomePage;
import static org.testng.Assert.*;

import TestRail.APIException;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.io.IOException;

import  static Base.MobileSetup.MobileSetupTest.testDataMobile;


public class LanguageChooseTest {
    private String testCaseId;

    @Test(priority = 1)
    public void welcomeLabelIsDisplayed(){
    testCaseId="10270";
    assertTrue(LanguageChoose.welcomeTextIsDisplayed());
}
    @Test(priority = 2)
    public void welcomeLabelTextIsCorrect(){
    testCaseId="10275";
    assertEquals(LanguageChoose.getWelcomeLabelText(),"Welcome to your safe space");
}
    @Test(priority = 3)
    public void mainImageIsDisplayed(){
    testCaseId="10285";
    assertTrue(LanguageChoose.mainImageIsDisplayed());
}

    @Test(priority = 4)
    public void welcomeDescriptionIsDisplayed(){
        testCaseId="10286";
        assertTrue(LanguageChoose.welcomeDescriptionIsDisplayed());
    }
    @Test(priority = 5)
    public void VerifyThatTheUserAbleSelectArabicLanguage(){
        testCaseId="10287";
        LanguageChoose.ClickOnSelectArabicText();
        assertEquals(LanguageChoose.getChooseButtonText(),testDataMobile.getChooseButtonText());
    }
    @Test(priority = 6)
    public void VerifyThatTheUserAbleClickChooseButton(){
        testCaseId="10288";
        LanguageChoose.ClickOnChooseButton();
        assertTrue(LanguageChoose.IgnoreButtonIsDisplayed());
    }
    @Test(priority = 7)
    public void VerifyThatTheUserAbleClickIgnoreButton(){
        testCaseId="10289";
        LanguageChoose.ClickOnIgnoreButton();
        assertTrue(HomePage.welcomeMessageIsDisplayed());
    }

    @AfterMethod
    public void reportResult(ITestResult result) throws APIException, IOException {
        MobileFinder.afterMethod(result,testCaseId);
        System.out.println("After method" + result.getMethod().getMethodName());
    }
}
