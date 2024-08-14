package example.order;

import example.order.Order;

public interface OrderInterface {
    public Order createOrder();

    public Order getOrderInformation();

    public Order updateOrder();

    public boolean deleteOrder();
}
