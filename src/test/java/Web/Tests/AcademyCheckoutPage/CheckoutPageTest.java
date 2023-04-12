package Web.Tests.AcademyCheckoutPage;

import static org.testng.Assert.*;
import org.testng.annotations.Test;

import static Base.WebSetup.WebSetupTest.testDataWeb;

public class CheckoutPageTest {
    @Test(priority = 1)
    public void firstNameInputIsDisplayed() {
        assertTrue(CheckoutPage.FirstNameInputIsDisplayed());
    }
    @Test(priority = 2)
    public void inputFirstNameData(){
        CheckoutPage.InputFirstNameField(testDataWeb.setFirstNameOnCheckoutPage());
        assertEquals(CheckoutPage.getFirstNameInputText(),testDataWeb.setFirstNameOnCheckoutPage());
    }
    @Test(priority = 3)
    public void lastNameInputIsDisplayed() {
        assertTrue(CheckoutPage.LastNameInputIsDisplayed());
    }
    @Test(priority = 4)
    public void inputLastNameData(){
        CheckoutPage.InputLastNameField(testDataWeb.setLastNameOnCheckoutPage());
        assertEquals(CheckoutPage.getLastNameInputText(),testDataWeb.setLastNameOnCheckoutPage());
    }
    @Test(priority = 5)
    public void countryNameIsDisplayed() {
        assertTrue(CheckoutPage.CountryNameInputIsDisplayed());
    }
    @Test(priority = 6)
    public void addressInputIsDisplayed() {
        assertTrue(CheckoutPage.AddressInputIsDisplayed());
    }
    @Test(priority = 7)
    public void inputAddressData(){
        CheckoutPage.InputAddressField(testDataWeb.setAddressOnCheckoutPage());
        assertEquals(CheckoutPage.getAddressInputText(),testDataWeb.setAddressOnCheckoutPage());

    }
    @Test(priority = 8)
    public void cityInputIsDisplayed() {
        assertTrue(CheckoutPage.CityInputIsDisplayed());
    }
    @Test(priority = 9)
    public void inputCityData(){
        CheckoutPage.InputCityField(testDataWeb.setCityOnCheckoutPage());
        assertEquals(CheckoutPage.getCityInputText(),testDataWeb.setCityOnCheckoutPage());

    }
    @Test(priority = 10)
    public void phoneInputIsDisplayed() {
        assertTrue(CheckoutPage.PhoneInputIsDisplayed());
    }
    @Test(priority = 11)
    public void inputPhoneData(){
        CheckoutPage.InputPhoneField(testDataWeb.setPhoneOnCheckoutPage());
        assertEquals(CheckoutPage.getPhoneInputText(),testDataWeb.setPhoneOnCheckoutPage());

    }
    @Test(priority = 10)
    public void emailInputIsDisplayed() {
        assertTrue(CheckoutPage.EmailInputIsDisplayed());
    }
    @Test(priority = 11)
    public void inputEmailData(){
        CheckoutPage.InputEmailField();
    }
    @Test(priority = 12)
    public void userNameInputIsDisplayed() {
        assertTrue(CheckoutPage.UserNameInputIsDisplayed());
    }
    @Test(priority = 13)
    public void inputUserNameData(){
        CheckoutPage.InputUserNameField();
    }
    @Test(priority = 14)
    public void passwordInputIsDisplayed() {
       assertTrue(CheckoutPage.PasswordInputIsDisplayed());
    }
    @Test(priority = 15)
    public void inputPasswordData(){
        CheckoutPage.InputPasswordField();
    }

    @Test(priority = 16)
    public void amountTotalPriceTextIsCorrect() {
        assertEquals(CheckoutPage.getAmountPriceText(), testDataWeb.getAmountTotalPriceOnCheckoutPage());
    }
    @Test(priority = 17)
    public void finalTotalAmountPriceTextIsCorrect() {
        assertEquals(CheckoutPage.getFinalTotalAmountPriceText(), testDataWeb.getFinalTotalAmountPriceOnCheckoutPage());
    }
    @Test(priority = 18)
    public void confirmOrderButtonIsDisplayed() {
        assertTrue(CheckoutPage.ConfirmOrderButtonIsDisplayed());
    }

    @Test(priority = 19)
    public void confirmOrderButtonIsClickable() {
        CheckoutPage.clickOnConfirmOrderButton();
        assertTrue(CheckoutPage.PayOrderAmountIsDisplayed());
    }
}
