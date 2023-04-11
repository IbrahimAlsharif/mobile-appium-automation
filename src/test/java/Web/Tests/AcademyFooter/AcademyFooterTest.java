package Web.Tests.AcademyFooter;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AcademyFooterTest {
    @Test(priority = 1)
    public void checkoutTitleIsDisplayed() {
        Assert.assertTrue(AcademyFooter.logoImageIsDisplayed());
    }
}
