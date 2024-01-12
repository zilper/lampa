package pageobjects.pages;

import manager.PageFactoryManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BlogPage extends BasePage {

    @FindBy(xpath = "//span[@class='Breadcrumbs_activeLink__3VpFB' and contains(text(), 'Blog')]")
    WebElement blogActiveLink;

    @FindBy(xpath = "//span[text()='Solutions']/parent::div[@class='Select_selectInput__gDxrc']")
    WebElement filterSolutionsDropdown;

    @FindBy(xpath = "//span[text()='Services']/parent::div[@class='Select_selectInput__gDxrc']")
    WebElement filterServicesDropdown;

    @FindBy(xpath = "//input[@placeholder='Search']")
    WebElement searchInputField;

    @FindBy(xpath = "//span[text()='Tools']/parent::div")
    WebElement solutionDropdownMenuElement;

    @FindBy(xpath = "//span[text()='Web Development']/parent::div")
    WebElement servicesDropdownMenuElement;

    @FindBy(xpath = "//div[@class='BlogFilters_selectedFilters__hI_Eg']//span[contains(text(), 'Tools')]")
    WebElement toolsBlogFilter;

    @FindBy(xpath = "//div[@class='BlogFilters_selectedFilters__hI_Eg']//span[contains(text(), 'Web Development')]")
    WebElement webDevelopmentBlogFilter;

    PageFactoryManager instance = PageFactoryManager.getInstance();

    WebDriverWait wait = new WebDriverWait(instance.getDriver(), Duration.ofSeconds(60));

    public BlogPage(WebDriver driver) {
        super(driver);
    }

    public boolean blogActiveLinkIsVisible() {
        return blogActiveLink.isDisplayed();
    }

    public void clickFilterSolutionsDropdown() {
        filterSolutionsDropdown.click();
    }

    public void clickFilterServicesDropdown() {
        filterServicesDropdown.click();
    }

    public void fillSearchInputField(final String text) {
        wait.until(ExpectedConditions.visibilityOf(searchInputField));
        searchInputField.sendKeys(text);
        scrollToElement(instance.getDriver(), searchInputField);
    }

    public void clickSolutionDropdownMenuElement() {
        wait.until(ExpectedConditions.visibilityOf(solutionDropdownMenuElement));
        solutionDropdownMenuElement.click();
    }

    public void clickServicesDropdownMenuElement() {
        wait.until(ExpectedConditions.visibilityOf(servicesDropdownMenuElement));
        servicesDropdownMenuElement.click();
    }

    public boolean toolsBlogFilterIsVisible() {
        wait.until(ExpectedConditions.visibilityOf(toolsBlogFilter));
        return toolsBlogFilter.isDisplayed();
    }

    public boolean webDevelopmentBlogFilterIsVisible() {
        wait.until(ExpectedConditions.visibilityOf(webDevelopmentBlogFilter));
        return webDevelopmentBlogFilter.isDisplayed();
    }
}
