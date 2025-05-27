package StackInternalImplementation;

public class Stack {

    int stackSize;
    int[] stack;
    int topIndex;

    Stack(){
        stackSize = 16;
        stack = new int[stackSize];
        topIndex = -1;
    }
    
    Stack(int maxSize){
        stackSize = maxSize;
        stack = new int[maxSize];
        topIndex = -1;
    }

    public void add(int element){
        topIndex++;
        stack[topIndex] = element;
    }

    public void addAtIndex(int index, int element){
        topIndex++;

        if(index == topIndex+1){
            stack[topIndex] = element;
            return;
        }
        for(int i=topIndex+1; i>index; i--){
            stack[i] = stack[i-1];
        }
        stack[index] = element;
    }

    public int pop() throws Exception {
        if(isEmpty()) throw new Exception("Stack Empty");
        return stack[topIndex--];
    }

    public void removeAtIndex(int index){
        if(index == topIndex){
            topIndex--;
            return;
        }
        for(int i=index; i<=topIndex; i++){
            stack[i]=stack[i+1];
        }
        topIndex--;
    }

    public boolean isEmpty(){
        return topIndex == -1;
    }

    public int peek() throws Exception {
        if(isEmpty()) throw new Exception("Stack is Empty");
        return stack[topIndex];
    }

    public boolean isFull(){
        return topIndex == stackSize-1;
    }


    @Override
    public String toString() {
        if (topIndex == -1) {
            return "Stack is empty";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Stack (bottom -> top): ");
        for (int i = 0; i <= topIndex; i++) {
             sb.append(stack[i]);
             if (i < topIndex) sb.append(", ");
        }
        sb.append("\nStack's top is ").append(topIndex);
        return sb.toString();
     }


}
