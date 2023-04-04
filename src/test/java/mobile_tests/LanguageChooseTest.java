package mobile_tests;

import io.appium.java_client.MobileElement;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import testrail.APIException;
import java.io.IOException;


public class LanguageChooseTest {
    String testCaseId="";
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



    @AfterMethod
    public void screenShot(ITestResult result) throws APIException, IOException {
        //Utilities.afterMethod(result,testCaseId);
        System.out.println("After method" + result.getMethod().getMethodName());
    }
}
