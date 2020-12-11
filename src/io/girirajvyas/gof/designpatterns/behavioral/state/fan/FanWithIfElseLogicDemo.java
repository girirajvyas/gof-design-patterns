package io.girirajvyas.gof.designpatterns.behavioral.state.fan;

public class FanWithIfElseLogicDemo {
	public static void main(String[] args) {
		FanWithIfElseLogic fan = new FanWithIfElseLogic();
	
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
