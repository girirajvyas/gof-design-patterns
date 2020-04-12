package io.girirajvyas.gof.designpatterns.creational.singleton;

public class SingletonDemo {
	public static void main(String[] args) {
		Singleton instance = Singleton.getInstanceLazily2();
		Singleton anotherInstance = Singleton.getInstanceLazily2();
		
		System.out.println(instance);
		System.out.println(anotherInstance);
	}

}
