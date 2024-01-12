package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
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
        instance.getContactUsPage().waitForPageLoadComplete(WAIT);
        Assert.assertTrue(instance.getContactUsPage().contactUsActiveLinkIsVisible());
        log.info("Contact Us page is opened");
    }

    @When("User fills 'Your Name' input field with {string}")
    public void userFillsYourNameInputField(final String name) {
        instance.getContactUsPage();
        instance.getContactUsPage().implicitWait(WAIT);
        instance.getContactUsPage().fillNameInputField(name);
        log.info("Name field filled: " + name);
    }

    @When("User fills 'Your Email' input field with {string}")
    public void userFillsYourEmailInputField(final String email) {
        instance.getContactUsPage();
        instance.getContactUsPage().implicitWait(WAIT);
        instance.getContactUsPage().fillEmailInputField(email);
        log.info("Email field filled: " + email);
    }

    @When("User fills 'Your Phone Number' input field with {string}")
    public void userFillsYourPhoneNumberInputField(final String phoneNumber) {
        instance.getContactUsPage();
        instance.getContactUsPage().implicitWait(WAIT);
        instance.getContactUsPage().fillPhoneInputField(phoneNumber);
        log.info("Phone number field filled: " + phoneNumber);
    }

    @When("User fills 'Message' input field with {string}")
    public void userFillsMessageInputField(final String message) {
        instance.getContactUsPage();
        instance.getContactUsPage().implicitWait(WAIT);
        instance.getContactUsPage().fillMessageInputField(message);
        log.info("Message field filled: " + message);
    }

    @And("User clicks 'Send' button on 'Contact Us' page")
    public void userClicksSendButtonOnContactUsPage() {
        instance.getContactUsPage();
        instance.getContactUsPage().implicitWait(90);
        instance.getContactUsPage().clickSendButton();
        log.info("Send button has been clicked");
    }

    @Then("User sees email input field error message")
    public void userSeesEmailInputFieldErrorMessage() {
        instance.getContactUsPage();
        instance.getContactUsPage().waitForPageLoadComplete(WAIT);
        Assert.assertTrue(instance.getContactUsPage().emailErrorMessageIsVisible());
    }

    @Then("User sees phone number input field error message")
    public void userSeesPhoneNumberInputFieldErrorMessage() {
        instance.getContactUsPage();
        instance.getContactUsPage().implicitWait(WAIT);
        Assert.assertTrue(instance.getContactUsPage().phoneNumberErrorMessageIsVisible());
    }

    @Then("User sees the confirmation message {string}")
    public void userSeesTheConfirmationMessage(final String message) {
        instance.getContactUsPage();
        instance.getContactUsPage().implicitWait(90);
        Assert.assertEquals(message, instance.getContactUsPage().getContactMessageText());
        instance.getContactUsPage().implicitWait(90);
    }

}
