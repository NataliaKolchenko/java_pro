package example.product;

import example.marketplaces.Store;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class PhysicalProduct extends Product {

    private boolean isPhysicalProduct;
    private Store store;

    public PhysicalProduct(String productTitle, String productDescription, productCountries productCountry,
                           String productSeller, String productBrand, Product.productColor productColor,
                           Product.productSize productSize, String productMaterial, int availableProductQuantity,
                           boolean isPhysicalProduct, Store store) {
        super(productTitle, productDescription, productCountry, productSeller, productBrand, productColor, productSize,
                productMaterial, availableProductQuantity);
        this.isPhysicalProduct = isPhysicalProduct;
        this.store = store;
    }

}
