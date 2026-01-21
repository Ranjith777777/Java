package pratices.index;

import java.util.Scanner;

class ArrayQueue {
    int queue[];
    int front, rear, size;

   
    ArrayQueue(int size) {
        this.size = size;
        queue = new int[size];
        front = 0;
        rear = -1;
    }

  
    boolean isFull() {
        return rear == size - 1;
    }


    boolean isEmpty() {
        return front > rear;
    }

   
    void enqueue(int data) {
        if (isFull()) {
            System.out.println("Queue is Full");
        } else {
            rear++;
            queue[rear] = data;
            System.out.println(data + " inserted");
        }
    }

  
    void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
        } else {
            System.out.println(queue[front] + " removed");
            front++;
        }
    }

   
    void peek() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
        } else {
            System.out.println("Front element: " + queue[front]);
        }
    }

  
    void display() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
        } else {
            System.out.print("Queue elements: ");
            for (int i = front; i <= rear; i++) {
                System.out.print(queue[i] + " ");
            }
            System.out.println();
        }
    }
}

public class QueueUsingArray_task2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayQueue q = new ArrayQueue(5);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        q.display();

        q.dequeue();
        q.peek();

        q.display();
    }
}
