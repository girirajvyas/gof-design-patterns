package io.girirajvyas.gof.designpatterns.creational.factory;

public class Shop extends Website {

	@Override
	protected void createWebsite() {
		pages.add(new CartPage());
		pages.add(new ItemPage());
		pages.add(new SearchPage());
	}

}
