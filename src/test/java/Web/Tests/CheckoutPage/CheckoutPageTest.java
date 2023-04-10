package Web.Tests.CheckoutPage;

import org.testng.Assert;
import org.testng.annotations.Test;

import static Base.WebSetup.WebSetupTest.testDataWeb;

public class CheckoutPageTest {
    @Test(priority = 1)
    public void checkoutTitleIsDisplayed() {
        Assert.assertTrue(CheckoutPage.checkoutTitleIsDisplayed());
    }
    @Test(priority = 1)
    public void checkoutTitleIsCorrect() {
        Assert.assertEquals(CheckoutPage.getCheckoutTitleText(), testDataWeb.getCheckoutTitleText());
    }
    @Test(priority = 1)
    public void packageTitleIsDisplayed() {
        Assert.assertTrue(CheckoutPage.packageTitleIsDisplayed());
    }
    @Test(priority = 1)
    public void packageTitleIsCorrect() {
        Assert.assertEquals(CheckoutPage.getPackageTitleText(), testDataWeb.getCheckoutPackageTitle());
    }
    @Test(priority = 1)
    public void packageSTitleIsDisplayed() {
        Assert.assertTrue(CheckoutPage.packageSTitleIsDisplayed());
    }
    @Test(priority = 1)
    public void packageSTitleIsCorrect() {
        Assert.assertEquals(CheckoutPage.getPackageSTitleText(), testDataWeb.getCheckoutPackageTitle());
    }
    @Test(priority = 1)
    public void paymentDetailsTitleIsDisplayed() {
        Assert.assertTrue(CheckoutPage.paymentDetailsTitleIsDisplayed());
    }
    @Test(priority = 1)
    public void priceTextIsDisplayed() {
        Assert.assertTrue(CheckoutPage.priceTextIsDisplayed());
    }
    @Test(priority = 1)
    public void discountTextIsDisplayed() {
        Assert.assertTrue(CheckoutPage.discountTextIsDisplayed());
    }
    @Test(priority = 1)
    public void taxTextIsDisplayed() {
        Assert.assertTrue(CheckoutPage.taxTextIsDisplayed());
    }
    @Test(priority = 1)
    public void totalPriceTextIsDisplayed() {
        Assert.assertTrue(CheckoutPage.totalPriceTextIsDisplayed());
    }
    @Test(priority = 1)
    public void priceValueIsDisplayed() {
        Assert.assertTrue(CheckoutPage.priceValueIsDisplayed());
    }
    @Test(priority = 1)
    public void discountValueIsDisplayed() {
        Assert.assertTrue(CheckoutPage.discountValueIsDisplayed());
    }
    @Test(priority = 1)
    public void taxValueIsDisplayed() {
        Assert.assertTrue(CheckoutPage.getTaxValueIsDisplayed());
    }
    @Test(priority = 1)
    public void totalPriceValueIsDisplayed() {
        Assert.assertTrue(CheckoutPage.getTotalPriceValueIsDisplayed());
    }
    @Test(priority = 1)
    public void priceValueIsCorrect() {
        Assert.assertEquals(CheckoutPage.getPriceValueText(), testDataWeb.getPriceValue());
    }
    @Test(priority = 1)
    public void discountValueIsCorrect() throws InterruptedException {
        Thread.sleep(9000);
        Assert.assertEquals(CheckoutPage.getDiscountValueText(), testDataWeb.getDiscountValue());
    }
    @Test(priority = 1)
    public void taxValueIsCorrect() {
        Assert.assertEquals(CheckoutPage.taxValueText(), testDataWeb.getTaxValue());
    }
    @Test(priority = 1)
    public void totalPriceValueIsCorrect() {
        Assert.assertEquals(CheckoutPage.totalPriceValueText(), testDataWeb.getTotalPriceValue());
    }
    @Test(priority = 1)
    public void couponFieldIsDisplayed() {
        Assert.assertTrue(CheckoutPage.couponFieldIsDisplayed());
    }
    @Test(priority = 1)
    public void inputOnCouponField() {
        CheckoutPage.inputOnCouponField();
        Assert.assertEquals(CheckoutPage.getCouponInputText(), testDataWeb.getCouponCode());
    }
    @Test(priority = 1)
    public void couponButtonIsDisplayed() {
        Assert.assertTrue(CheckoutPage.couponButtonIsDisplayed());
    }
    @Test(priority = 1)
    public void paymentDataTextIsDisplayed() {
        Assert.assertTrue(CheckoutPage.paymentDataTextIsDisplayed());
    }
    @Test(priority = 1)
    public void cardImageIsDisplayed() {
        Assert.assertTrue(CheckoutPage.cardImageIsDisplayed());
    }
    @Test(priority = 1)
    public void cardNumberFieldIsDisplayed() {
        Assert.assertTrue(CheckoutPage.cardNumberFieldIsDisplayed());
    }
    @Test(priority = 1)
    public void cardNameFieldIsDisplayed() {
        Assert.assertTrue(CheckoutPage.cardNameFieldIsDisplayed());
    }
    @Test(priority = 1)
    public void cardExpiryFieldIsDisplayed() {
        Assert.assertTrue(CheckoutPage.cardExpiryFieldIsDisplayed());
    }
    @Test(priority = 1)
    public void cardPINFieldIsDisplayed() {
        Assert.assertTrue(CheckoutPage.cardPINFieldIsDisplayed());
    }
    @Test(priority = 2)
    public void inputOnCardNumberField() {
        CheckoutPage.inputOnCardNumberField();
        Assert.assertEquals(CheckoutPage.getCardNumberInputText(), testDataWeb.getCardNumber());
    }
    @Test(priority = 3)
    public void inputOnCardNameField() {
        CheckoutPage.inputOnCardNameField();
        Assert.assertEquals(CheckoutPage.getCardNameInputText(), testDataWeb.getCardName());
    }
    @Test(priority = 4)
    public void inputOnCardExpiryField() {
        CheckoutPage.inputOnCardExpiryField();
        Assert.assertEquals(CheckoutPage.getCardExpiryInputText(), testDataWeb.getCardExpiry());
    }
    @Test(priority = 5)
    public void inputOnCardPINField() {
        CheckoutPage.inputOnCardPINField();
        Assert.assertEquals(CheckoutPage.getCardPINInputText(), testDataWeb.getCardPIN());
    }
    @Test(priority = 6)
    public void payNowButtonIsDisplayed() {
        Assert.assertTrue(CheckoutPage.payNowButtonIsDisplayed());
    }
    @Test(priority = 7)
    public void clickOnNowButton() {
//        CheckoutPage.clickOnNowButton();
//        Assert.assertTrue(CheckoutPage.clickOnNowButton());
    }
}
