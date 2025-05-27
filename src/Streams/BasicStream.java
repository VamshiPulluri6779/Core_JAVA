package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class BasicStream {
    public static void main(String[] args) {

        List<Integer> salaryList = new ArrayList<>();

        salaryList.add(10000);
        salaryList.add(15000);
        salaryList.add(8000);
        salaryList.add(9500);
        salaryList.add(13000);

        // Count of salaries greater than 10000
        long salaryCount = salaryList.stream().filter((val) -> val >= 10000).count();

        List<Double> incrementedSalaries = salaryList.stream().map((val) -> val + 0.1 * val).toList();

        List<Integer> secondSalaryList = new ArrayList<>();
        secondSalaryList.add(20000);
        secondSalaryList.add(25000);
        secondSalaryList.add(34000);
        secondSalaryList.add(19000);
        secondSalaryList.add(33000);

        List<List<Integer>> listOfLists = new ArrayList<>();

        listOfLists.add(salaryList);
        listOfLists.add(secondSalaryList);

        // incremented salaries of both lists
        // For sorted, we can pass Comparator for getting descending order
        List<Integer> flattendList = listOfLists.stream().flatMap((list) -> list.stream().map((val) -> val+1000)).sorted().toList();

        List<String> integers = Arrays.asList("1","2","3","4");
        int[] numbersArray = integers.stream().mapToInt(Integer::parseInt).toArray();

        System.out.println(flattendList);
        System.out.println("Salaries greater than 10000 are "+ salaryCount);
    }
}
