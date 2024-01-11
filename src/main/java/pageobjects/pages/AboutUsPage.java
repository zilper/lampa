package pageobjects.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AboutUsPage extends BasePage{

    @FindBy(xpath = "//span[@class='Breadcrumbs_activeLink__3VpFB' and contains(text(), 'About us')]")
    WebElement aboutUsActiveLink;

    public AboutUsPage(WebDriver driver) {
        super(driver);
    }

    public boolean aboutUsActiveLinkIsVisible() {
        return aboutUsActiveLink.isDisplayed();
    }

}
