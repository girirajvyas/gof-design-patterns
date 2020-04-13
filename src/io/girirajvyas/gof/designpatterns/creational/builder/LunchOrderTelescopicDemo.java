package io.girirajvyas.gof.designpatterns.creational.builder;

/**
 * 
 * @author Giriraj_Vyas
 *
 */
public class LunchOrderTelescopicDemo {

	public static void main(String[] args) {
		LunchOrderTelescopic lunchOrderTelescopic = new LunchOrderTelescopic("bread", "condiments", "dressing", "meat");

		System.out.println(lunchOrderTelescopic.getBread());
		System.out.println(lunchOrderTelescopic.getCondiments());
		System.out.println(lunchOrderTelescopic.getDressing());
		System.out.println(lunchOrderTelescopic.getMeat());
	}

}
