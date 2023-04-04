package Base;

import Listeners.ListenerTest;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import TestData.*;
import TestRail.APIException;
import TestRail.TestRailManager;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

@Listeners(ListenerTest.class)

public class MobileSetupTest {
    public static MobileDriver driver;
    public static WebDriverWait wait;
    public static AbstractTestData testData;
    public static JavascriptExecutor javascriptExecutor;

@Test(priority = 1)
@Parameters({"language","appPath","platform","branch"})
public void setUp(String language,String appPath, String platform, String branch) throws APIException, IOException {

    DesiredCapabilities capabilities= new DesiredCapabilities();
    capabilities.setCapability("platformName", "Android");
    capabilities.setCapability("deviceName", "Android Emulator");
    capabilities.setCapability("app_activity","sa.app.famcare.MainActivity");
    capabilities.setCapability("allowTestPackages","true");
    capabilities.setCapability("app_package","sa.app.famcare");
    capabilities.setCapability(MobileCapabilityType.APP, appPath);
    File app = new File(appPath);
    capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
    driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    initializeTestData(language, branch);
    wait = new WebDriverWait(driver, 30);
    javascriptExecutor = (JavascriptExecutor) driver;
    TestRailManager testRailManager = new TestRailManager();
    Utilities.testRunId = testRailManager.addTestRun();
    Assert.assertTrue(true);
    }



    private void initializeTestData(String language, String branch) {
        if (language.equals("Arabic") && branch.equals("Production")){
            testData = new ArabicProductionTestData();
        }
        else if (language.equals("Arabic") && branch.equals("Staging")){
            testData = new ArabicStagingTestData();
        }
        else if(language.equals("English") && branch.equals("Staging")){
            testData = new EnglishStagingTestData();
        }
        else {
            testData = new EnglishProductionTestData();
        }
    }



}
