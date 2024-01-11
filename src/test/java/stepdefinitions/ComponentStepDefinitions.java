package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import manager.PageFactoryManager;
import org.openqa.selenium.support.FindBy;

import java.util.logging.Logger;

public class ComponentStepDefinitions {

    public static final Logger log = Logger.getLogger(ComponentStepDefinitions.class.getName());

    PageFactoryManager instance = PageFactoryManager.getInstance();

    private static final long WAIT = 30;

    @When("User clicks 'About Us' navigation button")
    public void userCLicksAboutUsNavigationButton() {
        instance.getHeaderComponent();
        instance.getHeaderComponent().clickAboutUsNavigationButton();
        instance.getHeaderComponent().implicitWait(WAIT);
    }

    @When("User clicks 'Cases' navigation button")
    public void userCLicksCasesNavigationButton() {
        instance.getHeaderComponent();
        instance.getHeaderComponent().clickCasesNavigationButton();
        instance.getHeaderComponent().implicitWait(WAIT);
    }

    @And("User clicks 'Career' navigation button")
    public void userCLicksCareerNavigationButton() {
        instance.getHeaderComponent();
        instance.getHeaderComponent().clickCareerNavigationButton();
        instance.getHeaderComponent().implicitWait(WAIT);
    }

    @And("User clicks 'Blog' navigation button")
    public void userCLicksBlogNavigationButton() {
        instance.getHeaderComponent();
        instance.getHeaderComponent().clickBlogNavigationButton();
        instance.getHeaderComponent().implicitWait(WAIT);
    }

    @And("User clicks 'Contacts' navigation button")
    public void userClicksContactsNavigationButton() {
        instance.getHeaderComponent();
        instance.getHeaderComponent().clickContactsNavigationButton();
        instance.getHeaderComponent().implicitWait(WAIT);
    }

    @And("User clicks 'Contact Us' button on header component")
    public void userClicksContactUsButtonOnHeaderComponent() {
        instance.getHeaderComponent();
        instance.getHeaderComponent().clickContactUsHeaderButton();
        instance.getHeaderComponent().implicitWait(WAIT);
    }


}
