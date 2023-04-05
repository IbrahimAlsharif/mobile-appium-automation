package Web.Tests.SubscriptionsPage;

import Base.Utilities;
import org.openqa.selenium.WebElement;

public class SubscriptionPage {
    public static WebElement getSubscriptionTitle() {
        String xpath="/html/body/div[1]/div/h5";
        return  Utilities.getByXpath(xpath, false);
    }

    public static String getSubscriptionTitleText() {
        return getSubscriptionTitle().getText();
    }

}
