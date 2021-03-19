package combinatorpattern;

public class EmployeeMain {
    public static void main(String[] args) {
        //System.out.println(EmployeeCombinator.getSalary().apply(new Employee("Nilesh","70016",25000)));
        System.out.println(EmployeeCombinator.getSalary().apply(new Employee("Nilesh","70016",51000, Employee.Designation.DEVELOPER)));
    }
}
