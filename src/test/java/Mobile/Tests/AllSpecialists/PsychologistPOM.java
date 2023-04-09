package Mobile.Tests.AllSpecialists;

import Base.Utilities;
import Mobile.Tests.MyConversations.MyConversationsPOM;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import static Base.SetupTest.driver;
import static Base.SetupTest.testDataMobile;

public class PsychologistPOM {


    public static WebElement getTitleAppBarOnMyConversationsPage() {
        String xpath="//android.view.View[@content-desc=\""+testDataMobile.getTitleAppBarOnMyConversationsPage()+"\"]";
        return  Utilities.getByXpath(xpath,false);
    }
    public static boolean TitleAppBarOnMyConversationsDisplayed(){
        return getTitleAppBarOnMyConversationsPage().isDisplayed();
    }





}
