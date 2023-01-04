package carlos.noronha.test.login;

import carlos.noronha.core.DriverFactory;
import carlos.noronha.screen.ScreenInBox;
import carlos.noronha.screen.ScreenLogin;
import carlos.noronha.screen.ScreenMenuSettings;
import carlos.noronha.screen.ScreenSettings;
import io.appium.java_client.AppiumDriver;
import org.junit.*;
import org.openqa.selenium.remote.RemoteWebElement;

import java.net.MalformedURLException;

public class TestLoginIOS {
        private static ScreenLogin screenLoginIos;
        private static ScreenMenuSettings screenMenuSettings;
        private static ScreenSettings screenSettings;
        private static ScreenInBox screenInBox;
        private static AppiumDriver<RemoteWebElement> driver;

        @BeforeClass
        public static void caps() throws MalformedURLException {


//                driver = DriverFactory.getDriver("ios");
                driver = DriverFactory.getDriver("browserstackiOS");
                screenLoginIos = new ScreenLogin(driver);
                screenSettings = new ScreenSettings(driver);
                screenInBox = new ScreenInBox(driver);
                screenMenuSettings = new ScreenMenuSettings(driver);

        }

        @Test
        public void testLoginLoginPasswordCorrect() throws InterruptedException, MalformedURLException {

                screenLoginIos.loginCorrectIOS();
                screenLoginIos.validationLoginPasswordCorrect();
                screenLoginIos.inboxClick();
                screenInBox.menuInbox();
                screenInBox.goToSetting();
                screenSettings.signOut();


        }
        @Test
        public void testLoginLoginPasswordIncorrect() throws InterruptedException, MalformedURLException {
                screenLoginIos.loginIncorrectIOS();
                screenLoginIos.validationLoginPasswordIncorrect();
//                screenLoginIos.okClick();
//                screenLoginIos.cleanField();
        }
//        @Test
//        public void testSignUpIos() throws InterruptedException {
//                screenLoginIos.SignUpIos();
//        }
//        @Test
//        public void connectToPartner() throws InterruptedException {
//                screenLoginIos.linkPartner();
//        }
@After
public void fecharApp()  {        driver.resetApp ();

}@AfterClass
public static void killApp()  {        driver.quit ();

}


}

