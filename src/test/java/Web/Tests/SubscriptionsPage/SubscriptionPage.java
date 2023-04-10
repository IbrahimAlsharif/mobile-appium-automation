package Web.Tests.SubscriptionsPage;

import Base.WebSetup.WebFinder;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.Set;

import static Base.WebSetup.WebSetupTest.*;

public class SubscriptionPage {
    public static WebElement getSubscriptionTitle() {
        String xpath = "/html/body/div[1]/div/h5";
        return WebFinder.getByXpath(xpath, false);
    }

    public static String getSubscriptionTitleText() {
        return getSubscriptionTitle().getText();
    }

    public static WebElement getMonthlyButton() {
        String xpath = "//*[@id=\"filter\"]/li[1]/a";
        return WebFinder.getByXpath(xpath, true);
    }

    public static boolean monthlyButtonIsDisplayed() {
        return getMonthlyButton().isDisplayed();
    }

    public static void clickOnMonthlyButton() {
        getMonthlyButton().click();
    }

    public static WebElement getThreeMonthsButton() {
        String xpath = "//*[@id=\"filter\"]/li[2]/a";
        return WebFinder.getByXpath(xpath, true);
    }

    public static boolean threeMonthsButtonIsDisplayed() {
        return getThreeMonthsButton().isDisplayed();
    }

    public static void clickThreeMonthsButton() {
        getThreeMonthsButton().click();
    }

    public static WebElement getSixMonthsButton() {
        String xpath = "//*[@id=\"filter\"]/li[3]/a";
        return WebFinder.getByXpath(xpath, true);
    }

    public static boolean sixMonthsButtonIsDisplayed() {
        return getSixMonthsButton().isDisplayed();
    }

    public static void clickSixMonthsButton() {
        getSixMonthsButton().click();
    }

    public static WebElement getMonthlyBronzePrice() {
        String xpath = "//*[@id=\"163747\"]/h3[2]";
        return WebFinder.getByXpath(xpath, false);
    }

    public static String getMonthlyBronzePriceText() {
        return getMonthlyBronzePrice().getText();
    }

    public static WebElement getMonthlyBronzeButton() {
        String xpath = "//*[@id=\"163747\"]/button";
        return WebFinder.getByXpath(xpath, true);
    }

    public static boolean monthlyBronzeButtonIsDisplayed() {
        return getMonthlyBronzeButton().isDisplayed();
    }

    public static WebElement getMonthlySilverButton() {
        String xpath = "//*[@id=\"171851\"]/button";
        return WebFinder.getByXpath(xpath, true);
    }

    public static boolean monthlySilverButtonIsDisplayed() {
        return getMonthlySilverButton().isDisplayed();
    }

    public static WebElement getMonthlyGoldButton() {
        String xpath = "//*[@id=\"171851\"]/button";
        return WebFinder.getByXpath(xpath, true);
    }

    public static boolean monthlyGoldButtonIsDisplayed() {
        return getMonthlyGoldButton().isDisplayed();
    }

    public static WebElement getThreeMonthsBronzePrice() {
        String xpath = "//*[@id=\"171834\"]/h3[2]";
        return WebFinder.getByXpath(xpath, false);
    }

    public static String getThreeMonthsBronzePriceText() {
        return getThreeMonthsBronzePrice().getText();
    }

    public static WebElement getThreeMonthsBronzeButton() {
        String xpath = "//*[@id=\"171834\"]/button";
        return WebFinder.getByXpath(xpath, true);
    }

    public static boolean threeMonthsBronzeButtonIsDisplayed() {
        return getThreeMonthsBronzeButton().isDisplayed();
    }


    public static WebElement getThreeMonthsSilverButton() {
        String xpath = "//*[@id=\"171848\"]/button";
        return WebFinder.getByXpath(xpath, true);
    }

    public static boolean threeMonthsSilverButtonIsDisplayed() {
        return getThreeMonthsSilverButton().isDisplayed();
    }

    public static WebElement getThreeMonthsGoldButton() {
        String xpath = "//*[@id=\"171849\"]/button";
        return WebFinder.getByXpath(xpath, true);
    }

    public static boolean threeMonthsGoldButtonIsDisplayed() {
        return getThreeMonthsGoldButton().isDisplayed();
    }

    public static WebElement getSixMonthsBronzePrice() {
        String xpath = "//*[@id=\"177902\"]/h3[2]";
        return WebFinder.getByXpath(xpath, false);
    }

    public static String getSixMonthsBronzePriceText() {
        return getSixMonthsBronzePrice().getText();
    }

    public static WebElement getSixMonthsBronzeButton() {
        String xpath = "(//button[@type='button'])[5]";
        return WebFinder.getByXpath(xpath, true);
    }

    public static boolean sixMonthsBronzeButtonIsDisplayed() {
        return getSixMonthsBronzeButton().isDisplayed();
    }

    public static WebElement getSixMonthsSilverButton() {
        String xpath = "(//button[@type='button'])[8]";
        return WebFinder.getByXpath(xpath, true);
    }

    public static boolean sixMonthsSilverButtonIsDisplayed() {
        return getSixMonthsSilverButton().isDisplayed();
    }

    public static WebElement getSixMonthsGoldButton() {
        String xpath = "//*[@id=\"178054\"]/button";
        return WebFinder.getByXpath(xpath, true);
    }

    public static boolean sixMonthsGoldButtonIsDisplayed() {
        return getSixMonthsGoldButton().isDisplayed();
    }

    public static void clickSixMonthsBronzeButton() {
        WebFinder.javascriptExecutor("arguments[0].scrollIntoView()", getSixMonthsBronzeButton());
        getSixMonthsBronzeButton().click();
    }

    public static WebElement getLoginPopUpTitle() {
        String xpath = "//*[@id=\"exampleModal\"]/div/div/div/div/span[1]";
        return WebFinder.getByXpath(xpath, false);
    }

    public static String getLoginPopUpTitleText() {
        return getLoginPopUpTitle().getText();
    }

    public static WebElement getSignInButton() {
        String xpath = "//*[@id=\"container\"]/div/div[2]";
        return WebFinder.getByXpath(xpath, true);
    }

    public static boolean signInButtonIsDisplayed() {
        return getSignInButton().isDisplayed();
    }

    public static String waitForWindow(int timeout) {
        try {
            Thread.sleep(timeout);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Set<String> whNow = webDriver.getWindowHandles();
        Set<String> whThen = (Set<String>) vars.get("window_handles");
        if (whNow.size() > whThen.size()) {
            whNow.removeAll(whThen);
        }
        return whNow.iterator().next();
    }

    public static void clickSignInWithGoogleButton() {
        vars.put("window_handles", webDriver.getWindowHandles());
        Actions builder = new Actions(webDriver);
        builder.click(getSignInButton()).perform();
        vars.put("win405", waitForWindow(2000));
        vars.put("root", webDriver.getWindowHandle());
        webDriver.switchTo().window(vars.get("win405").toString());
    }

    public static WebElement getSignInWindowTitle() {
        String xpath = "//*[@id=\"headingSubtext\"]/span";
        return WebFinder.getByXpath(xpath, false);
    }

    public static String getSignInWindowTitleText(){
        return getSignInWindowTitle().getText();
    }

    public static WebElement getEmailField() {
        String xpath = "//*[@id=\"identifierId\"]";
        return WebFinder.getByXpath(xpath, false);
    }

    public static void inputOnEmailField(){
        getEmailField().sendKeys(testDataWeb.getEmail());
    }

    public static String getEmailFieldInputText(){
        return getEmailField().getAttribute("value");
    }

    public static WebElement getNextToPasswordButton() {
        String xpath = "//*[@id=\"identifierNext\"]/div/button";
        return WebFinder.getByXpath(xpath, true);
    }

    public static void clickOnNextToPasswordButton(){
        getNextToPasswordButton().click();
    }

    public static WebElement getLoggedInEmailLabel() {
        String xpath = "//*[@id=\"yDmH0d\"]/c-wiz/div/div[1]/div/div[2]/div/div[2]";
        return WebFinder.getByXpath(xpath, true);
    }

    public static String getLoggedInEmailLabelText(){
        return getLoggedInEmailLabel().getText();
    }

    public static WebElement getPasswordField() {
        String xpath = "//*[@id=\"password\"]/div[1]/div/div[1]/input";
        return WebFinder.getByXpath(xpath, false);
    }

    public static void inputOnPasswordField(){
        getPasswordField().sendKeys(testDataWeb.getPassword());
    }

    public static String getPasswordFieldInputText(){
        return getPasswordField().getAttribute("value");
    }

    public static WebElement getNextButton() {
        String xpath = "//*[@id=\"passwordNext\"]/div/button/span";
        return WebFinder.getByXpath(xpath, true);
    }

    public static void clickOnNextButton(){
        getNextButton().click();
    }
}