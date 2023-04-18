package Web.Tests.BlogPage;

import org.testng.Assert;
import org.testng.annotations.Test;

import static Base.WebSetup.WebSetupTest.testDataWeb;

public class BlogPageTest {
    private String testCaseId;
    @Test(priority = 1)
    public void navbarButtonIsDisplayed() {
       testCaseId = "10126";
        Assert.assertTrue(BlogPage.NavbarButtonIsDisplayed());
    }

    @Test(priority = 2)
    public void blogNavbarButtonIsDisplayed() {
       testCaseId = "10273";
        BlogPage.clickOnNavbarButton();
        Assert.assertTrue(BlogPage.BlogButtonIsDisplayed());
    }
    @Test(priority = 3)
    public void blogButtonIsClickable() {
       testCaseId = "10274";
        BlogPage.clickOnBlogButton();
        Assert.assertTrue(BlogPage.SearchInputFieldIsDisplayed());
    }
    @Test(priority = 4)
    public void searchInputData(){
       testCaseId = "10276";
        BlogPage.SearchInputField(testDataWeb.getSearchInputOnBlogPage());
        Assert.assertEquals(BlogPage.getSearchInputText(),testDataWeb.getSearchInputOnBlogPage());
    }
    @Test(priority = 5)
    public void categoriesDropdownIsDisplayed() {
       testCaseId = "10278";
        Assert.assertTrue(BlogPage.CategoriesDropdownIsDisplayed());
    }
    @Test(priority = 6)
    public void selectCategory() {
       testCaseId = "10279";
        BlogPage.SelectCategory();
        Assert.assertEquals(BlogPage.getSelectedCategoryText(),testDataWeb.getValueOfSelectedCategoryOnBlogPage());
    }

    @Test(priority =7)
    public void searchButtonDisplayed() {
       testCaseId = "10280";
        Assert.assertTrue(BlogPage.SearchButtonIsDisplayed());
    }

    @Test(priority = 8)
    public void searchButtonIsClicked() {
       testCaseId = "10281";
        BlogPage.clickOnSearchButton();
        Assert.assertTrue(BlogPage.SearchResultIsDisplayed());
    }
    @Test(priority = 9)
    public void searchResultTextIsCorrect() {
       testCaseId = "10282";
        Assert.assertEquals(BlogPage.getSearchResultText(), testDataWeb.getSearchResultOnBlogPage());
    }
}
