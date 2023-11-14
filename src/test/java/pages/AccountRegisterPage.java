package pages;

import com.codeborne.selenide.SelenideElement;
import elements.HomeElements;
import helpers.Randomizers;
import org.openqa.selenium.By;
import utils.UserData;

import static com.codeborne.selenide.Selenide.$;

public class AccountRegisterPage extends HomeElements {

    private static final String PHONE_INPUT = "//input[@formcontrolname='phone']";
    private static final String EMAIL_INPUT = "//input[@name='email']";
    private static final String PASSWORD_REGISTER_INPUT = "//input[@name='password']";
    private static final String AGREEMENT_BUTTON = "//input[@name='isAgreed']";
    private static final String CREATE_ACCOUNT_BUTTON = "//button[@class='del-button ic-lock']";
    private static final String TITLE_SMS_CODE = "//h5[text()='Отримати СМС з кодом']";

    public AccountRegisterPage inputPhone() {
        $(By.xpath(PHONE_INPUT)).sendKeys(UserData.USER_TEST_NUMBER);
        return this;
    }

    public AccountRegisterPage inputEmail() {
        Randomizers.randomEmail($(By.xpath(EMAIL_INPUT)));
        return this;
    }

    public AccountRegisterPage inputPassword() {
        Randomizers.randomPassword($(By.xpath(PASSWORD_REGISTER_INPUT)));
        return this;
    }

    public AccountRegisterPage clickAgreement() {
        $(By.xpath(AGREEMENT_BUTTON)).click();
        return this;
    }

    public AccountRegisterPage clickCreateAccount() {
        $(By.xpath(CREATE_ACCOUNT_BUTTON)).click();
        return this;
    }

    public SelenideElement getTitleSMSCode() {
        return $(By.xpath(TITLE_SMS_CODE));
    }
}
