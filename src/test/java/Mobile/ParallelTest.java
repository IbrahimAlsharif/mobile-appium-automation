package Mobile;

import Base.MobileSetup.MobileSetupTest;
import Mobile.Tests.Language.LanguageChooseTest;
import Mobile.TestsSpecialist.WelcomeScreen.WelcomeScreenTest;
import TestRail.APIException;
import io.appium.java_client.android.AndroidDriver;
import org.testng.annotations.Test;

import java.io.IOException;

public class ParallelTest {
    AndroidDriver client;
    AndroidDriver specialist;
    MobileSetupTest mobileSetupTest = new MobileSetupTest();
    LanguageChooseTest languageChooseTest= new LanguageChooseTest();
    WelcomeScreenTest welcomeScreenTest = new WelcomeScreenTest();
  @Test
    public void flow1() throws APIException, IOException {
      client= mobileSetupTest.createClientDriver();
      MobileSetupTest.clientAndroidDriver = client;
      specialist = mobileSetupTest.createSpecialistDriver();
      MobileSetupTest.serviceProviderAndroidDriver = specialist;
      welcomeScreenTest.existanceOfLogoInWelcomeScreen();
      languageChooseTest.mainImageIsDisplayed();
      welcomeScreenTest.existanceOfDescriptionTextInWelcomeScreen();
      languageChooseTest.VerifyThatTheUserAbleSelectArabicLanguage();
      languageChooseTest.VerifyThatTheUserAbleClickChooseButton();
      welcomeScreenTest.existanceOfDescriptionTextInWelcomeScreen();
      languageChooseTest.VerifyThatTheUserAbleClickChooseButton();
      welcomeScreenTest.existanceOfMainTextInWelcomeScreen();
  }
}
