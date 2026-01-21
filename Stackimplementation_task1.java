package pratices.index;
import java.util.Scanner;
class Stack {
    int top;
    int maxSize;
    int[] stackArray;

   
    Stack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

  
    void push(int value) {
        if (top == maxSize - 1) {
            System.out.println("Stack Overflow! Cannot push " + value);
        } else {
            stackArray[++top] = value;
            System.out.println(value + " pushed into stack");
        }
    }

    
    void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow! Stack is empty");
        } else {
            System.out.println(stackArray[top--] + " popped from stack");
        }
    }


    void peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Top element is: " + stackArray[top]);
        }
    }
}

public class Stackimplementation_task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter stack size: ");
        int size = sc.nextInt();

        Stack stack = new Stack(size);

        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.peek();
        stack.pop();
        stack.peek();
    }

}
