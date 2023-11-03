package com.student.app_12;

import java.util.Scanner;

public class Citizen {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the age of citizen of india");
		int age = scan.nextInt();
		// boolean check=age>=18;
		scan.close();
		if (age >= 18) {
			System.out.println("eligible");

		}

		// System.out.println(check);
	}

}
