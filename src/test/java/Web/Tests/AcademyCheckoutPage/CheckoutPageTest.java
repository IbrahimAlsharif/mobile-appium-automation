package Web.Tests.AcademyCheckoutPage;

import org.testng.Assert;
import org.testng.annotations.Test;

import static Base.WebSetup.WebSetupTest.testDataWeb;

public class CheckoutPageTest {
    private String testCaseId;
    @Test(priority = 1)
    public void firstNameInputIsDisplayed() {
        testCaseId = "C10212";
        Assert.assertTrue(CheckoutPage.FirstNameInputIsDisplayed());
    }
    @Test(priority = 2)
    public void inputFirstNameData(){
        testCaseId = "C10215";
        CheckoutPage.InputFirstNameField(testDataWeb.setFirstNameOnCheckoutPage());
        Assert.assertEquals(CheckoutPage.getFirstNameInputText(),testDataWeb.setFirstNameOnCheckoutPage());
    }
    @Test(priority = 3)
    public void lastNameInputIsDisplayed() {
        testCaseId = "C10217";
        Assert.assertTrue(CheckoutPage.LastNameInputIsDisplayed());
    }
    @Test(priority = 4)
    public void inputLastNameData(){
        testCaseId = "C10218";
        CheckoutPage.InputLastNameField(testDataWeb.setLastNameOnCheckoutPage());
        Assert.assertEquals(CheckoutPage.getLastNameInputText(),testDataWeb.setLastNameOnCheckoutPage());
    }
    @Test(priority = 5)
    public void countryNameIsDisplayed() {
        testCaseId = "C10219";
        Assert.assertTrue(CheckoutPage.CountryNameInputIsDisplayed());
    }
    @Test(priority = 6)
    public void addressInputIsDisplayed() {
        testCaseId = "C10220";
        Assert.assertTrue(CheckoutPage.AddressInputIsDisplayed());
    }
    @Test(priority = 7)
    public void inputAddressData(){
        testCaseId = "C10221";
        CheckoutPage.InputAddressField(testDataWeb.setAddressOnCheckoutPage());
        Assert.assertEquals(CheckoutPage.getAddressInputText(),testDataWeb.setAddressOnCheckoutPage());

    }
    @Test(priority = 8)
    public void cityInputIsDisplayed() {
        testCaseId = "C10222";
        Assert.assertTrue(CheckoutPage.CityInputIsDisplayed());
    }
    @Test(priority = 9)
    public void inputCityData(){
        testCaseId = "C10223";
        CheckoutPage.InputCityField(testDataWeb.setCityOnCheckoutPage());
        Assert.assertEquals(CheckoutPage.getCityInputText(),testDataWeb.setCityOnCheckoutPage());

    }
    @Test(priority = 10)
    public void phoneInputIsDisplayed() {
        testCaseId = "C10224";
        Assert.assertTrue(CheckoutPage.PhoneInputIsDisplayed());
    }
    @Test(priority = 11)
    public void inputPhoneData(){
        testCaseId = "C10225";
        CheckoutPage.InputPhoneField(testDataWeb.setPhoneOnCheckoutPage());
        Assert.assertEquals(CheckoutPage.getPhoneInputText(),testDataWeb.setPhoneOnCheckoutPage());

    }
    @Test(priority = 10)
    public void emailInputIsDisplayed() {
        testCaseId = "C10226";
        Assert.assertTrue(CheckoutPage.EmailInputIsDisplayed());
    }
    @Test(priority = 11)
    public void inputEmailData(){
        testCaseId = "C10227";
        CheckoutPage.InputEmailField();
    }
    @Test(priority = 12)
    public void userNameInputIsDisplayed() {
        testCaseId = "C10229";
        Assert.assertTrue(CheckoutPage.UserNameInputIsDisplayed());
    }
    @Test(priority = 13)
    public void inputUserNameData(){
        testCaseId = "C10231";
        CheckoutPage.InputUserNameField();
    }
    @Test(priority = 14)
    public void passwordInputIsDisplayed() {
        testCaseId = "C10232";
        Assert.assertTrue(CheckoutPage.PasswordInputIsDisplayed());
    }
    @Test(priority = 15)
    public void inputPasswordData(){
        testCaseId = "C10234";
        CheckoutPage.InputPasswordField();
    }

    @Test(priority = 16)
    public void amountTotalPriceTextIsCorrect() {
        testCaseId = "C10238";
        Assert.assertEquals(CheckoutPage.getAmountPriceText(), testDataWeb.getAmountTotalPriceOnCheckoutPage());
    }
    @Test(priority = 17)
    public void finalTotalAmountPriceTextIsCorrect() {
        testCaseId = "C10240";
        Assert.assertEquals(CheckoutPage.getFinalTotalAmountPriceText(), testDataWeb.getFinalTotalAmountPriceOnCheckoutPage());
    }
    @Test(priority = 18)
    public void confirmOrderButtonIsDisplayed() {
        testCaseId = "C10243";
        Assert.assertTrue(CheckoutPage.ConfirmOrderButtonIsDisplayed());
    }

    @Test(priority = 19)
    public void confirmOrderButtonIsClickable() {
        testCaseId = "C10245";
        CheckoutPage.clickOnConfirmOrderButton();
        Assert.assertTrue(CheckoutPage.PayOrderAmountIsDisplayed());
    }
}
