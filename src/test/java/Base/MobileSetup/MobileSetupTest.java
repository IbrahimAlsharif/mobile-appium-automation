package Base.MobileSetup;

import Listeners.Listener;
import Mobile.TestData.*;
import Mobile.TestDataSpecialistTests.ArabicProductionTestDataSpecialist;
import Mobile.TestDataSpecialistTests.ArabicStagingTestDataSpecialist;
import Mobile.TestDataSpecialistTests.EnglishProductionTestDataSpecialist;
import Mobile.TestDataSpecialistTests.EnglishStagingTestDataSpecialist;
import TestRail.APIException;
import TestRail.TestRailManager;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.JavascriptExecutor;
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
public class MobileSetupTest {

    public static AndroidDriver  androidDriver;
    public static WebDriverWait wait;
    public static AbstractTestData testDataMobile;
    public static Mobile.TestDataSpecialistTests.AbstractTestData testDataMobileSpecialist;
    public static Web.TestData.AbstractTestData testDataWeb;
    public static JavascriptExecutor javascriptExecutor;
    private String port;
    @Test(priority = 1)
    @Parameters({"language", "appPath", "branch","deviceName", "port"})
    public void setUp(String language, String appPath, String branch, String deviceName,String port) throws APIException, IOException {
        this.port = port;
        initializeMobileDriver(appPath,deviceName);
        initializeTestData(language, branch);
        TestRailManager testRailManager = new TestRailManager();
        MobileFinder.testRunId = testRailManager.addTestRun();
        Assert.assertTrue(true);
    }

    private void initializeMobileDriver(String appPath, String deviceName) throws MalformedURLException {
        androidDriver = new AndroidDriver<>(new URL("http://127.0.0.1:"+port+"/wd/hub"), getDesiredCapabilities(appPath,deviceName));
        androidDriver.manage().timeouts().implicitlyWait(35, TimeUnit.SECONDS);
        wait = new WebDriverWait(androidDriver, 35);
        javascriptExecutor = (JavascriptExecutor) androidDriver;
    }

    private DesiredCapabilities getDesiredCapabilities(String appPath, String deviceName) {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("deviceName", deviceName);
        capabilities.setCapability("app_activity", "sa.app.famcare.MainActivity");
        capabilities.setCapability("allowTestPackages", "true");
        capabilities.setCapability("app_package", "sa.app.famcare");
        capabilities.setCapability(MobileCapabilityType.APP, appPath);
        File app = new File(appPath);
        capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
        return capabilities;
    }

    private void initializeTestData(String language, String branch) {
        if (language.equalsIgnoreCase("Arabic") && branch.equalsIgnoreCase("Production")) {
            testDataMobile = new ArabicProductionTestDataMobile();
            testDataMobileSpecialist= new ArabicProductionTestDataSpecialist();
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
