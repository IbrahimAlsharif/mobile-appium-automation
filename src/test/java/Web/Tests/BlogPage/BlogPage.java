package Web.Tests.BlogPage;

import Base.WebSetup.WebFinder;
import org.openqa.selenium.WebElement;

import static Base.WebSetup.WebSetupTest.testDataWeb;

public class BlogPage {

    public static WebElement getNavbarButton() {
        String xpath = "//button[@data-target='#navbarContent']";
        return WebFinder.getByXpath(xpath, true);
    }

    public static boolean NavbarButtonIsDisplayed() {
        return getNavbarButton().isDisplayed();
    }

    public static void clickOnNavbarButton() {
        getNavbarButton().click();
    }

    public static WebElement getBlogButton() {
        String xpath = "//li[@id='menu-item-2633']";
        return WebFinder.getByXpath(xpath, true);
    }

    public static boolean BlogButtonIsDisplayed() {
        return getBlogButton().isDisplayed();
    }

    public static void clickOnBlogButton() {
        getBlogButton().click();
    }

    public static WebElement getSearchInputField() {
        String xpath = "//input[@name='s']";
        return WebFinder.getByXpath(xpath, true);
    }

    public static boolean SearchInputFieldIsDisplayed() {
        return getSearchInputField().isDisplayed();
    }

    public static void SearchInputField(String Search) {
        getSearchInputField().sendKeys(Search);
    }
    public static String getSearchInputText(){
        return getSearchInputField().getAttribute("value");
    }

    public static WebElement getCategoriesDropdown() {
        String xpath = "//select[@id='search-all-categories']";
        return WebFinder.getByXpath(xpath, true);
    }

    public static boolean CategoriesDropdownIsDisplayed() {
        return getCategoriesDropdown().isDisplayed();
    }

    public static void SelectCategory() {
        WebFinder.selectByValue(getCategoriesDropdown(), testDataWeb.getSelectedCategoryOnBlogPage());
    }
    public static String getSelectedCategoryText(){
        return getCategoriesDropdown().getAttribute("value");
    }

    public static WebElement getSearchButton() {
        String xpath = "//button[@type='submit']";
        return WebFinder.getByXpath(xpath, true);
    }

    public static boolean SearchButtonIsDisplayed() {
        return getSearchButton().isDisplayed();
    }
    public static void clickOnSearchButton() {
        getSearchButton().click();
    }


    public static WebElement getSearchResult() {
        String xpath = "/html/body/div[1]/div/div/div/div[1]/h3";
        return WebFinder.getByXpath(xpath, true);
    }
    public static boolean SearchResultIsDisplayed() {
        return getSearchResult().isDisplayed();
    }

    public static String getSearchResultText() {
        return getSearchResult().getText().substring(16);
    }

}
