package stepdefinitions;

import io.cucumber.java.en.And;
import org.junit.Assert;
import pages.AllPages;
import utilities.Driver;

public class SpinnerDefinitions {
    AllPages elements = new AllPages();

    @And("kullanic color dugmesinden blue secmeli")
    public void kullanicColorDugmesindenSecmeli() throws InterruptedException {
        elements.spinnerPage().colorDropDown.click();
        elements.spinnerPage().blue.click();
        Thread.sleep(2000);
        Assert.assertTrue(elements.spinnerPage().selectedBlue.isDisplayed());
    }

    @And("kullanici planet menusunden Saturn secmeli")
    public void kullaniciPlanetMenusundenSecmeli() throws InterruptedException {
        elements.spinnerPage().planetDropDown.click();
        elements.spinnerPage().saturn.click();
        String toast = Driver.getAppiumDriver().findElementByXPath("//android.widget.Toast").getAttribute("name");
        Assert.assertEquals("Spinner2: position=5 id=5",toast);
        System.out.println(toast);
        Thread.sleep(2000);
        Assert.assertTrue(elements.spinnerPage().selectedSaturn.isDisplayed());



    }
}
