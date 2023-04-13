package Mobile.Tests.MorePage;
import Base.MobileSetup.MobileFinder;
import io.appium.java_client.MobileElement;
import  static Base.MobileSetup.MobileSetupTest.testDataMobile;

public class MorePage {
    public static MobileElement getLanguageIcon() {
        String xpath="//android.widget.ImageView[@content-desc=\""+testDataMobile.getLanguageIconText()+"\"]";
        return MobileFinder.getByXpath(xpath,true);
    }
    public static boolean LanguageIconIsDisplayed(){
        return getLanguageIcon().isDisplayed();
    }
    public static MobileElement getUserImage() {
        String xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.ImageView[2]";
        return MobileFinder.getByXpath(xpath,true);
    }
    public static boolean UserImageIsDisplayed(){
        return getUserImage().isDisplayed();
    }


    public static MobileElement getTheUserDoesNotHaveSubscription() {
        String xpath="//android.view.View[@content-desc=\""+testDataMobile.getTheUserDoesNotHaveSubscriptionText()+"\"]";
        return MobileFinder.getByXpath(xpath,false);
    }
    public static boolean TheUserDoesNotHaveSubscriptionTitleIsDisplayed(){
        return getTheUserDoesNotHaveSubscription().isDisplayed();
    }
    public static MobileElement getSubscribeToSubscriptionsText() {
        String xpath="//android.view.View[@content-desc=\""+testDataMobile.getSubscribeToSubscriptionsText()+"\"]";
        return MobileFinder.getByXpath(xpath,false);
    }
    public static boolean SubscribeToSubscriptionsTextIsDisplayed(){
        return getSubscribeToSubscriptionsText().isDisplayed();
    }
    public static MobileElement getNumberOfSessions() {
        String xpath="(//android.view.View[@content-desc=\"0\"])[1]";
        return MobileFinder.getByXpath(xpath,false);
    }
    public static boolean NumberOfSessionsTextIsDisplayed(){
        return getNumberOfSessions().isDisplayed();
    }
    public static MobileElement getNumberOfDays() {
        String xpath="(//android.view.View[@content-desc=\"0\"])[2]";
        return  MobileFinder.getByXpath(xpath,false);
    }
    public static boolean NumberOfDaysIsDisplayed(){
        return getNumberOfDays().isDisplayed();
    }

    public static MobileElement getBrowseSubscriptionsButton() {
        String xpath="//android.widget.Button[@content-desc=\""+testDataMobile.getBrowseSubscriptionsButton()+"\"]";
        return  MobileFinder.getByXpath(xpath,true);
    }
    public static boolean BrowseSubscriptionsButtonIsDisplayed(){
        return getBrowseSubscriptionsButton().isDisplayed();
    }
    public static MobileElement getAnswerAndQuestionButton() {
        String xpath="//android.view.View[@content-desc=\""+testDataMobile.getAnswerAndQuestionButton()+"\"]";
        return  MobileFinder.getByXpath(xpath,true);
    }
    public static boolean AnswerAndQuestionButtonIsDisplayed(){
        return getAnswerAndQuestionButton().isDisplayed();
    }
    public static MobileElement getBlogButton() {
        String xpath="//android.view.View[@content-desc=\""+testDataMobile.getBlogButton()+"\"]";
        return MobileFinder.getByXpath(xpath,true);
    }
    public static boolean BlogButtonIsDisplayed(){
        return getBlogButton().isDisplayed();
    }
    public static MobileElement getSignInButton() {
        String xpath="//android.view.View[@content-desc=\""+testDataMobile.getSignInButton()+"\"]";
        return MobileFinder.getByXpath(xpath,true);
    }
    public static boolean SignInButtonIsDisplayed(){
        return getSignInButton().isDisplayed();
    }
    public static void ClickOnSignInButton() {
        getSignInButton().click();
    }

    public static MobileElement getFriendsInviteButton() {
        String xpath="//android.view.View[@content-desc=\""+testDataMobile.getFriendsInviteButton()+"\"]";
        return MobileFinder.getByXpath(xpath,true);
    }
    public static boolean FriendsInviteButtonIsDisplayed(){
        return getFriendsInviteButton().isDisplayed();
    }
    public static MobileElement getFamcareRatingButton() {
        String xpath="//android.view.View[@content-desc=\""+testDataMobile.getFamcareRatingButton()+"\"]";
        return MobileFinder.getByXpath(xpath,true);
    }
    public static boolean FamcareRatingButtonIsDisplayed(){
        return getFamcareRatingButton().isDisplayed();
    }
    public static MobileElement getTechnicalSupportButton() {
        String xpath="//android.view.View[@content-desc=\""+testDataMobile.getTechnicalSupportButton()+"\"]";
        return MobileFinder.getByXpath(xpath,true);
    }
    public static boolean TechnicalSupportIsDisplayed(){
        return getTechnicalSupportButton().isDisplayed();
    }
    public static MobileElement getInterestNumbersButton() {
        String xpath="//android.view.View[@content-desc=\""+testDataMobile.getInterestNumbersButton()+"\"]";
        return MobileFinder.getByXpath(xpath,true);
    }
    public static boolean InterestNumbersButtonIsDisplayed(){
        return getInterestNumbersButton().isDisplayed();
    }
  public static MobileElement getPrivacyPolicyButton() {
        String xpath="//android.view.View[@content-desc=\""+testDataMobile.getPrivacyPolicyButton()+"\"]";
        return MobileFinder.getByXpath(xpath,true);
    }
    public static boolean PrivacyPolicyIsDisplayed(){
        return getPrivacyPolicyButton().isDisplayed();
    }
    public static MobileElement getUseTermsButton() {
        String xpath="//android.view.View[@content-desc=\""+testDataMobile.getUseTermsButton()+"\"]";
        return MobileFinder.getByXpath(xpath,true);
    }
    public static boolean UseTermsIsDisplayed(){
        return getUseTermsButton().isDisplayed();
    }






}
