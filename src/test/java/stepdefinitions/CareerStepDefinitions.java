package stepdefinitions;

import io.cucumber.java.en.Then;
import manager.PageFactoryManager;
import org.junit.Assert;

import java.util.logging.Logger;

public class CareerStepDefinitions {

    public static final Logger log = Logger.getLogger(CareerStepDefinitions.class.getName());

    PageFactoryManager instance = PageFactoryManager.getInstance();

    private static final long WAIT = 30;

    @Then("User sees 'Career' page")
    public void userSeesCareerPage() {
        instance.getCareerPage();
        instance.getCareerPage().implicitWait(WAIT);
        Assert.assertTrue(instance.getCareerPage().careerActiveLinkIsVisible());
    }

}
