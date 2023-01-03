package carlos.noronha.test.login;

import carlos.noronha.core.DriverFactory;
import carlos.noronha.screen.ScreenLogin;
import io.appium.java_client.AppiumDriver;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.remote.RemoteWebElement;

import java.net.MalformedURLException;

public class TestLoginAndroid {
        private static ScreenLogin screenLoginAndroid;
        private static AppiumDriver<RemoteWebElement> driver;

        @BeforeClass
        public static void caps() throws MalformedURLException {
                driver = DriverFactory.getDriver("browserstackAndroid");
                screenLoginAndroid = new ScreenLogin(driver);


        }

        @Test
        public void testLogin() throws MalformedURLException, InterruptedException {
                screenLoginAndroid.loginAndroid();
        }
        @AfterClass
        public static void killDriver(){
                driver.quit();
        }



}


