package Day9;
class NumberPrinter extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            if (i == 5) {
                try {
                	System.out.println("Delayed for five seconds");
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        NumberPrinter t = new NumberPrinter();
        t.start();
    }
}
