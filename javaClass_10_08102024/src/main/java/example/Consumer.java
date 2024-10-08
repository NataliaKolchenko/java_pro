package example;

public class Consumer implements Runnable {
    private Buffer buffer;

    public Consumer(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        sleep();
        while (true) {
            synchronized (buffer) {
                if (!buffer.isEmptyQueue()) {
                    int number = buffer.get();
                    System.out.println("thread name is " + Thread.currentThread().getName() +
                            " get " + number);
                } else {
                    buffer.notify();
                    try {
                        buffer.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }

            }

        }
    }

    private static void sleep() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
