package Mobile.TestsSpecialist.WelcomeScreen;

import static org.testng.Assert.*;
import org.testng.annotations.Test;

public class WelcomeScreenTest {
    private String testCaseId;
    @Test(priority = 1)
    public void existanceOfLogoInWelcomeScreen(){
        testCaseId="1";
        assertTrue(WelcomeScreen.existanceOfLogo());
    }
    @Test(priority = 2)
    public void existanceOfWelcomPictureInWelcomeScreen(){
        testCaseId="2";
        assertTrue(WelcomeScreen.existanceOfWelcomPicture());
    }
    @Test(priority = 3)
    public void existanceOfMainTextInWelcomeScreen(){
        testCaseId="3";
        assertTrue(WelcomeScreen.existanceOfMainText());
    }
    @Test(priority = 4)
    public void existanceOfDescriptionTextInWelcomeScreen(){
        testCaseId="4";
        assertTrue(WelcomeScreen.existanceOfDescriptionText());
    }
    @Test(priority = 5)
    public void existanceOfLoginButtonInWelcomeScreen(){
        testCaseId="5";
        assertTrue(WelcomeScreen.existanceOfLoginButton());
    }
    @Test(priority = 5)
    public void existanceOfSignUpButtonInWelcomeScreen(){
        testCaseId="6";
        assertTrue(WelcomeScreen.existanceOfSignUpButton());
    }

}
