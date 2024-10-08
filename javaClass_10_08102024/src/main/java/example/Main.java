package example;

//Задача "Производитель-потребитель": Реализуйте классическую задачу производителя-потребителя.
// Создайте класс Buffer с методами put() и get().
// Производитель должен генерировать числа и помещать их в буфер, а потребитель - забирать эти числа из буфера.
// Используйте wait() и notify() для синхронизации потоков.

public class Main {
    public static void main(String[] args) {
        Buffer buffer = new Buffer();
        Consumer consumer = new Consumer(buffer);
        Producer producer = new Producer(buffer);

        Thread threadConsumer1 = new Thread(consumer);
        Thread threadConsumer2 = new Thread(consumer);
        Thread threadConsumer3 = new Thread(consumer);


        Thread threadProducer = new Thread(producer);

        threadProducer.start();
        threadConsumer1.start();
        threadConsumer2.start();
        threadConsumer3.start();

    }
}