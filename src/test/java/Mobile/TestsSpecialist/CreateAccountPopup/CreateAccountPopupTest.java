package Mobile.TestsSpecialist.CreateAccountPopup;

import Mobile.TestsSpecialist.SignUpScreen.SignUpScreen;
import Mobile.TestsSpecialist.WelcomeScreen.WelcomeScreen;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateAccountPopupTest {
    String testCaseId;
    @Test(priority = 1)
    public void titleIsDisplayed(){
        testCaseId = "1";
        Assert.assertTrue(CreateAccountPopup.titleIsDisplayed());
    }
    @Test(priority = 2)
    public void descriptionTextIsDisplayed(){
        testCaseId = "1";
        Assert.assertTrue(CreateAccountPopup.descriptionTextIsDisplayed());
    }
    @Test(priority = 2)
    public void CreateAccountButtonIsDisplayed(){
        testCaseId = "1";
        Assert.assertTrue(CreateAccountPopup.CreateAccountButtonIsDisplayed());
    }
}
