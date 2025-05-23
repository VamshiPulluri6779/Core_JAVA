package Reflection.ConstructorReflection;


import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/*
    * One of most powerful features of java is singleton, but because of constructor reflection
    * we can create multiple instances of singleton class too.
 */
public class Main {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {

        Class studentClass = Student.class;
        Constructor constructor = studentClass.getDeclaredConstructor();

        constructor.setAccessible(true); // set accessible to true to access private constructor

        Student student1 = (Student) constructor.newInstance();
        System.out.println(student1.getStudent());

    }
}
