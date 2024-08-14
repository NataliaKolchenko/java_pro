package example.order;

public class OrderDaoImp implements OrderInterface {
    @Override
    public Order createOrder() {
        //запись в БД
        return null;
    }

    @Override
    public Order getOrderInformation() {
        //запрос данных из БД
        return null;
    }

    @Override
    public Order updateOrder() {
        //обновление данных в БД
        return null;
    }

    @Override
    public boolean deleteOrder() {
        //удаление записи из БД
        return false;
    }
}
