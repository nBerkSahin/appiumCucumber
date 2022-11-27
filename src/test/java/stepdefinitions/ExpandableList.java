package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.AllPages;
import utilities.ReusableMethods;

public class ExpandableList {

    AllPages elements = new AllPages();



    @When("kullanici Arnold basili tuttugunda")
    public void kullaniciArnoldBasiliTuttugunda() {
        ReusableMethods.longPressOnElement(elements.expandableListPage().arnold);

    }

    @Then("popup ciktigini onayla")
    public void popupCiktiginiOnayla() {
        Assert.assertTrue(elements.expandableListPage().sampleMenu.isDisplayed());
    }
}
