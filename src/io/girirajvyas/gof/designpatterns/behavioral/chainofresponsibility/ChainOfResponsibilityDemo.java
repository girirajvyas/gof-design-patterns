package io.girirajvyas.gof.designpatterns.behavioral.chainofresponsibility;

public class ChainOfResponsibilityDemo {
	
	public static void main(String[] args) {
		Director director = new Director();
		VP vp = new VP();
		CEO ceo = new CEO();
		
		director.setSuccessor(vp);
		vp.setSuccessor(ceo);
		
		Request request = new Request(RequestType.CONFERENCE, 500);
		director.handleRequest(request);
		
		request = new Request(RequestType.PURCHASE, 1000);
		director.handleRequest(request);
		
		request = new Request(RequestType.PURCHASE, 2000);
		director.handleRequest(request);
	}

}
