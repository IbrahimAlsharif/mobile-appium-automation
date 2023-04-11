package Mobile.Tests.AllSpecialists;

import Base.MobileSetup.MobileSetupTest;
import Mobile.Tests.HomePage.HomePage;
import Mobile.Tests.HomePage.HomePageTest;

import Mobile.Tests.MyConversations.MyConversations;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import static Base.MobileSetup.MobileSetupTest.testDataMobile;


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
    @Test(priority = 5,enabled = false)
    public void InputOnSearchField() throws InterruptedException {
        //todo refer to it again
        String searchText = testDataMobile.getPsychologistNameText();
        for (int i = 0; i < searchText.length(); i++) {
            char letter = searchText.charAt(i);
            Psychologist.getSearchFieldOnPsychologistPage().sendKeys(String.valueOf(letter));
            Thread.sleep(500);
        }
        Psychologist.getSearchFieldOnPsychologistPage().click();
        Psychologist.InputOnSearchField();
        Assert.assertTrue(Psychologist.PsychologistNameOnPsychologistPageIsDisplayed());
    }
    @Test(priority = 6 ,enabled = true)
    public void PsychologistNameOnPsychologistPageIsDisplayed(){
        androidDriver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().description(\""+testDataMobile.getPsychologistNameText()+"\"))").click();
       Assert.assertTrue(Psychologist.SpecialistNameOnDetailsPsychologistPageIsDisplayed());
    }



}
