package com.constructor.demo;

public class Application {
	public static void main(String[] args) {
		Student s = new Student("Ashirbad", 123,12.4f);
		s.study();
		System.out.println(s.name);
		System.out.println(s.age);
		System.out.println(s.marks);
		

	}

}
