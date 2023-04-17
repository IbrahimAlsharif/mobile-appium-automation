package Web.Tests.Footer;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FooterTest {
    private String testCaseId;
    @Test(priority = 1)
    public void footerGooglePlayButtonIsDisplayed() {
        testCaseId="C10154";
        Assert.assertTrue(Footer.footerGooglePlayButtonIsDisplayed());
    }
    @Test(priority = 1)
    public void footerAppStoreButtonIsDisplayed() {
        testCaseId="C10152";
        Assert.assertTrue(Footer.footerAppStoreButtonIsDisplayed());
    }
}
