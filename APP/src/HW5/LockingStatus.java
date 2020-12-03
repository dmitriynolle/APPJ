package HW5;

public class LockingStatus extends Status{
    LockingStatus(OrderStatus orderStatus) {
        super(orderStatus);
    }

    @Override
    public String established() {
        orderStatus.changeStatus(new ProcessedStatus(orderStatus));
        return "Принят";
    }

    @Override
    public String processed() {
        orderStatus.changeStatus(new DeliveryStatus(orderStatus));
        return "Обработка";
    }

    @Override
    public String delivery() {
        orderStatus.changeStatus(new DeliveryStatus(orderStatus));
        return "Доставка";    }

    @Override
    public String locking() {
        return null;
    }
}
