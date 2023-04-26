package Mobile.Tests.Payment;
import Base.MobileSetup.MobileFinder;
import Base.MobileSetup.MobileSetupTest;
import Mobile.Tests.AllSpecialists.Psychologist;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;
import static Base.MobileSetup.MobileSetupTest.*;



public class PaymentPageTest {
    private String testCaseId;
    @Test(priority = 1)
    public void VerifyTheExistenceOfTextAtTapBar() {
        testCaseId = "2786";
        assertTrue(PaymentPage.paymentButtonIsDisplayed());
    }
    @Test(priority = 2)
    public void VerifyTheTextEqualtoPayment() {
        testCaseId = "3165";
        assertTrue(PaymentPage.paymentButtonIsDisplayed());
    }
    @Test(priority = 3)
    public void VerifyTheExistenceOfBackIconAtTapBar() {
        testCaseId = "2787";
        assertTrue(PaymentPage.BackIconIsDisplayed());
    }
    @Test(priority = 4)
    public void VerifyTheExistenceOfCouponField() {
        testCaseId = "2788";
        assertTrue(PaymentPage.CouponFieldIsDisplayed());
    }
   @Test(priority = 5)
    public void VerifyTheExistenceOFSubscriptionNameSelect () {
        testCaseId = "10338";
       assertTrue(PaymentPage.bronzeSubscriptionIsDisplayed());
    }
    @Test(priority = 6)
    public void VerifyTheCouponWithoutPriceIsCorrect () {
        testCaseId = "2949";
       assertTrue(PaymentPage.CouponWithoutPriceIsDisplayed());
    }
    @Test(priority = 7)
    public void VerifyTheCouponWithoutDiscountIsCorrect () {
        testCaseId = "10339";
       assertTrue(PaymentPage.CouponWithoutDiscountIsDisplayed());
    }
    @Test(priority = 8)
    public void VerifyCouponWithoutVATCollectedIsCorrect () {
        testCaseId = "10340";
       assertTrue(PaymentPage.CouponWithoutVATCollectedIsDisplayed());
    }
    @Test(priority = 9)
    public void VerifyCouponWithoutTotalAfterVATIsCorrect () {
        testCaseId = "10341";
       assertTrue(PaymentPage.CouponWithoutTotalAfterVATIsDisplayed());
    }
    @Test(priority = 10)
    public void   VerifyTheExistenceOfPaymentButton() {
        testCaseId = "2790";
       assertTrue(PaymentPage.payButtonIsDisplayed());
    }
    @Test(priority = 11)
    public void   VerifyThatTheTextEqualToPay() {
        testCaseId = "3171";
       assertTrue(PaymentPage.payButtonIsDisplayed());
    }
    @Test(priority = 12)
    public void  VerifyTheExistenceOfImageBelowPaymentButton() {
        testCaseId = "3642";
       assertTrue(PaymentPage.ImageBelowPaymentButtonIsDisplayed());
    }

    @Test(priority = 13)
    public void  VerifyThatTheTextEqualToPaymentMethodSelection() {
        testCaseId = "3844";
        assertTrue(PaymentPage.payButtonIsDisplayed());
    }
    @Test(priority = 14)
    public void  VerifyThatPressingOnPaymentButtonleadToAppearBottomSheet() {
        testCaseId = "2792";
        PaymentPage.clickOnPayButton();
        assertTrue(PaymentPage.PaymentMethodSelectionDisplayed());

    }
    @Test(priority = 15)
    public void  VerifyTheExistenceofPaymentByVisaOptionInBottomSheet() {
        testCaseId = "2793";
        assertTrue(PaymentPage.PaymentByVisaIsDisplayed());
    }
    @Test(priority = 16)
    public void  verifyTheExistenceofPaymentByMadaOptionInBottomSheet() {
        testCaseId = "2794";
        assertTrue(PaymentPage.PaymentByMadaIsDisplayed());
    }

    @Test(priority = 17)
    public void  verifyTheExistenceofPaymentByTabbyOptionInBottomSheet() {
        testCaseId = "3765";
        assertTrue(PaymentPage.PaymentByTabbyIsDisplayed());
    }

    @Test(priority = 18)
    public void  verifyTheInputInTheCouponFiled() throws InterruptedException {
        testCaseId = "10342";
        PaymentPage.clickOnBottomSheetHide();
        Thread.sleep(4000);
        PaymentPage.clickOnCouponField();
        Thread.sleep(4000);
        PaymentPage.inputOnCouponField(testDataMobile.getCouponText());
        Assert.assertEquals(PaymentPage.getCouponField().getText(), testDataMobile.getCouponText());
    }
    @Test(priority = 19)
    public void  VerifyTheExistenceOfCheckButton() {
        testCaseId = "2789";
        assertTrue(PaymentPage.CheckButtonIsDisplayed());
    }
    @Test(priority = 20)
    public void   verifyThatDiscountActivation() {
        testCaseId = "10343";
       PaymentPage.clickOnCheckButton();
        assertTrue(PaymentPage.CompletedButtonIsDisplayed());
    }

    @Test(priority = 21)
    public void VerifyTheCouponWithPriceIsCorrect () {
        testCaseId = "10344";
        assertTrue(PaymentPage.CouponWithPriceIsDisplayed());
    }
    @Test(priority = 22)
    public void VerifyTheCouponWithDiscountIsCorrect () {
        testCaseId = "10345";
        assertTrue(PaymentPage.CouponWithDiscountIsDisplayed());
    }
    @Test(priority = 23)
    public void VerifyCouponWithVATCollectedIsCorrect () {
        testCaseId = "10346";
        assertTrue(PaymentPage.CouponWithVATCollectedIsDisplayed());
    }
    @Test(priority = 24)
    public void VerifyCouponWithTotalAfterVATIsCorrect () {
        testCaseId = "10347";
        assertTrue(PaymentPage.CouponWithTotalAfterVATIsDisplayed());
    }
    @Test(priority = 25,enabled = false)
    public void CompletedButtonIsDisplayed () {
        testCaseId = "10348";
        assertTrue(PaymentPage.CompletedButtonIsDisplayed());
    }


}
