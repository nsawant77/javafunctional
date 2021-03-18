package combinatorpattern;

public class Employee {

    private final String name;
    private final String empId;
    private final Integer salary;


    public Employee(String name, String empId, Integer salary) {
        this.name = name;
        this.empId = empId;
        this.salary = salary;
    }


    public String getName() {
        return name;
    }

    public String getEmpId() {
        return empId;
    }

    public Integer getSalary() {
        return salary;
    }
}
