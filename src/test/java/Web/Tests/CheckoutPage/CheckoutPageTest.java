package Web.Tests.CheckoutPage;

import org.testng.Assert;
import org.testng.annotations.Test;

import static Base.WebSetup.WebSetupTest.testDataWeb;

public class CheckoutPageTest {
    private String testCaseId;
    @Test(priority = 1)
    public void checkoutTitleIsDisplayed() {
        testCaseId="C10213";
        Assert.assertTrue(CheckoutPage.checkoutTitleIsDisplayed());
    }
    @Test(priority = 1)
    public void checkoutTitleIsCorrect() {
        testCaseId="C10214";
        Assert.assertEquals(CheckoutPage.getCheckoutTitleText(), testDataWeb.getCheckoutTitleText());
    }
    @Test(priority = 1)
    public void packageTitleIsDisplayed() {
        testCaseId="C10216";
        Assert.assertTrue(CheckoutPage.packageTitleIsDisplayed());
    }
    @Test(priority = 1)
    public void packageTitleIsCorrect() {
        testCaseId="C10228";
        Assert.assertEquals(CheckoutPage.getPackageTitleText(), testDataWeb.getCheckoutPackageTitle());
    }
    @Test(priority = 1)
    public void packageSTitleIsDisplayed() {
        testCaseId="C10230";
        Assert.assertTrue(CheckoutPage.packageSTitleIsDisplayed());
    }
    @Test(priority = 1)
    public void packageSTitleIsCorrect() {
        testCaseId="C10233";
        Assert.assertEquals(CheckoutPage.getPackageSTitleText(), testDataWeb.getCheckoutPackageTitle());
    }
    @Test(priority = 1)
    public void paymentDetailsTitleIsDisplayed() {
        testCaseId="C10235";
        Assert.assertTrue(CheckoutPage.paymentDetailsTitleIsDisplayed());
    }
    @Test(priority = 1)
    public void priceTextIsDisplayed() {
        testCaseId="C10236";
        Assert.assertTrue(CheckoutPage.priceTextIsDisplayed());
    }
    @Test(priority = 1)
    public void discountTextIsDisplayed() {
        testCaseId="C10237";
        Assert.assertTrue(CheckoutPage.discountTextIsDisplayed());
    }
    @Test(priority = 1)
    public void taxTextIsDisplayed() {
        testCaseId="C10239";
        Assert.assertTrue(CheckoutPage.taxTextIsDisplayed());
    }
    @Test(priority = 1)
    public void totalPriceTextIsDisplayed() {
        testCaseId="C10241";
        Assert.assertTrue(CheckoutPage.totalPriceTextIsDisplayed());
    }
    @Test(priority = 1)
    public void priceValueIsDisplayed() {
        testCaseId="C10242";
        Assert.assertTrue(CheckoutPage.priceValueIsDisplayed());
    }
    @Test(priority = 1)
    public void discountValueIsDisplayed() {
        testCaseId="C10244";
        Assert.assertTrue(CheckoutPage.discountValueIsDisplayed());
    }
    @Test(priority = 1)
    public void taxValueIsDisplayed() {
        testCaseId="C10246";
        Assert.assertTrue(CheckoutPage.getTaxValueIsDisplayed());
    }
    @Test(priority = 1)
    public void totalPriceValueIsDisplayed() {
        testCaseId="C10247";
        Assert.assertTrue(CheckoutPage.getTotalPriceValueIsDisplayed());
    }
    @Test(priority = 1)
    public void priceValueIsCorrect() {
        testCaseId="C10248";
        Assert.assertEquals(CheckoutPage.getPriceValueText(), testDataWeb.getPriceValue());
    }
    @Test(priority = 1)
    public void discountValueIsCorrect() throws InterruptedException {
        testCaseId="C10249";
        Thread.sleep(9000);
        Assert.assertEquals(CheckoutPage.getDiscountValueText(), testDataWeb.getDiscountValue());
    }
    @Test(priority = 1)
    public void taxValueIsCorrect() {
        testCaseId="C10250";
        Assert.assertEquals(CheckoutPage.taxValueText(), testDataWeb.getTaxValue());
    }
    @Test(priority = 1)
    public void totalPriceValueIsCorrect() {
        testCaseId="C10251";
        Assert.assertEquals(CheckoutPage.totalPriceValueText(), testDataWeb.getTotalPriceValue());
    }
    @Test(priority = 1)
    public void couponFieldIsDisplayed() {
        testCaseId="C10252";
        Assert.assertTrue(CheckoutPage.couponFieldIsDisplayed());
    }
    @Test(priority = 1)
    public void inputOnCouponField() {
        testCaseId="C10253";
        CheckoutPage.inputOnCouponField();
        Assert.assertEquals(CheckoutPage.getCouponInputText(), testDataWeb.getCouponCode());
    }
    @Test(priority = 1)
    public void couponButtonIsDisplayed() {
        testCaseId="C10254";
        Assert.assertTrue(CheckoutPage.couponButtonIsDisplayed());
    }
    @Test(priority = 1)
    public void paymentDataTextIsDisplayed() {
        testCaseId="C10255";
        Assert.assertTrue(CheckoutPage.paymentDataTextIsDisplayed());
    }
    @Test(priority = 1)
    public void cardImageIsDisplayed() {
        testCaseId="C10256";
        Assert.assertTrue(CheckoutPage.cardImageIsDisplayed());
    }
    @Test(priority = 1)
    public void cardNumberFieldIsDisplayed() {
        testCaseId="C10257";
        Assert.assertTrue(CheckoutPage.cardNumberFieldIsDisplayed());
    }
    @Test(priority = 1)
    public void cardNameFieldIsDisplayed() {
        testCaseId="C10258";
        Assert.assertTrue(CheckoutPage.cardNameFieldIsDisplayed());
    }
    @Test(priority = 1)
    public void cardExpiryFieldIsDisplayed() {
        testCaseId="C10259";
        Assert.assertTrue(CheckoutPage.cardExpiryFieldIsDisplayed());
    }
    @Test(priority = 1)
    public void cardPINFieldIsDisplayed() {
        testCaseId="C10260";
        Assert.assertTrue(CheckoutPage.cardPINFieldIsDisplayed());
    }
    @Test(priority = 2)
    public void inputOnCardNumberField() {
        testCaseId="C10261";
        CheckoutPage.inputOnCardNumberField();
        Assert.assertEquals(CheckoutPage.getCardNumberInputText(), testDataWeb.getCardNumber());
    }
    @Test(priority = 3)
    public void inputOnCardNameField() {
        testCaseId="C10262";
        CheckoutPage.inputOnCardNameField();
        Assert.assertEquals(CheckoutPage.getCardNameInputText(), testDataWeb.getCardName());
    }
    @Test(priority = 4)
    public void inputOnCardExpiryField() {
        testCaseId="C10264";
        CheckoutPage.inputOnCardExpiryField();
        Assert.assertEquals(CheckoutPage.getCardExpiryInputText(), testDataWeb.getCardExpiry());
    }
    @Test(priority = 5)
    public void inputOnCardPINField() {
        testCaseId="C10266";
        CheckoutPage.inputOnCardPINField();
        Assert.assertEquals(CheckoutPage.getCardPINInputText(), testDataWeb.getCardPIN());
    }
    @Test(priority = 6)
    public void payNowButtonIsDisplayed() {
        testCaseId="C10267";
        Assert.assertTrue(CheckoutPage.payNowButtonIsDisplayed());
    }
    @Test(priority = 7)
    public void clickOnNowButton() {
//        CheckoutPage.clickOnNowButton();
//        Assert.assertTrue(CheckoutPage.clickOnNowButton());
    }
}
