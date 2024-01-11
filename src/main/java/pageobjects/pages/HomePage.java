package pageobjects.pages;

import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{


    private static final String HOME_URL = "https://lampa.dev";

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void openHomePage() { driver.get(HOME_URL); }
}
