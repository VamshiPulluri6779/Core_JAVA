package Reflection.FieldReflection;

public class Employee {

    private int empID;
    public String name;
    public String address;

    public Employee() {}

    public Employee(int empID, String name, String address) {
        this.empID = empID;
        this.name = name;
        this.address = address;
    }

    public void printEmployee(Employee employee){
        System.out.println("Employee ID: " + employee.empID);
        System.out.println("Employee Name: " + employee.name);
        System.out.println("Employee Address: " + employee.address);
    }
}
