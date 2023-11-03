package com.day20.racking;

import java.util.Scanner;

public class Application3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter age");
		int age = scan.nextInt();
		System.out.println("Enter name");
		String name = scan.next();
		System.out.println("Enter salary");
		double salary = scan.nextDouble();
		scan.close();

		Question3 q3 = new Question3();
		q3.display();
		q3.display(age);
		q3.display(name);
		q3.display(age, name);
		q3.display(name, age);
		q3.display(salary, age, name);
		q3.display(salary, name, age);
		q3.display(age, name, salary);
	}

}
