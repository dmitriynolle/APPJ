package HW5;

public class OrderStatus {
    private Status status;

    public OrderStatus() {
        this.status = new EstablishedStatus(this);
    }

    public void changeStatus(Status status) {
        this.status = status;
    }

    public Status getStatus(){
        return this.status;
    }
}
