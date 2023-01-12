package carlos.noronha.test.sinup;

import carlos.noronha.core.DriverFactory;
import carlos.noronha.core.TestBase;
import carlos.noronha.screen.ScreenLinkPartner;
import carlos.noronha.screen.ScreenLogin;
import carlos.noronha.screen.ScreenSinup;
import io.appium.java_client.AppiumDriver;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.remote.RemoteWebElement;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class TestSignupIOS extends TestBase {
        private static ScreenLinkPartner screenLinkPartner;
        private static AppiumDriver<RemoteWebElement> driver;
        private static ScreenSinup screenSinup;


        @Before
        public  void caps() throws MalformedURLException, InterruptedException {
//                driver = DriverFactory.getDriver("ios");
                driver = DriverFactory.getDriver("browserstackiOS");
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                screenSinup = new ScreenSinup(driver);
                screenLinkPartner = new ScreenLinkPartner(driver);

        }

//        @Test
//        public void helpTeamNoteItTest() throws InterruptedException, MalformedURLException {
//                screenSinup.phoneNumberClick();
//                screenSinup.selectedCountryClick();
//                screenSinup.searchCountryBrazil();
//                screenSinup.setPhoneNumber();
//                screenLinkPartner.menuHelp();
//                screenSinup.notGettingMyCodeClick();
//                screenSinup.getHelpFromTeamNoteitClick();
//                screenSinup.validationEmailScreeen();
//        }
        @Test
        public void agreeToOurTermsPrivacyPolicy() throws InterruptedException, MalformedURLException {
                screenSinup.phoneNumberClick();
                screenSinup.byPressingNextTermsPrivacyPolicyClick();
                screenSinup.validationPagePrivacyPolicyIOS();


        }



}

