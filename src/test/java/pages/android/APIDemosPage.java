package pages.android;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.time.Duration;

public class APIDemosPage {
    public APIDemosPage(){
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAppiumDriver(), Duration.ofSeconds(30)),this);
    }

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Preference']" )
    public MobileElement preference;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Views']" )
    public MobileElement views;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Drag and Drop']" )
    public MobileElement draganddrop;

    @AndroidFindBy(id = "com.touchboarder.android.api.demos:id/drag_text" )
    public MobileElement dragdroptext;

    @AndroidFindBy(id = "com.touchboarder.android.api.demos:id/drag_dot_1" )
    public MobileElement dragdropdot1;

    @AndroidFindBy(id = "com.touchboarder.android.api.demos:id/drag_dot_2" )
    public MobileElement dragdropdot2;

    @AndroidFindBy(id = "com.touchboarder.android.api.demos:id/drag_dot_3" )
    public MobileElement dragdropdot3;

}
