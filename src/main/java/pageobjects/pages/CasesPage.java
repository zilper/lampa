package pageobjects.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CasesPage extends BasePage{

    @FindBy(xpath = "//span[@class='Breadcrumbs_activeLink__3VpFB' and contains(text(), 'Cases')]")
    WebElement casesActiveLink;

    public CasesPage(WebDriver driver) {
        super(driver);
    }

    public boolean casesActiveLinkIsVisible() {
        return casesActiveLink.isDisplayed();
    }

}
