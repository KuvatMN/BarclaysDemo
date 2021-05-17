package barclays.co.uk.step_definitions;

import barclays.co.uk.pages.LoginPage;
import barclays.co.uk.utilities.ConfigurationReader;
import barclays.co.uk.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefs {

    @Given("User is on Login Page")
    public void user_is_on_Login_Page() {

        String url = ConfigurationReader.get("url");
        Driver.get().get(url);
    }

    @When("User enters {string} and {string}")
    public void user_enters_and(String lastName, String membershipNumber) {

        LoginPage loginPage = new LoginPage();
        loginPage.login(lastName,membershipNumber);

    }

    @Then("User should see error message {string}")
    public void user_should_see_error_message(String expectedErrorMessage) {

        String actualErrorMessage = new LoginPage().errorMessage.getText();
        System.out.println(actualErrorMessage);
        Assert.assertEquals(expectedErrorMessage, new LoginPage().errorMessage.getText());

    }
}
