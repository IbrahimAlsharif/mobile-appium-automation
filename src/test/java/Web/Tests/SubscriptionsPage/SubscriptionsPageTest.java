package Web.Tests.SubscriptionsPage;

import Web.Tests.CheckoutPage.CheckoutPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import static Base.WebSetup.WebSetupTest.testDataWeb;

public class SubscriptionsPageTest {
    private String testCaseId;
    @Test(priority = 1)
    public void monthlyButtonIsDisplayed() {
        testCaseId="C10166";
        Assert.assertTrue(SubscriptionPage.monthlyButtonIsDisplayed());
    }

    @Test(priority = 1)
    public void threeMonthsButtonIsDisplayed() {
        testCaseId="C10167";
        Assert.assertTrue(SubscriptionPage.threeMonthsButtonIsDisplayed());
    }

    @Test(priority = 1)
    public void sixMonthsButtonIsDisplayed() {
        testCaseId="C10169";
        Assert.assertTrue(SubscriptionPage.sixMonthsButtonIsDisplayed());
    }

    @Test(priority = 2)
    public void viewMonthlySubscriptions() {
        testCaseId="C10170";
        SubscriptionPage.clickOnMonthlyButton();
        Assert.assertEquals(SubscriptionPage.getMonthlyBronzePriceText(), testDataWeb.getMonthlyBronzePrice());
    }
    @Test(priority = 3)
    public void monthlyBronzeIsDisplayed() {
        testCaseId="C10171";
        Assert.assertTrue(SubscriptionPage.monthlyBronzeButtonIsDisplayed());
    }
    @Test(priority = 3)
    public void monthlySilverIsDisplayed() {
        testCaseId="C10173";
        Assert.assertTrue(SubscriptionPage.monthlySilverButtonIsDisplayed());
    }

    @Test(priority = 3)
    public void monthlyGoldIsDisplayed() {
        testCaseId="C10175";
        Assert.assertTrue(SubscriptionPage.monthlyGoldButtonIsDisplayed());
    }

    @Test(priority = 4)
    public void viewThreeMonthSubscriptions() {
        testCaseId="C10176";
        SubscriptionPage.clickThreeMonthsButton();
        Assert.assertEquals(SubscriptionPage.getThreeMonthsBronzePriceText(), testDataWeb.getThreeMonthsBronzePrice());
    }
    @Test(priority = 5)
    public void threeMonthsBronzeIsDisplayed() {
        testCaseId="C10178";
        Assert.assertTrue(SubscriptionPage.threeMonthsBronzeButtonIsDisplayed());
    }

    @Test(priority = 5)
    public void threeMonthsSilverIsDisplayed() {
        testCaseId="C10179";
        Assert.assertTrue(SubscriptionPage.threeMonthsSilverButtonIsDisplayed());
    }

    @Test(priority = 5)
    public void threeMonthsGoldIsDisplayed() {
        testCaseId="C10180";
        Assert.assertTrue(SubscriptionPage.threeMonthsGoldButtonIsDisplayed());
    }
    @Test(priority = 6)
    public void viewSixMonthSubscriptions() {
        testCaseId="C10181";
        SubscriptionPage.clickSixMonthsButton();
        Assert.assertEquals(SubscriptionPage.getSixMonthsBronzePriceText(), testDataWeb.getSixMonthsBronzePrice());
    }
    @Test(priority = 7)
    public void sixMonthsBronzeIsDisplayed() {
        testCaseId="C10182";
        Assert.assertTrue(SubscriptionPage.sixMonthsBronzeButtonIsDisplayed());
    }
    @Test(priority = 7)
    public void sixMonthsSilverIsDisplayed() {
        testCaseId="C10183";
        Assert.assertTrue(SubscriptionPage.sixMonthsSilverButtonIsDisplayed());
    }

    @Test(priority = 7)
    public void sixMonthsGoldIsDisplayed() {
        testCaseId="C10184";
        Assert.assertTrue(SubscriptionPage.sixMonthsGoldButtonIsDisplayed());
    }

    @Test(priority = 8)
    public void openCompleteSubscription() {
        testCaseId="C10185";
        SubscriptionPage.clickSixMonthsBronzeButton();
        Assert.assertEquals(SubscriptionPage.getLoginPopUpTitleText(), testDataWeb.getLoginPopUpText());
    }

    @Test(priority = 9)
    public void signInButtonIsDisplayed() {
        testCaseId="C10187";
        SubscriptionPage.switchToFrame("iframe");
        Assert.assertTrue(SubscriptionPage.signInButtonIsDisplayed());
    }

    @Test(priority = 9)
    public void signInWithGoogle() {
        testCaseId="C10188";
        SubscriptionPage.clickSignInWithGoogleButton();
        Assert.assertEquals(SubscriptionPage.getSignInWindowTitleText(), testDataWeb.getSignInWindowTitleText());
    }

    @Test(priority = 10)
    public void inputOnEmailField() {
        testCaseId="C10190";
        SubscriptionPage.inputOnEmailField();
        Assert.assertEquals(SubscriptionPage.getEmailFieldInputText(), testDataWeb.getEmail());
    }

    @Test(priority = 11)
    public void clickOnNextToPasswordButton() {
        testCaseId="C10191";
        SubscriptionPage.clickOnNextToPasswordButton();
        Assert.assertEquals(SubscriptionPage.getLoggedInEmailLabelText(), testDataWeb.getEmail());
    }

    @Test(priority = 12)
    public void inputOnPasswordField() {
        testCaseId="C10193";
        SubscriptionPage.inputOnPasswordField();
        Assert.assertEquals(SubscriptionPage.getPasswordFieldInputText(), testDataWeb.getPassword());
    }

    @Test(priority = 13)
    public void clickOnNextButton() {
        testCaseId="C10194";
        SubscriptionPage.clickOnNextButton();
        Assert.assertEquals(CheckoutPage.getCheckoutTitleText(), testDataWeb.getCheckoutTitleText());
    }
}
