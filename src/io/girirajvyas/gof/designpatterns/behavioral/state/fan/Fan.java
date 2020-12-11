package io.girirajvyas.gof.designpatterns.behavioral.state.fan;

public class Fan {
	State fanOffState;
	State fanLowState;
	State fanMedState;

	State state;

	public Fan() {
		fanOffState = new FanOffState(this);
		fanLowState = new FanLowState(this);
		fanMedState = new FanMedState(this);

		// Default scenario
		state = fanOffState;
	}

	public void pullchain() {
		state.handleRequest();
	}

	@Override
	public String toString() {
		return state.toString();
	}

	public void setState(State state) {
		this.state = state;
	}

	public State getFanOffState() {
		return fanOffState;
	}

	public State getFanLowState() {
		return fanLowState;
	}

	public State getFanMedState() {
		return fanMedState;
	}
}
