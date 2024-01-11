package stepdefinitions;

import io.cucumber.java.en.Then;
import manager.PageFactoryManager;
import org.junit.Assert;

import java.util.logging.Logger;

public class BlogStepDefinitions {

    public static final Logger log = Logger.getLogger(BlogStepDefinitions.class.getName());

    PageFactoryManager instance = PageFactoryManager.getInstance();

    private static final long WAIT = 30;

    @Then("User sees 'Blog' page")
    public void userSeesBlogPage() {
        instance.getBlogPage();
        instance.getBlogPage().implicitWait(WAIT);
        Assert.assertTrue(instance.getBlogPage().blogActiveLinkIsVisible());
    }

}
