package com.student.app_12;

import java.util.Scanner;

public class PositiveOrNot {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("User enter a number");
		int a = scan.nextInt();
		// ladder if statement
		if (a > 0) {
			System.out.println("Positive");
		}
		if (a < 0) {
			System.out.println("Not positive");
		}

		scan.close();

	}

}
