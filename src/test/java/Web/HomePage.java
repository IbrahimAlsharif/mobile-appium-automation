package Web;

import Base.Utilities;
import org.openqa.selenium.WebElement;

public class HomePage {
//    public static WebElement getStartButton() {
//        String xpath="//*[@id=\"heroText\"]/div/div[3]/a";
//        Utilities.waitForElementToBeVisibleBy(By.xpath(xpath));
//        By xPath = By.xpath(xpath);
//        return driver.findElement(xPath);
//    }

    public static WebElement getStartButton() {
        String xpath="//*[@id=\"heroText\"]/div/div[3]/a";
        return  Utilities.getByXpath(xpath, true);
    }

    public static boolean startButtonIsDisplayed() {
        return getStartButton().isDisplayed();
    }
}
