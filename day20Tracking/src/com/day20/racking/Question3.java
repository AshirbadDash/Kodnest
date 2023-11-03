package com.day20.racking;

public class Question3 {

	void display() {
		System.out.println("nothing is displayed");

	}

	void display(int age) {
		System.out.println("\nage:" + age);

	}

	void display(String name) {
		System.out.println("\nname:" + name);
	}

	void display(int age, String name) {
		System.out.println("\nage:" + age + "\nname:" + name);
	}

	void display(String name, int age) {
		System.out.println("\nname:" + name + "\nage:" + age);
	}

	void display(int age, String name, double salary) {
		System.out.println("\nage:" + age + "\nname:" + name + "\nsalary:" + salary);
	}

	void display(double salary, String name, int age) {
		System.out.println("\nsalary:" + salary + "\nname:" + name + "\nage:" + age);
	}

	void display(double salary, int age, String name) {
		System.out.println("\nsalary:" + salary + "\nage:" + age + "\nname:" + name);
	}
}
