package Web.Tests.CheckoutPage;

import Base.WebSetup.WebFinder;
import org.openqa.selenium.WebElement;

import static Base.WebSetup.WebFinder.*;
import static Base.WebSetup.WebSetupTest.*;

public class CheckoutPage {
    public static WebElement getCheckoutTitle() {
        backToWindow("root");
        String xpath = "//H3[@class='text-center fs-3 pt-48 mb-12'][text()='"+testDataWeb.getCheckoutTitleText()+"']";
        return WebFinder.getByXpath(xpath, false);
    }
    public static boolean checkoutTitleIsDisplayed() {
        return getPackageTitle().isDisplayed();
    }
    public static String getCheckoutTitleText() {
        return getCheckoutTitle().getText();
    }
    public static WebElement getPackageTitle() {
        String xpath = "//*[@id=\"packageTitle\"]";
        return WebFinder.getByXpath(xpath, false);
    }
    public static boolean packageTitleIsDisplayed() {
        return getPackageTitle().isDisplayed();
    }
    public static String getPackageTitleText() {
        return getPackageTitle().getText();
    }
    public static WebElement getPackageSTitle() {
        String xpath = "//*[@id=\"packageTitle\"]";
        return WebFinder.getByXpath(xpath, false);
    }
    public static boolean packageSTitleIsDisplayed() {
        return getPackageSTitle().isDisplayed();
    }
    public static String getPackageSTitleText() {
        return getPackageSTitle().getText();
    }
    public static WebElement getPaymentDetailsTitle() {
        String xpath = "//DIV[@class='card-header' and contains(text(),'"+testDataWeb.getPaymentDetailsTitle()+"')]";
        return WebFinder.getByXpath(xpath, false);
    }
    public static boolean paymentDetailsTitleIsDisplayed() {
        return getPaymentDetailsTitle().isDisplayed();
    }
    public static WebElement getPriceText() {
        String xpath = "//TD[@scope='row'][text()='"+testDataWeb.getPriceText()+"']";
        return WebFinder.getByXpath(xpath, false);
    }
    public static boolean priceTextIsDisplayed() {
        return getPriceText().isDisplayed();
    }
    public static WebElement getDiscountText() {
        String xpath = "//TD[@scope='row'][text()='"+testDataWeb.getDiscountText()+"']";
        return WebFinder.getByXpath(xpath, false);
    }
    public static boolean discountTextIsDisplayed() {
        return getDiscountText().isDisplayed();
    }
    public static WebElement getTaxText() {
        String xpath = "//TD[@scope='row'][text()='"+testDataWeb.getTaxText()+"']";
        return WebFinder.getByXpath(xpath, false);
    }
    public static boolean taxTextIsDisplayed() {
        return getTaxText().isDisplayed();
    }
    public static WebElement getTotalPriceText() {
        String xpath = "//TD[@scope='row'][text()='"+testDataWeb.getTotalPriceText()+"']";
        return WebFinder.getByXpath(xpath, false);
    }
    public static boolean totalPriceTextIsDisplayed() {
        return getTotalPriceText().isDisplayed();
    }
    public static WebElement getPriceValue() {
        String xpath = "//*[@id=\"priceVal\"]";
        return WebFinder.getByXpath(xpath, false);
    }
    public static boolean priceValueIsDisplayed() {
        return getPriceValue().isDisplayed();
    }
    public static String getPriceValueText(){
        return getPriceValue().getText();
    }
    public static WebElement getDiscountValue() {
        String xpath = "//*[@id=\"discountVal\"]";
        return WebFinder.getByXpath(xpath, false);
    }
    public static boolean discountValueIsDisplayed() {
        return getDiscountValue().isDisplayed();
    }
    public static String getDiscountValueText(){
        return getDiscountValue().getText();
    }
    public static WebElement getTaxValue() {
        String xpath = "//*[@id=\"taxVal\"]";
        return WebFinder.getByXpath(xpath, false);
    }
    public static boolean getTaxValueIsDisplayed() {
        return getTaxValue().isDisplayed();
    }
    public static String taxValueText(){
        return getTaxValue().getText();
    }
    public static WebElement getTotalPriceValue() {
        String xpath = "//*[@id=\"totalVal\"]";
        return WebFinder.getByXpath(xpath, false);
    }
    public static boolean getTotalPriceValueIsDisplayed() {
        return getTotalPriceValue().isDisplayed();
    }
    public static String totalPriceValueText(){
        return getTotalPriceValue().getText();
    }
    public static WebElement getCouponField() {
        String xpath = "//*[@id=\"coponVal\"]";
        return WebFinder.getByXpath(xpath, false);
    }
    public static boolean couponFieldIsDisplayed() {
        return getCouponField().isDisplayed();
    }
    public static void inputOnCouponField(){
        getCouponField().sendKeys(testDataWeb.getCouponCode());
    }
    public static String getCouponInputText(){
        return getCouponField().getAttribute("value");
    }

    public static WebElement getCouponButton() {
        String xpath = "//*[@id=\"button-addon1\"]";
        return WebFinder.getByXpath(xpath, true);
    }
    public static boolean couponButtonIsDisplayed() {
        return getCouponButton().isDisplayed();
    }
    public static WebElement getPaymentDataText() {
        String xpath = "//DIV[@class='card-header' and contains(text(),'"+testDataWeb.getPaymentDataText()+"')]";
        return WebFinder.getByXpath(xpath, true);
    }
    public static boolean paymentDataTextIsDisplayed() {
        return getPaymentDataText().isDisplayed();
    }
    public static WebElement getCardImage() {
        String xpath = "//*[@id=\"hyperFrm\"]/div[1]";
        return WebFinder.getByXpath(xpath, true);
    }
    public static boolean cardImageIsDisplayed() {
        return getCardImage().isDisplayed();
    }
    public static WebElement getCardNumberField() {
        String xpath = "//*[@id=\"cardNumber\"]";
        return WebFinder.getByXpath(xpath, false);
    }
    public static boolean cardNumberFieldIsDisplayed() {
        return getCardNumberField().isDisplayed();
    }
    public static WebElement getCardNameField() {
        String xpath = "(//INPUT[@required=''])[2]";
        return WebFinder.getByXpath(xpath, false);
    }
    public static boolean cardNameFieldIsDisplayed() {
        return getCardNameField().isDisplayed();
    }
    public static WebElement getCardExpiryField() {
        String xpath = "//*[@id=\"cardExpiry\"]";
        return WebFinder.getByXpath(xpath, false);
    }
    public static boolean cardExpiryFieldIsDisplayed() {
        return getCardExpiryField().isDisplayed();
    }
    public static WebElement getCardPINField() {
        String xpath = "//*[@id=\"hyperFrm\"]/div[4]/div[2]/input";
        return WebFinder.getByXpath(xpath, false);
    }
    public static boolean cardPINFieldIsDisplayed() {
        return getCardPINField().isDisplayed();
    }
    public static void inputOnCardNumberField(){
        getCardNumberField().sendKeys(testDataWeb.getCardNumber());
    }
    public static String getCardNumberInputText(){
        return getCardNumberField().getAttribute("value");
    }
    public static void inputOnCardNameField(){
        getCardNameField().sendKeys(testDataWeb.getCardName());
    }
    public static String getCardNameInputText(){
        return getCardNameField().getAttribute("value");
    }
    public static void inputOnCardExpiryField(){
        getCardExpiryField().sendKeys(testDataWeb.getCardExpiry());
    }
    public static String getCardExpiryInputText(){
        return getCardExpiryField().getAttribute("value");
    }
    public static void inputOnCardPINField(){
        getCardPINField().sendKeys(testDataWeb.getCardPIN());
    }
    public static String getCardPINInputText(){
        return getCardPINField().getAttribute("value");
    }
    public static WebElement getPayNowButton() {
        String xpath = "//*[@id=\"payNow\"]";
        return WebFinder.getByXpath(xpath, false);
    }
    public static boolean payNowButtonIsDisplayed() {
        return getPayNowButton().isDisplayed();
    }
    public static void clickOnNowButton() {
        click(getPayNowButton());
    }
}
