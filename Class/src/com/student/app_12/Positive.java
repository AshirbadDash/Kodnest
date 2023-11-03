package com.student.app_12;

import java.util.Scanner;

public class Positive {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("User enter a number");
		int a = scan.nextInt();
		if (a > 0) {
			System.out.println("the entered number is positive");
		}
		scan.close();

	}

}
