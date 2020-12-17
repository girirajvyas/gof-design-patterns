package io.girirajvyas.gof.designpatterns.behavioral.visitor.atv.before;

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
	public void accept(AtvPartVisitor visitor) {
		
		for (AtvPart atvPart : parts) {
			atvPart.accept(visitor);
		}
		visitor.visit(this);
	}

}
