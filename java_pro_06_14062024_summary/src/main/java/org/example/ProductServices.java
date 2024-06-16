package org.example;

import java.util.UUID;

public interface ProductServices {

    String addProduct(Product product);

    Product findProduct(UUID productId);
    String deleteProduct(UUID productId);
}
