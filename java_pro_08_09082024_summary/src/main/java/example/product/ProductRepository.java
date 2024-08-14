package example.product;

import java.util.List;
import java.util.UUID;

public class ProductRepository {
    ProductDaoImp daoImp;

    public ProductRepository(ProductDaoImp daoImp) {
        this.daoImp = daoImp;
    }

    public Product addProduct(Product product) {
        return null;
    }

    public Product getProductById(UUID id) {
        return null;
    }

    public Product getProductByTitle(String productTitle) {
        return null;
    }

    public Product getProductByBrand(String productBrand) {
        return null;
    }

    public Product getProductByColor(Product.productColor productColor) {
        return null;
    }

    public List<Product> getAllProducts() {
        return null;
    }

    public Product updateProduct(UUID existId, Product newProduct) {
        return null;
    }

    public boolean deleteProductById(UUID id) {
        return false;
    }
}
