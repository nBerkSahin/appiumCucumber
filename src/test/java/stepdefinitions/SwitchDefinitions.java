package stepdefinitions;

import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.AllPages;
import utilities.Driver;

public class SwitchDefinitions {

    AllPages elements = new AllPages();



    @When("kullanici Switch tiklasin")
    public void kullaniciSwitchTiklasin() {
        elements.preferencePage().switchButton.click();

    }

    @And("ilk switch butonu acik olmali")
    public void ilkSwitchButonuAcikOlmali() {
        TouchAction touchAction = new TouchAction(Driver.getAppiumDriver());

        if (elements.switchPage().switchbox.getAttribute("checked").equals("false")) {
            touchAction.tap(TapOptions.tapOptions().
                    withElement(ElementOption.element(elements.switchPage().switchbox))).perform();
        }
    }

    @Then("ilk switch butonunun acik oldugunu onayla")
    public void ilkSwitchButonununAcikOldugunuOnayla() {
        Assert.assertEquals("true",elements.switchPage().switchbox.getAttribute("checked"));
    }


    @And("ilk switch butonu kapali olmali")
    public void ilkSwitchButonuKapaliOlmali() {
        if (elements.switchPage().firstSwitchButton.getText().equals("ON")){
            elements.switchPage().firstSwitchButton.click();
        }
    }

    @Then("ilk switch butonunun kapali oldugunu onayla")
    public void ilkSwitchButonununKapaliOldugunuOnayla() {
        Assert.assertEquals(elements.switchPage().firstSwitchButton.getAttribute("checked"),"true");
    }

    @And("ikinci switch butonu acik olmali")
    public void ikinciSwitchButonuAcikOlmali() {
        if (elements.switchPage().secondSwitchButton.getText().equals("OFF")){
            elements.switchPage().secondSwitchButton.getText().equals("ON");
        }
    }



}
