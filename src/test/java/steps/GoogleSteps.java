package steps;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import pages.GoogleSearchPage;
import utils.Driver;

public class GoogleSteps {

    WebDriver driver;
    GoogleSearchPage googleSearchPage;

    @Before
    public void setup() {

        driver = Driver.getDriver();
        googleSearchPage = new GoogleSearchPage();
    }


    @When("user searches for {string} on google")
    public void user_searches_for_on_google(String key) {
        googleSearchPage.searchInputBox.sendKeys(key + Keys.ENTER);

    }

    @Then("user should see {string} in the url")
    public void user_should_see_in_the_url(String key) {
        Assert.assertTrue(driver.getCurrentUrl().contains(key));

    }

    @Then("user should see {string} in the title")
    public void user_should_see_in_the_title(String key) {
        Assert.assertTrue(driver.getTitle().contains(key));

    }


    @Then("user should see results are more than {int}")
    public void userShouldSeeResultsAreMoreThan(long results) {
    Assert.assertTrue(Long.parseLong(googleSearchPage.searchResult.getText().split(" ")[1].replaceAll(",", "")) > results);

    }
}
