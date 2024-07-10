package lab5_4;

import java.time.LocalDate;

public class CustOrderFactory {

    private CustOrder custOrder;

    public CustOrder getObject(String type, String name, Customer cust){

        if(type.equals("Customer")){
            this.custOrder = new Customer(name);

        }else if(type.equals("Order")){

            this.custOrder=  Order.newOrder(cust,LocalDate.now());
        }

        return this.custOrder;
    }
}
