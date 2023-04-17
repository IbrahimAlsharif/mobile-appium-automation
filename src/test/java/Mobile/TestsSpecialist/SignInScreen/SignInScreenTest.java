package Mobile.TestsSpecialist.SignInScreen;

import Mobile.TestsSpecialist.SignUpScreen.SignUpScreen;
import Mobile.TestsSpecialist.WelcomeScreen.WelcomeScreen;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignInScreenTest {
    String testCaseId;
    @Test(priority = 1)
    public void closeButtonIsDisplayed(){
        testCaseId = "1";
        WelcomeScreen.getLoginButton().click();
        Assert.assertTrue(SignInScreen.closeButtonIsDisplayed());
    }
    @Test(priority = 2)
    public void titleIsDisplayed(){
        testCaseId = "1";
        Assert.assertTrue(SignInScreen.titleIsDisplayed());
    }
    @Test(priority = 2)
    public void logoIsDisplayed(){
        testCaseId = "1";
        Assert.assertTrue(SignInScreen.logoIsDisplayed());
    }
    @Test(priority = 2)
    public void mainTextIsDisplayed(){
        testCaseId = "1";
        Assert.assertTrue(SignInScreen.mainTextIsDisplayed());
    }
    @Test(priority = 2)
    public void descriptionTextIsDisplayed(){
        testCaseId = "1";
        Assert.assertTrue(SignInScreen.descriptionTextIsDisplayed());
    }
    @Test(priority = 2)
    public void registerButtonIsDisplayed(){
        testCaseId = "1";
        Assert.assertTrue(SignInScreen.loginButtonIsDisplayed());
    }
    @Test(priority = 2)
    public void haveAccountTextIsDisplayed(){
        testCaseId = "1";
        Assert.assertTrue(SignInScreen.haveNotAccountTextIsDisplayed());
    }
    @Test(priority = 2)
    public void loginLinkedTextIsDisplayed(){
        testCaseId = "1";
        Assert.assertTrue(SignInScreen.signUpLinkedTextIsDisplayed());
    }
    @Test(priority = 2)
    public void bottomBarTextIsDisplayed(){
        testCaseId = "1";
        Assert.assertTrue(SignInScreen.bottomBarTextIsDisplayed());
    }
    @Test(priority = 2)
    public void privacyPolicyTextIsDisplayed(){
        testCaseId = "1";
        Assert.assertTrue(SignInScreen.privacyPolicyTextIsDisplayed());
    }
    @Test(priority = 2)
    public void andTextIsDisplayed(){
        testCaseId = "1";
        Assert.assertTrue(SignInScreen.andTextIsDisplayed());
    }
    @Test(priority = 2)
    public void termsUseTextIsDisplayed(){
        testCaseId = "1";
        Assert.assertTrue(SignInScreen.termsUseTextIsDisplayed());
    }
}
