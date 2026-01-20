package pratices.index;
	import java.util.LinkedList;
	public class InsertLinkedList_task2{
	    public static void main(String[] args) {
	        LinkedList<Integer> list = new LinkedList<>();
	        list.add(2);
	        list.add(3);
	        list.add(4);

	        System.out.println("Original LinkedList: " + list);
	        list.addFirst(1);
	        list.addLast(5);
	     
	        System.out.println("LinkedList after insertion: " + list);
	    }
	}


