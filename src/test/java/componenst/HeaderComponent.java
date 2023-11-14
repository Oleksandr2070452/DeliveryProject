package componenst;

import common.BasePage;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class HeaderComponent extends BasePage {

    private final static String COMPANY = "//p[text()='Компанія']";
    private final static String CLIENTS = "//p[text()='Клієнтам']";
    private final static String PRICE = "//p[text()='Вартість']";
    private final static String DOCUMENTS = "//p[text()='Документи']";
    private final static String DEPARTMENT = "//a[text()='Відділення']";
    private final static String CONNECT_AND_SUPPORT = "//a[text()='Зв’язок та підтримка']";
    private final static String FEEDBACK = "//a[text()=' Зворотній дзвінок']";
    private final static String TARIFF = "//li[@class='drop__li']/a[text()='Тарифи']";

    public HeaderComponent moveToCompany() {
        moveToElement(COMPANY);
        return this;
    }

    public HeaderComponent moveToClients() {
        moveToElement(CLIENTS);
        return this;
    }

    public HeaderComponent moveToPrice() {
        moveToElement(PRICE);
        return this;
    }

    public HeaderComponent moveToDocuments() {
        moveToElement(DOCUMENTS);
        return this;
    }

    public HeaderComponent moveToDepartment() {
        moveToElement(DEPARTMENT);
        return this;
    }

    public HeaderComponent moveToConnectAndSupport() {
        moveToElement(CONNECT_AND_SUPPORT);
        return this;
    }

    public HeaderComponent moveToFeedback() {
        moveToElement(FEEDBACK);
        return this;
    }

    public HeaderComponent clickTariff() {
        $(By.xpath(TARIFF)).click();
        return this;
    }
}
