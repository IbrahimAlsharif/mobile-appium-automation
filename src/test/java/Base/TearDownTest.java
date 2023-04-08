package Base;

import Listeners.Listener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import static Base.MobileSetupTest.androidDriver;
import static Base.WebSetupTest.webDriver;

@Listeners(Listener.class)
public class TearDownTest
{
    @Test
    public void tearDown(){
        if (webDriver!= null) webDriver.quit();
        else androidDriver.quit();
    }
}
