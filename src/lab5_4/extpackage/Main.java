package lab5_4.extpackage;

import java.time.LocalDate;

import lab5_4.CustOrder;
import lab5_4.Customer;
import lab5_4.Order;
import lab5_4.CustOrderFactory;

public class Main {

	public static void main(String[] args) {

		CustOrderFactory custOrderFactory = new CustOrderFactory();
		CustOrder cust = custOrderFactory.getObject("Customer", "Bob", null);

		//Customer cust = new Customer("Bob");
		CustOrder order = custOrderFactory.getObject("Order", "", (Customer) cust);

		//CustOrder order = Order.newOrder((Customer) cust, LocalDate.now());
		((Order)order).addItem("Shirt");
		((Order)order).addItem("Laptop");

//		order = Order.newOrder(cust, LocalDate.now());
		((Order)order).addItem("Pants");
		((Order)order).addItem("Knife set");

		System.out.println(((Customer) cust).getOrders());
	}
}

		
