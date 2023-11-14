package pages;

import common.BasePage;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class CalculationExtendedVersionPage extends BasePage {

    private static final String CHOOSE_TOWN_FROM = "//textarea[@aria-controls='select2-areaSendId-q1-results']";
    private static final String LUTSK_TOWN = "//option[text()='Луцьк, Луцький р-н, Волинська обл']";
    private static final String EAST_TOWN = "//option[text()='Южноукраїнськ, Южноукраїнськ р-н, Миколаївська обл']";
    private static final String CHOOSE_TOWN_TO = "//TEXTAREA[@aria-describedby='select2-areaReceiveId-su-container']";
    private static final String DELIVERY_TYPE = "//textarea[@aria-describedby='select2-deliveryScheme-yp-container']";
    private static final String DELIVERY_TYPE_DOORS = "//option[text()='Двері-Двері']";
    private static final String ERROR_MESSAGE_WARNING_DELIVERY_COST = "//div[@id='warning-cost-delivery']";
    private static final String WAREHOUSE_ADDRESS_FROM_DROPDOWN = "//textarea[@aria-describedby='select2-warehouseSendId-y7-container']";
    private static final String WAREHOUSE_ADDRESS_FROM = "//span[@class='option-sub' and text()='вул. Карбишева, 2']";
    private static final String WAREHOUSE_ADDRESS_TO_DROPDOWN = "//textarea[@aria-describedby='select2-warehouseReceiveId-r8-container']";
    private static final String WAREHOUSE_ADDRESS_TO = "//option[text()='ЮЖНОУКРАЇНСЬК ***']";
    private static final String DELIVERY_SEND_DATE = "//input[@name='dateSend']";
    private static final String DELIVERY_RECEIVING_DATE = "//input[@id='dateReceive']";
    private static final String DECLARED_PRICE = "//input[@name='DeclaredCost']";
    private static final String SUBSCRIPTION = "//input[@name='CODCost']";
    private static final String CARGO_TYPE = "//textarea[@aria-describedby='select2-cargoCategories-5n-container']";
    private static final String CARGO_WEIGHT = "//input[@name='cargoWeight']";
    private static final String CARGO_COUNT = "//input[@name='cargoCount']";
    private static final String CARGO_VOLUME = "//input[@name='cargoVolume']";
    private static final String CARGO_LENGTH = "//input[@name='cargoLength']";
    private static final String CARGO_WIDTH = "//input[@name='cargoWidth']";
    private static final String CARGO_HEIGHT = "//input[@name='cargoHeight']";

    public CalculationExtendedVersionPage inputTownFrom() {
        $(By.xpath(CHOOSE_TOWN_FROM)).setValue("Луцьк");
        $(By.xpath(LUTSK_TOWN)).click();
        return this;
    }

    public CalculationExtendedVersionPage inputTownTo() {
        $(By.xpath(CHOOSE_TOWN_TO)).setValue("Київ");
        $(By.xpath(EAST_TOWN)).click();
        return this;
    }

    public CalculationExtendedVersionPage selectDeliveryType() {
        $(By.xpath(DELIVERY_TYPE)).click();
        $(By.xpath(DELIVERY_TYPE_DOORS)).click();
        return this;
    }

    public boolean isErrorMessageWarningDeliveryCostVisible() {
        return $(By.xpath(ERROR_MESSAGE_WARNING_DELIVERY_COST))
                .getText().contains("Вартість доставки в даний населений пункт може змінюватися");
    }

    public CalculationExtendedVersionPage selectWarehouseAddressFrom() {
        $(By.xpath(WAREHOUSE_ADDRESS_FROM_DROPDOWN)).click();
        $(By.xpath(WAREHOUSE_ADDRESS_FROM)).click();
        return this;
    }

    public CalculationExtendedVersionPage selectWarehouseAddressTo() {
        $(By.xpath(WAREHOUSE_ADDRESS_TO_DROPDOWN)).click();
        $(By.xpath(WAREHOUSE_ADDRESS_TO)).click();
        return this;
    }

    public CalculationExtendedVersionPage selectDateSendingCargo() {
        $(By.xpath(DELIVERY_SEND_DATE)).click();
        chooseDate(DELIVERY_SEND_DATE, 2023, 11, 27);
        return this;
    }

    public CalculationExtendedVersionPage selectDateReceivingCargo() {
        $(By.xpath(DELIVERY_RECEIVING_DATE)).click();
        chooseDate(DELIVERY_RECEIVING_DATE, 2023, 11, 30);
        return this;
    }
}
