package io.girirajvyas.gof.designpatterns.behavioral.state.fan;

public class StateDemo {

	public static void main(String[] args) {
		Fan fan = new Fan();
		
		// Off State
		System.out.println(fan);
		fan.pullchain();
		
		// Low State
		System.out.println(fan);
		fan.pullchain();
	
		// Med state
		System.out.println(fan);
		fan.pullchain();
	}
}
