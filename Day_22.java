import java.util.EmptyStackException;
class Stack {
    private int maxSize;        
    private int[] stackArray;   
    private int top;            
    public Stack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;   // Stack is initially empty
    }
    public void push(int value) {
        if (isFull()) {
            throw new StackOverflowError("Stack is full. Cannot push element.");
        }
        stackArray[++top] = value;
    }
    public int pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stackArray[top--];
    }
      public int peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stackArray[top];
    }
    public boolean isEmpty() {
        return (top == -1);
    }
    public boolean isFull() {
        return (top == maxSize - 1);
    }
}
public class Day_22 {
    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Top element after pushes: " + stack.peek());
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Top element after pops: " + stack.peek());
        stack.push(40);
        stack.push(50);
        stack.push(60); 
        System.out.println("Is stack empty? " + stack.isEmpty());
    }
}