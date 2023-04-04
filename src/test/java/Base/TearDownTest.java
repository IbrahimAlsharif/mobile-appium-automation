package Base;

import Listeners.ListenerTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(ListenerTest.class)

public class TearDownTest
{

    @Test
    public void tearDown(){
        MobileSetupTest.driver.quit();
    }
}
