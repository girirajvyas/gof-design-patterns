package io.girirajvyas.gof.designpatterns.behavioral.command;

public class CommandEverydayDemo {
	public static void main(String[] args) {
		Task task1 = new Task(1, 2); // encapsulates request
		Task task2 = new Task(2, 2);

		Thread thread1 = new Thread(task1);
		thread1.start();

		Thread thread2 = new Thread(task2);
		thread2.start();
	}
}

class Task implements Runnable {
	int num1;
	int num2;

	Task(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	@Override
	public void run() { // execute method
		System.out.println(num1 * num2);// receiver
	}

}