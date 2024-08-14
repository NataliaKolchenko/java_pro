package example.product;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter

public class Product {
    private UUID id;
    private String productTitle;
    private String productDescription;
    private productCountries productCountry;
    private String productSeller;
    private String productBrand;
    private productColor productColor;
    private productSize productSize;
    private String productMaterial;
    private int availableProductQuantity;

    public Product(String productTitle, String productDescription, productCountries productCountry, String productSeller,
                   String productBrand, Product.productColor productColor, Product.productSize productSize, String productMaterial,
                   int availableProductQuantity) {
        this.id = UUID.randomUUID();
        this.productTitle = productTitle;
        this.productDescription = productDescription;
        this.productCountry = productCountry;
        this.productSeller = productSeller;
        this.productBrand = productBrand;
        this.productColor = productColor;
        this.productSize = productSize;
        this.productMaterial = productMaterial;
        this.availableProductQuantity = availableProductQuantity;
    }

    public enum productCountries {
        GERMANY, ITALY, FRANCE, SPAIN, CHINA, JAPAN, USA, MONTENEGRO, ALBANIA, TURKEY
    }

    public enum productColor {
        RED, BLACK, GREEN, BLUE, WHITE, PINK
    }

    public enum productSize {
        XXS, XS, S, M, L, XL, XXL
    }
}
