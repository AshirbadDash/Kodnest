package com.day20.racking;

import java.util.Scanner;

public class TwoPresons {
	public static void main(String[] args) {
		{
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter the name of person 1:");
			String name1 = scan.next();
			System.out.println("Enter the age of person 1:");
			int age1 = scan.nextInt();
			System.out.println("Enter the address of person 1:");
			String add1 = scan.next();

			System.out.println("Enter the name of person 2:");
			String name2 = scan.next();
			System.out.println("Enter the age of person 2:");
			int age2 = scan.nextInt();
			System.out.println("Enter the address of person 2:");
			String add2 = scan.next();
			scan.close();

			Question2 person1 = new Question2(name1, age1, add1);
			Question2 person2 = new Question2(name2, age2, add2);
			System.out.println("\nperson 1:Name:" + person1.name + "\nperson 1:Age:" + person1.age
					+ "\nperson 1:Address:" + person1.add);

			System.out.println("\nperson 2:Name:" + person2.name + "\nperson 2:Age:" + person2.age
					+ "\nperson 2:Address:" + person2.add);
		}
	}

}
