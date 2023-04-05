package Mobile.Tests.BenchmarksPage;

import Base.Utilities;
import io.appium.java_client.MobileElement;

import static Base.SetupTest.testData;

public class BenchmarksPOM {

    public static MobileElement getTitleAppBarOnBenchmarksPage() {
        String xpath="//android.widget.ImageView[@content-desc=\""+testData.getLanguageIconText()+"\"]";
        return (MobileElement) Utilities.getByXpath(xpath,true);
    }
    public static boolean TitleAppBarDisplayed(){
        return getTitleAppBarOnBenchmarksPage().isDisplayed();
    }
}
