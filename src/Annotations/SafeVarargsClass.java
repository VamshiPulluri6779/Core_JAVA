package Annotations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SafeVarargsClass {

    @SafeVarargs  // This will ignore the heap pollution warning
    public static void myMethod(List<Integer>... lists){

        Object[] list = lists;

        List<String> newList = new ArrayList<>();
        newList.add("Hello");

        list[0] = newList;
    }

    public static void main(String[] args) {
        SafeVarargsClass.myMethod(Arrays.asList(1,2,3));
    }
}
