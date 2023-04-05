package Mobile.Tests.LanguageChoose;

import Mobile.Tests.HomePage.HomePagePOM;
import Mobile.Tests.LanguageChoose.LanguageChoose;
import org.testng.Assert;
import org.testng.annotations.Test;
import  static Base.SetupTest.testDataMobile;


public class LanguageChooseTest {
    private String testCaseId;

    @Test(priority = 1)
    public void welcomeLabelIsDisplayed(){
    testCaseId="0";
    Assert.assertTrue(LanguageChoose.welcomeTextIsDisplayed());
}
    @Test(priority = 1)
    public void welcomeLabelTextIsCorrect(){
    testCaseId="0";
    Assert.assertEquals(LanguageChoose.getWelcomeLabelText(),"Welcome to your safe space");
}
    @Test(priority = 1)
    public void mainImageIsDisplayed(){
    testCaseId="0";
    Assert.assertTrue(LanguageChoose.mainImageIsDisplayed());
}

    @Test(priority = 1)
    public void welcomeDescriptionIsDisplayed(){
        testCaseId="0";
        Assert.assertTrue(LanguageChoose.welcomeDescriptionIsDisplayed());
    }
    @Test(priority = 2)
    public void VerifyThatTheUserAbleSelectArabicLanguage(){
        testCaseId="0";
        LanguageChoose.ClickOnSelectArabicText();
        Assert.assertEquals(LanguageChoose.getChooseButtonText(),testDataMobile.getChooseButtonText());
    }
    @Test(priority = 3)
    public void VerifyThatTheUserAbleClickChooseButton(){
        testCaseId="0";
        LanguageChoose.ClickOnChooseButton();
        Assert.assertTrue(LanguageChoose.IgnoreButtonIsDisplayed());
    }
    @Test(priority = 4)
    public void VerifyThatTheUserAbleClickIgnoreButton(){
        testCaseId="0";
        LanguageChoose.ClickOnIgnoreButton();
        Assert.assertTrue(HomePagePOM.welcomeMessageIsDisplayed());
    }




//    @AfterMethod
//    public void screenShot(ITestResult result) throws APIException, IOException {
//        //Utilities.afterMethod(result,testCaseId);
//        System.out.println("After method" + result.getMethod().getMethodName());
//    }
}
