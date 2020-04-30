package io.girirajvyas.gof.designpatterns.structural.flyweight;

public class FlyweightDemo {
	
	public static void main(String[] args) {
		InventorySystem inventorySystem = new InventorySystem();
		
		inventorySystem.takeOrder("Samsung TV", 1);
		inventorySystem.takeOrder("Oneplus TV", 2);
		inventorySystem.takeOrder("Samsung TV", 3);
		inventorySystem.takeOrder("Oneplus TV", 4);
		
		inventorySystem.process();
		
		System.out.println(inventorySystem.report());
	}

}
