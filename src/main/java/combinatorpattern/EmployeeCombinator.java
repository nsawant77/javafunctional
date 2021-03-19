package combinatorpattern;

import java.util.function.Function;

interface EmployeeCombinator extends Function<Employee, Integer> {

    static EmployeeCombinator getSalary(){
        return emp -> emp != null && emp.getName().startsWith("N") && emp.getDesignation().name().equals("DEVELOPER") ? 140000 : 60000;
    }
}


