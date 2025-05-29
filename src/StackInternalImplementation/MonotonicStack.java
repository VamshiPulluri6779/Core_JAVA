package StackInternalImplementation;

import jdk.dynalink.beans.StaticClass;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class MonotonicStack {
    public static void main(String[] args) {

        int[] nums = {3, 1, 4, 1, 5, 9, 2, 6};

        Stack<Integer> ascendingStack = new Stack<>();
        Stack<Integer> descendingStack = new Stack<>();


        // Monotonic ascendingStack - ascending
        for(int i=0;i<nums.length;i++){
            while(!ascendingStack.isEmpty() && ascendingStack.peek()>nums[i]){
                ascendingStack.pop();
            }

            ascendingStack.add(nums[i]);
        }

        System.out.println(ascendingStack);


        for(int i=0;i<nums.length;i++){
            while(!descendingStack.isEmpty() && descendingStack.peek()<nums[i]){
                descendingStack.pop();
            }

            descendingStack.add(nums[i]);
        }

        System.out.println(descendingStack);

    }
}
