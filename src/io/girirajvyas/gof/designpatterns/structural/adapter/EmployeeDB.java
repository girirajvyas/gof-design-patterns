package io.girirajvyas.gof.designpatterns.structural.adapter;

public class EmployeeDB implements Employee {

	private String id;
	private String firstName;
	private String lastName;
	private String email;
	
	public EmployeeDB(String id, String firstName, String lastName, String email) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}

	public String getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getEmail() {
		return email;
	}

	@Override
	public String toString() {
		return "EmployeeDB [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ "]";
	}

	
}
