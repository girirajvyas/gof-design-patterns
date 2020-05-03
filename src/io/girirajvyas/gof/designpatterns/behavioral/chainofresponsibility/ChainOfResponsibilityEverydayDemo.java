package io.girirajvyas.gof.designpatterns.behavioral.chainofresponsibility;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ChainOfResponsibilityEverydayDemo {

	private static final Logger LOGGER = Logger.getLogger(ChainOfResponsibilityEverydayDemo.class.getName());

	public static void main(String[] args) {
		// level to log at
		LOGGER.setLevel(Level.FINER);
		
		ConsoleHandler consoleHandler = new ConsoleHandler();
		// level to publish at
		consoleHandler.setLevel(Level.FINER);
		LOGGER.addHandler(consoleHandler);
		
		LOGGER.fine("Logged at Fine level");
		LOGGER.finer("logging at Finer level");
		LOGGER.finest("logging at Finest level");
	}
}
