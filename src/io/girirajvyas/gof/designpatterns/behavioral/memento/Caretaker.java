package io.girirajvyas.gof.designpatterns.behavioral.memento;

import java.util.Stack;

// Caretaker
public class Caretaker {

	private Stack<EmployeeMemento> employeeHistory = new Stack<>();
	
	public void save(Employee emp) {
		employeeHistory.push(emp.save());
	}
	
	public void revert(Employee emp) {
		emp.revert(employeeHistory.pop());
	}
}
