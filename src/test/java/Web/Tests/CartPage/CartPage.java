package Web.Tests.CartPage;

import Base.WebSetup.WebFinder;
import org.openqa.selenium.WebElement;

public class CartPage {

    public static WebElement getCartItem() {
        String xpath = "//*[@id=\"main-content\"]/div/form/table/tbody/tr[1]";
        return WebFinder.getByXpath(xpath, false);
    }

    public static boolean CartItemIsDisplayed() {
        return getCartItem().isDisplayed();
    }

    public static WebElement getProductName() {
        String xpath = "//*[@id=\"main-content\"]/div/form/table/tbody/tr[1]/td[2]/a";
        return WebFinder.getByXpath(xpath, false);
    }

    public static boolean ProductNameIsDisplayed() {
        return getProductName().isDisplayed();
    }
    public static String getProductNameText() {
        return getProductName().getText();
    }
    public static WebElement getProductPriceElement() {
        String xpath = "//*[@id=\"main-content\"]/div/form/table/tbody/tr[1]/td[3]/span";
        return WebFinder.getByXpath(xpath, false);
    }
    public static String getProductPriceText() {
        return getProductPriceElement().getText();
    }
    public static WebElement getProductSubTotalElement() {
        String xpath = "//*[@id=\"main-content\"]/div/form/table/tbody/tr[1]/td[5]/span";
        return WebFinder.getByXpath(xpath, false);
    }
    public static String getProductSubTotalPriceText() {
        return getProductSubTotalElement().getText();
    }
    public static WebElement getCouponCodeInput() {
        String xpath = "//input[@name='coupon_code']";
        return WebFinder.getByXpath(xpath, true);
    }
    public static boolean CouponCodeInputIsDisplayed() {
        return getCouponCodeInput().isDisplayed();
    }

    public static WebElement getApplyCouponButton() {
        String xpath = "//input[@name='coupon_code']";
        return WebFinder.getByXpath(xpath, true);
    }
    public static boolean ApplyCouponButtonIsDisplayed() {
        return getApplyCouponButton().isDisplayed();
    }

    public static WebElement getTotalShoppingCartText() {
        String xpath = "//*[@id=\"main-content\"]/div/div[2]/div/h2";
        return WebFinder.getByXpath(xpath, true);
    }
    public static boolean TotalShoppingCartTextIsDisplayed() {
        return getTotalShoppingCartText().isDisplayed();
    }
    public static WebElement getAmountElement() {
        String xpath = "//*[@id=\"main-content\"]/div/div[2]/div/table/tbody/tr[1]/td/span";
        return WebFinder.getByXpath(xpath, false);
    }
    public static String getAmountPriceText() {
        return getAmountElement().getText();
    } public static WebElement getFinalTotalAmountElement() {
        String xpath = "//*[@id=\"main-content\"]/div/div[2]/div/table/tbody/tr[2]/td/strong/span";
        return WebFinder.getByXpath(xpath, false);
    }
    public static String getFinalTotalAmountPriceText() {
        return getFinalTotalAmountElement().getText();
    }


    public static WebElement getCheckoutButton() {
        String xpath = "//a[@class='checkout-button button alt wc-forward']";
        return WebFinder.getByXpath(xpath, true);
    }
    public static boolean CheckoutButtonIsDisplayed() {
        return getCheckoutButton().isDisplayed();
    }
    public static void clickOnCheckoutButton() {
        getCheckoutButton().click();
    }

    public static WebElement getCompleteOrder() {
        String xpath = "//div[@class='page-header_title']";
        return WebFinder.getByXpath(xpath, false);
    }
    public static boolean CompleteOrderIsDisplayed() {
        return getCompleteOrder().isDisplayed();
    }

}
