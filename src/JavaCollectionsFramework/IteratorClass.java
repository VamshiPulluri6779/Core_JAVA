package JavaCollectionsFramework;

import java.util.*;

public class IteratorClass {
    public static void main(String[] args) {

        List<Integer> numbersList = new ArrayList<>();
        numbersList.add(1);
        numbersList.add(2);
        numbersList.add(3);
        numbersList.add(4);

        Iterator<Integer> iterator = numbersList.iterator();

        while(iterator.hasNext()){

            int val = iterator.next();
            if(val == 3){
                iterator.remove();
            }
            System.out.println(val);

        }

        for(int val : numbersList){
            System.out.println(val);
        }

        numbersList.forEach((val) -> System.out.println(val));
    }
}
