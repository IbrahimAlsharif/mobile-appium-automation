package Mobile.Tests.MyConversations;

import Base.MobileSetup.MobileFinder;
import Base.MobileSetup.MobileSetupTest;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

public class MyConversationsTest {
    private static MobileFinder mobileFinder = new MobileFinder(MobileSetupTest.clientAndroidDriver);

    @Test(priority =1)
    public void verifyThatTapMyConversationsButtonNavigateToMyConversationsPage() throws InterruptedException {
        String accessibility = "محادثاتي\n" +
                "علامة التبويب 2 من 5";
        mobileFinder.getByAccessibilityId(accessibility,false);
        Thread.sleep(9000);
        assertTrue(MyConversations.TitleAppBarOnMyConversationsDisplayed());

    }
    @Test(priority = 2)
    public void TitleAppBarOnMyConversationsDisplayed(){

        assertTrue(MyConversations.TitleAppBarOnMyConversationsDisplayed());
    }
    @Test(priority = 2)
    public void SearchFieldOnMyConversationsDisplayed(){
        assertTrue(MyConversations.SearchFieldOnMyConversationsDisplayed());
    }
    @Test(priority = 2)
    public void FilterIconOnMyConversationsDisplayed(){
        assertTrue(MyConversations.FilterIconOnMyConversationsDisplayed());
    }
    @Test(priority = 2)
    public void ChatIconOnMyConversationsDisplayed(){
        assertTrue(MyConversations.ChatIconOnMyConversationsDisplayed());
    }
    @Test(priority = 2)
    public void EmptyChatTitleOnMyConversationsDisplayed(){
        assertTrue(MyConversations.EmptyChatTitleOnMyConversationsDisplayed());
    }
   @Test(priority = 2)
    public void EmptyChatSubTitleOnMyConversationsDisplayed(){
        assertTrue(MyConversations.EmptyChatSubTitleOnMyConversationsDisplayed());
    }
    @Test(priority = 2)
    public void SpecialistsBrowseButtonOnMyConversationsDisplayed(){
        assertTrue(MyConversations.SpecialistsBrowseButtonOnMyConversationsDisplayed());
    }


}
