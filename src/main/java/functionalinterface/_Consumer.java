package functionalinterface;

import java.util.function.Consumer;


public class _Consumer {

    //Consumer takes 1 arg but does not return anything
    public static void main(String[] args) {

        //traditional way
        greetMessage(new Customer("Nilesh", "+91-9769161011"));

        //using Consumer functional interface
        greetCustomerConsumer.accept(new Customer("Josh","1234567890"));
    }


    static void greetMessage(Customer customer){
        System.out.println("Hello "+customer.Name+". Thank you for your registration with phone no "+customer.phoneNumber);
    }

    static Consumer<Customer> greetCustomerConsumer = customer
            -> System.out.println("Hello "+customer.Name+". Thank you for your registration with phone no "+customer.phoneNumber);

    static class Customer {
        private final String Name;
        private final String phoneNumber;


        Customer(String name, String phoneNumber) {
            this.Name = name;
            this.phoneNumber = phoneNumber;
        }
    }

}
