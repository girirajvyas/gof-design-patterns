package io.girirajvyas.gof.designpatterns.behavioral.command;

// invokder
public class Switch {

	public void storeAndExecute(Command command) {
		command.execute();
	}
}
