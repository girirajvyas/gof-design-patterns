package io.girirajvyas.gof.designpatterns.behavioral.mediator;

// Concrete commands
public class TurnOnAllLightsCommand implements Command {

	private Mediator mediator;
	
	public TurnOnAllLightsCommand(Mediator mediator) {
		this.mediator = mediator;
	}
	
	@Override
	public void execute() {
		mediator.turnOnAllLights();
	}

}
