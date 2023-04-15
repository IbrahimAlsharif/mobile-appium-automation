package Base;

import Listeners.Listener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import static Base.MobileSetup.MobileSetupTest.clientAndroidDriver;
import static Base.MobileSetup.MobileSetupTest.serviceProviderAndroidDriver;
import static Base.WebSetup.WebSetupTest.webDriver;

@Listeners(Listener.class)
public class TearDownTest
{
    @Test
    public void tearDown(){
        if (webDriver!= null) webDriver.quit();
        else {
            if (clientAndroidDriver != null) clientAndroidDriver.quit();
            if (serviceProviderAndroidDriver != null) serviceProviderAndroidDriver.quit();
    }
    }
}
