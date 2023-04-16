package Mobile.TestsSpecialist.CreateAccountPopup;

import Base.MobileSetup.MobileFinder;
import io.appium.java_client.MobileElement;

import static Base.MobileSetup.MobileSetupTest.serviceProviderMobileFinder;
import static Base.MobileSetup.MobileSetupTest.testDataMobileSpecialist;

public class CreateAccountPopup {
    public static MobileElement getTitle(){
        return serviceProviderMobileFinder.getByAccessibilityId(testDataMobileSpecialist.getTitleInCreateAccountPopup(), false);
    }
    public static Boolean titleIsDisplayed(){
        return getTitle().isDisplayed();
    }

    public static MobileElement getDescriptionText(){
        return serviceProviderMobileFinder.getByAccessibilityId(testDataMobileSpecialist.getDescriptionTextInCreateAccountPopup(), false);
    }
    public static Boolean descriptionTextIsDisplayed(){
        return getDescriptionText().isDisplayed();
    }

    //Name
    public static MobileElement getNameField(){
        String xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView[1]";
        return serviceProviderMobileFinder.getByAccessibilityId(testDataMobileSpecialist.getDescriptionTextInCreateAccountPopup(), false);
    }

    //Mobile

    //Password

    public static MobileElement getCreateAccountButton(){
        return serviceProviderMobileFinder.getByAccessibilityId(testDataMobileSpecialist.getCreateAccountButtonInCreateAccountPopup(), true);
    }
    public static Boolean CreateAccountButtonIsDisplayed(){
        return getCreateAccountButton().isDisplayed();
    }

}
