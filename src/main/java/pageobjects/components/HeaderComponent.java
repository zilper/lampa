package pageobjects.components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageobjects.pages.BasePage;

public class HeaderComponent extends BasePage {

    @FindBy(xpath = "//a[contains(@class, 'NavItem_button__5k_VV')]/span[contains(text(), 'About Us')]")
    WebElement headerNavigationMenuAboutUs;
    @FindBy(xpath = "//a[contains(@class, 'NavItem_button__5k_VV')]/span[contains(text(), 'Cases')]")
    WebElement headerNavigationMenuCases;
    @FindBy(xpath = "//a[contains(@class, 'NavItem_button__5k_VV')]/span[contains(text(), 'Career')]")
    WebElement headerNavigationMenuCareer;
    @FindBy(xpath = "//a[contains(@class, 'NavItem_button__5k_VV')]/span[contains(text(), 'Blog')]")
    WebElement headerNavigationMenuBlog;
    @FindBy(xpath = "//a[contains(@class, 'NavItem_button__5k_VV')]/span[contains(text(), 'Contacts')]")
    WebElement headerNavigationMenuContacts;
    @FindBy(xpath = "//span[@class='Button_inner__k_RMZ' and text()='Contact us']")
    WebElement headerButtonContactUs;

    public HeaderComponent(WebDriver driver) {
        super(driver);
    }

    public void clickAboutUsNavigationButton() {
        headerNavigationMenuAboutUs.click();
    }

    public void clickCasesNavigationButton() {
        headerNavigationMenuCases.click();
    }

    public void clickCareerNavigationButton() {
        headerNavigationMenuCareer.click();
    }

    public void clickBlogNavigationButton() {
        headerNavigationMenuBlog.click();
    }

    public void clickContactsNavigationButton() {headerNavigationMenuContacts.click();}

    public void clickContactUsHeaderButton() {
        headerButtonContactUs.click();
    }

}
