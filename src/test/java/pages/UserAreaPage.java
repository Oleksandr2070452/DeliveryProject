package pages;

import common.BasePage;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class UserAreaPage extends BasePage {

    private static final String MAIN_USER_PAGE_ACCOUNT_HEADER = "//h1[@class='cabinet-head__title']";
    private static final String MY_ACCOUNT_LOGO_DROPDOWN = "//div[@class='sub-nav__icon dropdown-arrow']";
    private static final String LOGOUT_BUTTON = "//a[@class='is-logout']";

    public boolean getHeaderUserPageAccount() {
        return $(By.xpath(MAIN_USER_PAGE_ACCOUNT_HEADER)).getText().contains("Головна сторiнка");
    }

    public UserAreaPage clickMyAccountLogo() {
        $(By.xpath(MY_ACCOUNT_LOGO_DROPDOWN)).click();
        return this;
    }

    public UserAreaPage clickLogoutButton() {
        $(By.xpath(LOGOUT_BUTTON)).click();
        return this;
    }
}
