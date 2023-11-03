package com.kodnest.programming;

import java.util.Scanner;

public class Application14 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the time in minutes");
		double minutes = scan.nextDouble();
		scan.close();

		Question14 q14 = new Question14();
		double hours =q14.convertToHours((int) minutes);
		System.out.println("time in hours is "+ hours +" h");

	}

}
