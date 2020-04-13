package io.girirajvyas.gof.designpatterns.creational.builder;

/**
 * This implementation example is with Telescopic constructor<br>
 * 
 * 1. LunchOrderTelescopic is Immutable <br>
 * 2. To have any combination of parameters that is not available already, we
 * need to add a new constructor with those fields<br>
 * 
 * @author Giriraj_Vyas
 *
 */
public class LunchOrderTelescopic {

	private String bread;
	private String condiments;
	private String dressing;
	private String meat;

	public LunchOrderTelescopic(String bread) {
		this.bread = bread;
	}

	public LunchOrderTelescopic(String bread, String condiments) {
		this(bread);
		this.condiments = condiments;
	}

	public LunchOrderTelescopic(String bread, String condiments, String dressing) {
		this(bread, condiments);
		this.dressing = dressing;
	}

	/**
	 * Telescopic constructors calling the above in the hierarchy that has only 1
	 * less parameter from the current one
	 * 
	 * @param bread
	 * @param condiments
	 * @param dressing
	 * @param meat
	 */
	public LunchOrderTelescopic(String bread, String condiments, String dressing, String meat) {
		this(bread, condiments, dressing);
		this.meat = meat;
	}

	public String getBread() {
		return bread;
	}

	public String getCondiments() {
		return condiments;
	}

	public String getDressing() {
		return dressing;
	}

	public String getMeat() {
		return meat;
	}

}
