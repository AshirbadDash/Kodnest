package com.kodnest.programming;

import java.util.Scanner;

public class Application5 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("User please enter the speed in double value");
		double speed = scan.nextDouble();
		System.out.println("User please enter the time in double value");
		double time = scan.nextDouble();

		Question5 a5 = new Question5();
		double dist = a5.calculateDistance(speed, time);
		System.out.println("The distance travelled is " + dist);
		scan.close();

	}

}
