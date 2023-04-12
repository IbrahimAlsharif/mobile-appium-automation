package Web.Tests.StorePage;

import static org.testng.Assert.*;
import org.testng.annotations.Test;

import static Base.WebSetup.WebSetupTest.testDataWeb;

public class StorePageTest {
    @Test(priority = 1)
    public void addToCartButtonIsDisplayed() {
        assertTrue(StorePage.AddToCartButtonIsDisplayed());
    }
    @Test(priority = 1)
    public void coursePriceTextIsCorrect() {
        assertEquals(StorePage.getCoursePriceText(), testDataWeb.getCoursePriceNumberOnStorePage());
    }
    @Test(priority = 2)
    public void addToCartButtonTextIsCorrect() {
        assertEquals(StorePage.getAddToCartButtonText(), testDataWeb.getAddToCartButtonText());
    }

    @Test(priority = 3)
    public void addToCartButtonIsClickable() {
        StorePage.clickOnAddToCartButton();
        assertTrue(StorePage.ViewCartButtonIsDisplayed());
    }
    @Test(priority = 5)
    public void viewCartButtonIsDisplayed() {
        assertTrue(StorePage.ViewCartButtonIsDisplayed());
    }
    @Test(priority = 6)
    public void viewCartButtonTextIsCorrect() {
        assertEquals(StorePage.getViewCartButtonText(), testDataWeb.getViewCartButtonText());
    }
    @Test(priority = 7)
    public void viewCartButtonIsClickable() {
        StorePage.clickOnViewCartButton();
        assertTrue(StorePage.ShoppingCartTextIsDisplayed());
    }
}
