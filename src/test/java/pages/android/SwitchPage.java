package pages.android;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.time.Duration;
import java.util.List;

public class SwitchPage {

    public SwitchPage(){
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAppiumDriver(), Duration.ofSeconds(15)),this);
    }

    @AndroidFindBy(className = "android.widget.CheckBox")
    public MobileElement switchbox;

    @AndroidFindBy(xpath = "(//android.widget.Switch)[1]")
    public MobileElement firstSwitchButton;

    @AndroidFindBy(xpath = "(//android.widget.Switch)[2]")
    public MobileElement secondSwitchButton;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Switches']")
    public List<MobileElement> switches;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Switches']")
    public MobileElement switchesSingle;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Date Widgets']")
    public MobileElement dateWidgets;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='WebView']")
    public MobileElement webView;


}
