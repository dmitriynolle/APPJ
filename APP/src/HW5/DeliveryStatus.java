package HW5;

public class DeliveryStatus extends Status{

    DeliveryStatus(OrderStatus orderStatus) {
        super(orderStatus);
    }

    @Override
    public String established() {
        return "Недоступно";
    }

    @Override
    public String processed() {
        return "Недоступно";
    }

    @Override
    public String delivery() {
        orderStatus.changeStatus(new ProcessedStatus(orderStatus));
        return "Доставка";
    }

    @Override
    public String locking() {
        orderStatus.changeStatus(new LockingStatus(orderStatus));
        return "Заблокировано";
    }
}
