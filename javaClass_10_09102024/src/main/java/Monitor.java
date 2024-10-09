import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Random;

public class Monitor implements Runnable {
    private Queue<String> strings;
    private FileCustomerWriter fileCustomerWriter;

    public Monitor(Queue<String> strings, FileCustomerWriter fileCustomerWriter) {
        this.strings = strings;
        this.fileCustomerWriter = fileCustomerWriter;
    }

    @Override
    public void run() {
        int count = 1;
        while (true) {
            sleep();
            if (strings.size() >= 10) {
                List<String> words = new ArrayList<>();
                synchronized (strings) {
                    while (!strings.isEmpty()) {
                        words.add(strings.poll());
                    }
                }
                fileCustomerWriter.create("File" + count++, words);
            }
        }
    }

    private static void sleep() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
