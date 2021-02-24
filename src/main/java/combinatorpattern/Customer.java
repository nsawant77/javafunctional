package combinatorpattern;

import java.time.LocalDate;

public class Customer {

    private final String name;
    private final LocalDate dob;

    public Customer(String name, LocalDate dob) {
        this.name = name;
        this.dob = dob;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDob() {
        return dob;
    }
}
