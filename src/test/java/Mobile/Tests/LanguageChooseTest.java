package Mobile.Tests;

import Mobile.Tests.HomePage.HomePagePOM;
import org.testng.Assert;
import org.testng.annotations.Test;
import  static Base.SetupTest.testData;


public class LanguageChooseTest {
    private String testCaseId;

    @Test(priority = 1)
    public void welcomeLabelIsDisplayed(){
    testCaseId="0";
    Assert.assertTrue(LanguageChoosePOM.welcomeTextIsDisplayed());
}
    @Test(priority = 1)
    public void welcomeLabelTextIsCorrect(){
    testCaseId="0";
    Assert.assertEquals(LanguageChoosePOM.getWelcomeLabelText(),"Welcome to your safe space");
}
    @Test(priority = 1)
    public void mainImageIsDisplayed(){
    testCaseId="0";
    Assert.assertTrue(LanguageChoosePOM.mainImageIsDisplayed());
}

    @Test(priority = 1)
    public void welcomeDescriptionIsDisplayed(){
        testCaseId="0";
        Assert.assertTrue(LanguageChoosePOM.welcomeDescriptionIsDisplayed());
    }
    @Test(priority = 2)
    public void VerifyThatTheUserAbleSelectArabicLanguage(){
        testCaseId="0";
        LanguageChoosePOM.ClickOnSelectArabicText();
        Assert.assertEquals(LanguageChoosePOM.getChooseButtonText(),testData.getChooseButtonText());
    }
    @Test(priority = 3)
    public void VerifyThatTheUserAbleClickChooseButton(){
        testCaseId="0";
        LanguageChoosePOM.ClickOnChooseButton();
        Assert.assertTrue(LanguageChoosePOM.IgnoreButtonIsDisplayed());
    }
    @Test(priority = 4)
    public void VerifyThatTheUserAbleClickIgnoreButton(){
        testCaseId="0";
        LanguageChoosePOM.ClickOnIgnoreButton();
        Assert.assertTrue(HomePagePOM.welcomeMessageIsDisplayed());
    }




//    @AfterMethod
//    public void screenShot(ITestResult result) throws APIException, IOException {
//        //Utilities.afterMethod(result,testCaseId);
//        System.out.println("After method" + result.getMethod().getMethodName());
//    }
}
