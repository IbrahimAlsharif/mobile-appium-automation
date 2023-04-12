package Web.Tests.CartPage;

import static org.testng.Assert.*;
import org.testng.annotations.Test;

import static Base.WebSetup.WebSetupTest.testDataWeb;

public class CartPageTest {

    @Test(priority = 1)
    public void cartItemIsDisplayed() {
        assertTrue(CartPage.CartItemIsDisplayed());
    }

    @Test(priority = 2)
    public void productNameIsDisplayed() {
        assertTrue(CartPage.ProductNameIsDisplayed());
    }

    @Test(priority = 2)
    public void productNameTextIsCorrect() {
        assertEquals(CartPage.getProductNameText(), testDataWeb.getProductNameOnCartPage());
    }

    @Test(priority = 3)
    public void productPriceTextIsCorrect() {
        assertEquals(CartPage.getProductPriceText(), testDataWeb.getProductPriceOnCartPage());
    }

    @Test(priority = 4)
    public void productSubTotalTextIsCorrect() {
        assertEquals(CartPage.getProductSubTotalPriceText(), testDataWeb.getProductSubTotalPriceOnCartPage());
    }

    @Test(priority = 5)
    public void couponCodeInputIsDisplayed() {
        assertTrue(CartPage.CouponCodeInputIsDisplayed());
    }

    @Test(priority = 6)
    public void applyCouponButtonIsDisplayed() {
        assertTrue(CartPage.ApplyCouponButtonIsDisplayed());
    }

    @Test(priority = 7)
    public void totalShoppingCartTextIsDisplayed() {
        assertTrue(CartPage.TotalShoppingCartTextIsDisplayed());
    }

    @Test(priority = 8)
    public void amountTotalPriceTextIsCorrect() {
        assertEquals(CartPage.getAmountPriceText(), testDataWeb.getAmountTotalPriceOnCartPage());
    }
    @Test(priority = 9)
    public void finalTotalAmountPriceTextIsCorrect() {
        assertEquals(CartPage.getFinalTotalAmountPriceText(), testDataWeb.getFinalTotalAmountPriceOnCartPage());
    }

    @Test(priority = 10)
    public void checkoutButtonIsDisplayed() {
        assertTrue(CartPage.CheckoutButtonIsDisplayed());
    }

    @Test(priority = 11)
    public void checkoutButtonIsClickable() {
        CartPage.clickOnCheckoutButton();
        assertTrue(CartPage.CompleteOrderIsDisplayed());
    }

}
