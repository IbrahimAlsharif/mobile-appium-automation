package Base;

import Listeners.Listener;
import Base.SetupTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import static Base.SetupTest.driver;

@Listeners(Listener.class)

public class TearDownTest
{
    @Test
    public void tearDown(){
        driver.quit();
    }
}
