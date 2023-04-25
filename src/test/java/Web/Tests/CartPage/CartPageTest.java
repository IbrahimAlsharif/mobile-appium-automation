package Web.Tests.CartPage;
// -*- coding: utf-8 -*-

import Base.WebSetup.WebFinder;
import TestRail.APIException;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.io.IOException;

import static Base.WebSetup.WebSetupTest.testDataWeb;

public class CartPageTest {
    private String testCaseId;

    @Test(priority = 1)
    public void cartItemIsDisplayed() {
        testCaseId="10200";
        Assert.assertTrue(CartPage.CartItemIsDisplayed());
    }

    @Test(priority = 2)
    public void productNameIsDisplayed() {
        testCaseId="10201";
        Assert.assertTrue(CartPage.ProductNameIsDisplayed());
    }

    @Test(priority = 2)
    public void productNameTextIsCorrect() {
        testCaseId="10202";
        Assert.assertEquals(CartPage.getProductNameText(), testDataWeb.getProductNameOnCartPage());
    }

    @Test(priority = 3)
    public void productPriceTextIsCorrect() {
        testCaseId="10203";
        Assert.assertEquals(CartPage.getProductPriceText(), testDataWeb.getProductPriceOnCartPage());
    }

    @Test(priority = 4)
    public void productSubTotalTextIsCorrect() {
        testCaseId="10204";
        Assert.assertEquals(CartPage.getProductSubTotalPriceText(), testDataWeb.getProductSubTotalPriceOnCartPage());
    }

    @Test(priority = 5)
    public void couponCodeInputIsDisplayed() {
        testCaseId="10205";
        Assert.assertTrue(CartPage.CouponCodeInputIsDisplayed());
    }

    @Test(priority = 6)
    public void applyCouponButtonIsDisplayed() {
        testCaseId="10206";
        Assert.assertTrue(CartPage.ApplyCouponButtonIsDisplayed());
    }

    @Test(priority = 7)
    public void totalShoppingCartTextIsDisplayed() {
        testCaseId="10207";
        Assert.assertTrue(CartPage.TotalShoppingCartTextIsDisplayed());
    }

    @Test(priority = 8)
    public void amountTotalPriceTextIsCorrect() {
        testCaseId="10208";
        Assert.assertEquals(CartPage.getAmountPriceText(), testDataWeb.getAmountTotalPriceOnCartPage());
    }

    @Test(priority = 9)
    public void finalTotalAmountPriceTextIsCorrect() {
        testCaseId="10209";
        Assert.assertEquals(CartPage.getFinalTotalAmountPriceText(), testDataWeb.getFinalTotalAmountPriceOnCartPage());
    }

    @Test(priority = 10)
    public void checkoutButtonIsDisplayed() {
        testCaseId="10210";
        Assert.assertTrue(CartPage.CheckoutButtonIsDisplayed());
    }

    @Test(priority = 11)
    public void checkoutButtonIsClickable() {
        testCaseId="10211";
        CartPage.clickOnCheckoutButton();
        Assert.assertTrue(CartPage.CompleteOrderIsDisplayed());
    }
    @AfterMethod
    public void reportResult(ITestResult result) throws APIException, IOException {
        WebFinder.afterMethod(result,testCaseId);
    }
}
