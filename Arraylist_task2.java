package pratices.index;


	import java.util.ArrayList;

	public class Arraylist_task2 {
	    public static void main(String[] args) {

	      
	        ArrayList<Integer> numbers = new ArrayList<>();

	      
	        numbers.add(1);
	        numbers.add(2);
	        numbers.add(3);
	        numbers.add(4);
	        numbers.add(5);

	        
	        System.out.println("Using for loop:");
	        for (int i = 0; i < numbers.size(); i++) {
	            System.out.println(numbers.get(i));
	        }
	        System.out.println("\n Using enhanced for loop:");
	        for (int num : numbers) {
	            System.out.println(num);
	        }
	    }
	}

