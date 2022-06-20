package steps;

import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.HeroAppPage;
import utils.Driver;

public class HeroOkuLoginSteps {
    WebDriver driver;
    HeroAppPage heroOkuPage;

    @Before
    public void setup() {
        driver = Driver.getDriver();
        heroOkuPage = new HeroAppPage();
    }
    @When("user enters username as {string} and password as {string}")
    public void user_enters_username_as_and_password_as(String userName, String password) {


    }

    @Then("user should see a message starts with {string}")
    public void user_should_see_a_message_starts_with(String string) {

        throw new cucumber.api.PendingException();
    }


}