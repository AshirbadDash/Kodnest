package com.kodnest.programming;

import java.util.Scanner;

public class Application11{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("User please enter a number");
		double radius= scan.nextDouble();
		scan.close();

		Question11 q11 = new Question11();
		double area =q11.calculateSurfaceArea(radius);
		System.out.println("the area is:"+area);

	}
}



