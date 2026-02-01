package pratices.index;

class SleepSynchronizedExample implements Runnable {

    public void run() {
        synchronized (this) {
            try {
                System.out.println(Thread.currentThread().getName()
                        + " entered synchronized block");

              
                Thread.sleep(2000);

                System.out.println(Thread.currentThread().getName()
                        + " exiting synchronized block");

            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }
    }
}

public class thread_task3 {
    public static void main(String[] args) {

        SleepSynchronizedExample obj = new SleepSynchronizedExample();

        Thread t1 = new Thread(obj, "Thread-1");
        Thread t2 = new Thread(obj, "Thread-2");

        t1.start();
        t2.start();
    }
}
