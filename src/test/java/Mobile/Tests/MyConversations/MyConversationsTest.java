package Mobile.Tests.MyConversations;

import Base.SetupTest;
import Base.Utilities;
import Mobile.Tests.SupportGroup.SupportGroupsPOM;
import io.appium.java_client.MobileElement;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import static Base.SetupTest.*;

public class MyConversationsTest {

    @Test(priority =1)
    public void verifyThatTapMyConversationsButtonNavigateToMyConversationsPage() throws InterruptedException {
        TouchAction touchAction=new TouchAction((PerformsTouchActions) driver);
        touchAction.tap(PointOption.point(750, 1954)).release().perform();
        Thread.sleep(9000);
    }
    @Test(priority = 2)
    public void TitleAppBarOnMyConversationsDisplayed(){

        Assert.assertTrue(MyConversationsPOM.TitleAppBarOnMyConversationsDisplayed());
    }
    @Test(priority = 2)
    public void SearchFieldOnMyConversationsDisplayed(){
        Assert.assertTrue(MyConversationsPOM.SearchFieldOnMyConversationsDisplayed());
    }
    @Test(priority = 2)
    public void FilterIconOnMyConversationsDisplayed(){
        Assert.assertTrue(MyConversationsPOM.FilterIconOnMyConversationsDisplayed());
    }
    @Test(priority = 2)
    public void ChatIconOnMyConversationsDisplayed(){
        Assert.assertTrue(MyConversationsPOM.ChatIconOnMyConversationsDisplayed());
    }
    @Test(priority = 2)
    public void EmptyChatTitleOnMyConversationsDisplayed(){
        Assert.assertTrue(MyConversationsPOM.EmptyChatTitleOnMyConversationsDisplayed());
    }
   @Test(priority = 2)
    public void EmptyChatSubTitleOnMyConversationsDisplayed(){
        Assert.assertTrue(MyConversationsPOM.EmptyChatSubTitleOnMyConversationsDisplayed());
    }
    @Test(priority = 2)
    public void SpecialistsBrowseButtonOnMyConversationsDisplayed(){
        Assert.assertTrue(MyConversationsPOM.SpecialistsBrowseButtonOnMyConversationsDisplayed());
    }


}
