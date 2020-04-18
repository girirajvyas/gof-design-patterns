package io.girirajvyas.gof.designpatterns.creational.factory;

public class WebsiteFactory {

	/**
	 * Static factory method
	 * @param siteType
	 * @return
	 */
	public static Website getWebsite(WebsiteType siteType) {
		switch (siteType) {

		case BLOG:
			return new Blog();

		case SHOP:
			return new Shop();

		default:
			return null;
		}
	}
}
