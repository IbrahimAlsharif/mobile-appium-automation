package Mobile.TestsSpecialist.SignUpScreen;

import Mobile.TestsSpecialist.WelcomeScreen.WelcomeScreen;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignUpScreenTest {
    String testCaseId;
    @Test(priority = 1)
    public void closeButtonIsDisplayed(){
        testCaseId = "1";
        Assert.assertTrue(SignUpScreen.closeButtonIsDisplayed());
    }
    @Test(priority = 1)
    public void titleIsDisplayed(){
        testCaseId = "1";
        Assert.assertTrue(SignUpScreen.titleIsDisplayed());
    }
    @Test(priority = 1)
    public void logoIsDisplayed(){
        testCaseId = "1";
        Assert.assertTrue(SignUpScreen.logoIsDisplayed());
    }
    @Test(priority = 1)
    public void mainTextIsDisplayed(){
        testCaseId = "1";
        Assert.assertTrue(SignUpScreen.mainTextIsDisplayed());
    }
    @Test(priority = 1)
    public void descriptionTextIsDisplayed(){
        testCaseId = "1";
        Assert.assertTrue(SignUpScreen.descriptionTextIsDisplayed());
    }
    @Test(priority = 1)
    public void registerButtonIsDisplayed(){
        testCaseId = "1";
        Assert.assertTrue(SignUpScreen.registerButtonIsDisplayed());
    }
    @Test(priority = 1)
    public void haveAccountTextIsDisplayed(){
        testCaseId = "1";
        Assert.assertTrue(SignUpScreen.haveAccountTextIsDisplayed());
    }
    @Test(priority = 1)
    public void loginLinkedTextIsDisplayed(){
        testCaseId = "1";
        Assert.assertTrue(SignUpScreen.loginLinkedTextIsDisplayed());
    }
    @Test(priority = 1)
    public void bottomBarTextIsDisplayed(){
        testCaseId = "1";
        Assert.assertTrue(SignUpScreen.bottomBarTextIsDisplayed());
    }
    @Test(priority = 1)
    public void privacyPolicyTextIsDisplayed(){
        testCaseId = "1";
        Assert.assertTrue(SignUpScreen.privacyPolicyTextIsDisplayed());
    }
    @Test(priority = 1)
    public void andTextIsDisplayed(){
        testCaseId = "1";
        Assert.assertTrue(SignUpScreen.andTextIsDisplayed());
    }
    @Test(priority = 1)
    public void termsUseTextIsDisplayed(){
        testCaseId = "1";
        Assert.assertTrue(SignUpScreen.termsUseTextIsDisplayed());
    }

}
