package pratices.index;
import java.util.Deque;
import java.util.ArrayDeque;

public class dequeue_task3 {
    public static void main(String[] args) {

       
        Deque<Integer> deque = new ArrayDeque<>();

       
        deque.addFirst(10);
        deque.addFirst(20);

       
        deque.addLast(30);
        deque.addLast(40);

        
        System.out.println("Deque elements: " + deque);
    }
}

