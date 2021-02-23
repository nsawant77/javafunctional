package functionalinterface;

import java.util.function.BiConsumer;

public class _BiConsumer {

    public static void main(String[] args) {

        //using Consumer functional interface
        //BiConsumer takes 2 arg but does not return anything
        greetCustomerConsumer.accept(new Customer("Nilesh","9769161011"),true);
        greetCustomerConsumer.accept(new Customer("Josh","1234567890"),false);

    }

    static class Customer {
        private final String name;
        private final String phoneNumber;

        Customer(String name, String phoneNumber) {
            this.name = name;
            this.phoneNumber = phoneNumber;
        }
    }

    static BiConsumer<Customer, Boolean> greetCustomerConsumer =
            (customer, showPhoneNum)
            -> System.out.println("Hello "+customer.name+". Thank you for your registration with phone no "+(showPhoneNum ? customer.phoneNumber: "NA"));
}
