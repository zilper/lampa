package pageobjects.pages;

import manager.PageFactoryManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ContactUsPage extends BasePage {

    @FindBy(xpath = "//span[@class='Breadcrumbs_activeLink__3VpFB' and contains(text(), 'Contact us')]")
    WebElement contactUsActiveLink;

    @FindBy(xpath = "//button[contains(@class,'Button_root__s96Gl Button_outline__w30Xe Button_black__ooeyE')]")
    WebElement sendButton;

    @FindBy(xpath = "//input[@placeholder='Name']")
    WebElement nameInput;

    @FindBy(xpath = "//input[@placeholder='E-mail']")
    WebElement emailInput;

    @FindBy(xpath = "//input[@placeholder='Phone number']")
    WebElement phoneInput;

    @FindBy(xpath = "//textarea[@placeholder='Message']")
    WebElement commentInput;

    @FindBy(xpath = "//h1[@class='Heading_root__YA2EN Heading_h1Lg__j_YF9']")
    WebElement contactMessage;

    @FindBy(xpath = "//input[@placeholder='E-mail']//following-sibling::p")
    WebElement emailErrorMessage;

    @FindBy(xpath = "//input[@placeholder='Phone number']//following-sibling::p")
    WebElement phoneErrorMessage;

    PageFactoryManager instance = PageFactoryManager.getInstance();

    WebDriverWait wait = new WebDriverWait(instance.getDriver(), Duration.ofSeconds(60));

    public ContactUsPage(WebDriver driver) {
        super(driver);
    }

    public boolean contactUsActiveLinkIsVisible() {
        return contactUsActiveLink.isDisplayed();
    }

    public void clickSendButton() {
        sendButton.click();
    }

    public void fillNameInputField(final String name) {
        nameInput.sendKeys(name);
    }

    public void fillEmailInputField(final String email) {
        emailInput.sendKeys(email);
    }

    public void fillPhoneInputField(final String phone) {
        phoneInput.sendKeys(phone);
    }

    public void fillMessageInputField(final String comment) {
        commentInput.sendKeys(comment);
    }

    public String getContactMessageText() {
        wait.until(ExpectedConditions.visibilityOf(contactMessage));
        return contactMessage.getText();
    }

    public boolean emailErrorMessageIsVisible() {
        wait.until(ExpectedConditions.visibilityOf(emailErrorMessage));
        return emailErrorMessage.isDisplayed();
    }

    public boolean phoneNumberErrorMessageIsVisible() {
        wait.until(ExpectedConditions.visibilityOf(phoneErrorMessage));
        return phoneErrorMessage.isDisplayed();
    }


}
