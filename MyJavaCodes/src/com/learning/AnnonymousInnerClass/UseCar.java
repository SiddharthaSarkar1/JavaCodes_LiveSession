package com.learning.AnnonymousInnerClass;

public class UseCar {

	public static void main(String[] args) {
		CarImp obj1 = new CarImp();
		obj1.start();
		obj1.stop();
		
		Car obj2 = new CarImp();
		obj2.start();
		obj2.stop();

	}

}
