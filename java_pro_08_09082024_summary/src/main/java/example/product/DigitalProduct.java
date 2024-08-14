package example.product;

import example.marketplaces.Warehouse;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class DigitalProduct extends Product {
    private boolean isDigitalProduct;
    private Warehouse warehouse;

    private productCountries deliveryCountries;

    public DigitalProduct(String productTitle, String productDescription, productCountries productCountry,
                          String productSeller, String productBrand, Product.productColor productColor,
                          Product.productSize productSize, String productMaterial, int availableProductQuantity,
                          boolean isDigitalProduct, Warehouse warehouse, productCountries deliveryCountries) {
        super(productTitle, productDescription, productCountry, productSeller, productBrand, productColor, productSize,
                productMaterial, availableProductQuantity);
        this.isDigitalProduct = isDigitalProduct;
        this.warehouse = warehouse;
        this.deliveryCountries = deliveryCountries;
    }
}
