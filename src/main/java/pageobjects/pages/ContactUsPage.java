package pageobjects.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactUsPage extends BasePage{

    @FindBy(xpath = "//span[@class='Breadcrumbs_activeLink__3VpFB' and contains(text(), 'Contact us')]")
    WebElement contactUsActiveLink;

    public ContactUsPage(WebDriver driver) {
        super(driver);
    }

    public boolean contactUsActiveLinkIsVisible() {
        return contactUsActiveLink.isDisplayed();
    }

}
