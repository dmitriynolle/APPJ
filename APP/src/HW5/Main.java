package HW5;

public class Main {

    public static void main(String[] args) {
        OrderStatus orderStatus = new OrderStatus();

        System.out.println(orderStatus.getStatus().established());

        System.out.println(orderStatus.getStatus().locking());

        System.out.println(orderStatus.getStatus().established());

        System.out.println(orderStatus.getStatus().processed());

        System.out.println(orderStatus.getStatus().delivery());
    }
}
