package io.girirajvyas.gof.designpatterns.behavioral.command;

// Concrete Command using Light with state
public class ToggleCommand implements Command {

	private Light light;

	public ToggleCommand(Light light) {
		this.light = light;
	}

	@Override
	public void execute() {
		light.toggle();
	}

}
