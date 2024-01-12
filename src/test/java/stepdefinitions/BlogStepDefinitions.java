package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import manager.PageFactoryManager;
import org.junit.Assert;

import java.util.logging.Logger;

public class BlogStepDefinitions {

    public static final Logger log = Logger.getLogger(BlogStepDefinitions.class.getName());

    PageFactoryManager instance = PageFactoryManager.getInstance();

    private static final long WAIT = 60;

    @Then("User sees 'Blog' page")
    public void userSeesBlogPage() {
        instance.getBlogPage();
        instance.getBlogPage().implicitWait(WAIT);
        Assert.assertTrue(instance.getBlogPage().blogActiveLinkIsVisible());
        log.info("Blog page is opened");
    }

    @When("User fills search input field with text {string}")
    public void userFillsSearchInputFieldWithText(final String text) {
        instance.getBlogPage();
        instance.getBlogPage().fillSearchInputField(text);
        log.info("Search field filled: " + text);
        instance.getBlogPage().implicitWait(WAIT);
    }

    @And("User opens Solutions dropdown menu on Blog Page")
    public void userOpensSolutionsDropdownMenuOnBlogPage() {
        instance.getBlogPage();
        instance.getBlogPage().clickFilterSolutionsDropdown();
        log.info("Solution dropdown is opened");
        instance.getBlogPage().implicitWait(WAIT);
    }

    @And("User selects Solutions dropdown menu option")
    public void userSelectsSolutionDropdownMenuOption() {
        instance.getBlogPage();
        instance.getBlogPage().clickSolutionDropdownMenuElement();
        log.info("Option selected");
        instance.getBlogPage().implicitWait(WAIT);
    }

    @And("User opens Services dropdown menu on Blog Page")
    public void userOpensServicesDropdownMenuOnBlogPage() {
        instance.getBlogPage();
        instance.getBlogPage().clickFilterServicesDropdown();
        log.info("Services dropdown is opened");
        instance.getBlogPage().implicitWait(WAIT);
    }

    @And("User selects Services dropdown menu option")
    public void userSelectsServicesDropdownMenuOption() {
        instance.getBlogPage();
        instance.getBlogPage().clickServicesDropdownMenuElement();
        log.info("Option selected");
        instance.getBlogPage().implicitWait(WAIT);
    }

    @Then("User sees 'Tools' Blog filter button")
    public void userSeesToolsFilterElement() {
        instance.getBlogPage();
        Assert.assertTrue(instance.getBlogPage().toolsBlogFilterIsVisible());
        instance.getBlogPage().implicitWait(WAIT);
    }

    @Then("User sees 'Web Development' Blog filter button")
    public void userSeesWebDevelopmentFilterElement() {
        instance.getBlogPage();
        Assert.assertTrue(instance.getBlogPage().webDevelopmentBlogFilterIsVisible());
        instance.getBlogPage().implicitWait(WAIT);
    }

}
