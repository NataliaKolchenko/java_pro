package org.example;

import java.util.UUID;

public interface WarehousePrintable {

    void printProductById(UUID id);
    void printProductAll();
    void printProductByTitle(String title);
}
