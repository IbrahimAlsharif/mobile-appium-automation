package Web;

import Base.Utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static Base.SetupTest.driver;

public class HomePage {
    public static WebElement getStartButton() {
        String xpath="//*[@id=\"heroText\"]/div/div[3]/a";
        Utilities.waitForElementToBeVisibleBy(By.xpath(xpath));
        By xPath = By.xpath(xpath);
        return driver.findElement(xPath);
    }

    public static boolean startButtonIsDisplayed() {
        return getStartButton().isDisplayed();
    }
}
