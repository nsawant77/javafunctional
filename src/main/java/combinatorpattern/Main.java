package combinatorpattern;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        //Traditional way
        Customer customer = new Customer("Nilesh",LocalDate.of(2005, 10, 04));
        //System.out.println(CustomerValidatorService.isCustomerValid(customer));

        //Using combinator pattern
        System.out.println(CustomerValidatorCombinator.isValidName().apply(customer));
        System.out.println(CustomerValidatorCombinator.isAdult().apply(customer));
    }
}
