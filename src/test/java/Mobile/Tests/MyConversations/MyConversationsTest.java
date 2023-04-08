package Mobile.Tests.MyConversations;

import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.testng.Assert;
import org.testng.annotations.Test;

import static Base.MobileSetup.MobileSetupTest.androidDriver;


public class MyConversationsTest {

    @Test(priority =1)
    public void verifyThatTapMyConversationsButtonNavigateToMyConversationsPage() throws InterruptedException {
        TouchAction touchAction=new TouchAction((PerformsTouchActions) androidDriver);
        touchAction.tap(PointOption.point(750, 1954)).release().perform();
        Thread.sleep(9000);
    }
    @Test(priority = 2)
    public void TitleAppBarOnMyConversationsDisplayed(){

        Assert.assertTrue(MyConversations.TitleAppBarOnMyConversationsDisplayed());
    }
    @Test(priority = 2)
    public void SearchFieldOnMyConversationsDisplayed(){
        Assert.assertTrue(MyConversations.SearchFieldOnMyConversationsDisplayed());
    }
    @Test(priority = 2)
    public void FilterIconOnMyConversationsDisplayed(){
        Assert.assertTrue(MyConversations.FilterIconOnMyConversationsDisplayed());
    }
    @Test(priority = 2)
    public void ChatIconOnMyConversationsDisplayed(){
        Assert.assertTrue(MyConversations.ChatIconOnMyConversationsDisplayed());
    }
    @Test(priority = 2)
    public void EmptyChatTitleOnMyConversationsDisplayed(){
        Assert.assertTrue(MyConversations.EmptyChatTitleOnMyConversationsDisplayed());
    }
   @Test(priority = 2)
    public void EmptyChatSubTitleOnMyConversationsDisplayed(){
        Assert.assertTrue(MyConversations.EmptyChatSubTitleOnMyConversationsDisplayed());
    }
    @Test(priority = 2)
    public void SpecialistsBrowseButtonOnMyConversationsDisplayed(){
        Assert.assertTrue(MyConversations.SpecialistsBrowseButtonOnMyConversationsDisplayed());
    }


}
