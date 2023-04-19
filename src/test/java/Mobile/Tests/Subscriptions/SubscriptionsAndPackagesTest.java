package Mobile.Tests.Subscriptions;

import Base.MobileSetup.MobileSetupTest;
import Mobile.Tests.MorePage.MorePage;
import org.testng.annotations.Test;

import static Base.MobileSetup.MobileSetupTest.testDataMobile;
import static org.testng.Assert.*;

public class SubscriptionsAndPackagesTest {
    private String testCaseId;

    @Test(priority = 1)
    public void subscriptionsAndPackagesIsDisplayed() {
        testCaseId = "1";
        assertTrue(SubscriptionsAndPackages.subscriptionsAndPackagesIsDisplayed());
    }
    @Test(priority = 2)
    public void sessionWithSpecialistIsDisplayed() {
        testCaseId = "1";
        assertTrue(SubscriptionsAndPackages.sessionWithSpecialistIsDisplayed());
    }
  @Test(priority =3 )
    public void BronzeSubscriptionIsDisplayed() {
        testCaseId = "1";
        assertTrue(SubscriptionsAndPackages.BronzeSubscriptionIsDisplayed());
    }

    @Test(priority = 4)
    public void silverSubscriptionIsDisplayed() {
        testCaseId = "2";
        assertTrue(SubscriptionsAndPackages.silverSubscriptionIsDisplayed());
    }
    @Test(priority = 5)
    public void goldSubscriptionIsDisplayed() {
        testCaseId = "3";
        MobileSetupTest.clientAndroidDriver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().description(\""+testDataMobile.getGoldSubscription()+"\"))");
        assertTrue(SubscriptionsAndPackages.goldSubscriptionIsDisplayed());
    }
 @Test(priority = 6)
     public void paidSupportIsDisplayed() {
        testCaseId = "3";
        assertTrue(SubscriptionsAndPackages.paidSupportIsDisplayed());
    }
    @Test(priority = 7)
    public void threeMonthsSubscriptionIsDisplayed() {
        testCaseId = "3";
        assertTrue(SubscriptionsAndPackages.threeMonthsSubscriptionIsDisplayed());
    }
    @Test(priority = 8)
    public void subscribeButtonIsDisplayed() {
        testCaseId = "3";
        assertTrue(SubscriptionsAndPackages.subscribeButtonIsDisplayed());
    }
    @Test(priority = 8)
    public void naivagteTo() {
        testCaseId = "3";
        assertTrue(SubscriptionsAndPackages.subscribeButtonIsDisplayed());
    }





}
