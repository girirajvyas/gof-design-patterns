package io.girirajvyas.gof.designpatterns.behavioral.chainofresponsibility;

public abstract class Handler {
	
	protected Handler successor;
	
	public void setSuccessor(Handler successor) {
		this.successor = successor;
	}

	public abstract void handleRequest(Request request);
}
