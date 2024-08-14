package example.order;

import example.product.Product;
import lombok.Getter;
import lombok.Setter;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter

public class Order {
    private int orderNumber = 1;
    private LocalDateTime orderDate;
    private double amount;
    private String customerName;
    private String deliveryAddress;
    private orderStatus orderStatus;
    private LocalDateTime dateDelivery;
    private List<Product> productList;

    public Order(double amount, String customerName, String deliveryAddress,
                 Order.orderStatus orderStatus, LocalDateTime dateDelivery, List<Product> productList) {
        this.orderNumber++;
        this.orderDate = LocalDateTime.now();
        this.amount = amount;
        this.customerName = customerName;
        this.deliveryAddress = deliveryAddress;
        this.orderStatus = orderStatus;
        this.dateDelivery = dateDelivery;
        this.productList = productList;
    }


    public enum orderStatus {
        NEW, IN_PROGRESS, IN_DELIVERY, DELIVERED, CLOSED
    }
}
