package io.girirajvyas.gof.designpatterns.behavioral.state.fan;

public class FanWithIfElseLogic {
	final static int OFF = 0;
	final static int LOW = 1;
	final static int MED = 2;
	int state = OFF;
	
	public void pullchain() {
		if(state == OFF ) {
			System.out.println("Turning Fan to LOW");
			state = LOW;
		} else if (state == LOW) {
			System.out.println("Turning Fan to MED");
			state = MED;
		} else if (state == MED) {
			System.out.println("Turning Fan OFF");
			state = OFF;
		}
	}

	@Override
	public String toString() {
		if(state == OFF ) {
			return "Fan is OFF";
		} else if (state == LOW) {
			return "Fan is on LOW Speed";
		} else if (state == MED) {
			return "Fan is on MED Speed";
		}
		return "Invalid State";
	}
}
