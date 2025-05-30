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
import static org.testng.Assert.*;
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

    public static AndroidDriver  clientAndroidDriver;
    public static AndroidDriver  serviceProviderAndroidDriver;
    public static MobileFinder clientMobileFinder;
    public static MobileFinder serviceProviderMobileFinder;
    public static WebDriverWait wait;
    public static AbstractTestData testDataMobile;
    public static Mobile.TestDataSpecialistTests.AbstractTestData testDataMobileSpecialist;
    public static JavascriptExecutor javascriptExecutor;
    private String appiumPort;
    private String app;
    public static String testrailReport;
    @Test(priority = 1)
    @Parameters({"language", "appPath", "branch","deviceName", "appiumPort","app","testrailReport"})
    public void setUp(String language, String appPath, String branch, String deviceName,String appiumPort, String app, String testrailReport) throws APIException, IOException {
        this.appiumPort = appiumPort;
        this.app=app;
        this.testrailReport=testrailReport;
        initializeMobileDriver(appPath,deviceName);
        initializeTestData(language, branch);
        TestRailManager testRailManager = new TestRailManager();
        if (app.equalsIgnoreCase("client")){
            clientMobileFinder = new MobileFinder(clientAndroidDriver);
            if (testrailReport.equalsIgnoreCase("true")){
            clientMobileFinder.setTestRunId(testRailManager.createTestRun("Famcare Mobile",2));
            }
        }
        else {
            serviceProviderMobileFinder = new MobileFinder(serviceProviderAndroidDriver);
            if (testrailReport.equalsIgnoreCase("true")) {
                serviceProviderMobileFinder.setTestRunId(testRailManager.createTestRun("Famcare Mobile", 2));
            }
        }
        printParamters( language,  appPath,  branch,  deviceName, appiumPort,  app,  testrailReport);
        assertTrue(true);
    }

    private void initializeMobileDriver(String appPath, String deviceName) throws MalformedURLException {
        if (app.equalsIgnoreCase("client")){
            clientAndroidDriver = new AndroidDriver<>(new URL("http://127.0.0.1:"+appiumPort+"/wd/hub"), getDesiredCapabilities(appPath,deviceName));
            clientAndroidDriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
            wait = new WebDriverWait(clientAndroidDriver, 60);
            javascriptExecutor = (JavascriptExecutor) clientAndroidDriver;
        }
        else {
            serviceProviderAndroidDriver = new AndroidDriver<>(new URL("http://127.0.0.1:"+appiumPort+"/wd/hub"), getDesiredCapabilities(appPath,deviceName));
            serviceProviderAndroidDriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
            wait = new WebDriverWait(serviceProviderAndroidDriver, 60);
            javascriptExecutor = (JavascriptExecutor) serviceProviderAndroidDriver;
        }
    }

    private DesiredCapabilities getDesiredCapabilities(String appPath, String deviceName) {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("deviceName", deviceName);
        capabilities.setCapability("udid", deviceName);
//        capabilities.setCapability("app_activity", "sa.app.famcare.MainActivity");
//        capabilities.setCapability("allowTestPackages", "true");
//        capabilities.setCapability("app_package", "sa.app.famcare");
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
    private void printParamters(String language, String appPath, String branch, String deviceName,String appiumPort, String app, String testrailReport){
        System.out.println(language);
        System.out.println(appPath);
        System.out.println(branch);
        System.out.println(deviceName);
        System.out.println(appiumPort);
        System.out.println(app);
        System.out.println(testrailReport);
        if (app.equalsIgnoreCase("client"))
        System.out.println("clientAndroidDriver "+clientAndroidDriver.getConnection());
        else
        System.out.println("serviceProviderAndroidDriver "+serviceProviderAndroidDriver.getConnection());
        System.out.println("--------------------");
    }
}
