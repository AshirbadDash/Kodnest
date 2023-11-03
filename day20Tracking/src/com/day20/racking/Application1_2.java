package com.day20.racking;

import java.util.Scanner;

public class Application1_2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("User enter the first Number");
		int a = scan.nextInt();
		System.out.println("User Enter the second Number");
		int b = scan.nextInt();
		scan.close();

		Question1_2 s2 = new Question1_2();
		s2.woThirdVariable(a, b);

	}

}
