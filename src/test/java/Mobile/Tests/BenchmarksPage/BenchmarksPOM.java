package Mobile.Tests.BenchmarksPage;

import Base.Utilities;
import io.appium.java_client.MobileElement;

import static Base.SetupTest.testDataMobile;
import static Base.SetupTest.testDataMobile;

public class BenchmarksPOM {

    public static MobileElement getTitleAppBarOnBenchmarksPage() {
        String xpath="//android.view.View[@content-desc=\""+testDataMobile.getTitleAppBarOnBenchmarksPage()+"\"]";
        return (MobileElement) Utilities.getByXpath(xpath,false);
    }
    public static boolean TitleAppBarDisplayed(){
        return getTitleAppBarOnBenchmarksPage().isDisplayed();
    }
    public static MobileElement getDiagnosticScalesTypesOnBenchmarksPage() {
        String xpath="//android.view.View[@content-desc=\""+testDataMobile.getDiagnosticScalesTypesText()+"\"]";
        return (MobileElement) Utilities.getByXpath(xpath,false);
    }
    public static boolean DiagnosticScalesTypesIsDisplayed(){
        return getDiagnosticScalesTypesOnBenchmarksPage().isDisplayed();
    }
}
