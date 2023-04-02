package Base;

import Base.Initialization;
import Listener_Demo.ListenerTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(ListenerTest.class)

public class TearDownTest
{

    @Test
    public void tearDown(){
        Initialization.driver.quit();
    }
}
