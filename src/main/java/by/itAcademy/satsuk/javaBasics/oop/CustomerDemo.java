package by.itAcademy.satsuk.javaBasics.oop;

import net.datafaker.Faker;

public class CustomerDemo {
    public static void main(String[] args) {

        Faker faker = new Faker();
        Customer customer = new Customer(
                faker.number().numberBetween(1, 4000),
                faker.name().lastName(),
                faker.name().firstName(),
                faker.name().firstName(),
                faker.address().fullAddress(),
                faker.finance().creditCard(),
                faker.finance().iban()
        );

        System.out.println(customer);

        Customer customer2 = new Customer(
                faker.number().numberBetween(1, 4000),
                faker.name().lastName(),
                faker.name().firstName(),
                faker.name().firstName(),
                faker.address().fullAddress(),
                faker.finance().creditCard(),
                faker.finance().iban()
        );

        System.out.println(customer2);
    }
}
