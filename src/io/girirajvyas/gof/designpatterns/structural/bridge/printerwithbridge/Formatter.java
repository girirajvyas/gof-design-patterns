package io.girirajvyas.gof.designpatterns.structural.bridge.printerwithbridge;

import java.util.List;

public interface Formatter {

	String format(String header, List<Detail> details);

}
