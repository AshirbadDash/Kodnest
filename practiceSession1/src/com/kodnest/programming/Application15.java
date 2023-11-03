package com.kodnest.programming;

import java.util.Scanner;

public class Application15 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("User please enter the number to be halfed");
		double halved = scan.nextDouble();
		scan.close();

		Question15 q15 = new Question15();
		double halve = q15.halveTheNumber(halved);
		System.out.println("The half of the number is " + halve);

	}

}
