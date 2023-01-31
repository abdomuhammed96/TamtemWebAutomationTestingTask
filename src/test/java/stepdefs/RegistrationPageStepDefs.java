package stepdefs;

import core.Config;
import io.cucumber.java.en.Then;
import org.testng.asserts.SoftAssert;
import pages.HomePage.HomePageAbstract;
import pages.HomePage.HomePageLogic;
import pages.RegistrationPage.RegistrationPageAbstract;
import pages.RegistrationPage.RegistrationPageLogic;

public class RegistrationPageStepDefs {

    private RegistrationPageAbstract page;
    SoftAssert softAssert;

    public RegistrationPageStepDefs(Config config) {
        if (config.isWeb()) page = new RegistrationPageLogic();
        softAssert = new SoftAssert();
    }

        @Then("Register")
        public void click_on() throws InterruptedException {
        page.Register();
        Thread.sleep(10000);

        }
    }





