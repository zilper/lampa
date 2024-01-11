package pageobjects.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BlogPage extends BasePage{

    @FindBy(xpath = "//span[@class='Breadcrumbs_activeLink__3VpFB' and contains(text(), 'Blog')]")
    WebElement blogActiveLink;

    public BlogPage(WebDriver driver) {
        super(driver);
    }

    public boolean blogActiveLinkIsVisible() {
        return blogActiveLink.isDisplayed();
    }

}
