package tests;

import com.codeborne.selenide.Configuration;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static com.codeborne.selenide.Selenide.closeWindow;
import static com.codeborne.selenide.Selenide.open;

public class TestInit extends Assert {

    private final String BASE_URL = "https://www.delivery-auto.com/";

    @BeforeMethod
    public void setup() {
        open(BASE_URL);
        Configuration.browser = "chrome";
        Configuration.browserSize = "1920x1080";
        Configuration.headless = false;

    }

    @AfterMethod
    public void closeTest() {
        closeWindow();
    }
}
