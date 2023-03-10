package carlos.noronha.test.menuSettings;

import carlos.noronha.core.DriverFactory;
import carlos.noronha.core.TestBase;
import carlos.noronha.screen.ScreenInBox;
import carlos.noronha.screen.ScreenLogin;
import carlos.noronha.screen.ScreenMenuSettings;
import io.appium.java_client.AppiumDriver;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class TestMenuSettingsIOSiPhone14ProMax extends TestBase {
        private static ScreenInBox screenInBox;
        private static AppiumDriver<RemoteWebElement> driver;
        private static ScreenMenuSettings screenMenuSettings;
        private static WebDriverWait wait;
        private static ScreenLogin screenLoginIos;

        @Before
        public void caps() throws MalformedURLException, InterruptedException {
                driver = DriverFactory.getDriver("iPhone14ProMax");
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                screenMenuSettings = new ScreenMenuSettings(driver);
                screenInBox = new ScreenInBox(driver);
                screenLoginIos = new ScreenLogin(driver);
                screenLoginIos.loginCorrectIOS();
                screenInBox.goToInbox();
                screenInBox.menuInbox();
                System.out.println("Cliquei  no menu inbox");


        }

        @Test
        public void followTheIg() throws InterruptedException, MalformedURLException {

                screenMenuSettings.followIGClick();
                screenMenuSettings.validationNoteitProfileInstagramGetText();


        }
        @Test
        public void cancelILoveNoteIt() throws InterruptedException, MalformedURLException {

                screenMenuSettings.iLoveNoteItClick();
                screenMenuSettings.cancelRateClick();
                screenMenuSettings.validationCancelILoveNoteitClick();
        }
//        @Test
//        public void iLoveNoteIt() throws InterruptedException, MalformedURLException {
//
//                screenMenuSettings.iLoveNoteItClick();
//                screenMenuSettings.fiveStarsClick();
//                screenMenuSettings.notNowClick();
//                screenMenuSettings.validationILoveNoteitClick();
//        }
//        @Test
//        public void iNeedHelp() throws InterruptedException, MalformedURLException {
//
//                screenMenuSettings.iNeedHelpClick();
//                screenMenuSettings.validationEmailScreeen();
//        }





}

