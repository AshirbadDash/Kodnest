package com.kodnest.programming;

import java.util.Scanner;

public class Application1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("User! please enter a long number-l1");
		long l1 = scan.nextLong();
		System.out.println("User! please enter a long number-l2");
		long l2 = scan.nextLong();

		Question1 q1 = new Question1();
		long result = q1.galacticAddition(l1, l2);

		System.out.println("The result is "+ result);
		scan.close();
	}
}