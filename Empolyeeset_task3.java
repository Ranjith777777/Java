package pratices.index;
	import java.util.HashSet;
	import java.util.Set;

	public class Empolyeeset_task3 {
	    public static void main(String[] args) {
	        Set<Integer> empIds = new HashSet<>();
	        empIds.add(101);
	        empIds.add(102);
	        empIds.add(103);
	        empIds.add(101);
	        empIds.add(104);
	        System.out.println("Employee IDs in the Set:");
	        for (Integer id : empIds) {
	            System.out.println(id);
	        }
	    }
	}


