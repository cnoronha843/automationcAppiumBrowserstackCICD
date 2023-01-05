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

        @Before
        public  void caps() throws MalformedURLException {


//                driver = DriverFactory.getDriver("ios");
                driver = DriverFactory.getDriver("browserstackiOS");
                screenLoginIos = new ScreenLogin(driver);
                screenSettings = new ScreenSettings(driver);
                screenInBox = new ScreenInBox(driver);
                screenMenuSettings = new ScreenMenuSettings(driver);

        }

        @Test
        public void testLoginPasswordCorrect() throws InterruptedException, MalformedURLException {
                screenLoginIos.loginCorrectIOS();
                screenLoginIos.validationLoginPasswordCorrect();
        }
        @Test
        public void testLoginLoginPasswordIncorrect() throws InterruptedException, MalformedURLException {
                screenLoginIos.loginIncorrectIOS();
                screenLoginIos.validationLoginPasswordIncorrect();
        }

@After
public void fecharApp()  {        driver.resetApp ();

}
@AfterClass
public static void killApp()  {        driver.quit ();

}


}

