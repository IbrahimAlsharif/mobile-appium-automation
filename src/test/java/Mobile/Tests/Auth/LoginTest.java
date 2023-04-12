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
    public void ClickOnSignInButton(){
        MorePage.ClickOnSignInButton();
    }

    @Test(priority = 4)
    public void logInByPhoneButtonIsDisplayed(){
        testCaseId="1";
      assertTrue(Login.LogInByPhoneButtonIsDisplayed());
    }
    @Test(priority = 5)
    public void clickOnLogInByPhoneButton(){
        //todo teststep
        Login.ClickOnLogInByPhoneButton();

    }
    @Test(priority = 6)
    public void ClickOnPhoneField(){
        //todo teststep

        Login.ClickOnPhoneField();

    }

    @Test(priority =7)
    public void inputOnPhoneField()  {
        //todo teststep

        testCaseId="1";
        Login.InputOnPhoneField(testDataMobile.getPhoneNumberOnLoginPage());
       // MobileSetupTest.androidDriver.hideKeyboard();
      //  Assert.assertEquals(SignupPOM.getPasswordConfirmField().getAttribute("value"), testData.getPasswordConfirmFieldText());

    }


}
