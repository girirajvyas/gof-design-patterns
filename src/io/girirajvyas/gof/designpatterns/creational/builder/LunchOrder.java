package io.girirajvyas.gof.designpatterns.creational.builder;

/**
 * This is basic java bean demo<br>
 * 
 * 1. LunchOrderBean is Immutable <br>
 * 2. Flexibility of bean approach and contractual nature of constructors as
 * well<br>
 * 3. you have option to set the fields that you need and ignore that you don't
 * 
 * @author Giriraj_Vyas
 *
 */
public class LunchOrder {

	public static class Builder {
		private String bread;
		private String condiments;
		private String dressing;
		private String meat;

		/**
		 * This is default constructor, Add any fields in the constructor, that you want
		 * to enforce as mandatory
		 */
		public Builder() {

		}

		public LunchOrder build() {
			return new LunchOrder(this);
		}

		public Builder bread(String bread) {
			this.bread = bread;
			return this;
		}

		public Builder condiments(String condiments) {
			this.condiments = condiments;
			return this;
		}

		public Builder dressing(String dressing) {
			this.dressing = dressing;
			return this;
		}

		public Builder meat(String meat) {
			this.meat = meat;
			return this;
		}

	}

	private final String bread;
	private final String condiments;
	private final String dressing;
	private final String meat;

	private LunchOrder(Builder builder) {
		this.bread = builder.bread;
		this.condiments = builder.condiments;
		this.dressing = builder.dressing;
		this.meat = builder.meat;
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
