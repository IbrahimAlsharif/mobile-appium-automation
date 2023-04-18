package Web.Tests.CheckoutPage;

import org.testng.Assert;
import org.testng.annotations.Test;

import static Base.WebSetup.WebSetupTest.testDataWeb;

public class CheckoutPageTest {
    private String testCaseId;
    @Test(priority = 1)
    public void checkoutTitleIsDisplayed() {
        testCaseId="10213";
        Assert.assertTrue(CheckoutPage.checkoutTitleIsDisplayed());
    }
    @Test(priority = 1)
    public void checkoutTitleIsCorrect() {
        testCaseId="10214";
        Assert.assertEquals(CheckoutPage.getCheckoutTitleText(), testDataWeb.getCheckoutTitleText());
    }
    @Test(priority = 1)
    public void packageTitleIsDisplayed() {
        testCaseId="10216";
        Assert.assertTrue(CheckoutPage.packageTitleIsDisplayed());
    }
    @Test(priority = 1)
    public void packageTitleIsCorrect() {
        testCaseId="10228";
        Assert.assertEquals(CheckoutPage.getPackageTitleText(), testDataWeb.getCheckoutPackageTitle());
    }
    @Test(priority = 1)
    public void packageSTitleIsDisplayed() {
        testCaseId="10230";
        Assert.assertTrue(CheckoutPage.packageSTitleIsDisplayed());
    }
    @Test(priority = 1)
    public void packageSTitleIsCorrect() {
        testCaseId="10233";
        Assert.assertEquals(CheckoutPage.getPackageSTitleText(), testDataWeb.getCheckoutPackageTitle());
    }
    @Test(priority = 1)
    public void paymentDetailsTitleIsDisplayed() {
        testCaseId="10235";
        Assert.assertTrue(CheckoutPage.paymentDetailsTitleIsDisplayed());
    }
    @Test(priority = 1)
    public void priceTextIsDisplayed() {
        testCaseId="10236";
        Assert.assertTrue(CheckoutPage.priceTextIsDisplayed());
    }
    @Test(priority = 1)
    public void discountTextIsDisplayed() {
        testCaseId="10237";
        Assert.assertTrue(CheckoutPage.discountTextIsDisplayed());
    }
    @Test(priority = 1)
    public void taxTextIsDisplayed() {
        testCaseId="10239";
        Assert.assertTrue(CheckoutPage.taxTextIsDisplayed());
    }
    @Test(priority = 1)
    public void totalPriceTextIsDisplayed() {
        testCaseId="10241";
        Assert.assertTrue(CheckoutPage.totalPriceTextIsDisplayed());
    }
    @Test(priority = 1)
    public void priceValueIsDisplayed() {
        testCaseId="10242";
        Assert.assertTrue(CheckoutPage.priceValueIsDisplayed());
    }
    @Test(priority = 1)
    public void discountValueIsDisplayed() {
        testCaseId="10244";
        Assert.assertTrue(CheckoutPage.discountValueIsDisplayed());
    }
    @Test(priority = 1)
    public void taxValueIsDisplayed() {
        testCaseId="10246";
        Assert.assertTrue(CheckoutPage.getTaxValueIsDisplayed());
    }
    @Test(priority = 1)
    public void totalPriceValueIsDisplayed() {
        testCaseId="10247";
        Assert.assertTrue(CheckoutPage.getTotalPriceValueIsDisplayed());
    }
    @Test(priority = 1)
    public void priceValueIsCorrect() {
        testCaseId="10248";
        Assert.assertEquals(CheckoutPage.getPriceValueText(), testDataWeb.getPriceValue());
    }
    @Test(priority = 1)
    public void discountValueIsCorrect() throws InterruptedException {
        testCaseId="10249";
        Thread.sleep(9000);
        Assert.assertEquals(CheckoutPage.getDiscountValueText(), testDataWeb.getDiscountValue());
    }
    @Test(priority = 1)
    public void taxValueIsCorrect() {
        testCaseId="10250";
        Assert.assertEquals(CheckoutPage.taxValueText(), testDataWeb.getTaxValue());
    }
    @Test(priority = 1)
    public void totalPriceValueIsCorrect() {
        testCaseId="10251";
        Assert.assertEquals(CheckoutPage.totalPriceValueText(), testDataWeb.getTotalPriceValue());
    }
    @Test(priority = 1)
    public void couponFieldIsDisplayed() {
        testCaseId="10252";
        Assert.assertTrue(CheckoutPage.couponFieldIsDisplayed());
    }
    @Test(priority = 1)
    public void inputOnCouponField() {
        testCaseId="10253";
        CheckoutPage.inputOnCouponField();
        Assert.assertEquals(CheckoutPage.getCouponInputText(), testDataWeb.getCouponCode());
    }
    @Test(priority = 1)
    public void couponButtonIsDisplayed() {
        testCaseId="10254";
        Assert.assertTrue(CheckoutPage.couponButtonIsDisplayed());
    }
    @Test(priority = 1)
    public void paymentDataTextIsDisplayed() {
        testCaseId="10255";
        Assert.assertTrue(CheckoutPage.paymentDataTextIsDisplayed());
    }
    @Test(priority = 1)
    public void cardImageIsDisplayed() {
        testCaseId="10256";
        Assert.assertTrue(CheckoutPage.cardImageIsDisplayed());
    }
    @Test(priority = 1)
    public void cardNumberFieldIsDisplayed() {
        testCaseId="10257";
        Assert.assertTrue(CheckoutPage.cardNumberFieldIsDisplayed());
    }
    @Test(priority = 1)
    public void cardNameFieldIsDisplayed() {
        testCaseId="10258";
        Assert.assertTrue(CheckoutPage.cardNameFieldIsDisplayed());
    }
    @Test(priority = 1)
    public void cardExpiryFieldIsDisplayed() {
        testCaseId="10259";
        Assert.assertTrue(CheckoutPage.cardExpiryFieldIsDisplayed());
    }
    @Test(priority = 1)
    public void cardPINFieldIsDisplayed() {
        testCaseId="10260";
        Assert.assertTrue(CheckoutPage.cardPINFieldIsDisplayed());
    }
    @Test(priority = 2)
    public void inputOnCardNumberField() {
        testCaseId="10261";
        CheckoutPage.inputOnCardNumberField();
        Assert.assertEquals(CheckoutPage.getCardNumberInputText(), testDataWeb.getCardNumber());
    }
    @Test(priority = 3)
    public void inputOnCardNameField() {
        testCaseId="10262";
        CheckoutPage.inputOnCardNameField();
        Assert.assertEquals(CheckoutPage.getCardNameInputText(), testDataWeb.getCardName());
    }
    @Test(priority = 4)
    public void inputOnCardExpiryField() {
        testCaseId="10264";
        CheckoutPage.inputOnCardExpiryField();
        Assert.assertEquals(CheckoutPage.getCardExpiryInputText(), testDataWeb.getCardExpiry());
    }
    @Test(priority = 5)
    public void inputOnCardPINField() {
        testCaseId="10266";
        CheckoutPage.inputOnCardPINField();
        Assert.assertEquals(CheckoutPage.getCardPINInputText(), testDataWeb.getCardPIN());
    }
    @Test(priority = 6)
    public void payNowButtonIsDisplayed() {
        testCaseId="10267";
        Assert.assertTrue(CheckoutPage.payNowButtonIsDisplayed());
    }
    @Test(priority = 7)
    public void clickOnNowButton() {
//        CheckoutPage.clickOnNowButton();
//        Assert.assertTrue(CheckoutPage.clickOnNowButton());
    }
}
