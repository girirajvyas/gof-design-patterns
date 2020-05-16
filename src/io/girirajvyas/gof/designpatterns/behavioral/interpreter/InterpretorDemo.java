package io.girirajvyas.gof.designpatterns.behavioral.interpreter;

public class InterpretorDemo {

	public static void main(String[] args) {

		// String context = "Lions";
		// String context = "Tigers";
		String context = "Bears";
		// String context = "Lions Tigers";
		// String context = "Lions Bears";
		// String context = "Tigers Bears";

		Expression define = buildInterpreterTree();

		System.out.println(context + " is " + define.interpret(context));
	}

	static Expression buildInterpreterTree() {
		Expression terminal1 = new TerminalExpression("Lions");
		Expression terminal2 = new TerminalExpression("Tigers");
		Expression terminal3 = new TerminalExpression("Bears");

		// Lions and Tigers
		Expression alternation1 = new AndExpression(terminal1, terminal2);

		// (Lions and Tigers) or Bears
		Expression alternation2 = new OrExpression(alternation1, terminal3);

		return new AndExpression(alternation2, terminal3);
	}
}
