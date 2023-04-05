package Web;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest {
    @Test
    public void startButtonIsDisplayed(){

        Assert.assertTrue(HomePage.startButtonIsDisplayed());
    }
}
