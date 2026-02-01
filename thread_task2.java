package pratices.index;

class ChildThread extends Thread {
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Child Thread: " + i);

               
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Child thread interrupted");
        }
    }
}

public class thread_task2 {
    public static void main(String[] args) {
        ChildThread t = new ChildThread();
        t.start();   
    }
}
