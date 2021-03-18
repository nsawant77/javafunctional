package combinatorpattern;

import java.util.function.Function;

interface EmployeeCombinator extends Function<Employee, Integer> {

    static EmployeeCombinator getSalary(){
        return emp -> emp != null && emp.getName().startsWith("Nil") ? 40000 : 60000;
    }

    /*public enum Designation{
        DEVELOPER,
        TRAINEE;
    }*/
}


