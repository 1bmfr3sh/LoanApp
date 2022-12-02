package StepDefinitions;

import Page.HomePage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

import java.util.Map;


public class HomepageStepDefs {


    public HomePage homePage = new HomePage();

    @Given("User is on the Homepage")
    public void userIsOnTheHomepage() {
        homePage.goToHomepage();
        System.out.println("User is on the Homepage");
    }

    @When("User is clicking on Loan Application")
    public void userIsClickingOnLoanApplication() {
        homePage.selectLoanApp();
        System.out.println("User is planning to log in to apply for a loan application");
    }

    @Then("User is logging in with {string} and {string}")
    public void userIsLoggingInWithAnd(String Username, String Password) {
        homePage.accountName("user");
        homePage.accountPassword("password");
        System.out.println("My username and password are " + Username + Password);

    }

    @And("User click on the sign in button")
    public void userClickOnTheSignInButton() {
        homePage.setSignIn();
        System.out.println("User has signed into his/her account");

    }

    @When("I add values in all fields")
    public void iAddValuesInAllFields(DataTable dataTable) {
        Map<String, String> data = dataTable.asMap();
        homePage.findAndType(By.cssSelector("#firstName"),data.get("First Name"));
        homePage.findAndType(By.cssSelector("#lastName"),data.get("Last Name"));
        homePage.findAndType(By.cssSelector("#age"),data.get("Age"));
        homePage.findAndType(By.cssSelector("#addressLine1"),data.get("Address Line 1"));
        homePage.findAndType(By.cssSelector("#addressLine2"),data.get("Address Line 2"));
        homePage.findAndType(By.cssSelector("#postCode"),data.get("Postcode"));
        homePage.findAndType(By.cssSelector("#email"),data.get("Email"));
        homePage.findAndType(By.cssSelector("#amount"),data.get("Loan Amount"));

    }

    @Then("user clicks on the application submit")
    public void userClicksOnTheApplicationSubmit() {
        homePage.setLoanSubmit();
        System.out.println("Application has been submitted");
    }
}
