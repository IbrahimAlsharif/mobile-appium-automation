package Mobile.Tests.BenchmarksPage;

import Base.WebSetup.WebSetupTest;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import static org.testng.Assert.*;
import org.testng.annotations.Test;
public class DiagnosisTest {
    private String testCaseId;

    @Test(priority =1)
    public void verifyThatTapDiagnosticButtonNavigateToDiagnosticPage()  {
        TouchAction touchAction=new TouchAction((PerformsTouchActions) WebSetupTest.webDriver);
        touchAction.tap(PointOption.point(334, 1946)).release().perform();
        assertTrue(Diagnosis.TitleAppBarOnBenchmarksPageDisplayed());

    }
    @Test(priority = 2)
    public void TitleAppBarOnBenchmarksPageDisplayed(){
        testCaseId="0";
        assertTrue(Diagnosis.TitleAppBarOnBenchmarksPageDisplayed());
    }
    @Test(priority = 3)
    public void DiagnosticScalesTypesIsDisplayed(){
        testCaseId="0";
        assertTrue(Diagnosis.DiagnosticScalesTypesIsDisplayed());
    }




}
