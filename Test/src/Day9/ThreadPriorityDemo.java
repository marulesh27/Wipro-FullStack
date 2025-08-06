package Day9;
class PriorityThread extends Thread {
    public PriorityThread(String name) {
        super(name);
    }

    public void run() {
        System.out.println(getName() + " with priority " + getPriority() + " is running.");
    }
}

public class ThreadPriorityDemo {
    public static void main(String[] args) {
        PriorityThread t1 = new PriorityThread("Thread-A");
        PriorityThread t2 = new PriorityThread("Thread-B");
        PriorityThread t3 = new PriorityThread("Thread-C");

        t1.setPriority(9);
        t2.setPriority(2);
        t3.setPriority(7);

        t1.start();
        t2.start();
        t3.start();
    }
}
