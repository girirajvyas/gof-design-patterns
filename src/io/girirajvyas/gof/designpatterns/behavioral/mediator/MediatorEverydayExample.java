package io.girirajvyas.gof.designpatterns.behavioral.mediator;

import java.awt.Toolkit;
import java.util.Timer;
import java.util.TimerTask;

public class MediatorEverydayExample {
	private Toolkit toolkit;
	private Timer timer;

	public MediatorEverydayExample(int seconds) {
		timer = new Timer();
		timer.schedule(new RemindTask(), seconds * 1000);
		timer.schedule(new RemindTaskWithBeep(), seconds * 2 * 1000);
		toolkit = Toolkit.getDefaultToolkit();
	}

	class RemindTask extends TimerTask {

		@Override
		public void run() {
			System.out.println("Time' up!");
		}
	}

	class RemindTaskWithBeep extends TimerTask {

		@Override
		public void run() {
			System.out.println("Time' up Beeeep");
			toolkit.beep();
			timer.cancel();
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Scheduling task");
		new MediatorEverydayExample(3);
		System.out.println("Task Scheduled");
	}
}
