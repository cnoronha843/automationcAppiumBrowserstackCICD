package carlos.noronha.screen;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.PageFactory;

import java.net.MalformedURLException;

public class ScreenLogin {
    public ScreenLogin(AppiumDriver<RemoteWebElement> driver){
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id="et_email")
    @iOSFindBy(xpath="//XCUIElementTypeApplication[@name=\"noteit\"]/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTextField")
    private RemoteWebElement campoEmail;
    @AndroidFindBy(id="com.android.permissioncontroller:id/permission_allow_button")
    @iOSFindBy(xpath="//XCUIElementTypeApplication[@name=\"noteit\"]/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTextField")
    private RemoteWebElement contactAccess;
    @AndroidFindBy(id="et_password")
    @iOSFindBy(xpath="//XCUIElementTypeApplication[@name=\"noteit\"]/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeSecureTextField")
    private RemoteWebElement campoSenha;
    @AndroidFindBy(id="txt_other_options")
    @iOSFindBy(accessibility="more options")
    private RemoteWebElement botaoMaisOpcoes;
    @AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.TextView")
    @iOSFindBy(accessibility="Sign in")
    private RemoteWebElement botaoEntrar;
    @AndroidFindBy(id="fsfsd")
    @iOSFindBy(accessibility="Sign up")
    private RemoteWebElement botaoSignUp;
    @AndroidFindBy(id="sadasd")
    @iOSFindBy(accessibility="not-checked-square")
    private RemoteWebElement botaoTerms;
    @AndroidFindBy(id="dadasdasd")
    @iOSFindBy(xpath="//XCUIElementTypeApplication[@name=\"noteit\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTextField")
    private RemoteWebElement campoParceiro;




    public void linkPartner() throws InterruptedException {
        campoParceiro.sendKeys("4905943");
        Thread.sleep(2000);
    }
    public void loginIos(){
        botaoMaisOpcoes.click();
        campoEmail.sendKeys("catns.ios.noteit@gmail.com");
        campoSenha.sendKeys("Mudar12");
        botaoEntrar.click();
    }
    public void loginAndroid() throws MalformedURLException, InterruptedException {
        botaoMaisOpcoes.click();
        Thread.sleep(1000);
        campoEmail.sendKeys("catns.and.noteit@gmail.com");
        campoSenha.sendKeys("teste123");
        botaoEntrar.click();
        Thread.sleep(8000);
        contactAccess.click();
    }
    public void SignUpIos() throws InterruptedException {
        botaoMaisOpcoes.click();
        botaoSignUp.click();
        campoEmail.sendKeys("catns.ios.noteit@gmail.com");
        campoSenha.sendKeys("Mudar123");
        botaoTerms.click();
        Thread.sleep(1000);
        campoEmail.click();
        Thread.sleep(1000);
        botaoSignUp.click();
        Thread.sleep(1000);
    }


}
