package combinatorpattern;

import java.time.LocalDate;
import java.time.Period;

public class CustomerValidatorService {

    private static boolean isValidName (String name) {
        return name != null && !name.isEmpty();
    }

    private static boolean isAdult(LocalDate dob){
        return Period.between(dob, LocalDate.now()).getYears() > 18;
    }

    public static boolean isCustomerValid(Customer customer){
        return  isValidName(customer.getName()) && isAdult(customer.getDob());
    }
}
