package Web.Tests.SubscriptionsPage;

import Base.WebSetup.WebFinder;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


import static Base.WebSetup.WebSetupTest.webDriver;

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
        String xpath = "//*[@id=\"177902\"]/button";
        return WebFinder.getByXpath(xpath, true);
    }

    public static boolean sixMonthsBronzeButtonIsDisplayed() {
        return getSixMonthsBronzeButton().isDisplayed();
    }

    public static WebElement getSixMonthsSilverButton() {
        String xpath = "//*[@id=\"178053\"]/button";
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
        Actions action = new Actions(webDriver);
        action.moveToElement(getSixMonthsBronzeButton()).click().perform();
    }
}