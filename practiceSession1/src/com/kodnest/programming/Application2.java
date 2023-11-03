package com.kodnest.programming;

import java.util.Scanner;

public class Application2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first number:");
		int a = scan.nextInt();
		System.out.println("Enter the second number:");
		int b = scan.nextInt();
		scan.close();

		Question2 q2 = new Question2();
		System.out.println("The substraction is " + q2.subtractNumbers(a, b));
		System.out.println("The Multiplication is " + q2.multiplyNumbers(a, b));
		System.out.println("The Division is " + q2.divideNUmber(a, b));
		System.out.println("The Remainder is " + q2.findremainder(a, b));

	}

}
