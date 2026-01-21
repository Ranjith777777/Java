package pratices.index;
	import java.util.Deque;
	import java.util.ArrayDeque;

	public class DequeRemoveExample_task4 {
	    public static void main(String[] args) {

	        
	        Deque<Integer> deque = new ArrayDeque<>();

	       
	        deque.add(10);
	        deque.add(20);
	        deque.add(30);
	        deque.add(40);

	        System.out.println("Original Deque: " + deque);

	       
	        int frontElement = deque.removeFirst();
	        System.out.println("Removed from front: " + frontElement);

	        int rearElement = deque.removeLast();
	        System.out.println("Removed from rear: " + rearElement);

	        
	        System.out.println("Deque after removal: " + deque);
	    }
	}


