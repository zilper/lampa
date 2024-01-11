package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import manager.PageFactoryManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static io.github.bonigarcia.wdm.WebDriverManager.chromedriver;

public class Hooks {

    WebDriver driver;

    PageFactoryManager pageFactoryManager;

    @Before
    public void setUp() {
//        WebDriverManager.chromedriver().driverVersion("120.0.6099.109").setup();
        chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        pageFactoryManager = PageFactoryManager.getInstance();
        pageFactoryManager.setDriver(driver);
    }

    @After
    public void tearDown() {
        driver.close();driver.quit();
    }

}
