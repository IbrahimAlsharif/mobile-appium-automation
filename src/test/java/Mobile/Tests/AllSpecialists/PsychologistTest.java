package Mobile.Tests.AllSpecialists;

import Mobile.Tests.HomePage.HomePage;
import Mobile.Tests.HomePage.HomePageTest;

import Mobile.Tests.MyConversations.MyConversations;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import static Base.MobileSetup.MobileSetupTest.androidDriver;
import static Base.MobileSetup.MobileSetupTest.testDataMobile;


public class PsychologistTest {
    HomePageTest homePageTest =new HomePageTest();
    @Test(priority =1)
    public void verifyThatTapMyConversationsButtonNavigateToMyConversationsPage() throws InterruptedException {
        TouchAction touchAction = new TouchAction((PerformsTouchActions) androidDriver);
        touchAction.tap(PointOption.point(956, 1946)).release().perform();
        Thread.sleep(9000);
    }
    @Test(priority = 2)
    public void NavigateToPsychologistPage(){
        HomePage.ClickOnPsychologist();
        Assert.assertTrue(Psychologist.TitleAppBarOnMyConversationsDisplayed());
    }
    @Test(priority = 3)
    public void SearchFieldOnPsychologistPageIsDisplayed(){
        Assert.assertTrue(Psychologist.SearchFieldOnPsychologistPageIsDisplayed());
    }
    @Test(priority = 4)
    public void FilterOnPsychologistPageIsDisplayed(){
        Assert.assertTrue(Psychologist.FilterOnPsychologistPageIsDisplayed());
    }
    @Test(priority = 5)
    public void InputOnSearchField()  {
        Psychologist. getSearchFieldOnPsychologistPage().click();
        Psychologist.InputOnSearchField();
    Assert.assertTrue(Psychologist.PsychologistNameOnPsychologistPageIsDisplayed());
    }
    @Test(priority = 6 )
    public void PsychologistNameOnPsychologistPageIsDisplayed(){
        Assert.assertTrue(Psychologist.PsychologistNameOnPsychologistPageIsDisplayed());
    }



}
