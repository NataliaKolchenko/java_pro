package org.example;

public class Main {
    public static void main(String[] args) {
        Storage storage = new Storage();
        PrintClass printer = new PrintClass(storage);

        Product newItem = new Product("Book", "Good book");
        printer.printMessage(storage.addProduct(newItem));

        Product newItem1 = new Product("Pen", "Rad pen");
        printer.printMessage(storage.addProduct(newItem1));

        Product newItem2 = new Product("Pen", "Rad pen");
        printer.printMessage(storage.addProduct(newItem2));

        Product newItem3 = new Product("Pen", "Rad pen");
        printer.printMessage(storage.addProduct(newItem3));
        System.out.println("-------------------------");
        printer.printProductAll();

//        System.out.println("-------------------------");
//
//        String msg5 = storage.deleteProduct(newItem3.getId());
//        printer.printMessage(msg5);
//
//        printer.printProductAll();
//
//        System.out.println("-------------------------");
//
//        printer.printProductById(newItem1.getId());
//
//        System.out.println("-------------------------");
//
//        printer.printProductByTitle("Pen");

    }
}