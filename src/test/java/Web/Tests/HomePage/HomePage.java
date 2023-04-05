package Web.Tests.HomePage;

import Base.Utilities;
import org.openqa.selenium.WebElement;

public class HomePage {
    public static WebElement getLogo() {
        String xpath="//IMG[@src='https://famcare.app/wp-content/uploads/2023/02/full-logo-1.svg']";
        return  Utilities.getByXpath(xpath, true);
    }

    public static boolean logoIsDisplayed() {
        return getLogo().isDisplayed();
    }

    public static WebElement getStartImage() {
        String xpath="//*[@id=\"heroSection\"]/div/div/div[1]/div/div[2]/img";
        return  Utilities.getByXpath(xpath, false);
    }

    public static boolean startImageIsDisplayed() {
        return getStartImage().isDisplayed();
    }

    public static WebElement getStartText() {
        String xpath="//*[@id=\"heroText\"]/div/div[1]/h2";
        return  Utilities.getByXpath(xpath, false);
    }

    public static boolean startTextIsDisplayed() {
        return getStartText().isDisplayed();
    }

    public static WebElement getStartButton() {
        String xpath="//*[@id=\"heroText\"]/div/div[3]/a";
        return  Utilities.getByXpath(xpath, true);
    }

    public static boolean startButtonIsDisplayed() {
        return getStartButton().isDisplayed();
    }

    public static void clickOnStartButton() {
        getStartButton().click();
    }

    public static WebElement getPromotionalText() {
        String xpath="/html/body/div[1]/section[2]/div/div/div/div/div/h2";
        return  Utilities.getByXpath(xpath, false);
    }

    public static boolean promotionalTextIsDisplayed() {
        return getPromotionalText().isDisplayed();
    }

    public static WebElement getPackagesImage() {
        String xpath="//IMG[@src='https://famcare.app/wp-content/uploads/2023/02/Group-4913.png']";
        return  Utilities.getByXpath(xpath, false);
    }

    public static boolean packagesImageIsDisplayed() {
        return getPackagesImage().isDisplayed();
    }

    public static WebElement getPackagesTitle() {
        String xpath="(//P)[2]";
        return  Utilities.getByXpath(xpath, false);
    }

    public static boolean packagesTitleIsDisplayed() {
        return getPackagesTitle().isDisplayed();
    }

    public static WebElement getPackagesDescriptionText() {
        String xpath="(//P)[3]";
        return  Utilities.getByXpath(xpath, false);
    }

    public static boolean packagesDescriptionTextIsDisplayed() {
        return getPackagesDescriptionText().isDisplayed();
    }

    public static WebElement getSessionsImage() {
        String xpath="//IMG[@src='https://famcare.app/wp-content/uploads/2023/02/Group-1.png']";
        return  Utilities.getByXpath(xpath, false);
    }

    public static boolean sessionsImageIsDisplayed() {
        return getSessionsImage().isDisplayed();
    }

    public static WebElement getSessionsTitle() {
        String xpath="(//P)[4]";
        return  Utilities.getByXpath(xpath, false);
    }

    public static boolean sessionsTitleIsDisplayed() {
        return getSessionsTitle().isDisplayed();
    }

    public static WebElement getSessionsDescriptionText() {
        String xpath="(//P)[5]";
        return  Utilities.getByXpath(xpath, false);
    }

    public static boolean sessionsDescriptionTextIsDisplayed() {
        return getSessionsDescriptionText().isDisplayed();
    }

    public static WebElement getRatingImage() {
        String xpath="//IMG[@src='https://famcare.app/wp-content/uploads/2023/02/rating.png']";
        return  Utilities.getByXpath(xpath, false);
    }

    public static boolean ratingImageIsDisplayed() {
        return getRatingImage().isDisplayed();
    }

    public static WebElement getRatingTitle() {
        String xpath="(//P)[6]";
        return  Utilities.getByXpath(xpath, false);
    }

    public static boolean ratingTitleIsDisplayed() {
        return getRatingTitle().isDisplayed();
    }

    public static WebElement getRatingDescriptionText() {
        String xpath="(//P)[7]";
        return  Utilities.getByXpath(xpath, false);
    }

    public static boolean ratingDescriptionTextIsDisplayed() {
        return getRatingDescriptionText().isDisplayed();
    }

    public static WebElement getSubscriptionImage() {
        String xpath="//IMG[@src='https://famcare.app/wp-content/uploads/2023/03/mobile.png']";
        return  Utilities.getByXpath(xpath, true);
    }

    public static boolean subscriptionImageIsDisplayed() {
        return getSubscriptionImage().isDisplayed();
    }

    public static WebElement getConsultantButton() {
        String xpath="//a[@href=\"https://famcare.onelink.me/v4gj/y2wra5uz\" and contains(text(),'اختر مستشارك')]";
        return  Utilities.getByXpath(xpath, true);
    }

    public static boolean consultantButtonIsDisplayed() {
        return getConsultantButton().isDisplayed();
    }

    public static WebElement getStartChangeButton() {
        String xpath="//a[@href=\"https://famcare.onelink.me/v4gj/y2wra5uz\" and contains(text(),'ابدأ التغيير')]";
        return  Utilities.getByXpath(xpath, true);
    }

    public static boolean startChangeButtonIsDisplayed() {
        return getStartChangeButton().isDisplayed();
    }

    public static WebElement getGooglePlayButton() {
        String xpath="//IMG[@src='https://famcare.app/wp-content/themes/famkeer/images/hamed/Google_Play_Store_badge_EN.svg']";
        return  Utilities.getByXpath(xpath, true);
    }

    public static boolean googlePlayButtonIsDisplayed() {
        return getGooglePlayButton().isDisplayed();
    }

    public static WebElement getAppStoreButton() {
        String xpath="//IMG[@src='https://famcare.app/wp-content/themes/famkeer/images/hamed/Download_on_the_App_Store_Badge.svg']";
        return  Utilities.getByXpath(xpath, true);
    }

    public static boolean appStoreButtonIsDisplayed() {
        return getAppStoreButton().isDisplayed();
    }

    public static WebElement getBlogButton() {
        String xpath="//a[@title=\"مدونة الأسرة الأولى\"]";
        return  Utilities.getByXpath(xpath, true);
    }

    public static boolean blogButtonIsDisplayed() {
        return getBlogButton().isDisplayed();
    }

    public static WebElement getFooterGooglePlayButton() {
        String xpath="//IMG[@src='https://famcare.app/wp-content/themes/famkeer/images/Google-Play.svg']";
        return  Utilities.getByXpath(xpath, true);
    }

    public static boolean footerGooglePlayButtonIsDisplayed() {
        return getFooterGooglePlayButton().isDisplayed();
    }

    public static WebElement getFooterAppStoreButton() {
        String xpath="//IMG[@src='https://famcare.app/wp-content/themes/famkeer/images/App-Store.svg']";
        return  Utilities.getByXpath(xpath, true);
    }

    public static boolean footerAppStoreButtonIsDisplayed() {
        return getFooterAppStoreButton().isDisplayed();
    }
}
