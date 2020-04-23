package io.girirajvyas.gof.designpatterns.structural.adapter;

import java.util.ArrayList;
import java.util.List;

public class EmployeeClient {

	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>();
		EmployeeDB employeeDB = new EmployeeDB("1", "barbara", "mori", "barabara.mori@gmail.com");
		employees.add(employeeDB);
		
		EmployeeLdap employeeLdap = new EmployeeLdap("2", "Cena", "John", "john.cena@gmail.xom");
		employees.add(new EmployeeAdapterLdap(employeeLdap));
		
		System.out.println(employees);
	
	}

}
