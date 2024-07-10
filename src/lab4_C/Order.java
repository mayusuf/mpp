package lab4_C;

public class Order {
    private int orderNo;
    private String orderDate;
    private double orderAmount;

    Order(int orderNo, String orderDate, double orderAmount) {
        this.orderNo = orderNo;
        this.orderDate = orderDate;
        this.orderAmount = orderAmount;
    }

    public double getCommision() {

        return this.orderAmount * 0.1;
    }
}
