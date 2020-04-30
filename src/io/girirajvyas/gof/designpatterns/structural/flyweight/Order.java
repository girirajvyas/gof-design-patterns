package io.girirajvyas.gof.designpatterns.structural.flyweight;

public class Order {
	
	private final int orderNumber;
	private final Item item;
	
	public Order(int orderNumber, Item item) {
		this.orderNumber = orderNumber;
		this.item = item;
	}

	void processOrder() {
		System.out.println("Ordering " + item + " for order number " + orderNumber);
	}
	
}
