package com.learning.serialization;

import java.io.Serializable;

public class Student implements Serializable {
	
	private int id;
	private String name;
	private transient String email;
	private String password;
	
	Student(int id, String name, String email, String password){
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
	}
	
	public void display() {
		System.out.println(id+", "+name+", "+email+", "+password);
	}
	

	public static void main(String[] args) {

		Student obj = new Student(1, "Sid", "sid@gmail.com", "sid@123");
		obj.display();
		

	}

}
