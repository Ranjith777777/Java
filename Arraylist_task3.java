package pratices.index;
import java.util.ArrayList;
public class Arraylist_task3 {
	    public static void main(String[] args) {

	      
	        ArrayList<Integer> numbers = new ArrayList<>();

	     
	        numbers.add(1);
	        numbers.add(2);
	        numbers.add(3);
	        numbers.add(4);
	        numbers.add(50);

	       
	        int sum = 0;
	        for (int num : numbers) {
	            sum = sum + num;
	        }

	      
	        System.out.println("Sum of all elements: " + sum);
	    }
	
}
