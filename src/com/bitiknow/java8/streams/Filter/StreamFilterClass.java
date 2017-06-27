/** 
 * 
 */
package com.bitiknow.java8.streams.Filter;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author PradeepPadmarajaiah
 *
 *         Samples explains Stream filters.
 */
public class StreamFilterClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		List<Order> orders = new ArrayList<>();

		orders.add(new Order(1123, "Pradeep", "Bag"));
		orders.add(new Order(23, "albert", "Bag"));
		orders.add(new Order(13244, "Pradeep", "Bag"));
		orders.add(new Order(9945, "Kumar", "Bag"));
		orders.add(new Order(3, "Pradeep", "Bag"));
		orders.add(new Order(99, "Raj", "Bag"));
		orders.add(new Order(3491, "Kumar", "Book"));

		System.out.println("Original Orders : " + orders);

		// Get all the orders for order id greater than >100
		List<Order> ordersGt = orders.stream().filter(o -> o.getOrderId() > 100).collect(Collectors.toList());
		System.out.println(" order id greater than >100 : " + ordersGt);

		// Get all the orders for order id greater than >100 and product name is
		// "Bag"
		ordersGt = orders.stream().filter(o -> o.getOrderId() > 100 && o.getProductName().equalsIgnoreCase("bag"))
				.collect(Collectors.toList());
		System.out.println(" order id greater than >100 and order name is Bag : " + ordersGt);
		
		//Get all product name which has order id >100
		
		List<String> products=orders.stream().filter(o->o.getOrderId() > 100).map(o->o.getProductName()).collect(Collectors.toList());

	}

}

class Order {

	private int orderId;
	private String OwnerName;
	private String productName;

	/**
	 * @return the orderId
	 */
	public final int getOrderId() {
		return orderId;
	}

	/**
	 * @param orderId
	 *            the orderId to set
	 */
	public final void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	/**
	 * @return the ownerName
	 */
	public final String getOwnerName() {
		return OwnerName;
	}

	/**
	 * @param ownerName
	 *            the ownerName to set
	 */
	public final void setOwnerName(String ownerName) {
		OwnerName = ownerName;
	}

	/**
	 * @return the productName
	 */
	public final String getProductName() {
		return productName;
	}

	/**
	 * @param productName
	 *            the productName to set
	 */
	public final void setProductName(String productName) {
		this.productName = productName;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", " + (OwnerName != null ? "OwnerName=" + OwnerName + ", " : "")
				+ (productName != null ? "productName=" + productName : "") + "]";
	}

	public Order(int orderId, String ownerName, String productName) {
		super();
		this.orderId = orderId;
		OwnerName = ownerName;
		this.productName = productName;
	}

}

class Product {
	private String productId;
	private String productName;

	/**
	 * @return the productId
	 */
	public final String getProductId() {
		return productId;
	}

	/**
	 * @param productId
	 *            the productId to set
	 */
	public final void setProductId(String productId) {
		this.productId = productId;
	}

	/**
	 * @return the productName
	 */
	public final String getProductName() {
		return productName;
	}

	/**
	 * @param productName
	 *            the productName to set
	 */
	public final void setProductName(String productName) {
		this.productName = productName;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Product [" + (productId != null ? "productId=" + productId + ", " : "")
				+ (productName != null ? "productName=" + productName : "") + "]";
	}

	public Product(String productId, String productName) {
		super();
		this.productId = productId;
		this.productName = productName;
	}

}