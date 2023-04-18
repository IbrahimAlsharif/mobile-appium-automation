package Web.Tests.SubscriptionsPage;

import Base.WebSetup.WebFinder;
import TestRail.APIException;
import Web.Tests.CheckoutPage.CheckoutPage;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.io.IOException;

import static Base.WebSetup.WebSetupTest.testDataWeb;

public class SubscriptionsPageTest {
    private String testCaseId;
    @Test(priority = 1)
    public void monthlyButtonIsDisplayed() {
        testCaseId="10166";
        Assert.assertTrue(SubscriptionPage.monthlyButtonIsDisplayed());
    }

    @Test(priority = 1)
    public void threeMonthsButtonIsDisplayed() {
        testCaseId="10167";
        Assert.assertTrue(SubscriptionPage.threeMonthsButtonIsDisplayed());
    }

    @Test(priority = 1)
    public void sixMonthsButtonIsDisplayed() {
        testCaseId="10169";
        Assert.assertTrue(SubscriptionPage.sixMonthsButtonIsDisplayed());
    }

    @Test(priority = 2)
    public void viewMonthlySubscriptions() {
        testCaseId="10170";
        SubscriptionPage.clickOnMonthlyButton();
        Assert.assertEquals(SubscriptionPage.getMonthlyBronzePriceText(), testDataWeb.getMonthlyBronzePrice());
    }
    @Test(priority = 3)
    public void monthlyBronzeIsDisplayed() {
        testCaseId="10171";
        Assert.assertTrue(SubscriptionPage.monthlyBronzeButtonIsDisplayed());
    }
    @Test(priority = 3)
    public void monthlySilverIsDisplayed() {
        testCaseId="10173";
        Assert.assertTrue(SubscriptionPage.monthlySilverButtonIsDisplayed());
    }

    @Test(priority = 3)
    public void monthlyGoldIsDisplayed() {
        testCaseId="10175";
        Assert.assertTrue(SubscriptionPage.monthlyGoldButtonIsDisplayed());
    }

    @Test(priority = 4)
    public void viewThreeMonthSubscriptions() {
        testCaseId="10176";
        SubscriptionPage.clickThreeMonthsButton();
        Assert.assertEquals(SubscriptionPage.getThreeMonthsBronzePriceText(), testDataWeb.getThreeMonthsBronzePrice());
    }
    @Test(priority = 5)
    public void threeMonthsBronzeIsDisplayed() {
        testCaseId="10178";
        Assert.assertTrue(SubscriptionPage.threeMonthsBronzeButtonIsDisplayed());
    }

    @Test(priority = 5)
    public void threeMonthsSilverIsDisplayed() {
        testCaseId="10179";
        Assert.assertTrue(SubscriptionPage.threeMonthsSilverButtonIsDisplayed());
    }

    @Test(priority = 5)
    public void threeMonthsGoldIsDisplayed() {
        testCaseId="10180";
        Assert.assertTrue(SubscriptionPage.threeMonthsGoldButtonIsDisplayed());
    }
    @Test(priority = 6)
    public void viewSixMonthSubscriptions() {
        testCaseId="10181";
        SubscriptionPage.clickSixMonthsButton();
        Assert.assertEquals(SubscriptionPage.getSixMonthsBronzePriceText(), testDataWeb.getSixMonthsBronzePrice());
    }
    @Test(priority = 7)
    public void sixMonthsBronzeIsDisplayed() {
        testCaseId="10182";
        Assert.assertTrue(SubscriptionPage.sixMonthsBronzeButtonIsDisplayed());
    }
    @Test(priority = 7)
    public void sixMonthsSilverIsDisplayed() {
        testCaseId="10183";
        Assert.assertTrue(SubscriptionPage.sixMonthsSilverButtonIsDisplayed());
    }

    @Test(priority = 7)
    public void sixMonthsGoldIsDisplayed() {
        testCaseId="10184";
        Assert.assertTrue(SubscriptionPage.sixMonthsGoldButtonIsDisplayed());
    }

    @Test(priority = 8)
    public void openCompleteSubscription() {
        testCaseId="10185";
        SubscriptionPage.clickSixMonthsBronzeButton();
        Assert.assertEquals(SubscriptionPage.getLoginPopUpTitleText(), testDataWeb.getLoginPopUpText());
    }

    @Test(priority = 9)
    public void signInButtonIsDisplayed() {
        testCaseId="10187";
        SubscriptionPage.switchToFrame("iframe");
        Assert.assertTrue(SubscriptionPage.signInButtonIsDisplayed());
    }

    @Test(priority = 9)
    public void signInWithGoogle() {
        testCaseId="10188";
        SubscriptionPage.clickSignInWithGoogleButton();
        Assert.assertEquals(SubscriptionPage.getSignInWindowTitleText(), testDataWeb.getSignInWindowTitleText());
    }

    @Test(priority = 10)
    public void inputOnEmailField() {
        testCaseId="10190";
        SubscriptionPage.inputOnEmailField();
        Assert.assertEquals(SubscriptionPage.getEmailFieldInputText(), testDataWeb.getEmail());
    }

    @Test(priority = 11)
    public void clickOnNextToPasswordButton() {
        testCaseId="10191";
        SubscriptionPage.clickOnNextToPasswordButton();
        Assert.assertEquals(SubscriptionPage.getLoggedInEmailLabelText(), testDataWeb.getEmail());
    }

    @Test(priority = 12)
    public void inputOnPasswordField() {
        testCaseId="10193";
        SubscriptionPage.inputOnPasswordField();
        Assert.assertEquals(SubscriptionPage.getPasswordFieldInputText(), testDataWeb.getPassword());
    }

    @Test(priority = 13)
    public void clickOnNextButton() {
        testCaseId="10194";
        SubscriptionPage.clickOnNextButton();
        Assert.assertEquals(CheckoutPage.getCheckoutTitleText(), testDataWeb.getCheckoutTitleText());
    }
    @AfterMethod
    public void reportResult(ITestResult result) throws APIException, IOException {
        WebFinder.afterMethod(result,testCaseId);
    }
}
