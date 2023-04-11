package Base.MobileSetup;

import Base.Shot;
import TestRail.APIException;
import TestRail.TestRailManager;
import com.github.javafaker.Faker;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Coordinates;
import org.openqa.selenium.interactions.Locatable;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.ITestResult;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import static Base.MobileSetup.MobileSetupTest.androidDriver;


public  class MobileFinder {

    public static Faker faker = new Faker();
    private static final Shot shot= new Shot(androidDriver);
    private static final TestRailManager testRail= new TestRailManager();
    public static String testRunId;
    public static  JavascriptExecutor js = (JavascriptExecutor) androidDriver;

     public static void doubleClick(AndroidDriver androidDriver, MobileElement element) {
        {
            new Actions(androidDriver).doubleClick(element).perform();
        }
    }

    public static void moveAndClickAndHold(AndroidDriver androidDriver, MobileElement element) {
        {
            new Actions(androidDriver).moveToElement(element).clickAndHold().perform();
        }
    }


    /**
     * Scroll 150 down by javascript
     */
    public static void scrollDown150() {
        MobileSetupTest. javascriptExecutor.executeScript("window.scrollBy(0,150)", "");
    }

    /**
     * Scroll 50 down by javascript
     */
    public static void scrollDown50() {
        MobileSetupTest.javascriptExecutor.executeScript("window.scrollBy(0,50)", "");
    }

    /**
     * Scroll 30 down by javascript
     */
    public static void scrollDown30() {
        MobileSetupTest.javascriptExecutor.executeScript("window.scrollBy(0,30)", "");
    }

    /**
     * Scroll by a positive value to scroll down or negative value to scroll up
     *
     * @param value
     */
    public static void scrollBy(int value) {
        switch (value) {
            case 30:
                MobileSetupTest.javascriptExecutor.executeScript("window.scrollBy(0,30)", "");
                break;
            case 50:
                MobileSetupTest.javascriptExecutor.executeScript("window.scrollBy(0,50)", "");
                break;
            case 100:
                MobileSetupTest.javascriptExecutor.executeScript("window.scrollBy(0,100)", "");
                break;
            case 150:
                MobileSetupTest.   javascriptExecutor.executeScript("window.scrollBy(0,150)", "");
                break;
            case -30:
                MobileSetupTest.   javascriptExecutor.executeScript("window.scrollBy(0,-30)", "");
                break;
            case -50:
                MobileSetupTest.    javascriptExecutor.executeScript("window.scrollBy(0,-50)", "");
                break;
            case -100:
                MobileSetupTest.  javascriptExecutor.executeScript("window.scrollBy(0,-100)", "");
                break;
            case -150:
                MobileSetupTest.  javascriptExecutor.executeScript("window.scrollBy(0,-150)", "");
                break;
            default:
                MobileSetupTest.  javascriptExecutor.executeScript("window.scrollBy(0,-500)", "");
                break;

        }

    }

    /**
     * Scroll 150 up by java script
     */
    public static void scrollUp150() {
        MobileSetupTest.javascriptExecutor.executeScript("window.scrollBy(0,-150)", "");
    }

    public static void javascriptExecutor(String s, MobileElement usedProductAllMenuItem) {
    }

    public void scrolltoElement(MobileElement ScrolltoThisElement) {
        Coordinates coordinate = ((Locatable) ScrolltoThisElement)
                .getCoordinates();
        coordinate.onPage();
        coordinate.inViewPort();
    }

    public static void scrollDownToElement(MobileElement element) {
        while (!element.isDisplayed()) {
            scrollDown150();
        }

    }
//method to highlight

    public static void scrollUpToElement(MobileElement element) {
        while (!element.isDisplayed()) {
            scrollUp150();
        }
    }

    public static void highlightelement(MobileElement element) {
        for (int i = 0; i < 4; i++) {
            js.executeScript("arguments[0].setAttribute('style', arguments[1]);",
                    element, "color: yellow; border: 4px solid blue;");
            js.executeScript("arguments[0].setAttribute('style’' arguments[1]);",
                    element, "");
        }
    }

    /**
     * Click item which have onclick function
     *
     * @param id
     */
    public static void clickItem(String id) {
        switch (id) {
            case "payfort_fort":
                js.executeScript("$('input[id=payfort_fort]').click()");
                break;
            case "checkout-button":
                js.executeScript("$('input[id=checkout-button]').click()");
                js.executeScript("$('input[id=checkout-button]').click()");
                break;
            case "cod":
                js.executeScript("$('input[id=cod]').click()");
                break;

        }

    }

    /**
     * @return focused element
     */
    public static MobileElement getFocusedElement() {
        return (MobileElement)androidDriver.switchTo().activeElement();
    }

    /**
     * Implicit wait
     *
     * @param numOfSeconds
     */
    public static void Wait(int numOfSeconds) {
        androidDriver.manage().timeouts().implicitlyWait(numOfSeconds, TimeUnit.SECONDS);
    }

    /**
     * Wait for presence of element
     *
     * @param locator
     */
    public static void waitForElementToBeVisibleBy(By locator) {
        MobileSetupTest. wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }

    /**
     * Wait for element to be click able
     *
     * @param locator
     */
    public static void waitForElementToBeClickableBy(By locator) {
        MobileSetupTest. wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    /**
     * Wait for element to be Click able
     *
     * @param element
     */
    public static void waitForElementToBeClickable(MobileElement element) {
        MobileSetupTest.wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    /**
     * @param element
     * @param index
     */
    public static void selectByValue(MobileElement element, String index) {
        Select select = new Select(element);
        select.selectByVisibleText(index);
    }

    /**
     * Wait for the element to be click able then try to click element toClick
     * until element is shown
     *
     * @param toClick
     * @param by
     */
    public static void clickUntillVisibilityOfBy(MobileElement toClick, By by) {
        waitForElementToBeClickable(toClick);
        while (androidDriver.findElements(by).size() < 1) {
            toClick.click();
            Wait(10);
        }
    }

    public static void clearText(MobileElement element) {
        element.clear();
        element.sendKeys(Keys.CONTROL + "a");
        element.sendKeys(Keys.DELETE);
    }

    public static void afterMethod(ITestResult result, String testCaseId) throws APIException, IOException {
        File screenShot;
        if(!result.isSuccess()){
            screenShot = shot.snapError(result.getMethod().getMethodName());
            testRail.setResult(testRunId,testCaseId, TestRailManager.FAILED,screenShot.getAbsolutePath());
        }else {
            testRail.setResult(testRunId,testCaseId, TestRailManager.PASSED, null);
        }
    }

    public static MobileElement getByXpath(String xpath, boolean isClickable){
        By byXpath= By.xpath(xpath);
        waitForElementToBeVisibleBy(byXpath);
        if (isClickable) {waitForElementToBeClickableBy(byXpath);}
         return (MobileElement) androidDriver.findElement(byXpath);
    }
    public static MobileElement getById(String id, boolean isClickable){
        By byId= By.id(id);
        waitForElementToBeVisibleBy(byId);
        if (isClickable) {waitForElementToBeClickableBy(byId);}
         return (MobileElement) androidDriver.findElement(byId);
    }
    public static MobileElement getByClassName(String className, boolean isClickable){
        By byClassName= By.className(className);
        waitForElementToBeVisibleBy(byClassName);
        if (isClickable) {waitForElementToBeClickableBy(byClassName);}
         return (MobileElement) androidDriver.findElement(byClassName);
    }
    public static MobileElement getByCssSelector(String cssSelector, boolean isClickable){
        By byCssSelector= By.cssSelector(cssSelector);
        waitForElementToBeVisibleBy(byCssSelector);
        if (isClickable) {waitForElementToBeClickableBy(byCssSelector);}
         return  (MobileElement)androidDriver.findElement(byCssSelector);
    }
    public static MobileElement getByAccessibilityId(String AccessibilityId, boolean isClickable){
        By byAccessibilityId= MobileBy.AccessibilityId(AccessibilityId);
        waitForElementToBeVisibleBy(byAccessibilityId);
        if (isClickable) {waitForElementToBeClickableBy(byAccessibilityId);}
         return  (MobileElement)androidDriver.findElement(byAccessibilityId);
    }

public static void scrollUntilText(String text){
    androidDriver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().description(\""+text+"\"))");

}
}