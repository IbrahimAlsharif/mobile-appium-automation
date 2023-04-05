package Mobile.Tests.BenchmarksPage;

import Base.Utilities;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.WebElement;

import static Base.SetupTest.testData;

public class BenchmarksPOM {

    public static WebElement getTitleAppBarOnBenchmarksPage() {
        String xpath="//android.view.View[@content-desc=\""+testData.getTitleAppBarOnBenchmarksPage()+"\"]";
        return  Utilities.getByXpath(xpath,true);
    }
    public static boolean TitleAppBarOnBenchmarksPageDisplayed(){
        return getTitleAppBarOnBenchmarksPage().isDisplayed();
    }

    public static WebElement getDiagnosticScalesTypes() {
        String xpath="//android.view.View[@content-desc=\""+testData.getDiagnosticScalesTypesText()+"\"]";
        return  Utilities.getByXpath(xpath,true);
    }
    public static boolean DiagnosticScalesTypesIsDisplayed(){
        return getDiagnosticScalesTypes().isDisplayed();
    }







}
