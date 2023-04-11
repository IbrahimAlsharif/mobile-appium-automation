package Web.Tests.AcademyFooter;

import Base.WebSetup.WebFinder;
import org.openqa.selenium.WebElement;

public class AcademyFooter {
    public static WebElement getLogoImage() {
        String xpath = "//img[@src=\"https://academy.famcare.app/media/2020/10/Asset-4.png\"]";
        return WebFinder.getByXpath(xpath, false);
    }
    public static boolean logoImageIsDisplayed() {
        return getLogoImage().isDisplayed();
    }
}
