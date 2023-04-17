package Base;

import Listeners.Listener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import static Base.MobileSetup.MobileSetupTest.androidDriver;
import static Base.WebSetup.WebSetupTest.webDriver;

@Listeners(Listener.class)
public class TearDownTest
{
    @Test
    public void tearDown(){
        System.out.println(androidDriver.getConnection().toString());
        if (webDriver!= null) webDriver.quit();
        else androidDriver.quit();
    }
}
