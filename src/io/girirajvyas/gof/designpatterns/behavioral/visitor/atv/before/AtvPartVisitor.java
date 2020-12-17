package io.girirajvyas.gof.designpatterns.behavioral.visitor.atv.before;

public interface AtvPartVisitor {

	void visit(Fender fender);
	void visit(Oil oil);
	void visit(Wheel wheel);
	void visit(PartsOrder partsOrder);

}
