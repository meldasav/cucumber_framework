package steps;

import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.HeroOkuLoginPage;
import utils.Driver;

public class HeroOkuLoginSteps {
    WebDriver driver;
    HeroOkuLoginPage heroOkuLoginPage;

    @Before
    public void setup() {
        driver = Driver.getDriver();
        heroOkuLoginPage = new HeroOkuLoginPage();
    }

    @When("user enters username as {string} and password as {string}")
    public void user_enters_username_as_and_password_as(String userName, String password) {
        Assert.assertTrue(heroOkuLoginPage.userNameText.isDisplayed());
        Assert.assertTrue(heroOkuLoginPage.passwordText.isDisplayed());
        heroOkuLoginPage.userNameInputBox.sendKeys(userName);
        heroOkuLoginPage.passwordInputBox.sendKeys(password);

    }

    @Then("user should see a message starts with {string}")
    public void user_should_see_a_message_starts_with(String stringText) {
        Assert.assertTrue(heroOkuLoginPage.invalidMessageInLogin.isDisplayed());
        Assert.assertTrue(heroOkuLoginPage.invalidMessageInLogin.getText().startsWith(stringText));

    }

}
