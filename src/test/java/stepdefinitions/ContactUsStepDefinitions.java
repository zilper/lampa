package stepdefinitions;

import io.cucumber.java.en.Then;
import manager.PageFactoryManager;
import org.junit.Assert;

import java.util.logging.Logger;

public class ContactUsStepDefinitions {

    public static final Logger log = Logger.getLogger(ContactUsStepDefinitions.class.getName());

    PageFactoryManager instance = PageFactoryManager.getInstance();

    private static final long WAIT = 30;

    @Then("User sees 'Contact Us' page")
    public void userSeesAboutUsPage() {
        instance.getContactUsPage();
        instance.getContactUsPage().implicitWait(WAIT);
        Assert.assertTrue(instance.getContactUsPage().contactUsActiveLinkIsVisible());
    }


}
