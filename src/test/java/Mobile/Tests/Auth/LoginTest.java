package Mobile.Tests.Auth;

import Base.MobileSetup.MobileFinder;
import Base.MobileSetup.MobileSetupTest;
import Mobile.Tests.MorePage.MorePage;
import Mobile.Tests.MorePage.MorePageTest;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.testng.Assert.*;
import org.testng.annotations.Test;
import org.testng.Assert;

import static Base.MobileSetup.MobileSetupTest.testDataMobile;
import static org.testng.AssertJUnit.assertTrue;

public class LoginTest {
    private String testCaseId;
    MorePageTest morePageTest =new MorePageTest();
    @Test(priority =1)
    public void verifyThatTapMoreButtonNavigateToMorePage()  {
    morePageTest.verifyThatTapMoreButtonNavigateToMorePage();
    }
    @Test(priority = 2)
    public void SignInButtonIsDisplayed(){
        morePageTest.SignInButtonIsDisplayed();
    }
    @Test(priority = 3)
    public void NavigateToSignInPage(){
        MorePage.ClickOnSignInButton();
        assertTrue(Login.LogInByPhoneButtonIsDisplayed());
    }
    @Test(priority = 4)
    public void logInByPhoneButtonIsDisplayed(){
        testCaseId="1";
      assertTrue(Login.LogInByPhoneButtonIsDisplayed());
    }
    @Test(priority = 5)
    public void clickOnLogInByPhoneButton(){
        Login.ClickOnLogInByPhoneButton();
        assertTrue(Login.LogInTitleIsDisplayed());
    }
    @Test(priority =6)
    public void inputOnPhoneField() throws InterruptedException {
        testCaseId="1";
        Login.ClickOnPhoneField();
        Thread.sleep(4000);
        Login.InputOnPhoneField(testDataMobile.getPhoneNumberOnLoginPage());
        Assert.assertEquals(Login.getPhoneField().getText(), testDataMobile.getPhoneNumberOnLoginPage());
    }
    @Test(priority =7)
    public void inputOnPasswordField()  {
        testCaseId="1";
       Login.ClickOnPasswordField();
        Login.InputOnPasswordField(testDataMobile.getPasswordOnLoginPage());
       Assert.assertEquals(Login.getPasswordField().getText(),testDataMobile.getPasswordEncryption());
    }
    @Test(priority =8)
    public void ClickOnLoginButtonNavigteToMorePage() {
        testCaseId="1";
        Login.ClickOnLogInButton();
        assertTrue(Login.welcomeMessageIsDisplayed());
        assertTrue(Login.UserNameIsDisplayed());
    }


}
