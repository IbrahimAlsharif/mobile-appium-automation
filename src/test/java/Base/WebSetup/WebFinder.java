package Base.WebSetup;

import Base.Shot;
import com.github.javafaker.Faker;
import io.appium.java_client.MobileBy;
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
import java.util.Set;
import java.util.concurrent.TimeUnit;

import static Base.WebSetup.WebSetupTest.vars;
import static Base.WebSetup.WebSetupTest.webDriver;


public  class WebFinder {

    public static Faker faker = new Faker();
    private static final Shot shot= new Shot(webDriver);
    private static final TestRailManager testRail= new TestRailManager();
    public static String testRunId;
    public static  JavascriptExecutor js = (JavascriptExecutor) webDriver;

    public static void click(WebDriver driver, WebElement element) {
        {
            new Actions(driver).click(element).perform();
        }
    }

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


    /**
     * Scroll 150 down by javascript
     */
    public static void scrollDown150() {
        WebSetupTest. javascriptExecutor.executeScript("window.scrollBy(0,150)", "");
    }

    /**
     * Scroll 50 down by javascript
     */
    public static void scrollDown50() {
        WebSetupTest. javascriptExecutor.executeScript("window.scrollBy(0,50)", "");
    }

    /**
     * Scroll 30 down by javascript
     */
    public static void scrollDown30() {
        WebSetupTest.  javascriptExecutor.executeScript("window.scrollBy(0,30)", "");
    }

    /**
     * Scroll by a positive value to scroll down or negative value to scroll up
     *
     * @param value
     */
    public static void scrollBy(int value) {
        switch (value) {
            case 30:
                WebSetupTest.  javascriptExecutor.executeScript("window.scrollBy(0,30)", "");
                break;
            case 50:
                WebSetupTest.   javascriptExecutor.executeScript("window.scrollBy(0,50)", "");
                break;
            case 100:
                WebSetupTest.  javascriptExecutor.executeScript("window.scrollBy(0,100)", "");
                break;
            case 150:
                WebSetupTest.   javascriptExecutor.executeScript("window.scrollBy(0,150)", "");
                break;
            case -30:
                WebSetupTest.   javascriptExecutor.executeScript("window.scrollBy(0,-30)", "");
                break;
            case -50:
                WebSetupTest.    javascriptExecutor.executeScript("window.scrollBy(0,-50)", "");
                break;
            case -100:
                WebSetupTest.  javascriptExecutor.executeScript("window.scrollBy(0,-100)", "");
                break;
            case -150:
                WebSetupTest.  javascriptExecutor.executeScript("window.scrollBy(0,-150)", "");
                break;
            default:
                WebSetupTest.  javascriptExecutor.executeScript("window.scrollBy(0,-500)", "");
                break;

        }

    }

    /**
     * Scroll 150 up by java script
     */
    public static void scrollUp150() {
        WebSetupTest.javascriptExecutor.executeScript("window.scrollBy(0,-150)", "");
    }

    public static void javascriptExecutor(String s, WebElement usedProductAllMenuItem) {
        js.executeScript(s, usedProductAllMenuItem);
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
            JavascriptExecutor js = (JavascriptExecutor) webDriver;
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
        JavascriptExecutor js = (JavascriptExecutor) webDriver;
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
        return webDriver.switchTo().activeElement();
    }

    /**
     * Implicit wait
     *
     * @param numOfSeconds
     */
    public static void Wait(int numOfSeconds) {
        webDriver.manage().timeouts().implicitlyWait(numOfSeconds, TimeUnit.SECONDS);
    }

    /**
     * Wait for presence of element
     *
     * @param locator
     */
    public static void waitForElementToBeAccessibleBy(By locator) {
        WebSetupTest.wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }

    public static void waitForElementToBeVisibleBy(By locator) {
        WebSetupTest.wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    /**
     * Wait for element to be click able
     *
     * @param locator
     */
    public static void waitForElementToBeClickableBy(By locator) {
        WebSetupTest. wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    /**
     * Wait for element to be Click able
     *
     * @param element
     */
    public static void waitForElementToBeClickable(WebElement element) {
        WebSetupTest.wait.until(ExpectedConditions.elementToBeClickable(element));
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
        while (webDriver.findElements(by).size() < 1) {
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
        By byXpath= By.xpath(xpath);
        waitForElementToBeVisibleBy(byXpath);
        waitForElementToBeAccessibleBy(byXpath);
        if (isClickable) {waitForElementToBeClickableBy(byXpath);}
        return webDriver.findElement(byXpath);
    }
    public static WebElement getById(String id, boolean isClickable){
        By byId= By.id(id);
        waitForElementToBeVisibleBy(byId);
        if (isClickable) {waitForElementToBeClickableBy(byId);}
        return webDriver.findElement(byId);

    }
    public static WebElement getByClassName(String className, boolean isClickable){
        By byClassName= By.className(className);
        waitForElementToBeVisibleBy(byClassName);
        if (isClickable) {waitForElementToBeClickableBy(byClassName);}
        return webDriver.findElement(byClassName);
    }
    public static WebElement getByCssSelector(String cssSelector, boolean isClickable){
        By byCssSelector= By.cssSelector(cssSelector);
        waitForElementToBeVisibleBy(byCssSelector);
        if (isClickable) {waitForElementToBeClickableBy(byCssSelector);}
        return webDriver.findElement(byCssSelector);
    }
    public static WebElement getByAccessibilityId(String AccessibilityId, boolean isClickable){
        By byAccessibilityId= MobileBy.AccessibilityId(AccessibilityId);
        waitForElementToBeVisibleBy(byAccessibilityId);
        if (isClickable) {waitForElementToBeClickableBy(byAccessibilityId);}
        return webDriver.findElement(byAccessibilityId);
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

    public static void getWindowHandles(){
        vars.put("window_handles", webDriver.getWindowHandles());
    }

    public static void switchToWindow(String tag){
        vars.put(tag, waitForWindow(2000));
        putWindow("root");
        webDriver.switchTo().window(vars.get(tag).toString());
    }

    public static void backToWindow(String tag){
        webDriver.switchTo().window(vars.get(tag).toString());
    }

    public static void putWindow(String tag){
        vars.put(tag, webDriver.getWindowHandle());
    }
}