package Base;
import Listeners.ListenerTest;
import TestData.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import TestRail.APIException;
import TestRail.TestRailManager;

import java.io.IOException;

@Listeners(ListenerTest.class)

public class WebSetupTest {
    public static WebDriver driver;
    public static WebDriverWait wait;
    public static AbstractTestData testData;
    public static JavascriptExecutor javascriptExecutor;

    @Test(priority = 1)
    @Parameters({"language","url","browser","branch"})
    public void setUp(String language,String url, String browser, String branch) throws APIException, IOException {
        initializeBrowser(browser);
        initializeTestData(language, branch);
        wait = new WebDriverWait(driver, 60);
        javascriptExecutor = (JavascriptExecutor) driver;
        driver.get(url);
        driver.manage().window().setSize(new Dimension(1512, 889));
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

    private void initializeBrowser(String browser) {
        if (browser.equals("chrome")){
            ChromeOptions options = new BrowserOptions().getOptions(false, false);
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver(options);
        }
        else {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }
    }
@Test
    public void test(){
    System.out.println("sdfkjdshf");
}

}
