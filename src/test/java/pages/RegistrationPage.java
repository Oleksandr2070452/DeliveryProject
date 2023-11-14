package pages;

import elements.HomeElements;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class RegistrationPage extends HomeElements {

    private static final String REGISTRATION_BUTTON = "//a[@class='login-link']";

    public RegistrationPage clickRegistrationButton() {
        $(By.xpath(REGISTRATION_BUTTON)).click();
        return this;
    }
}
