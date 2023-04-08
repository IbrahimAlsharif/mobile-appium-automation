package Mobile.Tests.BenchmarksPage;

import Base.WebSetupTest;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
public class BenchmarksTest {
    private String testCaseId;

    @Test(priority =1)
    public void verifyThatTapDiagnosticButtonNavigateToDiagnosticPage()  {
        TouchAction touchAction=new TouchAction((PerformsTouchActions) WebSetupTest.webDriver);
        touchAction.tap(PointOption.point(334, 1946)).release().perform();
    }
    @Test(priority = 2)
    public void TitleAppBarOnBenchmarksPageDisplayed(){
        testCaseId="0";
        Assert.assertTrue(Diagnosis.TitleAppBarOnBenchmarksPageDisplayed());
    }
    @Test(priority = 3)
    public void DiagnosticScalesTypesIsDisplayed(){
        testCaseId="0";
        Assert.assertTrue(Diagnosis.DiagnosticScalesTypesIsDisplayed());
    }




}
