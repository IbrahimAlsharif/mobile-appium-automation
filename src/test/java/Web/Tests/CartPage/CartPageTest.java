package Web.Tests.CartPage;

import org.testng.Assert;
import org.testng.annotations.Test;

import static Base.WebSetup.WebSetupTest.testDataWeb;

public class CartPageTest {

    @Test(priority = 1)
    public void cartItemIsDisplayed() {
        Assert.assertTrue(CartPage.CartItemIsDisplayed());
    }

    @Test(priority = 2)
    public void productNameIsDisplayed() {
        Assert.assertTrue(CartPage.ProductNameIsDisplayed());
    }

    @Test(priority = 2)
    public void productNameTextIsCorrect() {
        Assert.assertEquals(CartPage.getProductNameText(), testDataWeb.getProductNameOnCartPage());
    }

    @Test(priority = 3)
    public void productPriceTextIsCorrect() {
        Assert.assertEquals(CartPage.getProductPriceText(), testDataWeb.getProductPriceOnCartPage());
    }

    @Test(priority = 4)
    public void productSubTotalTextIsCorrect() {
        Assert.assertEquals(CartPage.getProductSubTotalPriceText(), testDataWeb.getProductSubTotalPriceOnCartPage());
    }

    @Test(priority = 5)
    public void couponCodeInputIsDisplayed() {
        Assert.assertTrue(CartPage.CouponCodeInputIsDisplayed());
    }

    @Test(priority = 6)
    public void applyCouponButtonIsDisplayed() {
        Assert.assertTrue(CartPage.ApplyCouponButtonIsDisplayed());
    }

    @Test(priority = 7)
    public void totalShoppingCartTextIsDisplayed() {
        Assert.assertTrue(CartPage.TotalShoppingCartTextIsDisplayed());
    }

    @Test(priority = 8)
    public void amountTotalPriceTextIsCorrect() {
        Assert.assertEquals(CartPage.getAmountPriceText(), testDataWeb.getAmountTotalPriceOnCartPage());
    }
    @Test(priority = 9)
    public void finalTotalAmountPriceTextIsCorrect() {
        Assert.assertEquals(CartPage.getFinalTotalAmountPriceText(), testDataWeb.getFinalTotalAmountPriceOnCartPage());
    }

    @Test(priority = 10)
    public void checkoutButtonIsDisplayed() {
        Assert.assertTrue(CartPage.CheckoutButtonIsDisplayed());
    }

    @Test(priority = 11)
    public void checkoutButtonIsClickable() {
        CartPage.clickOnCheckoutButton();
        Assert.assertTrue(CartPage.CompleteOrderIsDisplayed());
    }

}
