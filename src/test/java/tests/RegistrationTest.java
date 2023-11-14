package tests;

import com.codeborne.selenide.WebDriverRunner;
import elements.HomeElements;
import org.testng.annotations.Test;
import pages.AccountRegisterPage;
import pages.RegistrationPage;

public class RegistrationTest extends TestInit {

    @Test
    public void registration() {

        HomeElements homeElements = new HomeElements();
        RegistrationPage registrationElements = new RegistrationPage();
        AccountRegisterPage accountRegisterPage = new AccountRegisterPage();

        homeElements
                .clickSignInBtn();

        registrationElements.clickRegistrationButton();

        accountRegisterPage
                .inputPhone()
                .inputEmail()
                .inputPassword()
                .clickAgreement()
                .clickCreateAccount();

        assertTrue(WebDriverRunner.url().contains("Account/Register"));
        assertTrue(accountRegisterPage.getTitleSMSCode().getText().contains("Отримати СМС з кодом"));

    }

}
