package Web.Tests.AcademyFooter;

import static org.testng.Assert.*;
import org.testng.annotations.Test;

public class AcademyFooterTest {
    @Test(priority = 1)
    public void checkoutTitleIsDisplayed() {
        assertTrue(AcademyFooter.logoImageIsDisplayed());
    }
}
