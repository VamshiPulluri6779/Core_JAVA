package Reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {


        Class studentClass = Student.class;
        Method studentMethod = studentClass.getMethod("getName");
        System.out.println("Class Name: " + studentClass.getName());
        System.out.println("Method Name: " + studentMethod.getName());

        System.out.println(studentMethod.invoke(new Student()));
    }
}
