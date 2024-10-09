package example.bankAccount;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        BankAccount bankAccount = new BankAccount(0);
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    bankAccount.put(10);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });


        thread1.start();


        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    bankAccount.put(10);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });


        thread2.start();

//        thread1.join();
//        thread2.join();
        while (true) {
            Thread.sleep(500);
            System.out.println(bankAccount.getBalance());
        }


    }
}