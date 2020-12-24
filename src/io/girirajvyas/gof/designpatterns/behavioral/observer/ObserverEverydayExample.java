package io.girirajvyas.gof.designpatterns.behavioral.observer;

import java.util.Observable;
import java.util.Observer;

public class ObserverEverydayExample {

	public static void main(String[] args) {
		TwitterStream stream = new TwitterStream();
		
		Client client1 = new Client("Giri");
		Client client2 = new Client("Raj");
		
		stream.addObserver(client1);
		stream.addObserver(client2);
		
		stream.someoneTweeted();
	}
}

// Concrete Subject
class TwitterStream extends Observable {
	
	public void someoneTweeted() {
		setChanged();
		notifyObservers();
	}
	
}

// Concrete Observer
class Client implements Observer {

	private String name;
	
	public Client(String name) {
		this.name = name;
	}
	
	@Override
	public void update(Observable o, Object arg) {
		System.out.println("Updating " + name + "'s feed. someone tweeted");
	}
	
}