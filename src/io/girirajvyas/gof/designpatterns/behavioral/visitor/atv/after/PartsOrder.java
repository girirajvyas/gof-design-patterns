package io.girirajvyas.gof.designpatterns.behavioral.visitor.atv.after;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PartsOrder implements AtvPart {

	private List<AtvPart> parts = new ArrayList<>();

	public void addParts(AtvPart part) {
		parts.add(part);
	}

	public List<AtvPart> getParts() {
		return Collections.unmodifiableList(parts);
	}

	@Override
	public double calculateShipping() {
		double shippingCost = 0;
		for (AtvPart atvPart : parts) {
			shippingCost += atvPart.calculateShipping();
		}
		return shippingCost;
	}
}
