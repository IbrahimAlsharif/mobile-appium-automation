package Web.Tests.BlogPage;

import org.testng.Assert;
import org.testng.annotations.Test;

import static Base.WebSetup.WebSetupTest.testDataWeb;

public class BlogPageTest {
    @Test(priority = 1)
    public void navbarButtonIsDisplayed() {
        Assert.assertTrue(BlogPage.NavbarButtonIsDisplayed());
    }

    @Test(priority = 2)
    public void blogNavbarButtonIsDisplayed() {
        BlogPage.clickOnNavbarButton();
        Assert.assertTrue(BlogPage.BlogButtonIsDisplayed());
    }
    @Test(priority = 3)
    public void blogButtonIsClickable() {
        BlogPage.clickOnBlogButton();
        Assert.assertTrue(BlogPage.SearchInputFieldIsDisplayed());
    }
    @Test(priority = 4)
    public void searchInputData(){
        BlogPage.SearchInputField(testDataWeb.getSearchInputOnBlogPage());
        Assert.assertEquals(BlogPage.getSearchInputText(),testDataWeb.getSearchInputOnBlogPage());
    }
    @Test(priority = 5)
    public void categoriesDropdownIsDisplayed() {
        Assert.assertTrue(BlogPage.CategoriesDropdownIsDisplayed());
    }
    @Test(priority = 6)
    public void selectCategory() {
        BlogPage.SelectCategory();
        Assert.assertEquals(BlogPage.getSelectedCategoryText(),testDataWeb.getValueOfSelectedCategoryOnBlogPage());
    }

    @Test(priority =7)
    public void searchInputDisplayed() {
        Assert.assertTrue(BlogPage.SearchButtonIsDisplayed());
    }

    @Test(priority = 8)
    public void searchButtonIsClicked() {
        BlogPage.clickOnSearchButton();
        Assert.assertTrue(BlogPage.SearchResultIsDisplayed());
    }
    @Test(priority = 9)
    public void searchResultTextIsCorrect() {
        Assert.assertEquals(BlogPage.getSearchResultText(), testDataWeb.getSearchResultOnBlogPage());
    }
}
