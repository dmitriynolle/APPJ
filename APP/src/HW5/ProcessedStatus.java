package HW5;

public class ProcessedStatus extends Status{
    ProcessedStatus(OrderStatus orderStatus) {
        super(orderStatus);
    }

    @Override
    public String established() {
        return "Недоступно";
    }

    @Override
    public String processed() {
        orderStatus.changeStatus(new DeliveryStatus(orderStatus));
        return "Обработка";
    }

    @Override
    public String delivery() {
        return "Недоступно";
    }

    @Override
    public String locking() {
        orderStatus.changeStatus(new LockingStatus(orderStatus));
        return "Заблокировано";    }
}
