package tests;

import com.codeborne.selenide.WebDriverRunner;
import elements.HomeElements;
import jdk.jfr.Description;
import org.testng.annotations.Test;
import pages.UserAreaPage;

public class SignInTest extends TestInit {

    @Test
    @Description("Negative: Invalid user credentials")
    public void userSignInWithInvalidCredentials() {

        HomeElements homeElements = new HomeElements();

        homeElements
                .clickSignInBtn()
                .loginInput()
                .passwordInput()
                .clickLoginButton();

        assertTrue(homeElements.isErrorMessageIncorrectDataVisible()
                .getText().contains("Невірно введені логін або пароль"));

    }

    @Test
    @Description("Positive: User with valid credentials")
    public void userSignIn() {

        HomeElements homeElements = new HomeElements();
        UserAreaPage userAreaPage = new UserAreaPage();

        homeElements
                .clickSignInBtn()
                .userValidLoginInput()
                .userValidLoginPasswordInput()
                .clickLoginButton();

        assertTrue(userAreaPage.getHeaderUserPageAccount().getText().contains("Головна сторiнка"));
        assertTrue(WebDriverRunner.url().contains("/uk/Home/UserArea"));

    }

    @Test
    @Description("Positive: User logout account")
    public void userLogout() {

        HomeElements homeElements = new HomeElements();
        UserAreaPage userAreaPage = new UserAreaPage();

        homeElements
                .clickSignInBtn()
                .userValidLoginInput()
                .userValidLoginPasswordInput()
                .clickLoginButton();

        userAreaPage
                .clickMyAccountLogo()
                .clickLogoutButton();

        assertTrue(WebDriverRunner.url().contains("delivery-auto.com/uk-UA"));

    }
}
