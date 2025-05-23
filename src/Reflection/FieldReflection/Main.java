package Reflection.FieldReflection;

import java.lang.reflect.Field;

/*
    Reflection has no boundaries, it violates the encapsulation principle of OOP.
    It allows you to access private fields and methods of a class.
 */
public class Main {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, NoSuchFieldException {

        Class employeeClass = Employee.class;

        // getDeclaredFields get both public and private fields in Employee class
        Field[] fields = employeeClass.getDeclaredFields();

        for(Field field : fields){
            System.out.println("Field Name: " + field.getName());
        }

        Employee employee = new Employee();

        // same below won't work for private fields
        Field field = employeeClass.getField("name");
        field.set(employee, "John Doe");
        Field field1 = employeeClass.getField("address");
        field1.set(employee, "123 Main St");

        // We can access and set private field like below
        Field field2 = employeeClass.getDeclaredField("empID");
        field2.setAccessible(true); // set accessible to true to access private field
        field2.set(employee, 101);

        employee.printEmployee(employee);
    }
}
