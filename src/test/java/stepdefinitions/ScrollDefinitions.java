package stepdefinitions;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Dimension;
import pages.AllPages;
import utilities.Driver;
import pages.AllPages;

import java.awt.*;
import java.util.List;

public class ScrollDefinitions {

        AllPages elements = new AllPages();

        @Then("kullanıcı switches tıklasın")
        public void kullanıcıSwitchesTıklasın() {

                List<MobileElement> list;
                do {
                        list = elements.switchPage().switches;
                        Dimension dimension = Driver.getAppiumDriver().manage().window().getSize();

                        int start_x = (int) (dimension.width * 0.5);
                        int start_y = (int) (dimension.height * 0.8);

                        int end_x = (int) (dimension.width * 0.5);
                        int end_y = (int) (dimension.height * 0.2);

                        TouchAction touchAction = new TouchAction(Driver.getAppiumDriver());

                        touchAction.press(PointOption.point(start_x, start_y)).
                                moveTo(PointOption.point(end_x, end_y)).perform();
                }while(list.size()==0);

                elements.switchPage().switches.get(0).click();

        }

        @Then("kullanici UiScrolable ile Switches tiklasin")
        public void kullaniciUiScrolableIleSwitchesTiklasin() {
      /*
      UiScrollable() sadece android sisteminde calisir cunku Android SDK uzerinden calisyor.
      Yazdigimiz kodda verilen text e kadar scroll yapmasi (scrollIntoView()) ve texti bulunca durmasini istedik.
      ve buldugumuz elemente senaryomuza gore tikladik.
      **** UiScrollable() kendimiz yazmamiz gerektigi icin hata olmamasina dikkat etmeliyiz.
      Detayli bakamk icin link incelenebilir.
      https://developer.android.com/reference/androidx/test/uiautomator/UiScrollable
       */
                ((AndroidDriver<?>) Driver.getAppiumDriver()).
                        findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Switches\"))");

                elements.switchPage().switchesSingle.click();
        }

        @Then("kullanici UiScrolable ile WebView tiklasin")
        public void kullaniciUiScrolableIleTiklasin() {
                ((AndroidDriver<?>) Driver.getAppiumDriver()).
                        findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"))");

                elements.switchPage().webView.click();

        }
}
