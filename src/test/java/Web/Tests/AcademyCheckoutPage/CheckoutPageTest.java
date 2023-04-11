package Web.Tests.AcademyCheckoutPage;

import org.testng.Assert;
import org.testng.annotations.Test;

import static Base.WebSetup.WebSetupTest.testDataWeb;

public class CheckoutPageTest {
    @Test(priority = 1)
    public void firstNameInputIsDisplayed() {
        Assert.assertTrue(CheckoutPage.FirstNameInputIsDisplayed());
    }
    @Test(priority = 2)
    public void inputFirstNameData(){
        CheckoutPage.InputFirstNameField(testDataWeb.setFirstNameOnCheckoutPage());
        Assert.assertEquals(CheckoutPage.getFirstNameInput().getText(),testDataWeb.setFirstNameOnCheckoutPage());
    }
    @Test(priority = 3)
    public void lastNameInputIsDisplayed() {
        Assert.assertTrue(CheckoutPage.LastNameInputIsDisplayed());
    }
    @Test(priority = 4)
    public void inputLastNameData(){
        CheckoutPage.InputLastNameField(testDataWeb.setLastNameOnCheckoutPage());
    }
    @Test(priority = 5)
    public void countryNameIsDisplayed() {
        Assert.assertTrue(CheckoutPage.CountryNameInputIsDisplayed());
    }
    @Test(priority = 6)
    public void addressInputIsDisplayed() {
        Assert.assertTrue(CheckoutPage.AddressInputIsDisplayed());
    }
    @Test(priority = 7)
    public void inputAddressData(){
        CheckoutPage.InputAddressField(testDataWeb.setAddressOnCheckoutPage());
    }
    @Test(priority = 8)
    public void cityInputIsDisplayed() {
        Assert.assertTrue(CheckoutPage.CityInputIsDisplayed());
    }
    @Test(priority = 9)
    public void inputCityData(){
        CheckoutPage.InputCityField(testDataWeb.setCityOnCheckoutPage());
    }
    @Test(priority = 10)
    public void phoneInputIsDisplayed() {
        Assert.assertTrue(CheckoutPage.PhoneInputIsDisplayed());
    }
    @Test(priority = 11)
    public void inputPhoneData(){
        CheckoutPage.InputPhoneField(testDataWeb.setPhoneOnCheckoutPage());
    }
    @Test(priority = 10)
    public void emailInputIsDisplayed() {
        Assert.assertTrue(CheckoutPage.EmailInputIsDisplayed());
    }
    @Test(priority = 11)
    public void inputEmailData(){
        CheckoutPage.InputEmailField();
    }
    @Test(priority = 12)
    public void userNameInputIsDisplayed() {
        Assert.assertTrue(CheckoutPage.UserNameInputIsDisplayed());
    }
    @Test(priority = 13)
    public void inputUserNameData(){
        CheckoutPage.InputUserNameField();
    }
    @Test(priority = 14)
    public void passwordInputIsDisplayed() {
        Assert.assertTrue(CheckoutPage.PasswordInputIsDisplayed());
    }
    @Test(priority = 15)
    public void inputPasswordData(){
        CheckoutPage.InputPasswordField();
    }

    @Test(priority = 16)
    public void viewAmountTotalPriceText() {
        Assert.assertEquals(CheckoutPage.getAmountPriceText(), testDataWeb.getAmountTotalPriceOnCheckoutPage());
    }
    @Test(priority = 17)
    public void viewFinalTotalAmountPriceText() {
        Assert.assertEquals(CheckoutPage.getFinalTotalAmountPriceText(), testDataWeb.getFinalTotalAmountPriceOnCheckoutPage());
    }
    @Test(priority = 18)
    public void confirmOrderButtonIsDisplayed() {
        Assert.assertTrue(CheckoutPage.ConfirmOrderButtonIsDisplayed());
    }

    @Test(priority = 19)
    public void confirmOrderButtonIsClickable() {
        CheckoutPage.clickOnConfirmOrderButton();
        Assert.assertTrue(CheckoutPage.PayOrderAmountIsDisplayed());
    }
}
