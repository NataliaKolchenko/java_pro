package example;

import java.util.Random;

public class Producer implements Runnable {
    private Buffer buffer;

    public Producer(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        Random random = new Random();
        while (true) {

            synchronized (buffer) {
                for (int i = 0; i < 100; i++) {
                    int number = random.nextInt(100);
                    buffer.put(number);
                    System.out.println("put " + number);
                }
                buffer.notifyAll();
                System.out.println();
                try {
                    buffer.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            sleep(1000);
        }

    }

    private static void sleep(int time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


}
