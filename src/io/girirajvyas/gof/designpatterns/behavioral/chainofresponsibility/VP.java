package io.girirajvyas.gof.designpatterns.behavioral.chainofresponsibility;

public class VP extends Handler {

	@Override
	public void handleRequest(Request request) {
		if (request.getAmount() < 1500) {
			System.out.println("VP approved the request as amount is less than 1500");
		} else {
			successor.handleRequest(request);
		}
	}

}
