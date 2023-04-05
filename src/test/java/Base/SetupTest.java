package Base;

import Listeners.Listener;
import Mobile.TestData.*;
import TestRail.APIException;
import TestRail.TestRailManager;
import Web.BrowserOptions;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

@Listeners(Listener.class)

public class SetupTest {
    public  static   AndroidDriver driver ;
    public  static   WebDriver webDriver ;
    public static WebDriverWait wait;
    public static AbstractTestData testData;
    public static JavascriptExecutor javascriptExecutor;

    @Test(priority = 1)
    @Parameters({"language", "appPath", "platform", "branch", "browser", "url"})
    public void setUp(String language, String appPath, String platform, String branch, String browser, String url) throws APIException, IOException {
        if (platform.equals("mobile")) {
            initializeMobileDriver(platform, appPath);
        } else {
            initializeWebDriver(browser, url);
        }
        initializeTestData(language, branch, platform);
        TestRailManager testRailManager = new TestRailManager();
        Utilities.testRunId = testRailManager.addTestRun();
        Assert.assertTrue(true);
    }

    private void initializeMobileDriver(String platform, String appPath) throws MalformedURLException {
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), getDesiredCapabilities(appPath));
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, 30);
        javascriptExecutor = (JavascriptExecutor) driver;
    }

    private void initializeWebDriver(String browser, String url) {
        if (browser.equals("chrome")) {
            WebDriverManager.chromedriver().setup();
            webDriver = new ChromeDriver(new BrowserOptions().getChromeOptions(false,false));
        } else {
            WebDriverManager.firefoxdriver().setup();
            webDriver = new FirefoxDriver(new BrowserOptions().getFirefixOptions(false,false));
        }
        wait = new WebDriverWait(driver, 60);
        javascriptExecutor = (JavascriptExecutor) driver;
        driver.get(url);
        driver.manage().window().setSize(new Dimension(390, 844));
    }

    private DesiredCapabilities getDesiredCapabilities(String appPath) {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("deviceName", "Android Emulator");
        capabilities.setCapability("app_activity", "sa.app.famcare.MainActivity");
        capabilities.setCapability("allowTestPackages", "true");
        capabilities.setCapability("app_package", "sa.app.famcare");
        capabilities.setCapability(MobileCapabilityType.APP, appPath);
        File app = new File(appPath);
        capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
        return capabilities;
    }

    private void initializeTestData(String language, String branch, String platform) {
        if (language.equals("Arabic") && branch.equals("Production")) {
            if (platform.equals("mobile")){
            testData = new ArabicProductionTestData();
            }
            else {
                //todo Add web test data
                System.out.println("Add test data");
                testData = new ArabicProductionTestData();
            }
        } else if (language.equals("Arabic") && branch.equals("Staging")) {
            testData = new ArabicStagingTestData();
        } else if (language.equals("English") && branch.equals("Staging")) {
            testData = new EnglishStagingTestData();
        } else {
            testData = new EnglishProductionTestData();
        }
    }
}
