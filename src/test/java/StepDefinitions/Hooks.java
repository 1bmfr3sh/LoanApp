package StepDefinitions;

import Util.DriverFactory;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Hooks {
    private DriverFactory driverFactory = new DriverFactory();

    static {
        WebDriverManager.chromedriver().setup();
    }

    private WebDriver driver;
    private ChromeOptions options = new ChromeOptions();

    @Before
    public void before() {
        System.out.println("This is the before anything happens");
        DriverFactory.getDriver();
    }

    @After
    public void after() {
        System.out.println("This is after everything happens");
        DriverFactory.quitDriver();

    }
}

