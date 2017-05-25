package com.bitiknow.supplier_consumer;

import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * 
 * @author pradeep
 *
 */
public class SupplierConsumerTest {

	public static void main(String[] args) {

		Supplier<Order> supplier = () -> new Order("1", "Pradeep");

		// or Another Syntax
		Supplier<Order> supplier1 = () -> {
			return new Order("2", "Raj");
		};

		System.out.println(supplier.get());
		System.out.println(supplier1.get());

		Consumer<Order> consumer = (o) -> {
			System.out.println("Order name is : " + o.getOrderName());
		};

		consumer.accept(new Order("3", "Ram"));
	}

}

class Order {

	private String orderId;
	private String orderName;

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getOrderName() {
		return orderName;
	}

	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", orderName=" + orderName + "]";
	}

	public Order(String orderId, String orderName) {
		super();
		this.orderId = orderId;
		this.orderName = orderName;
	}

	public Order() {
		// TODO Auto-generated constructor stub
	}
}