package functionalinterface;

import org.omg.CosNaming.NamingContextPackage.NotFound;

import java.time.LocalDate;
import java.util.Optional;
import java.util.function.Supplier;

public class _Optional {

    public static void main(String[] args) throws NotFound {


        Employee emp1 = new Employee("Nilesh","IT",30000);
        Employee emp2 = null;

        Supplier<IllegalArgumentException> exception = () -> new IllegalArgumentException();

        Optional.ofNullable(emp2)
                .orElseThrow(exception);

        //LocalDate

    }

    static class Employee {
        private final String name;
        private final String deptName;
        private final Integer salary;

        Employee(String name, String deptName, Integer salary) {
            this.name = name;
            this.deptName = deptName;
            this.salary = salary;
        }
    }
}
