package io.girirajvyas.gof.designpatterns.behavioral.memento;

public class MementoDemo {

	public static void main(String[] args) {
		Caretaker caretaker = new Caretaker();
		
		Employee emp = new Employee();
		emp.setName("Giri");
		emp.setAddress("abc park street");
		emp.setPhone("999999999");
		System.out.println("Employee before save:                  " + emp);
		caretaker.save(emp); // 1st instance saved
		
		emp.setName("Giriraj");
		caretaker.save(emp); // 2nd instance saved
		System.out.println("Employee after changed name and save:  " + emp);
		
		emp.setName("Vyas"); // wont be saved as save not called	
		
		caretaker.revert(emp);
		System.out.println("Reverted to last saved point:          " + emp);
		
		caretaker.revert(emp);
		System.out.println("Reverted to original:                  " + emp);
	}
}
