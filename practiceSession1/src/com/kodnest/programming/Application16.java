package com.kodnest.programming;

import java.util.Scanner;

public class Application16 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("User please enter the throttle required");
		int throttle = scan.nextInt();
		scan.close();

		Question16 q16 = new Question16();
		long thrust = q16.calculateThrust(throttle);
		System.out.println("The resulting thrust is given as " + thrust);

	}

}
