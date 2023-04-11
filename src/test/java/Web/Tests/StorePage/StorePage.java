package Web.Tests.StorePage;

import Base.WebSetup.WebFinder;
import org.openqa.selenium.WebElement;

public class StorePage {
    public static WebElement getAddToCartButton() {
        String xpath = "//button[@name='add-to-cart']";
        return WebFinder.getByXpath(xpath, true);
    }

    public static boolean AddToCartButtonIsDisplayed() {
        return getAddToCartButton().isDisplayed();
    }

    public static String getAddToCartButtonText() {
        return getAddToCartButton().getText();
    }

    public static void clickOnAddToCartButton() {
        getAddToCartButton().click();
    }
    public static WebElement getCoursePriceElement() {
        String xpath = "//*[@id=\"product-17548\"]/div[2]/p/span";
        return WebFinder.getByXpath(xpath, false);
    }
    public static String getCoursePriceText() {
        return getCoursePriceElement().getText();
    }

    public static WebElement getViewCartButton() {
        String xpath = "//a[@tabindex='1']";
        return WebFinder.getByXpath(xpath, true);
    }

    public static boolean ViewCartButtonIsDisplayed() {
        return getViewCartButton().isDisplayed();
    }

    public static String getViewCartButtonText() {
        return getViewCartButton().getText();
    }

    public static void clickOnViewCartButton() {
        getViewCartButton().click();
    }

    public static WebElement getShoppingCartText() {
        String xpath = "//div[@class='page-header_title']";
        return WebFinder.getByXpath(xpath, false);
    }

    public static boolean ShoppingCartTextIsDisplayed() {
        return getShoppingCartText().isDisplayed();
    }

}
