package io.girirajvyas.gof.designpatterns.behavioral.state.fan;

public class FanOffState extends State {

	private Fan fan;

	public FanOffState(Fan fan) {
		this.fan = fan;
	}

	public void handleRequest() {
		System.out.println("Turn the fan low as it is next state");
		fan.setState(fan.getFanLowState());
		// In above scenario we can have new instance created as well, for that purpose
		// we will use the Singleton pattern to get the instance
	}
	
	/**
	 * To get the current state of Fan
	 */
	public String toString() {
		return "fan is OFF";
	}
}
