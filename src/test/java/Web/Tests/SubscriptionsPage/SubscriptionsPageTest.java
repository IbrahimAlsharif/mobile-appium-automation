package Web.Tests.SubscriptionsPage;

import Web.Tests.CheckoutPage.CheckoutPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import static Base.WebSetup.WebSetupTest.testDataWeb;
import static Base.WebSetup.WebSetupTest.webDriver;

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
        Assert.assertEquals(SubscriptionPage.getLoginPopUpTitleText(), testDataWeb.getLoginPopUpText());
    }

    @Test(priority = 9)
    public void signInButtonIsDisplayed() {
        SubscriptionPage.switchToFrame("iframe");
        Assert.assertTrue(SubscriptionPage.signInButtonIsDisplayed());
    }

    @Test(priority = 9)
    public void signInWithGoogle() {
        SubscriptionPage.clickSignInWithGoogleButton();
        Assert.assertEquals(SubscriptionPage.getSignInWindowTitleText(), testDataWeb.getSignInWindowTitleText());
    }

    @Test(priority = 10)
    public void inputOnEmailField() {
        SubscriptionPage.inputOnEmailField();
        Assert.assertEquals(SubscriptionPage.getEmailFieldInputText(), testDataWeb.getEmail());
    }

    @Test(priority = 11)
    public void clickOnNextToPasswordButton() {
        SubscriptionPage.clickOnNextToPasswordButton();
        Assert.assertEquals(SubscriptionPage.getLoggedInEmailLabelText(), testDataWeb.getEmail());
    }

    @Test(priority = 12)
    public void inputOnPasswordField() {
        SubscriptionPage.inputOnPasswordField();
        Assert.assertEquals(SubscriptionPage.getPasswordFieldInputText(), testDataWeb.getPassword());
    }

    @Test(priority = 13)
    public void clickOnNextButton() {
        SubscriptionPage.clickOnNextButton();
        Assert.assertEquals(CheckoutPage.getCheckoutTitleText(), testDataWeb.getCheckoutTitleText());
    }
}
