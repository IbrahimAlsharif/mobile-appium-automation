package Base;

import com.github.javafaker.Faker;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Coordinates;
import org.openqa.selenium.interactions.Locatable;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.ITestResult;
import TestRail.APIException;
import TestRail.TestRailManager;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import static Base.SetupTest.driver;


public  class Utilities {

    public static Faker faker = new Faker();
    private static Shot shot= new Shot(driver);
    private static TestRailManager testRail= new TestRailManager();
    public static String testRunId;
    public static  JavascriptExecutor js = (JavascriptExecutor) driver;

     public static void doubleClick(WebDriver driver, WebElement element) {
        {
            new Actions(driver).doubleClick(element).perform();
        }
    }

    public static void moveAndClickAndHold(WebDriver driver, WebElement element) {
        {
            new Actions(driver).moveToElement(element).clickAndHold().perform();
        }
    }

//    public static void tearDown() {
//        Base.Initialization.  driver.quit();
//    }

    /**
     * Scroll 150 down by javascript
     */
    public static void scrollDown150() {
        SetupTest. javascriptExecutor.executeScript("window.scrollBy(0,150)", "");
    }

    /**
     * Scroll 50 down by javascript
     */
    public static void scrollDown50() {
        SetupTest. javascriptExecutor.executeScript("window.scrollBy(0,50)", "");
    }

    /**
     * Scroll 30 down by javascript
     */
    public static void scrollDown30() {
        SetupTest.  javascriptExecutor.executeScript("window.scrollBy(0,30)", "");
    }

    /**
     * Scroll by a positive value to scroll down or negative value to scroll up
     *
     * @param value
     */
    public static void scrollBy(int value) {
        switch (value) {
            case 30:
                SetupTest.  javascriptExecutor.executeScript("window.scrollBy(0,30)", "");
                break;
            case 50:
                SetupTest.   javascriptExecutor.executeScript("window.scrollBy(0,50)", "");
                break;
            case 100:
                SetupTest.  javascriptExecutor.executeScript("window.scrollBy(0,100)", "");
                break;
            case 150:
                SetupTest.   javascriptExecutor.executeScript("window.scrollBy(0,150)", "");
                break;
            case -30:
                SetupTest.   javascriptExecutor.executeScript("window.scrollBy(0,-30)", "");
                break;
            case -50:
                SetupTest.    javascriptExecutor.executeScript("window.scrollBy(0,-50)", "");
                break;
            case -100:
                SetupTest.  javascriptExecutor.executeScript("window.scrollBy(0,-100)", "");
                break;
            case -150:
                SetupTest.  javascriptExecutor.executeScript("window.scrollBy(0,-150)", "");
                break;
            default:
                SetupTest.  javascriptExecutor.executeScript("window.scrollBy(0,-500)", "");
                break;

        }

    }

    /**
     * Scroll 150 up by java script
     */
    public static void scrollUp150() {
        SetupTest.javascriptExecutor.executeScript("window.scrollBy(0,-150)", "");
    }

    public static void javascriptExecutor(String s, WebElement usedProductAllMenuItem) {
    }

    public void scrolltoElement(WebElement ScrolltoThisElement) {
        Coordinates coordinate = ((Locatable) ScrolltoThisElement)
                .getCoordinates();
        coordinate.onPage();
        coordinate.inViewPort();
    }

    public static void scrollDownToElement(WebElement element) {
        while (!element.isDisplayed()) {
            scrollDown150();
        }

    }
//method to highlight

    public static void scrollUpToElement(WebElement element) {
        while (!element.isDisplayed()) {
            scrollUp150();
        }
    }

    public static void highlightelement(WebElement element) {
        for (int i = 0; i < 4; i++) {
            JavascriptExecutor js = (JavascriptExecutor) driver;
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
        JavascriptExecutor js = (JavascriptExecutor) driver;
//        System.out.println("id= " + id);
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
    public static WebElement getFocusedElement() {
        return driver.switchTo().activeElement();
    }

    /**
     * Implicit wait
     *
     * @param numOfSeconds
     */
    public static void Wait(int numOfSeconds) {
        driver.manage().timeouts().implicitlyWait(numOfSeconds, TimeUnit.SECONDS);
    }

    /**
     * Wait for presence of element
     *
     * @param locator
     */
    public static void waitForElementToBeVisibleBy(By locator) {
        SetupTest. wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }

    /**
     * Wait for element to be click able
     *
     * @param locator
     */
    public static void waitForElementToBeClickableBy(By locator) {
        SetupTest. wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    /**
     * Wait for element to be Click able
     *
     * @param element
     */
    public static void waitForElementToBeClickable(WebElement element) {
        SetupTest.  wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    /**
     * @param element
     * @param index
     */
    public static void selectByValue(WebElement element, String index) {
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
    public static void clickUntillVisibilityOfBy(WebElement toClick, By by) {
        waitForElementToBeClickable(toClick);
        while (driver.findElements(by).size() < 1) {
            toClick.click();
            Wait(10);
        }
    }

    public static void clearText(WebElement element) {
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

    public static WebElement getByXpath(String xpath, boolean isClickable){
        waitForElementToBeVisibleBy(By.xpath(xpath));
        if (isClickable) waitForElementToBeClickableBy(By.xpath(xpath));
        if (driver instanceof WebDriver) return driver.findElement(By.xpath(xpath));
        else return (MobileElement) driver.findElement(By.xpath(xpath));
    }
}