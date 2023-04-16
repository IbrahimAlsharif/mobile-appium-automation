package Mobile.TestsSpecialist.SignInPopup;

import Mobile.TestsSpecialist.CreateAccountPopup.CreateAccountPopup;
import Mobile.TestsSpecialist.SignInScreen.SignInScreen;
import org.testng.Assert;
import org.testng.annotations.Test;


public class SignInPopupTest {
    String testCaseId;
    @Test(priority = 1)
    public void titleIsDisplayed(){
        testCaseId = "1";
        SignInScreen.getLoginButton().click();
        System.out.println(SignInPopup.titleIsDisplayed());
        Assert.assertTrue(SignInPopup.titleIsDisplayed());
    }
    @Test(priority = 2)
    public void descriptionTextIsDisplayed(){
        testCaseId = "1";
        Assert.assertTrue(SignInPopup.descriptionTextIsDisplayed());
    }
    @Test(priority = 2)
    public void mobileFieldIsDisplayed(){
        testCaseId = "1";
        Assert.assertTrue(SignInPopup.mobileFieldIsDisplayed());
    }
    @Test(priority = 2)
    public void passwordFieldIsDisplayed(){
        testCaseId = "1";
        Assert.assertTrue(SignInPopup.passwordFieldIsDisplayed());
    }
    @Test(priority = 2)
    public void forgetPasswordLinkedIsDisplayed(){
        testCaseId = "1";
        Assert.assertTrue(SignInPopup.forgetPasswordLinkedIsDisplayed());
    }
    @Test(priority = 2)
    public void signInButtonIsDisplayed(){
        testCaseId = "1";
        Assert.assertTrue(SignInPopup.signInButtonIsDisplayed());
    }
    @Test(priority = 2)
    public void signInButtonIsEnabledAfterAddingMobileAndPassword(){
        testCaseId = "1";
        SignInPopup.getMobileField().sendKeys("0592100200");
        SignInPopup.getPasswordField().sendKeys("100200");
        Assert.assertTrue(SignInPopup.signInButtonIsEnabled());
    }
}
