package example;

public class Shop {
    private int itemCount = 0;
    private int moveItemCount = 0;
    private int logisticCount = 0;


    public synchronized void putItem() throws InterruptedException {
        while (itemCount >= 5 || moveItemCount >= 5) {
            wait();
        }
        itemCount++;
        System.out.println("PUT ITEM + itemCount = " + itemCount + " moveItemCount = " + moveItemCount + " logisticCount " + logisticCount);
        notify();
    }

    public synchronized void moveItem() throws InterruptedException {
        while (itemCount <= 0) {
            wait();
        }

        itemCount--;
        moveItemCount++;

        System.out.println("MOVE ITEM + itemCount = " + itemCount + " moveItemCount = " + moveItemCount + " logisticCount " + logisticCount);
        notify();
    }

    public synchronized void logisticItem() throws InterruptedException {
        while (moveItemCount <= 0) {
            wait();
        }
        moveItemCount--;
        logisticCount++;
        System.out.println("LOGISTIC ITEM + moveItemCount = " + itemCount + " moveItemCount = " + moveItemCount + " logisticCount " + logisticCount);
        notify();
    }

    public synchronized void getItem() throws InterruptedException {
        while (logisticCount <= 0) {
            wait();
        }
        logisticCount--;
        System.out.println("GET ITEM + itemCount = " + itemCount + " moveItemCount = " + moveItemCount + " logisticCount " + logisticCount);
        notify();
    }

    public static void main(String[] args) {
        Shop shop = new Shop();

        Producer producer = new Producer(shop);
        Consumer consumer = new Consumer(shop);
        Mover mover = new Mover(shop);
        Logistic logistic = new Logistic(shop);


        Thread pT = new Thread(producer);
        Thread mT = new Thread(mover);
        Thread cT = new Thread(consumer);
        Thread lT = new Thread(logistic);


        cT.start();
        pT.start();
        mT.start();
        lT.start();
    }
}

class Producer implements Runnable {
    Shop shop;

    public Producer(Shop shop) {
        this.shop = shop;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            try {
                shop.putItem();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class Consumer implements Runnable {
    Shop shop;

    public Consumer(Shop shop) {
        this.shop = shop;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            try {
                shop.getItem();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class Mover implements Runnable {
    Shop shop;

    public Mover(Shop shop) {
        this.shop = shop;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            try {
                shop.moveItem();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class Logistic implements Runnable {
    Shop shop;

    public Logistic(Shop shop) {
        this.shop = shop;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            try {
                shop.logisticItem();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

