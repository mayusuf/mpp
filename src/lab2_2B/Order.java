package lab2_2B;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private int orderNum;
    private List<OrderLine> orderLines;

    public Order(int orderNum) {
        this.orderNum = orderNum;
        this.orderLines = new ArrayList<>();
        this.orderLines.add(new OrderLine(this));
    }

    public void setOrderLines(OrderLine orderLine){
        this.orderLines.add(orderLine);
    }

    public List<OrderLine> getOrderLines() {
        return orderLines;
    }
}
