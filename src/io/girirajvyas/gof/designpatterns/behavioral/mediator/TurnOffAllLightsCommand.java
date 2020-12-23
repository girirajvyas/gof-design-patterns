package io.girirajvyas.gof.designpatterns.behavioral.mediator;

public class TurnOffAllLightsCommand implements Command {

	private Mediator mediator;
	
	public TurnOffAllLightsCommand(Mediator mediator) {
		this.mediator = mediator;
	}
	
	@Override
	public void execute() {
		mediator.turnOffAllLights();
	}

}
