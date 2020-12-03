package HW5;

public abstract class Status {
    OrderStatus orderStatus;

    Status(OrderStatus orderStatus){
        this.orderStatus = orderStatus;
    }

    public abstract String established();
    public abstract String processed();
    public abstract String delivery();
    public abstract String locking();
}
