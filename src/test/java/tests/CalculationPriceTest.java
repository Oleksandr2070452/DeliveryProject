package tests;

import elements.HomeElements;
import org.testng.annotations.Test;
import pages.CalculationExtendedVersionPage;
import pages.CalculationPage;

public class CalculationPriceTest extends TestInit {

    @Test
    public void calculationPriceExtendedVersionTest() {

        HomeElements homeElements = new HomeElements();
        CalculationPage calculationPage = new CalculationPage();
        CalculationExtendedVersionPage calculationExtendedVersionPage = new CalculationExtendedVersionPage();

        homeElements
                .clickQuickStartDropdown()
                .clickCalculatePrice();

        calculationPage
                .clickExtendedVersion();

        calculationExtendedVersionPage
                .inputTownFrom()
                .inputTownTo()
                .selectDeliveryType()
                .selectWarehouseAddressFrom()
                .selectWarehouseAddressTo()
                .selectDateSendingCargo()
                .selectDateReceivingCargo();

    }
}
