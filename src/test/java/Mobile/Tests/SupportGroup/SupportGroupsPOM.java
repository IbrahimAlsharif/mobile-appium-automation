package Mobile.Tests.SupportGroup;

import Base.Utilities;
import org.openqa.selenium.WebElement;

import static Base.SetupTest.testData;

public class SupportGroupsPOM {

    public static WebElement getTitleAppBarOnSupportGroupsTestPage() {
        String xpath="//android.view.View[@content-desc=\""+testData.getTitleAppBarOnSupportGroupsTestPage()+"\"]";
        return  Utilities.getByXpath(xpath,true);
    }
    public static boolean TitleAppBarOnBenchmarksPageDisplayed(){
        return getTitleAppBarOnSupportGroupsTestPage().isDisplayed();
    }
    public static WebElement getAllGroupsTextOnSupportGroupsTestPage() {
        String xpath="//android.view.View[@content-desc=\""+testData.getTitleAppBarOnSupportGroupsTestPage()+"\"]";
        return  Utilities.getByXpath(xpath,true);
    }
    public static boolean AllGroupsTextOnSupportGroupsTestPageIsDisplayed(){
        return getAllGroupsTextOnSupportGroupsTestPage().isDisplayed();
    }



}
