package Web.Tests.SubscriptionsPage;

import org.testng.Assert;
import org.testng.annotations.Test;

import static Base.WebSetupTest.testDataWeb;

public class SubscriptionsPageTest {
    @Test(priority = 1)
    public void monthlyButtonIsDisplayed() {
        Assert.assertTrue(SubscriptionPage.monthlyButtonIsDisplayed());
    }

    @Test(priority = 1)
    public void threeMonthsButtonIsDisplayed() {
        Assert.assertTrue(SubscriptionPage.threeMonthsButtonIsDisplayed());
    }

    @Test(priority = 1)
    public void sixMonthsButtonIsDisplayed() {
        Assert.assertTrue(SubscriptionPage.sixMonthsButtonIsDisplayed());
    }

    @Test(priority = 2)
    public void viewMonthlySubscriptions() {
        SubscriptionPage.clickOnMonthlyButton();
        Assert.assertEquals(SubscriptionPage.getMonthlyBronzePriceText(), testDataWeb.getMonthlyBronzePrice());
    }
    @Test(priority = 3)
    public void monthlyBronzeIsDisplayed() {
        Assert.assertTrue(SubscriptionPage.monthlyBronzeButtonIsDisplayed());
    }
    @Test(priority = 3)
    public void monthlySilverIsDisplayed() {
        Assert.assertTrue(SubscriptionPage.monthlySilverButtonIsDisplayed());
    }

    @Test(priority = 3)
    public void monthlyGoldIsDisplayed() {
        Assert.assertTrue(SubscriptionPage.monthlyGoldButtonIsDisplayed());
    }

    @Test(priority = 4)
    public void viewThreeMonthSubscriptions() {
        SubscriptionPage.clickThreeMonthsButton();
        Assert.assertEquals(SubscriptionPage.getThreeMonthsBronzePriceText(), testDataWeb.getThreeMonthsBronzePrice());
    }
    @Test(priority = 5)
    public void threeMonthsBronzeIsDisplayed() {
        Assert.assertTrue(SubscriptionPage.threeMonthsBronzeButtonIsDisplayed());
    }

    @Test(priority = 5)
    public void threeMonthsSilverIsDisplayed() {
        Assert.assertTrue(SubscriptionPage.threeMonthsSilverButtonIsDisplayed());
    }

    @Test(priority = 5)
    public void threeMonthsGoldIsDisplayed() {
        Assert.assertTrue(SubscriptionPage.threeMonthsGoldButtonIsDisplayed());
    }
    @Test(priority = 6)
    public void viewSixMonthSubscriptions() {
        SubscriptionPage.clickSixMonthsButton();
        Assert.assertEquals(SubscriptionPage.getSixMonthsBronzePriceText(), testDataWeb.getSixMonthsBronzePrice());
    }
    @Test(priority = 7)
    public void sixMonthsBronzeIsDisplayed() {
        Assert.assertTrue(SubscriptionPage.sixMonthsBronzeButtonIsDisplayed());
    }
    @Test(priority = 7)
    public void sixMonthsSilverIsDisplayed() {
        Assert.assertTrue(SubscriptionPage.sixMonthsSilverButtonIsDisplayed());
    }

    @Test(priority = 7)
    public void sixMonthsGoldIsDisplayed() {
        Assert.assertTrue(SubscriptionPage.sixMonthsGoldButtonIsDisplayed());
    }

    @Test(priority = 8)
    public void openCompleteSubscription() {
        SubscriptionPage.clickSixMonthsBronzeButton();
//        Assert.assertTrue(SubscriptionPage.sixMonthsGoldButtonIsDisplayed());
    }

}
