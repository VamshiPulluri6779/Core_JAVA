package StackInternalImplementation;

public class Main {
    public static void main(String[] args) throws Exception{

        Stack stack = new Stack();

        stack.add(1);
        stack.add(2);
        stack.add(3);

        System.out.println(stack);

        stack.addAtIndex(3,4);
        stack.addAtIndex(2, -1);

        System.out.println(stack);

        System.out.println("Popped element from top is " + stack.pop());
        System.out.println("Popped element from top is " + stack.pop());

        System.out.println(stack);

        stack.add(7);
        stack.add(8);
        stack.add(9);
        System.out.println(stack.peek());

        System.out.println(stack);

        stack.removeAtIndex(4);
        stack.removeAtIndex(2);

        System.out.println(stack);

        stack.pop();stack.pop();
        stack.pop();stack.pop();

        System.out.println(stack);

        System.out.println("Is stack empty "+stack.isEmpty());
        stack.add(7);
        stack.add(8);
        stack.add(9);
        stack.add(7);
        stack.add(8);
        stack.add(9);
        stack.add(7);
        stack.add(8);
        stack.add(9);
        stack.add(7);
        stack.add(8);
        stack.add(9);
        stack.add(7);
        stack.add(8);
        stack.add(9);
        stack.add(7);

        System.out.println("Is stack full "+stack.isFull());
    }
}
