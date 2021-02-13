public class Main2 {
    private static final int a = 10;

    public static void main(String[] args) {
        int b = 5;
        final int c = 1;
        new Thread(new Runnable() {
            public void run() {
                //<...>
                int x = a;
            }
        }).start();
        b++;
    }
}
