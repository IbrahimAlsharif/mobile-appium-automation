package Mobile.Tests.Payment;

import Base.MobileSetup.MobileFinder;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.Keys;

import java.security.Key;

import static Base.MobileSetup.MobileSetupTest.testDataMobile;

public class PaymentPage {

    public static MobileElement getPaymentButton() {
        String xpath = "//android.view.View[@content-desc=\"" + testDataMobile.getPaymentButton() + "\"]";
        return MobileFinder.getByXpath(xpath, true);
    }

    public static boolean paymentButtonIsDisplayed() {
        return getPaymentButton().isDisplayed();
    }

    public static MobileElement getBackIcon() {
        String xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.ImageView";
        return MobileFinder.getByXpath(xpath, true);
    }

    public static boolean BackIconIsDisplayed() {
        return getBackIcon().isDisplayed();
    }
       public static MobileElement getCouponField() {
        String xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.ImageView";
        return MobileFinder.getByXpath(xpath, true);
    }

    public static boolean CouponFieldIsDisplayed() {
        return getCouponField().isDisplayed();
    }
    public  static  void  clickOnCouponField(){
        getCouponField().click();
    }
    public  static  void  inputOnCouponField(String data){
        getCouponField().sendKeys(data, Keys.TAB);
    }

    public static MobileElement getBronzeSubscription() {
        String xpath = "//android.view.View[@content-desc=\"" + testDataMobile.getSubscriptionNameSelect() + "\"]";
        return MobileFinder.getByXpath(xpath, true);
    }

    public static boolean bronzeSubscriptionIsDisplayed() {
        return getBronzeSubscription().isDisplayed();
    }
    public static MobileElement getCouponWithoutPrice() {
        String xpath = "//android.view.View[@content-desc=\"" + testDataMobile.getCouponWithoutPrice() + "\"]";
        return MobileFinder.getByXpath(xpath, true);
    }

    public static boolean CouponWithoutPriceIsDisplayed() {
        return getBronzeSubscription().isDisplayed();
    }
    public static MobileElement getCouponWithoutDiscount() {
        String xpath = "//android.view.View[@content-desc=\"" + testDataMobile.getCouponWithoutDiscount() + "\"]";
        return MobileFinder.getByXpath(xpath, true);
    }

    public static boolean CouponWithoutDiscountIsDisplayed() {
        return getCouponWithoutDiscount().isDisplayed();
    }
    public static MobileElement getCouponWithoutVATCollected() {
        String xpath = "//android.view.View[@content-desc=\"" + testDataMobile.getCouponWithoutVATCollected() + "\"]";
        return MobileFinder.getByXpath(xpath, true);
    }

    public static boolean CouponWithoutVATCollectedIsDisplayed() {
        return getCouponWithoutDiscount().isDisplayed();
    }
    public static MobileElement getCouponWithoutTotalAfterVAT() {
        String xpath = "//android.view.View[@content-desc=\"" + testDataMobile.getCouponWithoutTotalAfterVAT() + "\"]";
        return MobileFinder.getByXpath(xpath, true);
    }
    public static boolean CouponWithoutTotalAfterVATIsDisplayed() {
        return getCouponWithoutTotalAfterVAT().isDisplayed();
    }
    public static MobileElement getPayButton() {
        String xpath = "//android.view.View[@content-desc=\"" + testDataMobile.getPayButton() + "\"]";
        return MobileFinder.getByXpath(xpath, true);
    }

    public static boolean payButtonIsDisplayed() {
        return getPayButton().isDisplayed();
    }
    public  static  void  clickOnPayButton(){
        getPayButton().click();
    }

    public static MobileElement getImageBelowPaymentButton() {
        String xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.widget.ImageView";
        return MobileFinder.getByXpath(xpath, true);
    }

    public static boolean ImageBelowPaymentButtonIsDisplayed() {
        return getImageBelowPaymentButton().isDisplayed();
    }
    public static MobileElement getPaymentMethodSelection() {
        String xpath = "//android.view.View[@content-desc=\"" + testDataMobile.getPaymentMethodSelection() + "\"]";
        return MobileFinder.getByXpath(xpath, true);
    }

    public static boolean PaymentMethodSelectionDisplayed() {
        return getPaymentMethodSelection().isDisplayed();
    }

    public static MobileElement getPaymentByVisaButton() {
        String xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]";
        return MobileFinder.getByXpath(xpath, true);
    }

    public static boolean PaymentByVisaIsDisplayed() {
        return getPaymentByVisaButton().isDisplayed();
    }
    public static MobileElement getPaymentByMadaButton() {
        String xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView[1]";
        return MobileFinder.getByXpath(xpath, true);
    }

    public static boolean PaymentByMadaIsDisplayed() {
        return getPaymentByMadaButton().isDisplayed();
    }
    public static MobileElement getPaymentByTabbyButton() {
        String xpath = "//android.widget.ImageView[@content-desc=\"" + testDataMobile.getPaymentByTabbyButton() + "\"]";
        return MobileFinder.getByXpath(xpath, true);
    }

    public static boolean PaymentByTabbyIsDisplayed() {
        return getPaymentByTabbyButton().isDisplayed();
    }


    public static MobileElement getCheckButton() {

        String xpath = "//android.view.View[@content-desc=\"" + testDataMobile.getCheckButton() + "\"]";
        return MobileFinder.getByXpath(xpath, true);
    }

    public static boolean CheckButtonIsDisplayed() {
        return getCheckButton().isDisplayed();
    }
    public  static  void  clickOnCheckButton(){
        getCheckButton().click();
    }

    public static MobileElement getCompletedButton() {
        String xpath = "//android.widget.Button[@content-desc=\"" + testDataMobile.getCompletedButton() + "\"]";
        return MobileFinder.getByXpath(xpath, true);
    }

    public static boolean CompletedButtonIsDisplayed() {
        return getCompletedButton().isDisplayed();
    }
    public  static  void  clickOnCompletedButton(){
        getCompletedButton().click();
    }

    public static MobileElement getCouponWithPrice() {
        String xpath = "//android.view.View[@content-desc=\"" + testDataMobile.getCouponWithoutPrice() + "\"]";
        return MobileFinder.getByXpath(xpath, true);
    }

    public static boolean CouponWithPriceIsDisplayed() {
        return getBronzeSubscription().isDisplayed();
    }
    public static MobileElement getCouponWithDiscount() {
        String xpath = "//android.view.View[@content-desc=\"" + testDataMobile.getCouponWithoutDiscount() + "\"]";
        return MobileFinder.getByXpath(xpath, true);
    }

    public static boolean CouponWithDiscountIsDisplayed() {
        return getCouponWithoutDiscount().isDisplayed();
    }
    public static MobileElement getCouponWithVATCollected() {
        String xpath = "//android.view.View[@content-desc=\"" + testDataMobile.getCouponWithoutVATCollected() + "\"]";
        return MobileFinder.getByXpath(xpath, true);
    }

    public static boolean CouponWithVATCollectedIsDisplayed() {
        return getCouponWithoutDiscount().isDisplayed();
    }
    public static MobileElement getCouponWithTotalAfterVAT() {
        String xpath = "//android.view.View[@content-desc=\"" + testDataMobile.getCouponWithoutTotalAfterVAT() + "\"]";
        return MobileFinder.getByXpath(xpath, true);
    }
    public static boolean CouponWithTotalAfterVATIsDisplayed() {
        return getCouponWithoutTotalAfterVAT().isDisplayed();
    }

}
