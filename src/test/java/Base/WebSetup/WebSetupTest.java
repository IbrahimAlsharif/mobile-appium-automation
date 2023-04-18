package Base.WebSetup;

import Listeners.Listener;
import TestRail.APIException;
import TestRail.TestRailManager;
import Web.BrowserOptions;
import Web.TestData.ArabicProductionTestDataWeb;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


@Listeners(Listener.class)

public class WebSetupTest {

    public static WebDriver webDriver;
    public static WebDriverWait wait;
    public static Web.TestData.AbstractTestData testDataWeb;
    public static JavascriptExecutor javascriptExecutor;

    public static Map<String, Object> vars;
    public static String testrailReport;

    @Test(priority = 1)
    @Parameters({"language", "branch", "browser", "url", "testrailReport"})
    public void setUp(String language, String branch, String browser, String url, String testrailReport) throws APIException, IOException {
        this.testrailReport=testrailReport;
        initializeWebDriver(browser, url);
        initializeTestData(language, branch);
        if(testrailReport.equalsIgnoreCase("true")) {
            TestRailManager testRailManager = new TestRailManager();
            WebFinder.testRunId = testRailManager.createTestRun("Famcare Web", 7);
        }
        Assert.assertTrue(true);
    }


    private void initializeWebDriver(String browser, String url) {
        if (browser.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            webDriver = new ChromeDriver(new BrowserOptions().getChromeOptions(false, true));
        } else {
            WebDriverManager.firefoxdriver().setup();
            webDriver = new FirefoxDriver(new BrowserOptions().getFirefixOptions(false, true));
        }
        wait = new WebDriverWait(webDriver, 60);
        javascriptExecutor = (JavascriptExecutor) webDriver;
        vars = new HashMap<String, Object>();
        webDriver.get(url);

        webDriver.manage().window().setSize(new Dimension(390, 844));
    }


    private void initializeTestData(String language, String branch) {
        if (language.equalsIgnoreCase("Arabic") && branch.equalsIgnoreCase("Production")) {
            testDataWeb = new ArabicProductionTestDataWeb();
        } else if (language.equalsIgnoreCase("Arabic") && branch.equalsIgnoreCase("Staging")) {
            //
        } else if (language.equalsIgnoreCase("English") && branch.equalsIgnoreCase("Staging")) {
            //
        } else {
            //
        }
    }
}
