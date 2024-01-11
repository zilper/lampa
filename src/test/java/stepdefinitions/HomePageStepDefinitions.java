package stepdefinitions;

import io.cucumber.java.en.Given;
import manager.PageFactoryManager;

import java.util.logging.Logger;

public class HomePageStepDefinitions {

    public static final Logger log = Logger.getLogger(HomePageStepDefinitions.class.getName());

    PageFactoryManager instance = PageFactoryManager.getInstance();

    private static final long WAIT = 30;

    @Given("User opens home page")
    public void userOpensHomePage() {
        instance.getHomePage();
        instance.getHomePage().openHomePage();
        log.info("Hope Page is opened");
        instance.getHomePage().implicitWait(WAIT);
    }

}
