package io.girirajvyas.gof.designpatterns.structural.flyweight;

public class FlyweightEverydayDemo {
	
	public static void main(String[] args) {
		Integer integer1 = Integer.valueOf(5);
		Integer integer2 = Integer.valueOf(5);
		Integer integer3 = Integer.valueOf(10);
		
		System.out.println(System.identityHashCode(integer1));
		System.out.println(System.identityHashCode(integer2));
		System.out.println(System.identityHashCode(integer3));
	}

}
