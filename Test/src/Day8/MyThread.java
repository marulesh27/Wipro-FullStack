package Day8;

class MyThread extends Thread {
 public MyThread(String name) {
     super(name); 
 }

 @Override
 public void run() {
     System.out.println("Thread running: " + Thread.currentThread().getName());
 }

 public static void main(String[] args) {
     MyThread thread1 = new MyThread("Scooby");
     MyThread thread2 = new MyThread("Shaggy");

     thread1.start();
     thread2.start();
 }
}

