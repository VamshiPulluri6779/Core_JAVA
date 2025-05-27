package StackInternalImplementation;

import java.util.Stack;

public class ReverseStringUsingStack {

    public static void main(String[] args) {

        String string = "hello";
        Stack<Character> stack = new Stack<>();

        for(char ch : string.toCharArray()){
            stack.add(ch);
        }

        StringBuilder rString = new StringBuilder();

        while(!stack.isEmpty()){
            rString.append(stack.pop());
        }

        System.out.println("Reversed string is "+ rString);

    }
}
