package Mobile.Tests.AllSpecialists;

import Base.Utilities;
import Mobile.Tests.HomePage.HomePagePOM;
import Mobile.Tests.HomePage.HomePageTest;
import Mobile.Tests.MyConversations.MyConversationsPOM;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import static Base.SetupTest.driver;
import static Base.SetupTest.testDataMobile;

public class PsychologistTest {
    HomePageTest homePageTest =new HomePageTest();


    @Test(priority =1)
    public void verifyThatTapMyConversationsButtonNavigateToMyConversationsPage() throws InterruptedException {
        TouchAction touchAction=new TouchAction((PerformsTouchActions) driver);
        touchAction.tap(PointOption.point(956, 1946)).release().perform();
        Thread.sleep(9000);
    }
    @Test(priority = 2)
    public void NavigateToPsychologistPage(){
        HomePagePOM.ClickOnPsychologist();
        Assert.assertTrue(MyConversationsPOM.TitleAppBarOnMyConversationsDisplayed());
    }



}
