package io.girirajvyas.gof.designpatterns.behavioral.observer;

public class ObserverDemo {
	
	public static void main(String[] args) {
		Subject subject = new MessageStream();
		
		PhoneClient phoneClient = new PhoneClient(subject);
		TabletClient tabletClient = new TabletClient(subject);
		
		phoneClient.addMessage("Here's a new message");
		tabletClient.addMessage("Here is another message");
	}
}
