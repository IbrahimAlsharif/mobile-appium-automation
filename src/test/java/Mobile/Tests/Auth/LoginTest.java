package Mobile.Tests.Auth;

import Base.MobileSetup.MobileFinder;
import Base.MobileSetup.MobileSetupTest;
import Mobile.Tests.MorePage.MorePage;
import Mobile.Tests.MorePage.MorePageTest;
import TestRail.APIException;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.testng.Assert.*;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.Assert;

import java.io.IOException;

import static Base.MobileSetup.MobileSetupTest.testDataMobile;
import static org.testng.AssertJUnit.assertTrue;

public class LoginTest {
    private String testCaseId;
    MorePageTest morePageTest =new MorePageTest();
    @Test(priority =1)

    public void verifyThatTapMoreButtonNavigateToMorePage()  {
        testCaseId="10290";
    morePageTest.verifyThatTapMoreButtonNavigateToMorePage();
    }
    @Test(priority = 2)
    public void SignInButtonIsDisplayed(){
        testCaseId="10296";
        morePageTest.SignInButtonIsDisplayed();
    }
    @Test(priority = 3)
    public void NavigateToSignInPage(){
        testCaseId="4401" ;
        MorePage.ClickOnSignInButton();
        assertTrue(Login.LogInByPhoneButtonIsDisplayed());
    }
    @Test(priority = 4)
    public void logInByPhoneButtonIsDisplayed(){
        testCaseId="2605";
      assertTrue(Login.LogInByPhoneButtonIsDisplayed());
    }
    @Test(priority = 5)
    public void NavigateToFormLogInByPhone(){
        testCaseId="10186";
        Login.ClickOnLogInByPhoneButton();
        assertTrue(Login.LogInTitleIsDisplayed());
    }
    @Test(priority =6)
    public void inputOnPhoneField() throws InterruptedException {
        testCaseId="2928";
        Login.ClickOnPhoneField();
        Thread.sleep(4000);
        Login.InputOnPhoneField(testDataMobile.getPhoneNumberOnLoginPage());
        Assert.assertEquals(Login.getPhoneField().getText(), testDataMobile.getPhoneNumberOnLoginPage());
    }
    @Test(priority =7)
    public void inputOnPasswordField()  {
        testCaseId="2929";
       Login.ClickOnPasswordField();
        Login.InputOnPasswordField(testDataMobile.getPasswordOnLoginPage());
       Assert.assertEquals(Login.getPasswordField().getText(),testDataMobile.getPasswordEncryption());
    }
    @Test(priority =8)
    public void ClickOnLoginButtonNavigteToMorePage() {
        testCaseId="2930";
        Login.ClickOnLogInButton();
       // assertTrue(Login.welcomeMessageIsDisplayed());
        assertTrue(Login.UserNameIsDisplayed());
    }
    @AfterMethod
    public void screenShot(ITestResult result) throws APIException, IOException {
        MobileFinder.afterMethod(result,testCaseId);
        System.out.println("After method" + result.getMethod().getMethodName());
    }


}
