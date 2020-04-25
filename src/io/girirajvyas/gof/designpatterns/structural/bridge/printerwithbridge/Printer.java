package io.girirajvyas.gof.designpatterns.structural.bridge.printerwithbridge;

import java.util.List;

public abstract class Printer {

	public String print(Formatter formatter) {
		return formatter.format(getHeader(), getDetails());
	}

	protected abstract String getHeader();

	protected abstract List<Detail> getDetails();
}
