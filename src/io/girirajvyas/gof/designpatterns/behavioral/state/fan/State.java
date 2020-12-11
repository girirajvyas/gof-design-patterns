package io.girirajvyas.gof.designpatterns.behavioral.state.fan;

public abstract class State {

	public void handleRequest() {
		System.out.println("This should not have been called, Exception can also be thrown");
	}
}
