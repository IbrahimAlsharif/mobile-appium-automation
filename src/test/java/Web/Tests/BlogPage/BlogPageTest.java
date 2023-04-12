package Web.Tests.BlogPage;

import static org.testng.Assert.*;
import org.testng.annotations.Test;

import static Base.WebSetup.WebSetupTest.testDataWeb;

public class BlogPageTest {
    @Test(priority = 1)
    public void navbarButtonIsDisplayed() {
        assertTrue(BlogPage.NavbarButtonIsDisplayed());
    }

    @Test(priority = 2)
    public void blogNavbarButtonIsDisplayed() {
        BlogPage.clickOnNavbarButton();
        assertTrue(BlogPage.BlogButtonIsDisplayed());
    }
    @Test(priority = 3)
    public void blogButtonIsClickable() {
        BlogPage.clickOnBlogButton();
        assertTrue(BlogPage.SearchInputFieldIsDisplayed());
    }
    @Test(priority = 4)
    public void searchInputData(){
        BlogPage.SearchInputField(testDataWeb.getSearchInputOnBlogPage());
        assertEquals(BlogPage.getSearchInputText(),testDataWeb.getSearchInputOnBlogPage());
    }
    @Test(priority = 5)
    public void categoriesDropdownIsDisplayed() {
        assertTrue(BlogPage.CategoriesDropdownIsDisplayed());
    }
    @Test(priority = 6)
    public void selectCategory() {
        BlogPage.SelectCategory();
        assertEquals(BlogPage.getSelectedCategoryText(),testDataWeb.getValueOfSelectedCategoryOnBlogPage());
    }

    @Test(priority =7)
    public void searchInputDisplayed() {
        assertTrue(BlogPage.SearchButtonIsDisplayed());
    }

    @Test(priority = 8)
    public void searchButtonIsClicked() {
        BlogPage.clickOnSearchButton();
        assertTrue(BlogPage.SearchResultIsDisplayed());
    }
    @Test(priority = 9)
    public void searchResultTextIsCorrect() {
        assertEquals(BlogPage.getSearchResultText(), testDataWeb.getSearchResultOnBlogPage());
    }
}
