package pages;

import common.BasePage;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class CalculationPage extends BasePage {

    private static final String HEADER_CALCULATE_PRICE_PAGE = "//h1[text()='Розрахувати вартість']";
    private static final String EXTENDED_VERSION = "//a[text()='Розширена версія']";

    public boolean isHeaderCalculatePriceVisible() {
        return $(By.xpath(HEADER_CALCULATE_PRICE_PAGE)).getText().contains("Розрахувати вартість");
    }

    public CalculationPage clickExtendedVersion() {
        $(By.xpath(EXTENDED_VERSION)).click();
        return this;
    }

}
