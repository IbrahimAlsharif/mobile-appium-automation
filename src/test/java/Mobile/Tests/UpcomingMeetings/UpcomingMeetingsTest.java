package Mobile.Tests.UpcomingMeetings;

import Mobile.Tests.SupportGroup.SupportGroups;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

public class UpcomingMeetingsTest {
    private String testCaseId;
    @Test(priority = 8)
    public void VerifyThatTheUserAbleClickUpcomingMeeting(){
        testCaseId="0";
        SupportGroups.ClickOnUpcomingMeeting();
        assertTrue(UpcomingMeetings.DetailsUpcomingMeetingIsDisplayed());
    }
    @Test(priority = 9)
    public void TitleUpcomingMeetingIsDisplayed(){
        testCaseId="0";
        assertTrue(UpcomingMeetings.TitleUpcomingMeetingIsDisplayed());
    }
    @Test(priority = 10)
    public void getPriceMeetingIsDisplayed(){
        testCaseId="0";
        assertTrue(UpcomingMeetings.PriceMeetingIsDisplayed());
    }
    @Test(priority = 11)
    public void TimeMeetingIsDisplayed(){
        testCaseId="0";
        assertTrue(UpcomingMeetings.TimeMeetingIsDisplayed());
    }
    @Test(priority = 12)
    public void RemainingSeatsIsDisplayed(){
        testCaseId="0";
        assertTrue(UpcomingMeetings.RemainingSeatsIsDisplayed());
    }
    @Test(priority = 13)
    public void getTargetGroupTextIsDisplayed(){
        testCaseId="0";
        assertTrue(UpcomingMeetings.TargetGroupTextIsDisplayed());
    }
    @Test(priority = 14)
    public void getMeetingDetailsGoalsItem(){
        testCaseId="0";
        assertTrue(UpcomingMeetings.isMeetingDetailsGoalsItemDisplayed());
    }

    @Test(priority = 15)
    public void registerMeetingButtonIsDisplayed(){
        testCaseId="0";
        assertTrue(UpcomingMeetings.isRegisterMeetingButtonDisplayed());
    }

}
