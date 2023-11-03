package com.kodnest.studentapp;

class Application {

	public static void main(String[] args) {
		Student s = new Student();
		s.name = "vardhan";
		s.age = 21;
		System.out.println(s.name);
		System.out.println(s.age);
		s.study();
		s.sleep();

	}
}
