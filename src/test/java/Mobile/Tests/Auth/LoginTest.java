package Mobile.Tests.Auth;

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
    public void logInByPhoneButtonIsDisplayed(){
        testCaseId="1";
      assertTrue(Login.LogInByPhoneButtonIsDisplayed());
    }
    @Test(priority = 3)
    public void inputOnPhoneField(){
        testCaseId="1";
        Login.ClickOnPhoneField();
        Login.InputOnPhoneField(testDataMobile.getPhoneNumberOnLoginPage());
    }


}
