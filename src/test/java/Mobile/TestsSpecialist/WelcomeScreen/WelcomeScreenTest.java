package Mobile.TestsSpecialist.WelcomeScreen;

import org.testng.Assert;
import org.testng.annotations.Test;

public class WelcomeScreenTest {
    private String testCaseId;
    @Test(priority = 1)
    public void existanceOfLogoInWelcomeScreen(){
        testCaseId="1";
        Assert.assertTrue(WelcomeScreenPOM.existanceOfLogo());
    }
    @Test(priority = 1)
    public void existanceOfWelcomPictureInWelcomeScreen(){
        testCaseId="2";
        Assert.assertTrue(WelcomeScreenPOM.existanceOfWelcomPicture());
    }
    @Test(priority = 1)
    public void existanceOfMainTextInWelcomeScreen(){
        testCaseId="3";
        Assert.assertTrue(WelcomeScreenPOM.existanceOfMainText());
    }
    @Test(priority = 1)
    public void existanceOfDescriptionTextInWelcomeScreen(){
        testCaseId="4";
        Assert.assertTrue(WelcomeScreenPOM.existanceOfDescriptionText());
    }
    @Test(priority = 1)
    public void existanceOfLoginButtonInWelcomeScreen(){
        testCaseId="5";
        Assert.assertTrue(WelcomeScreenPOM.existanceOfLoginButton());
    }
    @Test(priority = 1)
    public void existanceOfSignUpButtonInWelcomeScreen(){
        testCaseId="6";
        Assert.assertTrue(WelcomeScreenPOM.existanceOfSignUpButton());
    }

}
