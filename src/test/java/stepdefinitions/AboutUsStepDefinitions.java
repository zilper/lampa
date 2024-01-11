package stepdefinitions;

import io.cucumber.java.en.Then;
import manager.PageFactoryManager;
import org.junit.Assert;

import java.util.logging.Logger;

public class AboutUsStepDefinitions {

    public static final Logger log = Logger.getLogger(AboutUsStepDefinitions.class.getName());

    PageFactoryManager instance = PageFactoryManager.getInstance();

    private static final long WAIT = 30;

    @Then("User sees 'About Us' page")
    public void userSeesAboutUsPage() {
        instance.getAboutUsPage();
        instance.getAboutUsPage().implicitWait(WAIT);
        Assert.assertTrue(instance.getAboutUsPage().aboutUsActiveLinkIsVisible());
    }

}
