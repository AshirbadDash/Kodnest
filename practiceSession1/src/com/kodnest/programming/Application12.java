package com.kodnest.programming;

import java.util.Scanner;

public class Application12 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("User Please enter your height in inches");
		double height = scan.nextDouble();
		scan.close();

		Question12 q12 = new Question12();
		double feet = q12.convertInchesToFeet(height);
		System.out.println();
		System.out.println("The height in foot is "+feet);

	}

}
