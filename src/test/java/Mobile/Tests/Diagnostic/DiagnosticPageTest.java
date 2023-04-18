package Mobile.Tests.Diagnostic;

import Base.MobileSetup.MobileFinder;

import static org.testng.Assert.*;

import TestRail.APIException;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class DiagnosticPageTest {
    private String testCaseId;

    @Test(priority =1)
    public void verifyThatTapDiagnosticButtonNavigateToDiagnosticPage()  {
        testCaseId="10330";
        String accessibility = "المقاييس\n" +
                "علامة التبويب 4 من 5";
        MobileFinder.getByAccessibilityId(accessibility,true);
      //  assertTrue(DiagnosticPage.TitleAppBarOnBenchmarksPageDisplayed());
        assertTrue(DiagnosticPage.DiagnosticScalesTypesIsDisplayed());

    }
    @Test(priority = 2)
    public void TitlePagePageDisplayed(){
        testCaseId="3903";
        assertTrue(DiagnosticPage.TitleAppBarOnBenchmarksPageDisplayed());
    }
    @Test(priority = 3)
    public void DiagnosticScalesTypesIsDisplayed(){
        testCaseId="3859";
        assertTrue(DiagnosticPage.DiagnosticScalesTypesIsDisplayed());
    }

    @AfterMethod
    public void screenShot(ITestResult result) throws APIException, IOException {
        MobileFinder.afterMethod(result,testCaseId);
        System.out.println("After method" + result.getMethod().getMethodName());
    }


}
