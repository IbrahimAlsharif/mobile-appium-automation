package Web.Tests.StorePage;

import org.testng.Assert;
import org.testng.annotations.Test;

import static Base.WebSetup.WebSetupTest.testDataWeb;

public class StorePageTest {
    @Test(priority = 1)
    public void addToCartButtonIsDisplayed() {
        Assert.assertTrue(StorePage.AddToCartButtonIsDisplayed());
    }
    @Test(priority = 1)
    public void coursePriceTextIsCorrect() {
        Assert.assertEquals(StorePage.getCoursePriceText(), testDataWeb.getCoursePriceNumberOnStorePage());
    }
    @Test(priority = 2)
    public void addToCartButtonTextIsCorrect() {
        Assert.assertEquals(StorePage.getAddToCartButtonText(), testDataWeb.getAddToCartButtonText());
    }

    @Test(priority = 3)
    public void addToCartButtonIsClickable() {
        StorePage.clickOnAddToCartButton();
        Assert.assertTrue(StorePage.ViewCartButtonIsDisplayed());
    }
    @Test(priority = 5)
    public void viewCartButtonIsDisplayed() {
        Assert.assertTrue(StorePage.ViewCartButtonIsDisplayed());
    }
    @Test(priority = 6)
    public void viewCartButtonTextIsCorrect() {
        Assert.assertEquals(StorePage.getViewCartButtonText(), testDataWeb.getViewCartButtonText());
    }
    @Test(priority = 7)
    public void viewCartButtonIsClickable() {
        StorePage.clickOnViewCartButton();
        Assert.assertTrue(StorePage.ShoppingCartTextIsDisplayed());
    }
}
