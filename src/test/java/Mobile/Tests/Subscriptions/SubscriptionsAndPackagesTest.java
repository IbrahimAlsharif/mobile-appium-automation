package Mobile.Tests.Subscriptions;

import Mobile.Tests.MorePage.MorePage;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class SubscriptionsAndPackagesTest {
    private String testCaseId;

    @Test(priority = 1)
    public void subscriptionsAndPackagesIsDisplayed() {
        testCaseId = "1";
        assertTrue(SubscriptionsAndPackages.subscriptionsAndPackagesIsDisplayed());
    }






}
