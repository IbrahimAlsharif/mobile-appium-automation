package Base;

import Listeners.Listener;
import Mobile.TestData.*;
import Mobile.TestDataSpecialistTests.ArabicProductionTestDataSpecialist;
import Mobile.TestDataSpecialistTests.ArabicStagingTestDataSpecialist;
import Mobile.TestDataSpecialistTests.EnglishProductionTestDataSpecialist;
import Mobile.TestDataSpecialistTests.EnglishStagingTestDataSpecialist;
import TestRail.APIException;
import TestRail.TestRailManager;
import Web.BrowserOptions;
import Web.TestData.ArabicProductionTestDataWeb;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
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

    public static WebDriver driver;
    public static AndroidDriver  androidDriver;

    public static WebDriverWait wait;
    public static AbstractTestData testDataMobile;
    public static Mobile.TestDataSpecialistTests.AbstractTestData testDataMobileSpecialist;

    public static Web.TestData.AbstractTestData testDataWeb;
    public static JavascriptExecutor javascriptExecutor;

    @Test(priority = 1)
    @Parameters({"language", "appPath", "platform", "branch", "browser", "url"})
    public void setUp(String language, String appPath, String platform, String branch, String browser, String url) throws APIException, IOException {
        if (platform.equalsIgnoreCase("mobile")) {
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
        driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), getDesiredCapabilities(appPath));
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, 60);
        javascriptExecutor = (JavascriptExecutor) driver;
    }

    private void initializeWebDriver(String browser, String url) {
        if (browser.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver(new BrowserOptions().getChromeOptions(false,false));
        } else {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver(new BrowserOptions().getFirefixOptions(false,false));
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
        if (language.equalsIgnoreCase("Arabic") && branch.equalsIgnoreCase("Production")) {
            if (platform.equalsIgnoreCase("mobile")){
            testDataMobile = new ArabicProductionTestDataMobile();
            testDataMobileSpecialist= new ArabicProductionTestDataSpecialist();
            }
            else {
                //todo Add web test data
                System.out.println("Add test data");
                testDataWeb =  new ArabicProductionTestDataWeb();
            }
        } else if (language.equalsIgnoreCase("Arabic") && branch.equalsIgnoreCase("Staging")) {
            testDataMobile = new ArabicStagingTestData();
            testDataMobileSpecialist = new ArabicStagingTestDataSpecialist();
        } else if (language.equalsIgnoreCase("English") && branch.equalsIgnoreCase("Staging")) {
            testDataMobile = new EnglishStagingTestData();
            testDataMobileSpecialist = new EnglishStagingTestDataSpecialist();
        } else {
            testDataMobile = new EnglishProductionTestData();
            testDataMobileSpecialist = new EnglishProductionTestDataSpecialist();
        }
    }
}
