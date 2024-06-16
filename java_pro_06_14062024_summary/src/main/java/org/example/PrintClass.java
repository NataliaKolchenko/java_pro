package org.example;

import java.util.UUID;

public class PrintClass implements WarehousePrintable {

    Storage storage;

    public PrintClass(Storage storage) {
        this.storage = storage;
    }

    public void printMessage(String output) {
        System.out.println(output);
    }

    @Override
    public void printProductById(UUID productId) {
        for (int i = 0; i < storage.allProductList.size(); i++) {
            if (storage.allProductList.get(i).getId() == productId) {
                System.out.println(storage.allProductList.get(i));
                break;
            }

        }

    }

    @Override
    public void printProductAll() {
        System.out.println("AlL products: ");
        for (int i = 0; i < storage.allProductList.size(); i++) {
            System.out.println(storage.allProductList.get(i));
        }
            System.out.println(storage.uniqueProductSet);



    }

    @Override
    public void printProductByTitle(String titleProduct) {
        for (int i = 0; i < storage.allProductList.size(); i++) {
            if (storage.allProductList.get(i).getTitle().equals(titleProduct)) {
                System.out.println(storage.allProductList.get(i));
            }
        }
    }


}
