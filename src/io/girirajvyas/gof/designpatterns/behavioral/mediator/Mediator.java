package io.girirajvyas.gof.designpatterns.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class Mediator {

	private List<Light> lights = new ArrayList<>();
	
	public void registerLight(Light light) {
		lights.add(light);
	}
	
	public void turnOnAllLights() {
		for(Light light: lights) {
			if(!light.isOn()) {
				light.toggle();
			}
		}
	}

	public void turnOffAllLights() {
		for(Light light: lights) {
			if(light.isOn()) {
				light.toggle();
			}
		}
	}
}
