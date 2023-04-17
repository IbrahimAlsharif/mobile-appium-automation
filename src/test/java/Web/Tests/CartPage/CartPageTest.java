package Web.Tests.CartPage;

import org.testng.Assert;
import org.testng.annotations.Test;

import static Base.WebSetup.WebSetupTest.testDataWeb;

public class CartPageTest {
    private String testCaseId;

    @Test(priority = 1)
    public void cartItemIsDisplayed() {
        testCaseId = "C10200";
        Assert.assertTrue(CartPage.CartItemIsDisplayed());
    }

    @Test(priority = 2)
    public void productNameIsDisplayed() {
        testCaseId = "C10201";
        Assert.assertTrue(CartPage.ProductNameIsDisplayed());
    }

    @Test(priority = 2)
    public void productNameTextIsCorrect() {
        testCaseId = "C10202";
        Assert.assertEquals(CartPage.getProductNameText(), testDataWeb.getProductNameOnCartPage());
    }

    @Test(priority = 3)
    public void productPriceTextIsCorrect() {
        testCaseId = "C10203";
        Assert.assertEquals(CartPage.getProductPriceText(), testDataWeb.getProductPriceOnCartPage());
    }

    @Test(priority = 4)
    public void productSubTotalTextIsCorrect() {
        testCaseId = "C10204";
        Assert.assertEquals(CartPage.getProductSubTotalPriceText(), testDataWeb.getProductSubTotalPriceOnCartPage());
    }

    @Test(priority = 5)
    public void couponCodeInputIsDisplayed() {
        testCaseId = "C10205";
        Assert.assertTrue(CartPage.CouponCodeInputIsDisplayed());
    }

    @Test(priority = 6)
    public void applyCouponButtonIsDisplayed() {
        testCaseId = "C10206";
        Assert.assertTrue(CartPage.ApplyCouponButtonIsDisplayed());
    }

    @Test(priority = 7)
    public void totalShoppingCartTextIsDisplayed() {
        testCaseId = "C10207";
        Assert.assertTrue(CartPage.TotalShoppingCartTextIsDisplayed());
    }

    @Test(priority = 8)
    public void amountTotalPriceTextIsCorrect() {
        testCaseId = "C10208";
        Assert.assertEquals(CartPage.getAmountPriceText(), testDataWeb.getAmountTotalPriceOnCartPage());
    }

    @Test(priority = 9)
    public void finalTotalAmountPriceTextIsCorrect() {
        testCaseId = "C10209";
        Assert.assertEquals(CartPage.getFinalTotalAmountPriceText(), testDataWeb.getFinalTotalAmountPriceOnCartPage());
    }

    @Test(priority = 10)
    public void checkoutButtonIsDisplayed() {
        testCaseId = "C10210";
        Assert.assertTrue(CartPage.CheckoutButtonIsDisplayed());
    }

    @Test(priority = 11)
    public void checkoutButtonIsClickable() {
        testCaseId = "C10211";
        CartPage.clickOnCheckoutButton();
        Assert.assertTrue(CartPage.CompleteOrderIsDisplayed());
    }

}
