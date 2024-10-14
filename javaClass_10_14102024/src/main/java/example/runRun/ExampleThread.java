package example.runRun;

public class ExampleThread extends Thread {
    public ExampleThread(Runnable target) {
        super(target);
    }

    public static void main(String[] args) {
        ExampleThread ex = new ExampleThread(new ExampleRunnable());

        ex.run();

    }
}
