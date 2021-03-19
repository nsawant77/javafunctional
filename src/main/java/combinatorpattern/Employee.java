package combinatorpattern;

public class Employee {

    private final String name;
    private final String empId;
    private final Integer salary;
    private final Designation designation;


    public Employee(String name, String empId, Integer salary, Designation designation) {
        this.name = name;
        this.empId = empId;
        this.salary = salary;
        this.designation = designation;
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

    public Designation getDesignation() {
        return designation;
    }

    public enum Designation{
        DEVELOPER,
        TRAINEE;
    }
}

