package io.girirajvyas.gof.designpatterns.behavioral.mediator;

public class MediatorDemo {

	public static void main(String[] args) {
		Mediator mediator = new Mediator();
		
		
		Light bedroomLight = new Light("Bedroom");
		Light kitchenLight = new Light("Kitchen");
		
		mediator.registerLight(bedroomLight);
		mediator.registerLight(kitchenLight);
		
		Command turnOnallLightsCommand = new TurnOnAllLightsCommand(mediator);
		turnOnallLightsCommand.execute();
		
		Command turnOffallLightsCommand = new TurnOffAllLightsCommand(mediator);
		turnOffallLightsCommand.execute();
	}
}
