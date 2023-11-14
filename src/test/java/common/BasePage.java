package common;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.ElementsCollection;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class BasePage {

    protected WebElement getVisibleOfElement(String locator) {
        return $(By.xpath(locator)).shouldBe(visible, Duration.ofSeconds(15));
    }

    protected WebElement getClickableOfElement(String locator) {
        return $(By.xpath(locator)).shouldBe(enabled, Duration.ofSeconds(15));
    }

    protected ElementsCollection getListPresenceOfElements(String locator) {
        return $$(By.xpath(locator)).shouldBe(CollectionCondition
                .sizeGreaterThan(0), Duration.ofSeconds(15));
    }

    protected WebElement getPresenceOfElement(String locator) {
        return $(By.xpath(locator)).shouldBe(exist, Duration.ofSeconds(15));
    }
}
