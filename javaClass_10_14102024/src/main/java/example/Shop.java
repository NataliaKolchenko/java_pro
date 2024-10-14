package example;

public class Shop {
    private int itemCount = 0;
    private int moveItemCount = 0;

    public synchronized void getItem() throws InterruptedException {
        while (moveItemCount <= 0) {
            wait();
        }
        moveItemCount--;
        System.out.println("GET ITEM + itemCount = " + itemCount + " moveItemCount = " + moveItemCount);
        notify();
    }

    public synchronized void putItem() throws InterruptedException {
        while (itemCount >= 5 || moveItemCount >= 5) {
            wait();
        }
        itemCount++;
        System.out.println("PUT ITEM + itemCount = " + itemCount + " moveItemCount = " + moveItemCount);
        notify();
    }

    public synchronized void moveItem() throws InterruptedException {
        while (itemCount <= 0) {
            wait();
        }

        itemCount--;
        moveItemCount++;

        System.out.println("MOVE ITEM + itemCount = " + itemCount + " moveItemCount = " + moveItemCount);
        notify();
    }

    public static void main(String[] args) {
        Shop shop = new Shop();

        Producer producer = new Producer(shop);
        Consumer consumer = new Consumer(shop);
        Mover mover = new Mover(shop);


        Thread pT = new Thread(producer);
        Thread mT = new Thread(mover);
        Thread cT = new Thread(consumer);

        cT.start();
        pT.start();
        mT.start();
    }
}

class Producer implements Runnable {
    Shop shop;

    public Producer(Shop shop) {
        this.shop = shop;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
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
        for (int i = 0; i < 10; i++) {
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
        for (int i = 0; i < 10; i++) {
            try {
                shop.moveItem();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

