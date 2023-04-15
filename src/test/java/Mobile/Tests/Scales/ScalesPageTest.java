package Mobile.Tests.Scales;

import Base.MobileSetup.MobileFinder;

import static Base.MobileSetup.MobileSetupTest.clientMobileFinder;
import static org.testng.Assert.*;
import org.testng.annotations.Test;
public class ScalesPageTest {
    private String testCaseId;

    @Test(priority =1)
    public void verifyThatTapScalesButtonNavigateToScalesPage()  {
        String accessibility = "المقاييس\n" +
                "علامة التبويب 4 من 5";
        clientMobileFinder.getByAccessibilityId(accessibility,false);
        assertTrue(ScalesPage.TitleAppBarOnBenchmarksPageDisplayed());
    }
    @Test(priority = 2)
    public void TitleAppBarOnBenchmarksPageDisplayed(){
        testCaseId="0";
        assertTrue(ScalesPage.TitleAppBarOnBenchmarksPageDisplayed());
    }
    @Test(priority = 3)
    public void DiagnosticScalesTypesIsDisplayed(){
        testCaseId="0";
        assertTrue(ScalesPage.DiagnosticScalesTypesIsDisplayed());
    }




}
