package org.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.UUID;

public class Storage implements ProductServices{

    ArrayList<Product> allProductList = new ArrayList<>();
    HashSet <UUID> uniqueProductSet = new HashSet<>();

    
    @Override
    public String addProduct(Product product) {

        for (int i = 0; i <= allProductList.size(); i++) {

                if (i == 0) {
                    allProductList.add(product);
                    uniqueProductSet.add(product.getId());
                return "all - OK: Product has added";
                } else {
                    if ( (product.getId() == allProductList.get(i-1).getId())) {
                        return "all  - Fail";
                    } else {
                        allProductList.add(product);
                        if (!uniqueProductSet.contains(product)) {
                            uniqueProductSet.add(product.getId());
                            return "all &  unique: OK. Product has added";
                        }
                    }
                }
            }


        return "something";
    }

    @Override
    public Product findProduct(UUID productId) {
        for (int i = 0; i < allProductList.size(); i++){
            if (allProductList.get(i).getId() == productId) {
                return allProductList.get(i);
            }
        }

        return null;
    }

    @Override
    public String deleteProduct(UUID productId) {
        for (int i = 0; i < allProductList.size(); i++) {
            if (allProductList.get(i).getId() == productId) {
                allProductList.remove(i);
                return "Ok: Product has been successfully deleted";
            }
        }
        return "Fail: product wasn't deleted";
    }

}
