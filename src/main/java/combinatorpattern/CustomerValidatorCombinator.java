package combinatorpattern;

import java.time.LocalDate;
import java.time.Period;
import java.util.function.Function;

public interface CustomerValidatorCombinator extends Function <Customer, CustomerValidatorCombinator.ValidatorResult> {

    static CustomerValidatorCombinator isValidName() {
        return customer -> customer != null && !customer.getName().isEmpty() ? ValidatorResult.VALID_NAME : ValidatorResult.INVALID_NAME;
    }

    static CustomerValidatorCombinator isAdult () {
        return customer -> Period.between(customer.getDob(), LocalDate.now()).getYears() > 16 ? ValidatorResult.AN_ADULT : ValidatorResult.NOT_AN_ADULT;
    }

    enum ValidatorResult {
        VALID_NAME, INVALID_NAME,
        NOT_AN_ADULT, AN_ADULT;
    }
}
