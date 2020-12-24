package io.girirajvyas.gof.designpatterns.behavioral.memento;

//Memento: can ignore fields whose state we don't want to recreate
public class EmployeeMemento {

	private String name;
	private String phone;
	
	public EmployeeMemento(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public String getPhone() {
		return phone;
	}
	
}
