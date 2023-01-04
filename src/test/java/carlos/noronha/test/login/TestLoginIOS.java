package carlos.noronha.test.login;

import carlos.noronha.core.DriverFactory;
import carlos.noronha.screen.ScreenLogin;
import io.appium.java_client.AppiumDriver;
import org.junit.*;
import org.openqa.selenium.remote.RemoteWebElement;

import java.net.MalformedURLException;

public class TestLoginIOS {
        private static ScreenLogin screenLoginIos;
        private static AppiumDriver<RemoteWebElement> driver;

        @Before
        public static void caps() throws MalformedURLException {


//                driver = DriverFactory.getDriver("ios");
                driver = DriverFactory.getDriver("browserstackiOS");
                screenLoginIos = new ScreenLogin(driver);

        }

        @Test
        public void testLoginLoginPasswordCorrect() throws InterruptedException {
                screenLoginIos.loginCorrectIOS();
                screenLoginIos.validationLoginPasswordCorrect();
        }
        @Test
        public void testLoginLoginPasswordIncorrect() throws InterruptedException {
                screenLoginIos.loginIncorrectIOS();
                screenLoginIos.validationLoginPasswordIncorrect();
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
        public static void killDriver(){

                driver.quit();
        }


}

