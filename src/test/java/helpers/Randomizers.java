package helpers;

import com.codeborne.selenide.SelenideElement;
import com.github.javafaker.Faker;

public class Randomizers {

    private static final Faker faker = new Faker();

    public static void randomName(SelenideElement element) {
        String randomName = faker.name().fullName();
        element.setValue(randomName);
    }

    public static void randomEmail(SelenideElement element) {
        String randomEmail = faker.internet().emailAddress();
        element.sendKeys(randomEmail);
    }

    public static void randomPhone(SelenideElement element) {
        String randomPhone = faker.phoneNumber().cellPhone();
        element.setValue(randomPhone);
    }

    public static void randomPassword(SelenideElement element) {
        String randomPassword = faker.internet().password();
        element.setValue(randomPassword);
    }
}
