package com.kodnest.programming;

import java.util.Scanner;

public class Application8 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("User enter a number to square it");
		int square = scan.nextInt();
		scan.close();

		Question8 q8 = new Question8();

		System.out.println("The square of the number is " + q8.squareNumber(square));

	}

}
