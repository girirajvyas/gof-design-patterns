package io.girirajvyas.gof.designpatterns.behavioral.chainofresponsibility;

public class Director extends Handler {

	@Override
	public void handleRequest(Request request) {
		if(request.getRequestType() == RequestType.CONFERENCE) {
			System.out.println("Director Approved this Request as it is Conference");
		} else {
			successor.handleRequest(request);
		}
	}

}
