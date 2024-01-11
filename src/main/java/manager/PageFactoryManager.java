package manager;

import org.openqa.selenium.WebDriver;
import pageobjects.components.HeaderComponent;
import pageobjects.pages.*;

public class PageFactoryManager {

    private static PageFactoryManager instance;

    private WebDriver driver;

    public WebDriver getDriver() {
        return driver;
    }

    public PageFactoryManager() {
    }

    public static PageFactoryManager getInstance() {
        if (instance == null) {
            instance = new PageFactoryManager();
        }
        return instance;
    }

    public void setDriver(WebDriver driver) {this.driver = driver;}

    public HomePage getHomePage() {
        return new HomePage(driver);
    }

    public HeaderComponent getHeaderComponent() {
        return new HeaderComponent(driver);
    }

    public AboutUsPage getAboutUsPage() {
        return new AboutUsPage(driver);
    }

    public CasesPage getCasesPage() {
        return new CasesPage(driver);
    }

    public CareerPage getCareerPage() {
        return new CareerPage(driver);
    }

    public BlogPage getBlogPage() {
        return new BlogPage(driver);
    }

    public ContactUsPage getContactUsPage() {
        return new ContactUsPage(driver);
    }


}
