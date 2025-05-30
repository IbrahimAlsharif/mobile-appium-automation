package Base;

import Listeners.Listener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import static Base.MobileSetup.MobileSetupTest.clientAndroidDriver;
import static Base.MobileSetup.MobileSetupTest.serviceProviderAndroidDriver;

@Listeners(Listener.class)
public class TearDownTest
{
    @Test
    @Parameters("app")
    public void tearDown(String app){
        if (app.equalsIgnoreCase("web")){
            System.out.println("delete for the web test");
        }
//            webDriver.quit();
        else if (app.equalsIgnoreCase("client")) clientAndroidDriver.quit();
        else serviceProviderAndroidDriver.quit();
    }
    }
