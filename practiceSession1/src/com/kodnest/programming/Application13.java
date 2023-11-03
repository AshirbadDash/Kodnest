package com.kodnest.programming;

import java.util.Scanner;

public class Application13 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("user please enter the principal value in double value");
		double principal = scan.nextDouble();
		System.out.println("user please enter the rate of intrest in decimal value");
		double rate = scan.nextDouble();
		System.out.println("user please enter the time in years");
		double time = scan.nextDouble();
		scan.close();

		Question13 q13 = new Question13();
		double intrest = q13.calculateSimpleInterest(principal, rate, time);
		System.out.println("the simpleIntrest is " + intrest);

	}

}
