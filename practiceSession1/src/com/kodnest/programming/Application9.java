package com.kodnest.programming;

import java.util.Scanner;

public class Application9 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a value");
		int a = scan.nextInt();
		scan.close();

		Question9 q9 = new Question9();

		q9.theCubeOfNumber(a);

	}

}