package Web.Tests.Footer;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FooterTest {
    private String testCaseId;
    @Test(priority = 1)
    public void googlePlayButtonIsDisplayed() {
        testCaseId="C10154";
        Assert.assertTrue(Footer.googlePlayButtonIsDisplayed());
    }
    @Test(priority = 1)
    public void appStoreButtonIsDisplayed() {
        testCaseId="C10152";
        Assert.assertTrue(Footer.appStoreButtonIsDisplayed());
    }
}
