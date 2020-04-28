package io.girirajvyas.gof.designpatterns.structural.composite;

public class CompositeMenuDemo {
	
	public static void main(String[] args) {
		Menu mainMenu = new Menu("Main", "/main");
		
		MenuItem safetyMenuItem = new MenuItem("Safety", "/safety");
		mainMenu.add(safetyMenuItem);
		
		Menu claimsSubMenu = new Menu("Claims", "/claims");
		mainMenu.add(claimsSubMenu);
		
		MenuItem personalClaimsMenu = new MenuItem("Personal Claims", "/personalClaims");
		claimsSubMenu.add(personalClaimsMenu);
	
		System.out.println(mainMenu.toString());
	}
	

}
