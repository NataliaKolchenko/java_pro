package example.runRun;

import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {
//        Thread thread = new Thread(new ExampleRunnable());
//        thread.run();

        new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println(i);
            }
        }).start();


    }
}