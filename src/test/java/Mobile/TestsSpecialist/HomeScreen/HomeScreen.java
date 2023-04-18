package Mobile.TestsSpecialist.HomeScreen;

import io.appium.java_client.MobileElement;

import static Base.MobileSetup.MobileSetupTest.serviceProviderMobileFinder;
import static Base.MobileSetup.MobileSetupTest.testDataMobileSpecialist;

public class HomeScreen {
    public static MobileElement getNotificationButton(){
        String xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.widget.ImageView[1]";
        return serviceProviderMobileFinder.getByXpath(xpath, false);
    }
    public static MobileElement getFamcareLogo(){
        String xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.widget.ImageView[2]";
        return serviceProviderMobileFinder.getByXpath(xpath, false);
    }
    public static MobileElement get(){
        String xpath = "//android.view.View[@content-desc=\"غير متاح\"]";
        return serviceProviderMobileFinder.getByXpath(xpath, false);
    }
}
