package Web.Tests.CheckoutPage;

import static org.testng.Assert.*;
import org.testng.annotations.Test;

import static Base.WebSetup.WebSetupTest.testDataWeb;

public class CheckoutPageTest {
    @Test(priority = 1)
    public void checkoutTitleIsDisplayed() {
        assertTrue(CheckoutPage.checkoutTitleIsDisplayed());
    }
    @Test(priority = 1)
    public void checkoutTitleIsCorrect() {
        assertEquals(CheckoutPage.getCheckoutTitleText(), testDataWeb.getCheckoutTitleText());
    }
    @Test(priority = 1)
    public void packageTitleIsDisplayed() {
        assertTrue(CheckoutPage.packageTitleIsDisplayed());
    }
    @Test(priority = 1)
    public void packageTitleIsCorrect() {
        assertEquals(CheckoutPage.getPackageTitleText(), testDataWeb.getCheckoutPackageTitle());
    }
    @Test(priority = 1)
    public void packageSTitleIsDisplayed() {
        assertTrue(CheckoutPage.packageSTitleIsDisplayed());
    }
    @Test(priority = 1)
    public void packageSTitleIsCorrect() {
        assertEquals(CheckoutPage.getPackageSTitleText(), testDataWeb.getCheckoutPackageTitle());
    }
    @Test(priority = 1)
    public void paymentDetailsTitleIsDisplayed() {
        assertTrue(CheckoutPage.paymentDetailsTitleIsDisplayed());
    }
    @Test(priority = 1)
    public void priceTextIsDisplayed() {
        assertTrue(CheckoutPage.priceTextIsDisplayed());
    }
    @Test(priority = 1)
    public void discountTextIsDisplayed() {
        assertTrue(CheckoutPage.discountTextIsDisplayed());
    }
    @Test(priority = 1)
    public void taxTextIsDisplayed() {
        assertTrue(CheckoutPage.taxTextIsDisplayed());
    }
    @Test(priority = 1)
    public void totalPriceTextIsDisplayed() {
        assertTrue(CheckoutPage.totalPriceTextIsDisplayed());
    }
    @Test(priority = 1)
    public void priceValueIsDisplayed() {
        assertTrue(CheckoutPage.priceValueIsDisplayed());
    }
    @Test(priority = 1)
    public void discountValueIsDisplayed() {
        assertTrue(CheckoutPage.discountValueIsDisplayed());
    }
    @Test(priority = 1)
    public void taxValueIsDisplayed() {
        assertTrue(CheckoutPage.getTaxValueIsDisplayed());
    }
    @Test(priority = 1)
    public void totalPriceValueIsDisplayed() {
        assertTrue(CheckoutPage.getTotalPriceValueIsDisplayed());
    }
    @Test(priority = 1)
    public void priceValueIsCorrect() {
        assertEquals(CheckoutPage.getPriceValueText(), testDataWeb.getPriceValue());
    }
    @Test(priority = 1)
    public void discountValueIsCorrect() throws InterruptedException {
        Thread.sleep(9000);
        assertEquals(CheckoutPage.getDiscountValueText(), testDataWeb.getDiscountValue());
    }
    @Test(priority = 1)
    public void taxValueIsCorrect() {
        assertEquals(CheckoutPage.taxValueText(), testDataWeb.getTaxValue());
    }
    @Test(priority = 1)
    public void totalPriceValueIsCorrect() {
        assertEquals(CheckoutPage.totalPriceValueText(), testDataWeb.getTotalPriceValue());
    }
    @Test(priority = 1)
    public void couponFieldIsDisplayed() {
        assertTrue(CheckoutPage.couponFieldIsDisplayed());
    }
    @Test(priority = 1)
    public void inputOnCouponField() {
        CheckoutPage.inputOnCouponField();
        assertEquals(CheckoutPage.getCouponInputText(), testDataWeb.getCouponCode());
    }
    @Test(priority = 1)
    public void couponButtonIsDisplayed() {
        assertTrue(CheckoutPage.couponButtonIsDisplayed());
    }
    @Test(priority = 1)
    public void paymentDataTextIsDisplayed() {
        assertTrue(CheckoutPage.paymentDataTextIsDisplayed());
    }
    @Test(priority = 1)
    public void cardImageIsDisplayed() {
        assertTrue(CheckoutPage.cardImageIsDisplayed());
    }
    @Test(priority = 1)
    public void cardNumberFieldIsDisplayed() {
        assertTrue(CheckoutPage.cardNumberFieldIsDisplayed());
    }
    @Test(priority = 1)
    public void cardNameFieldIsDisplayed() {
        assertTrue(CheckoutPage.cardNameFieldIsDisplayed());
    }
    @Test(priority = 1)
    public void cardExpiryFieldIsDisplayed() {
        assertTrue(CheckoutPage.cardExpiryFieldIsDisplayed());
    }
    @Test(priority = 1)
    public void cardPINFieldIsDisplayed() {
        assertTrue(CheckoutPage.cardPINFieldIsDisplayed());
    }
    @Test(priority = 2)
    public void inputOnCardNumberField() {
        CheckoutPage.inputOnCardNumberField();
        assertEquals(CheckoutPage.getCardNumberInputText(), testDataWeb.getCardNumber());
    }
    @Test(priority = 3)
    public void inputOnCardNameField() {
        CheckoutPage.inputOnCardNameField();
        assertEquals(CheckoutPage.getCardNameInputText(), testDataWeb.getCardName());
    }
    @Test(priority = 4)
    public void inputOnCardExpiryField() {
        CheckoutPage.inputOnCardExpiryField();
        assertEquals(CheckoutPage.getCardExpiryInputText(), testDataWeb.getCardExpiry());
    }
    @Test(priority = 5)
    public void inputOnCardPINField() {
        CheckoutPage.inputOnCardPINField();
        assertEquals(CheckoutPage.getCardPINInputText(), testDataWeb.getCardPIN());
    }
    @Test(priority = 6)
    public void payNowButtonIsDisplayed() {
        assertTrue(CheckoutPage.payNowButtonIsDisplayed());
    }
    @Test(priority = 7)
    public void clickOnNowButton() {
//        CheckoutPage.clickOnNowButton();
//        Assert.assertTrue(CheckoutPage.clickOnNowButton());
    }
}
