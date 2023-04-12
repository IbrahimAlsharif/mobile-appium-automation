//package Mobile.Tests.UpcomingMeetings;
//
//import Base.MobileSetup.MobileFinder;
//import io.appium.java_client.MobileElement;
//
//import static Base.MobileSetup.MobileSetupTest.testDataMobile;
//
//public class UpcomingMeetings {
//    public static MobileElement getDetailsMeetingText() {
//        String xpath="//android.view.View[@content-desc=\""+testDataMobile.getDetailsMeetingText()+"\"]";
//        return  MobileFinder.getByXpath(xpath,true);
//    }
//    public static boolean DetailsUpcomingMeetingIsDisplayed(){
//        return getDetailsMeetingText().isDisplayed();
//    }
//    public static MobileElement getTitleUpcomingMeeting() {
//        String xpath="//android.view.View[@content-desc=\""+testDataMobile.getTitleUpcomingMeeting()+"\"]";
//        return  MobileFinder.getByXpath(xpath,false);
//    }
//    public static boolean TitleUpcomingMeetingIsDisplayed(){
//        return getTitleUpcomingMeeting().isDisplayed();
//    }
//    public static MobileElement getPriceMeeting() {
//        String xpath="//android.view.View[@content-desc=\""+testDataMobile.getPriceMeeting()+"\"]";
//        return  MobileFinder.getByXpath(xpath,false);
//    }
//    public static boolean PriceMeetingIsDisplayed(){
//        return getPriceMeeting().isDisplayed();
//    }
//    public static MobileElement getTimeMeeting() {
//        String xpath="//android.view.View[@content-desc=\""+testDataMobile.getPriceMeeting()+"\"]";
//        return  MobileFinder.getByXpath(xpath,false);
//    }
//    public static boolean TimeMeetingIsDisplayed(){
//        return getTimeMeeting().isDisplayed();
//    }
//    public static MobileElement getRemainingSeats() {
//        String xpath="//android.view.View[@content-desc=\""+testDataMobile.getRemainingSeats()+"\"]";
//        return  MobileFinder.getByXpath(xpath,false);
//    }
//    public static boolean RemainingSeatsIsDisplayed(){
//        return getRemainingSeats().isDisplayed();
//    }
//    public static MobileElement getTargetGroupText() {
//        String xpath="//android.view.View[@content-desc=\""+testDataMobile.getTargetGroupText()+"\"]";
//        return  MobileFinder.getByXpath(xpath,false);
//    }
//    public static boolean TargetGroupTextIsDisplayed(){
//        return getTargetGroupText().isDisplayed();
//    }
//    public static MobileElement getMeetingDetailsGoalsItem() {
//        String xpath="//android.view.View[@content-desc=\""+testDataMobile.getMeetingDetailsGoalsItem()+"\"]";
//        return MobileFinder.getByXpath(xpath, false);
//    }
//    public static boolean isMeetingDetailsGoalsItemDisplayed() {
//        return getMeetingDetailsGoalsItem().isDisplayed();
//    }
//    public static MobileElement getRegisterMeetingButton() {
//        String xpath="//android.view.View[@content-desc=\""+testDataMobile.getRegisterMeetingButton()+"\"]";
//        return MobileFinder.getByXpath(xpath, true);
//    }
//    public static boolean isRegisterMeetingButtonDisplayed() {
//        return getRegisterMeetingButton().isDisplayed();
//    }
//}
