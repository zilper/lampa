package pageobjects.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CareerPage extends BasePage{

    @FindBy(xpath = "//span[@class='Breadcrumbs_activeLink__3VpFB' and contains(text(), 'Career')]")
    WebElement careerActiveLink;

    public CareerPage(WebDriver driver) {
        super(driver);
    }

    public boolean careerActiveLinkIsVisible() {
        return careerActiveLink.isDisplayed();
    }

}
