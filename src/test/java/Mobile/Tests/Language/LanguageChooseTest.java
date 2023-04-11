package Mobile.Tests.Language;

import Mobile.Tests.HomePage.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import  static Base.MobileSetup.MobileSetupTest.testDataMobile;


public class LanguageChooseTest {
    private String testCaseId;

    @Test(priority = 1)
    public void welcomeLabelIsDisplayed(){
    testCaseId="0";
    Assert.assertTrue(LanguageChoose.welcomeTextIsDisplayed());
}
    @Test(priority = 2)
    public void welcomeLabelTextIsCorrect(){
    testCaseId="0";
    Assert.assertEquals(LanguageChoose.getWelcomeLabelText(),"Welcome to your safe space");
}
    @Test(priority = 3)
    public void mainImageIsDisplayed(){
    testCaseId="0";
    Assert.assertTrue(LanguageChoose.mainImageIsDisplayed());
}

    @Test(priority = 4)
    public void welcomeDescriptionIsDisplayed(){
        testCaseId="0";
        Assert.assertTrue(LanguageChoose.welcomeDescriptionIsDisplayed());
    }
    @Test(priority = 5)
    public void VerifyThatTheUserAbleSelectArabicLanguage(){
        testCaseId="0";
        LanguageChoose.ClickOnSelectArabicText();
        Assert.assertEquals(LanguageChoose.getChooseButtonText(),testDataMobile.getChooseButtonText());
    }
    @Test(priority = 6)
    public void VerifyThatTheUserAbleClickChooseButton(){
        testCaseId="0";
        LanguageChoose.ClickOnChooseButton();
        Assert.assertTrue(LanguageChoose.IgnoreButtonIsDisplayed());
    }
    @Test(priority = 7)
    public void VerifyThatTheUserAbleClickIgnoreButton(){
        testCaseId="0";
        LanguageChoose.ClickOnIgnoreButton();
        Assert.assertTrue(HomePage.welcomeMessageIsDisplayed());
    }

//    @AfterMethod
//    public void screenShot(ITestResult result) throws APIException, IOException {
//        MobileFinder.afterMethod(result,testCaseId);
//        System.out.println("After method" + result.getMethod().getMethodName());
//    }
}
