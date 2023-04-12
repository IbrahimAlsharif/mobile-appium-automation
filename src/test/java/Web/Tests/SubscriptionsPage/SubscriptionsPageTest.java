package Web.Tests.SubscriptionsPage;

import Web.Tests.CheckoutPage.CheckoutPage;
import org.openqa.selenium.By;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

import static Base.WebSetup.WebSetupTest.testDataWeb;
import static Base.WebSetup.WebSetupTest.webDriver;

public class SubscriptionsPageTest {
    @Test(priority = 1)
    public void monthlyButtonIsDisplayed() {
        assertTrue(SubscriptionPage.monthlyButtonIsDisplayed());
    }

    @Test(priority = 1)
    public void threeMonthsButtonIsDisplayed() {
        assertTrue(SubscriptionPage.threeMonthsButtonIsDisplayed());
    }

    @Test(priority = 1)
    public void sixMonthsButtonIsDisplayed() {
        assertTrue(SubscriptionPage.sixMonthsButtonIsDisplayed());
    }

    @Test(priority = 2)
    public void viewMonthlySubscriptions() {
        SubscriptionPage.clickOnMonthlyButton();
        assertEquals(SubscriptionPage.getMonthlyBronzePriceText(), testDataWeb.getMonthlyBronzePrice());
    }
    @Test(priority = 3)
    public void monthlyBronzeIsDisplayed() {
        assertTrue(SubscriptionPage.monthlyBronzeButtonIsDisplayed());
    }
    @Test(priority = 3)
    public void monthlySilverIsDisplayed() {
        assertTrue(SubscriptionPage.monthlySilverButtonIsDisplayed());
    }

    @Test(priority = 3)
    public void monthlyGoldIsDisplayed() {
        assertTrue(SubscriptionPage.monthlyGoldButtonIsDisplayed());
    }

    @Test(priority = 4)
    public void viewThreeMonthSubscriptions() {
        SubscriptionPage.clickThreeMonthsButton();
        assertEquals(SubscriptionPage.getThreeMonthsBronzePriceText(), testDataWeb.getThreeMonthsBronzePrice());
    }
    @Test(priority = 5)
    public void threeMonthsBronzeIsDisplayed() {
        assertTrue(SubscriptionPage.threeMonthsBronzeButtonIsDisplayed());
    }

    @Test(priority = 5)
    public void threeMonthsSilverIsDisplayed() {
        assertTrue(SubscriptionPage.threeMonthsSilverButtonIsDisplayed());
    }

    @Test(priority = 5)
    public void threeMonthsGoldIsDisplayed() {
        assertTrue(SubscriptionPage.threeMonthsGoldButtonIsDisplayed());
    }
    @Test(priority = 6)
    public void viewSixMonthSubscriptions() {
        SubscriptionPage.clickSixMonthsButton();
        assertEquals(SubscriptionPage.getSixMonthsBronzePriceText(), testDataWeb.getSixMonthsBronzePrice());
    }
    @Test(priority = 7)
    public void sixMonthsBronzeIsDisplayed() {
        assertTrue(SubscriptionPage.sixMonthsBronzeButtonIsDisplayed());
    }
    @Test(priority = 7)
    public void sixMonthsSilverIsDisplayed() {
        assertTrue(SubscriptionPage.sixMonthsSilverButtonIsDisplayed());
    }

    @Test(priority = 7)
    public void sixMonthsGoldIsDisplayed() {
        assertTrue(SubscriptionPage.sixMonthsGoldButtonIsDisplayed());
    }

    @Test(priority = 8)
    public void openCompleteSubscription() {
        SubscriptionPage.clickSixMonthsBronzeButton();
        assertEquals(SubscriptionPage.getLoginPopUpTitleText(), testDataWeb.getLoginPopUpText());
    }

    @Test(priority = 9)
    public void signInButtonIsDisplayed() {
        SubscriptionPage.switchToFrame("iframe");
        assertTrue(SubscriptionPage.signInButtonIsDisplayed());
    }

    @Test(priority = 9)
    public void signInWithGoogle() {
        SubscriptionPage.clickSignInWithGoogleButton();
        assertEquals(SubscriptionPage.getSignInWindowTitleText(), testDataWeb.getSignInWindowTitleText());
    }

    @Test(priority = 10)
    public void inputOnEmailField() {
        SubscriptionPage.inputOnEmailField();
        assertEquals(SubscriptionPage.getEmailFieldInputText(), testDataWeb.getEmail());
    }

    @Test(priority = 11)
    public void clickOnNextToPasswordButton() {
        SubscriptionPage.clickOnNextToPasswordButton();
        assertEquals(SubscriptionPage.getLoggedInEmailLabelText(), testDataWeb.getEmail());
    }

    @Test(priority = 12)
    public void inputOnPasswordField() {
        SubscriptionPage.inputOnPasswordField();
        assertEquals(SubscriptionPage.getPasswordFieldInputText(), testDataWeb.getPassword());
    }

    @Test(priority = 13)
    public void clickOnNextButton() {
        SubscriptionPage.clickOnNextButton();
        assertEquals(CheckoutPage.getCheckoutTitleText(), testDataWeb.getCheckoutTitleText());
    }
}
