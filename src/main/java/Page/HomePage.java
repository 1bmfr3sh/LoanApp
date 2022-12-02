package Page;

import Util.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {
    WebDriver driver = DriverFactory.getDriver();
    WebDriverWait wait;

    static By LoanApplication = By.xpath("//a[@href=\"/application\"]");
    static By Username = By.xpath("//input[@name=\"username\"]");
    static By Password = By.xpath("//input[@type=\"password\"]");

    static By SignIn = By.xpath("//input[@type=\"submit\"]");
    static By LoanSubmit = By.xpath("//button");

    public void goToHomepage() {
        driver.get("http://35.178.110.62:8080/");
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void waitAndClick(By Selector) {
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(Selector));
        element.click();
    }

    public void selectLoanApp() {
        waitAndClick(LoanApplication);

    }
    public void findAndType(By elementSelector, String inputString) {

        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(elementSelector));
        element.sendKeys(inputString);
    }

    public void accountName(String name) {
        findAndType(Username, name);
    }

    public void accountPassword(String password) {
        findAndType(Password, password);
    }

    public void setSignIn() {
        waitAndClick(SignIn);
    }
    public void setLoanSubmit() {
        waitAndClick(LoanSubmit);
    }

}
