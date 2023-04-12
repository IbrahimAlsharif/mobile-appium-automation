package Mobile.Tests.Subscriptions;

import Base.MobileSetup.MobileFinder;
import org.openqa.selenium.WebElement;

import static Base.MobileSetup.MobileSetupTest.testDataMobile;

public class SubscriptionsAndPackages {

    public static WebElement getTitleAppBarOnSubscriptionsAndPackagesPage() {
        String xpath="//android.view.View[@content-desc=\""+testDataMobile.getTitleAppBarOnPsychologistPage()+"\"]";
        return  MobileFinder.getByXpath(xpath,false);
    }
    public static boolean TitleAppBarOnMyConversationsDisplayed(){
        return getTitleAppBarOnSubscriptionsAndPackagesPage().isDisplayed();
    }

}
