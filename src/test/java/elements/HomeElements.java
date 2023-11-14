package elements;

import common.BasePage;
import com.codeborne.selenide.SelenideElement;
import helpers.Randomizers;
import org.openqa.selenium.By;
import utils.UserData;

import static com.codeborne.selenide.Selenide.$;

public class HomeElements extends BasePage {

    private static final String SIGN_IN = "//label[@class='login-block__login-btn']";
    private static final String LOGIN_INPUT = "//input[@name='UserName']";
    private static final String PASSWORD_LOGIN_INPUT = "//input[@id='Password']";
    private static final String LOGIN_BUTTON = "//button[@class='login-button']";
    private static final String ERROR_MESSAGE_INCORRECT_DATA = "//div[@class='error_message mess_show']";
    private static final String SUCCESS_LOGIN_MESSAGE = "//div[@class='error_message success mess_show']";

    public HomeElements clickSignInBtn() {
        $(By.xpath(SIGN_IN)).click();
        return this;
    }

    public HomeElements loginInput() {
        Randomizers.randomEmail($(By.xpath(LOGIN_INPUT)));
        return this;
    }

    public HomeElements passwordInput() {
        Randomizers.randomPassword($(By.xpath(PASSWORD_LOGIN_INPUT)));
        return this;
    }

    public SelenideElement isErrorMessageIncorrectDataVisible() {
        return $(By.xpath(ERROR_MESSAGE_INCORRECT_DATA));
    }

    public HomeElements clickLoginButton() {
        $(By.xpath(LOGIN_BUTTON)).click();
        return this;
    }

    public HomeElements userValidLoginInput() {
        $(By.xpath(LOGIN_INPUT)).sendKeys(UserData.USER_EMAIL);
        return this;
    }

    public HomeElements userValidLoginPasswordInput() {
        $(By.xpath(PASSWORD_LOGIN_INPUT)).sendKeys(UserData.USER_PASSWORD);
        return this;
    }

    public SelenideElement getSuccessLoginMessage() {
        return $(By.xpath(SUCCESS_LOGIN_MESSAGE));
    }
}
