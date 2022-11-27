package stepdefinitions;

import io.cucumber.java.en.When;
import utilities.ReusableMethods;

public class HazirMethod {

    @When("kullanici {string} tiklasin")
    public void kullaniciTiklasin(String pageName) throws InterruptedException {
        ReusableMethods.clickOnPage(pageName);

    }


}
