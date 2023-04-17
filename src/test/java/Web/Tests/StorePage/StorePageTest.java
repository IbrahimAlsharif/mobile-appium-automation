package Web.Tests.StorePage;

import org.testng.Assert;
import org.testng.annotations.Test;

import static Base.WebSetup.WebSetupTest.testDataWeb;

public class StorePageTest {
    private String testCaseId;
    @Test(priority = 1)
    public void addToCartButtonIsDisplayed() {
        testCaseId="C10189";
        Assert.assertTrue(StorePage.AddToCartButtonIsDisplayed());
    }
    @Test(priority = 1)
    public void coursePriceTextIsCorrect() {
        testCaseId="C10192";
        Assert.assertEquals(StorePage.getCoursePriceText(), testDataWeb.getCoursePriceNumberOnStorePage());
    }
    @Test(priority = 2)
    public void addToCartButtonTextIsCorrect() {
        testCaseId="C10195";
        Assert.assertEquals(StorePage.getAddToCartButtonText(), testDataWeb.getAddToCartButtonText());
    }

    @Test(priority = 3)
    public void addToCartButtonIsClickable() {
        testCaseId="C10196";
        StorePage.clickOnAddToCartButton();
        Assert.assertTrue(StorePage.ViewCartButtonIsDisplayed());
    }
    @Test(priority = 5)
    public void viewCartButtonIsDisplayed() {
        testCaseId="C10197";
        Assert.assertTrue(StorePage.ViewCartButtonIsDisplayed());
    }
    @Test(priority = 6)
    public void viewCartButtonTextIsCorrect() {
        testCaseId="C10198";
        Assert.assertEquals(StorePage.getViewCartButtonText(), testDataWeb.getViewCartButtonText());
    }
    @Test(priority = 7)
    public void viewCartButtonIsClickable() {
        testCaseId="C10199";
        StorePage.clickOnViewCartButton();
        Assert.assertTrue(StorePage.ShoppingCartTextIsDisplayed());
    }
}
