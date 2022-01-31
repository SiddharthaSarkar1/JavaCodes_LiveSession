package com.learning.AnnonymousInnerClass;

public class AnnoyCls {

	public static void main(String[] args) {
		
		Car cr = new Car() {
			public void start() {
				System.out.println("My car is just started.");
			}
			public void stop() {
				System.out.println("My car is stopped.");
			}
		};
		
		cr.start();
		cr.stop();

	}

}
