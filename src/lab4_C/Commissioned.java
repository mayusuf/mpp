package lab4_C;

import java.util.*;

public class Commissioned extends  Employee{

    private double commission;
    private double baseSalary;
    private double sal;
    private Paycheck paycheck;
    private List<Order> order;

    public Commissioned(String empId, double baseSalary) {
        super(empId);
        this.baseSalary = baseSalary;
        this.order = new ArrayList<>();
        addOrder(101, "12-3-2024", 3000);
        addOrder(102, "12-10-2024", 2500);
    }

    public List<Order> addOrder(int oderId, String oDate, double oAmount) {

        this.order.add(new Order(oderId, oDate, oAmount));
        return order;
    }

    @Override
    public double calcGrossPay(int month, int yr){

        paycheck = calcCompensation(12, 2024);
        this.sal = baseSalary + getOrderCommission();
        paycheck.getNetPay(this.sal);
        return sal;
    }

    public double getOrderCommission(){

        this.commission = 0;
        for(Order o : order){
            this.commission += o.getCommision();
        }
        return commission;
    }

    public String print(){

        return "Commissioned Employee \n" + "Id: " + this.empId + "\n" + "Gross Pay: " + this.sal + "\n" + this.paycheck.print();
    }
}
