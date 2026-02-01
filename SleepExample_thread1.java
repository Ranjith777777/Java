package pratices.index;

public class SleepExample_thread1 {
	
	    public static void main(String[] args) {
	        try {
	            System.out.println("Main thread is going to sleep...");

	          
	            Thread.sleep(3000);

	            System.out.println("Main thread woke up after 3 seconds!");
	        } catch (InterruptedException e) {
	            System.out.println("Thread was interrupted");
	        }
	    }
	}


