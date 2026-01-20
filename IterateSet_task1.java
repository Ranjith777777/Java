package pratices.index;
	import java.util.HashSet;
	import java.util.Iterator;
	import java.util.Set;
	public class IterateSet_task1{
	    public static void main(String[] args) {
	        Set<Integer> numbers = new HashSet<>();
	        numbers.add(5);
	        numbers.add(10);
	        numbers.add(15);
	        numbers.add(40);
	        numbers.add(50);
	        Iterator<Integer> it = numbers.iterator();
	        System.out.println("Elements in the Set:");
	        while (it.hasNext()) {
	            System.out.println(it.next());
	        }
	    }
	}


