/**
 * 
 */
package com.bitiknow.lamba;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;


/**
 * @author pradeep
 *
 */
public class OrderManupulation {

	public static List<Order> getIndianOrders(List<Order> orders) {
		List<Order> indianOrders = new ArrayList<>();
		for (Order order : orders) {
			if (order.getRegion().equalsIgnoreCase("india")) {
				indianOrders.add(order);

			}

		}
		return indianOrders;

	}

	public static List<Order> getRegionOrders(List<Order> orders, String regionName) {
		List<Order> indianOrders = new ArrayList<>();
		for (Order order : orders) {
			if (order.getRegion().equalsIgnoreCase(regionName)) {
				indianOrders.add(order);
			}

		}
		return indianOrders;

	}

	public static List<Order> getRegionOrdersWithPrice(List<Order> orders, String regionName) {
		List<Order> indianOrders = new ArrayList<>();
		for (Order order : orders) {
			if (order.getRegion().equalsIgnoreCase(regionName) && order.getPrice() > 100.0) {
				indianOrders.add(order);
			}

		}
		return indianOrders;

	}

	public static boolean isIndianOrders(Order order) {
		return order.getRegion().equalsIgnoreCase("india");
	}

	public static List<Order> filterOrders(List<Order> orders, Predicate<Order> p) {
		List<Order> indianOrders = new ArrayList<>();
		for (Order order : orders) {
			if (p.test(order)) {
				indianOrders.add(order);
			}

		}
		return indianOrders;
	}

	public static void main(String[] args) {
		List<Order> orders = new ArrayList<>();
		orders.add(new Order(1, "india", 100));
		orders.add(new Order(1, "indsia", 200));
		List<Order> indianOrders = OrderManupulation.filterOrders(orders, OrderManupulation::isIndianOrders);
		indianOrders = OrderManupulation.filterOrders(orders, order -> {
			return order.getRegion().equalsIgnoreCase("India");
		});

		indianOrders = OrderManupulation.filterOrders(orders, (Order order) -> OrderManupulation.isIndianOrders(order));
		indianOrders = OrderManupulation.filterOrders(orders, order -> OrderManupulation.isIndianOrders(order));
		indianOrders = OrderManupulation.filterOrders(orders, order -> isIndianOrders(order));
		indianOrders = OrderManupulation.filterOrders(orders, order -> {
			return isIndianOrders(order);
		});

		System.out.println(indianOrders.size());
	}

}
