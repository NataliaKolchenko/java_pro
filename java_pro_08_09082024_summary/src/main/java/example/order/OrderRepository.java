package example.order;

import example.product.Product;

import java.util.List;
import java.util.UUID;

public class OrderRepository {
    private OrderDaoImp daoImp;

    public OrderRepository(OrderDaoImp daoImp) {
        this.daoImp = daoImp;
    }

    public Order addOrder(Order order) {
        return null;
    }

    public Order getOrderById(int id) {
        return null;
    }

    public List<Order> getAllOrders() {
        return null;
    }

    public Order updateOrder(int existId, Order newOrder) {
        return null;
    }

    public boolean deleteOrder(int id) {
        return false;
    }
}
