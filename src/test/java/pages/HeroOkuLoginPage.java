package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class HeroOkuLoginPage {
    public HeroOkuLoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "username")
    public WebElement userNameInputBox;

    @FindBy(css = "label[for='username']")
    public WebElement userNameText;

    @FindBy(id = "password")
    public WebElement passwordInputBox;

    @FindBy(css = "label[for='password']")
    public WebElement passwordText;

    @FindBy(css = ".radius")
    public WebElement heroLoginButton;

   @FindBy(id = "flash")
   public WebElement invalidMessageInLogin;
}
