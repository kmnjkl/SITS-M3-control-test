public class TestThread extends Thread {
    /*.....*/
    String message = "1";

    public void run() {
        while (true) {
            try {
                wait();
                System.out.println(message);
                notify();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
