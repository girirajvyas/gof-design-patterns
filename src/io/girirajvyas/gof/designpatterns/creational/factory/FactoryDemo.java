package io.girirajvyas.gof.designpatterns.creational.factory;

public class FactoryDemo {

	public static void main(String[] args) {
		Website website = WebsiteFactory.getWebsite(WebsiteType.SHOP);
		System.out.println(website.getPages());
		
		website = WebsiteFactory.getWebsite(WebsiteType.BLOG);
		System.out.println(website.getPages());
	}
}
