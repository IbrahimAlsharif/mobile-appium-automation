package Web.Tests.AcademyCheckoutPage;

import Base.WebSetup.WebFinder;
import org.openqa.selenium.WebElement;

public class CheckoutPage {
    public static String fakeValue;
    public static String fakeValueUserName ,fakeValuePassword;

    public static WebElement getFirstNameInput() {
        String xpath = "//input[@name='billing_first_name']";
        return WebFinder.getByXpath(xpath, true);
    }

    public static boolean FirstNameInputIsDisplayed() {
        return getFirstNameInput().isDisplayed();
    }

    public static void InputFirstNameField(String FirstName) {
        getFirstNameInput().sendKeys(FirstName);
    }

    public static WebElement getLastNameInput() {
        String xpath = "//input[@name='billing_last_name']";
        return WebFinder.getByXpath(xpath, true);
    }

    public static boolean LastNameInputIsDisplayed() {
        return getLastNameInput().isDisplayed();
    }

    public static void InputLastNameField(String LastName) {
        getLastNameInput().sendKeys(LastName);
    }

    public static WebElement getCountryNameInput() {
        String xpath = "//span[@id='select2-billing_country-container']";
        return WebFinder.getByXpath(xpath, true);
    }

    public static boolean CountryNameInputIsDisplayed() {
        return getCountryNameInput().isDisplayed();
    }

    public static WebElement getAddressInput() {
        String xpath = "//input[@name='billing_address_1']";
        return WebFinder.getByXpath(xpath, true);
    }

    public static boolean AddressInputIsDisplayed() {
        return getAddressInput().isDisplayed();
    }

    public static void InputAddressField(String Address) {
        getAddressInput().sendKeys(Address);
    }

    public static WebElement getCityInput() {
        String xpath = "//input[@name='billing_city']";
        return WebFinder.getByXpath(xpath, true);
    }

    public static boolean CityInputIsDisplayed() {
        return getCityInput().isDisplayed();
    }

    public static void InputCityField(String City) {
        getCityInput().sendKeys(City);
    }

    public static WebElement getPhoneInput() {
        String xpath = "//input[@name='billing_phone']";
        return WebFinder.getByXpath(xpath, true);
    }

    public static boolean PhoneInputIsDisplayed() {
        return getPhoneInput().isDisplayed();
    }

    public static void InputPhoneField(String Phone) {
        getPhoneInput().sendKeys(Phone);
    }

    public static WebElement getEmailInput() {
        String xpath = "//input[@name='billing_email']";
        return WebFinder.getByXpath(xpath, true);
    }

    public static boolean EmailInputIsDisplayed() {
        return getEmailInput().isDisplayed();
    }

    public static void InputEmailField() {
        fakeValue = WebFinder.faker.internet().emailAddress();
        getEmailInput().sendKeys(fakeValue);
    }

    public static WebElement getUserNameInput() {
        String xpath = "//input[@name='account_username']";
        return WebFinder.getByXpath(xpath, true);
    }

    public static boolean UserNameInputIsDisplayed() {
        return getUserNameInput().isDisplayed();
    }

    public static void InputUserNameField() {
        fakeValueUserName = WebFinder.faker.internet().emailAddress();
        getUserNameInput().sendKeys(fakeValueUserName);
    }

    public static WebElement getPasswordInput() {
        String xpath = "//input[@id='account_password']";
        return WebFinder.getByXpath(xpath, true);
    }

    public static boolean PasswordInputIsDisplayed() {
        return getPasswordInput().isDisplayed();
    }

    public static void InputPasswordField() {
        fakeValuePassword = WebFinder.faker.internet().password();
        getPasswordInput().sendKeys(fakeValuePassword);
    }

    public static WebElement getAmountElement() {
        String xpath = "//*[@id=\"order_review\"]/table/tfoot/tr[1]/td/span";
        return WebFinder.getByXpath(xpath, false);
    }

    public static String getAmountPriceText() {
        return getAmountElement().getText();
    }

    public static WebElement getFinalTotalAmountElement() {
        String xpath = "//*[@id=\"order_review\"]/table/tfoot/tr[2]/td/strong/span";
        return WebFinder.getByXpath(xpath, false);
    }

    public static String getFinalTotalAmountPriceText() {
        return getFinalTotalAmountElement().getText();
    }

    public static WebElement getConfirmOrderButton() {
        String xpath = "//button[@id='place_order']";
        return WebFinder.getByXpath(xpath, true);
    }

    public static boolean ConfirmOrderButtonIsDisplayed() {
        return getConfirmOrderButton().isDisplayed();
    }

    public static void clickOnConfirmOrderButton() {
        getConfirmOrderButton().click();
    }

    public static WebElement getPayOrderAmountText() {
        String xpath = "/html/body/div/div/div/div/div[2]/div/span[4]";
        return WebFinder.getByXpath(xpath, false);
    }

    public static boolean PayOrderAmountIsDisplayed() {
        return getPayOrderAmountText().isDisplayed();
    }
}
