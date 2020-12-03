package HW5;

public class EstablishedStatus extends Status{

    EstablishedStatus(OrderStatus orderStatus) {
        super(orderStatus);
    }

    @Override
    public String established() {
        orderStatus.changeStatus(new ProcessedStatus(orderStatus));
        return "Принят";
    }

    @Override
    public String processed() {
        return "Недоступно";
    }

    @Override
    public String delivery() {
        return "Недоступно";
    }

    @Override
    public String locking() {
        orderStatus.changeStatus(new LockingStatus(orderStatus));
        return "Заблокировано";
    }
}
