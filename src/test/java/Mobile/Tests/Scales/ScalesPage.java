package Mobile.Tests.Scales;
import Base.MobileSetup.MobileFinder;
import io.appium.java_client.MobileElement;
import  static Base.MobileSetup.MobileSetupTest.testDataMobile;

public class ScalesPage {

    public static MobileElement getTitleAppBarOnBenchmarksPage() {
        String xpath="//android.view.View[@content-desc=\""+testDataMobile.getTitleAppBarOnBenchmarksPage()+"\"]";
        return MobileFinder.getByXpath(xpath,false);
    }
    public static boolean TitleAppBarDisplayed(){
        return getTitleAppBarOnBenchmarksPage().isDisplayed();
    }
    public static MobileElement getDiagnosticScalesTypesOnBenchmarksPage() {
       // String xpath="//android.view.View[@content-desc=\""+testDataMobile.getDiagnosticScalesTypesText()+"\"]";
        String xpath=  "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.widget.ScrollView";
        return MobileFinder.getByXpath(xpath,false);
    }
    public static boolean DiagnosticScalesTypesIsDisplayed(){
        return getDiagnosticScalesTypesOnBenchmarksPage().isDisplayed();
    }

    public static boolean TitleAppBarOnBenchmarksPageDisplayed(){
        return getTitleAppBarOnBenchmarksPage().isDisplayed();
    }
}
