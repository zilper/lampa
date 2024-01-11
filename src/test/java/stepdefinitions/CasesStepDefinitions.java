package stepdefinitions;

import io.cucumber.java.en.Then;
import manager.PageFactoryManager;
import org.junit.Assert;

import java.util.logging.Logger;

public class CasesStepDefinitions {

    public static final Logger log = Logger.getLogger(CasesStepDefinitions.class.getName());

    PageFactoryManager instance = PageFactoryManager.getInstance();

    private static final long WAIT = 30;

    @Then("User sees 'Cases' page")
    public void userSeesAboutUsPage() {
        instance.getCasesPage();
        instance.getCasesPage().implicitWait(WAIT);
        Assert.assertTrue(instance.getCasesPage().casesActiveLinkIsVisible());
    }

}
