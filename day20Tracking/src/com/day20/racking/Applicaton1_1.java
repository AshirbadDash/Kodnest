package com.day20.racking;

import java.util.Scanner;

public class Applicaton1_1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("User please enter the 1st Number");
		int a1 = scan.nextInt();
		System.out.println("User please enter the second Number");
		int b1 = scan.nextInt();
		scan.close();

		Question1_1 s = new Question1_1();

		s.thirdVariable(a1, b1);

	}

}
