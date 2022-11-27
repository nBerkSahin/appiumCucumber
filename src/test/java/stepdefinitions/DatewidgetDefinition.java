package stepdefinitions;

import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AllPages;
import utilities.Driver;

import java.time.Duration;

public class DatewidgetDefinition {

    AllPages elements = new AllPages();

    @When("kullanıcı Date Widget tıklasın")
    public void kullanıcıDateWidgetTıklasın() {
        elements.dateWidget().dateWidgets.click();
    }

    @When("kullanıcı inline e tıklasın")
    public void kullanıcıInlineETıklasın() {
        elements.dateWidget().inline.click();
    }

    @When("kullanıcı num 9 tıklasın")
    public void kullanıcıNumTıklasın() {
        elements.dateWidget().num9.click();
    }

    @Then("kullanıcı 15ten 45e kaydırsın")
    public void kullanıcıTenEKaydırsın() {
        TouchAction touchAction = new TouchAction(Driver.getAppiumDriver());
        touchAction.press(ElementOption.element(elements.dateWidget().num15))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(ElementOption.element(elements.dateWidget().num45)).perform();
    }


}
