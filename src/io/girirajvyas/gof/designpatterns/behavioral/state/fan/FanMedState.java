package io.girirajvyas.gof.designpatterns.behavioral.state.fan;

public class FanMedState extends State {

	private Fan fan;

	public FanMedState(Fan fan) {
		this.fan = fan;
	}

	public void handleRequest() {
		System.out.println("Turn the fan Off as it is next state");
		fan.setState(fan.getFanOffState());
		// In above scenario we can have new instance created as well, for that purpose
		// we will use the Singleton pattern to get the instance
	}
	
	/**
	 * To get the current state of Fan
	 */
	public String toString() {
		return "fan is Med";
	}
}
