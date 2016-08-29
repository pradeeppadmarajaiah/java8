package com.bitiknow.lamba;

import java.util.ArrayList;
import java.util.List;

public class Order {
	private float price;
	private String region;
	private int orderId;
	private List<Product> products = new ArrayList<>();

	public Order(int orderId, String region, float price) {
		this.orderId = orderId;
		this.region = region;
		this.price = price;
	}

	/**
	 * @return the price
	 */
	public final float getPrice() {
		return price;
	}

	/**
	 * @param price
	 *            the price to set
	 */
	public final void setPrice(float price) {
		this.price = price;
	}

	/**
	 * @return the region
	 */
	public final String getRegion() {
		return region;
	}

	/**
	 * @param region
	 *            the region to set
	 */
	public final void setRegion(String region) {
		this.region = region;
	}

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
	 * @return the products
	 */
	public final List<Product> getProducts() {
		return products;
	}

	/**
	 * @param products
	 *            the products to set
	 */
	public final void setProducts(List<Product> products) {
		this.products = products;
	}

}
