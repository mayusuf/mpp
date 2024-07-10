package lab2_2B;

public class Main {

    public static void main(String[] args) {

        Order order = new Order(1);
        OrderLine orderLine = new OrderLine(order);
        order.setOrderLines(orderLine);
        System.out.println(order.getOrderLines().size());
    }
}
