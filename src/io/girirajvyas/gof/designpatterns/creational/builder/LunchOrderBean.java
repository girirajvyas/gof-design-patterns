package io.girirajvyas.gof.designpatterns.creational.builder;

/**
 * This is basic java bean demo<br>
 * 
 * 1. LunchOrderBean is <b>NOT</b> Immutable <br>
 * 2. Not validations as such which fields are mandatory<br>
 * 3. you have option to set the fields that you need and ignore that you don't
 * 
 * @author Giriraj_Vyas
 *
 */
public class LunchOrderBean {

	private String bread;
	private String condiments;
	private String dressing;
	private String meat;

	public LunchOrderBean() {

	}

	public String getBread() {
		return bread;
	}

	public void setBread(String bread) {
		this.bread = bread;
	}

	public String getCondiments() {
		return condiments;
	}

	public void setCondiments(String condiments) {
		this.condiments = condiments;
	}

	public String getDressing() {
		return dressing;
	}

	public void setDressing(String dressing) {
		this.dressing = dressing;
	}

	public String getMeat() {
		return meat;
	}

	public void setMeat(String meat) {
		this.meat = meat;
	}

}
