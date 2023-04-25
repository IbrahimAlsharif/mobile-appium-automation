package Base;

import Listeners.Listener;
import io.appium.java_client.android.AndroidDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import static Base.MobileSetup.MobileSetupTest.clientAndroidDriver;
import static Base.MobileSetup.MobileSetupTest.serviceProviderAndroidDriver;
import static Base.WebSetup.WebSetupTest.webDriver;

@Listeners(Listener.class)
public class TearDownTest
{
    @Test
    @Parameters("app")
    public void tearDown(String app){
        if (webDriver!= null) webDriver.quit();
        else {
            if (app.equalsIgnoreCase("client")) clientAndroidDriver.quit();
            else serviceProviderAndroidDriver.quit();
    }
    }
}
