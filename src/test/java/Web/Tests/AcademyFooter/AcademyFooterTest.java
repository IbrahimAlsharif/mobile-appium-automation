package Web.Tests.AcademyFooter;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AcademyFooterTest {
    private String testCaseId;
    @Test(priority = 1)
    public void logoImageIsDisplayed() {
        testCaseId="C10335";
        Assert.assertTrue(AcademyFooter.logoImageIsDisplayed());
    }
}
