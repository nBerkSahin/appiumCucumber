package stepdefinitions;

import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.ElementOption;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.AllPages;
import utilities.Driver;

public class DragDropDefinitions {

    AllPages elements = new AllPages();


    @When("kullanıcı Views e tıklasın")
    public void kullanıcıViewsETıklasın() {
        elements.apiDemosPage().views.click();
    }

    @When("kullanıcı drag drop tıklasın")
    public void kullanıcıDragDropTıklasın() {
        elements.apiDemosPage().draganddrop.click();
    }

    @Then("çıkan yazıyı onayla")
    public void çıkanYazıyıOnayla() throws InterruptedException {
        Thread.sleep(4000);
        Assert.assertTrue(elements.apiDemosPage().dragdroptext.isDisplayed());
    }

    @Then("kullanıcı ilk noktayı alttaki noktaya taşıyacak")
    public void kullanıcıIlkNoktayıAlttakiNoktayaTaşıyacak() {
        TouchAction touchAction = new TouchAction(Driver.getAppiumDriver());
        touchAction.longPress(ElementOption.element(elements.apiDemosPage().dragdropdot1))
                .moveTo(ElementOption.element(elements.apiDemosPage().dragdropdot3)).release().perform();
    }


}
