package io.girirajvyas.gof.designpatterns.creational.builder;

/**
 * 
 * @author Giriraj_Vyas
 *
 */
public class LunchOrderDemo {

	public static void main(String[] args) {
		LunchOrder.Builder builder = new LunchOrder.Builder(); 
		builder.bread("bread").condiments("condiments").dressing("dressing").meat("meat");
		LunchOrder lunchOrder = builder.build();

		System.out.println(lunchOrder.getBread());
		System.out.println(lunchOrder.getCondiments());
		System.out.println(lunchOrder.getDressing());
		System.out.println(lunchOrder.getMeat());
	}

}
