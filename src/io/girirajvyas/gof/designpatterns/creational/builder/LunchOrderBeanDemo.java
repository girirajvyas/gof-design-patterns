package io.girirajvyas.gof.designpatterns.creational.builder;

/**
 * 
 * @author Giriraj_Vyas
 *
 */
public class LunchOrderBeanDemo {

	public static void main(String[] args) {
		LunchOrderBean lunchOrderBean = new LunchOrderBean();

		lunchOrderBean.setBread("Bread");
		lunchOrderBean.setCondiments("Condiments");
		lunchOrderBean.setDressing("Dressing");
		lunchOrderBean.setMeat("Meat");

		System.out.println(lunchOrderBean.getBread());
		System.out.println(lunchOrderBean.getCondiments());
		System.out.println(lunchOrderBean.getDressing());
		System.out.println(lunchOrderBean.getMeat());
	}

}
