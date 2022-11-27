package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.AllPages;
import utilities.Driver;
import utilities.ReusableMethods;

public class IOSAlertViewDefs {

    AllPages elements = new AllPages();

    @Given("app IOS cihazında acilsin")
    public void app_ios_cihazda_acilsin() {

        Driver.getAppiumDriver();
    }

    @When("kullanici {string} yazisina tiklasin")
    public void kullanici_yazisina_tiklasin(String page) {
        ReusableMethods.clickOnPageIOS(page);
    }



}
