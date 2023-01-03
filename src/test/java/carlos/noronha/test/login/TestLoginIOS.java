package carlos.noronha.test.login;

import carlos.noronha.core.DriverFactory;
import carlos.noronha.screen.ScreenLogin;
import io.appium.java_client.AppiumDriver;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.remote.RemoteWebElement;

import java.net.MalformedURLException;
import java.net.URL;

public class TestLoginIOS {
        private static ScreenLogin screenLoginIos;
        private static AppiumDriver<RemoteWebElement> driver;

        @BeforeClass
        public static void caps() throws MalformedURLException {


//                driver = DriverFactory.getDriver("ios");
                driver = DriverFactory.getDriver("browserstackiOS");
                screenLoginIos = new ScreenLogin(driver);

        }

        @Test
        public void testLoginLoginSuccessful() throws InterruptedException {
                screenLoginIos.loginIos();
                screenLoginIos.validationLoginSuccessful();
        }
//        @Test
//        public void testSignUpIos() throws InterruptedException {
//                screenLoginIos.SignUpIos();
//        }
//        @Test
//        public void connectToPartner() throws InterruptedException {
//                screenLoginIos.linkPartner();
//        }
        @AfterClass
        public static void killDriver(){
                driver.quit();
        }


}

