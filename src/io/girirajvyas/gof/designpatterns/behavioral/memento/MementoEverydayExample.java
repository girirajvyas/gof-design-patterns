package io.girirajvyas.gof.designpatterns.behavioral.memento;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class MementoEverydayExample {

	private static EmployeeSerializable deserialize() {
		EmployeeSerializable emp = null;
		try {
			FileInputStream fileInputStream = new FileInputStream("/employee.ser");
			ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

			emp = (EmployeeSerializable) objectInputStream.readObject();
			objectInputStream.close();
			fileInputStream.close();
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}

		return emp;
	}

	public static void main(String[] args) {

		EmployeeSerializable employee = new EmployeeSerializable();
		employee.setName("Giri");
		employee.setAddress("abc, park street,");
		employee.setPhone("9999999999");

		serailize(employee);

		EmployeeSerializable newEmployee = deserialize();

		System.out.println(newEmployee.getName());
	}

	private static void serailize(EmployeeSerializable emp) {
		try {
			FileOutputStream fileOutputStream = new FileOutputStream("/employee.ser");
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
			objectOutputStream.writeObject(emp);
			objectOutputStream.close();
			fileOutputStream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
